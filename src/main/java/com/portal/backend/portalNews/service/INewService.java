package com.portal.backend.portalNews.service;

import com.portal.backend.portalNews.model.NewResponseRest;
import org.springframework.http.ResponseEntity;

public interface INewService {

    public ResponseEntity<NewResponseRest> save(New news);
}
