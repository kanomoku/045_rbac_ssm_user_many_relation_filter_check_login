package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.pojo.Url;

public interface UrlMapper {
	@Select("select * from url where id in (select uid from role_url where rid=#{0})")
	List<Url> selByRid(int rid);
	/**
	 * 查询全部
	 * @return
	 */
	@Select("select * from url")
	List<Url> selAll();
}
