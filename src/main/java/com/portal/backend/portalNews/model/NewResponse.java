package com.portal.backend.portalNews.model;

import java.util.List;

public class NewResponse {
    private List<New> news;

    public List<New> getNews() {
        return news;
    }
    public void setNews(List<New> news) {
        this.news = news;
    }
}
