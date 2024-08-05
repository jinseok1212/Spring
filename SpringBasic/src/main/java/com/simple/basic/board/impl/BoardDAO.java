package com.simple.basic.board.impl;

import java.util.ArrayList;

import com.simple.basic.command.ScoreVO;

public interface BoardDAO {
	void regist(ScoreVO vo); //등록
	public ArrayList<ScoreVO> getScore(); //조회
	public void delete(int sno); //삭제
}
