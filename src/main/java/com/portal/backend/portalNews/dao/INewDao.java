package com.portal.backend.portalNews.dao;

import com.portal.backend.portalNews.model.New;
import org.springframework.data.jpa.repository.JpaRepository;

public interface INewDao extends JpaRepository<New, Long> {

}
