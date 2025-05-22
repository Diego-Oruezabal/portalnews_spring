package com.portal.backend.portalNews.controller;
import com.portal.backend.portalNews.model.New;
import com.portal.backend.portalNews.model.NewResponseRest;
import com.portal.backend.portalNews.response.ErrorResponse;
import com.portal.backend.portalNews.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/api/v1")
public class NewController {
    @Autowired
    private INewService newService;

    @PostMapping("/news")
    public ResponseEntity<?> save(@RequestBody New news) {

        try {
            ResponseEntity<NewResponseRest> response = newService.save(news);

            if(response.getBody().getNewResponse().getNews().isEmpty()){
                return new ResponseEntity<>(new ErrorResponse(404, "No news found"), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ErrorResponse(500, "Internal Server Error"), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

    }

