package com.simple.basic.board;

import java.util.ArrayList;

import com.simple.basic.command.BoardVO;

public interface BoardService {
	void regist(BoardVO vo); //등록
	public ArrayList<BoardVO> getList(); //조회
	public void delete(int bno); //삭제
}
