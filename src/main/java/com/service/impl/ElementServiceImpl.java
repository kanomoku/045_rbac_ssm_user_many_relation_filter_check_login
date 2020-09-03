package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.ElementMapper;
import com.pojo.Element;
import com.service.ElementService;

@Service
public class ElementServiceImpl implements ElementService {
	@Resource
	private ElementMapper elementMapper;
	@Override
	public List<Element> selByRid(int rid) {
		return elementMapper.selByRid(rid);
	}

}
