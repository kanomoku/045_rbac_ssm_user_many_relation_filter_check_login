package com.service;

import java.util.List;

import com.pojo.Url;

public interface UrlService {
	List<Url> selByRid(int rid);
	
	List<Url> showAll();
}
