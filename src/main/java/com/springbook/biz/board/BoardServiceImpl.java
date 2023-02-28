package com.springbook.biz.board;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbook.biz.common.LogAdvice;
import com.springbook.biz.common.Log4jAdvice;


@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;
	
	public void insertBoard(BoardVO vo) {
		//log.printLogging();
		//if(vo.getSeq() == 0) {
			//throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
		//}
		boardDAO.insertBoard(vo);
		//boardDAO.insertBoard(vo);
	}
	public void updateBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.updateBoard(vo);
	}
	public void deleteBoard(BoardVO vo) {
		//log.printLogging();
		boardDAO.deleteBoard(vo);
	}
	public BoardVO getBoard(BoardVO vo) {
		//log.printLogging();
		return boardDAO.getBoard(vo);
	}
	public List<BoardVO> getBoardList(BoardVO vo) {
		//log.printLogging();
		return boardDAO.getBoardList(vo);
	}	

}
