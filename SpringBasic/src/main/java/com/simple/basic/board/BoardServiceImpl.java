package com.simple.basic.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simple.basic.command.BoardVO;

@Service("a") 
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void regist(BoardVO vo) {

		boardMapper.regist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boardMapper.getList();
	}

	@Override
	public void delete(int bno) {
		
		boardMapper.delete(bno);
	}

}
