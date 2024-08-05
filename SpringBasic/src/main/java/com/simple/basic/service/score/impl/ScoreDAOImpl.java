package com.simple.basic.service.score.impl;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.basic.command.ScoreVO;

@Repository("y") //component-scan <--
public class ScoreDAOImpl implements ScoreDAO {
	
	@Autowired
	DataSource ds;
	
	//DB
	ArrayList<ScoreVO> list = new ArrayList<>();
	
	@Override
	public void regist(ScoreVO vo) {
//		list.add(vo); //insert완료
		
		//insert작업...
	}

	@Override
	public ArrayList<ScoreVO> getScore() {
		//select...
		return null;
	}

	@Override
	public void delete(int sno) {
//		list.remove(sno); //인덱스 번호로 삭제
		//remove작업...
	}

}
