package com.portal.backend.portalNews.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "new")

public class New implements Serializable {

    private static final long serialVersionUID = -3298837734174984545L;

    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String title;
    @jakarta.persistence.Column(length = 1024)
    private String summary;
    @jakarta.persistence.Column(name = "published_at")
    private String publishedAt;
    @jakarta.persistence.Column(name = "new_site")
    private String newSite;
    @jakarta.persistence.Column(name = "image_url")
    private String imageUrl;
    @jakarta.persistence.Column(name = "saved_at")
    private String savedAt;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getNewSite() {
        return newSite;
    }

    public void setNewSite(String newSite) {
        this.newSite = newSite;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getSavedAt() {
        return savedAt;
    }

    public void setSavedAt(String savedAt) {
        this.savedAt = savedAt;
    }


}
