package com.simple.basic.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper //다는것이 좋음 (mapper라는 의미)
public interface TestMapper {
	public String getTime();
}
