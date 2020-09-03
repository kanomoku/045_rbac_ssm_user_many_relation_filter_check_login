package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.UrlMapper;
import com.pojo.Url;
import com.service.UrlService;

@Service
public class UrlServiceImpl implements UrlService {
	@Resource
	private UrlMapper urlMapper;
	@Override
	public List<Url> selByRid(int rid) {
		return urlMapper.selByRid(rid);
	}
	@Override
	public List<Url> showAll() {
		return urlMapper.selAll();
	}

}
