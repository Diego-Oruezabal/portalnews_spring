package com.portal.backend.portalNews.model;

import com.portal.backend.portalNews.response.ResponseRest;



public class NewResponseRest extends ResponseRest {

    private NewResponse newResponse =new NewResponse();

    public NewResponse getNewResponse() {
        return newResponse;
    }

    public void setNewResponse(NewResponse newResponse) {
        this.newResponse = newResponse;
    }
}

