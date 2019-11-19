package io.fidelmohabir.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.fidelmohabir.beans.HomeLinksBean;


public interface HomeLinksDao {

	public List<HomeLinksBean> getLinks();
}
