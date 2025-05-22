package com.portal.backend.portalNews.service;

import com.portal.backend.portalNews.dao.INewDao;
import com.portal.backend.portalNews.model.New;
import com.portal.backend.portalNews.model.NewResponseRest;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class NewServiceImpl  implements INewService {

    @Autowired
    private INewDao newDao;

    @Override
    @Transactional
    public ResponseEntity<NewResponseRest> save(New news) {

        NewResponseRest response = new NewResponseRest();
        List<New> list = new ArrayList<>();

        try {
           New newSaved = newDao.save(news);

           if (newSaved.getId() != null) {
                list.add(newSaved);
                response.getNewResponse().setNews(list);
                response.setMetadata("response ok", "00", "new saved");

            } else {
                response.setMetadata("response error", "01", "new not saved");
                return new ResponseEntity<NewResponseRest>(response, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            response.setMetadata("response error", "02", "new not saved");
            return new ResponseEntity<NewResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<NewResponseRest>(response, HttpStatus.OK);
    }


}
