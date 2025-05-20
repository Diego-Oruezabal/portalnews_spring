package com.portal.backend.portalNews.response;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseRest {

    private ArrayList<HashMap<String, String>> metadata = new ArrayList<>();


    public ArrayList<HashMap<String, String>> getMetadata() {
        return metadata;
    }
    public void setMetadata(String type, String code, String date) {
        HashMap<String, String> metadata = new HashMap<>();
        mmetadata.put("type", type);
        mmetadata.put("code", code);
        mmetadata.put("date", date);
        this.metadata.add(mmetadata);
    }
}
