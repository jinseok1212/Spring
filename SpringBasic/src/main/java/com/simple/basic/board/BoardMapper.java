package com.simple.basic.board;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.simple.basic.command.BoardVO;

@Mapper
public interface BoardMapper {

	void regist(BoardVO vo); //등록
	public ArrayList<BoardVO> getList(); //조회
	public void delete(int bno); //삭제
}
