package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.WriterCntVO;

public interface BoardService {
	//글 목록 보기
	public List<BoardVO> getList();
	//글 쓰기
	public void register(BoardVO board);
	//글 삭제
	public boolean remove(int bno);
	//글 수정
	public boolean modify(BoardVO board);
	//글 읽기
	public BoardVO get(int bno);
	//카운트
	public List<WriterCntVO> writercnt();
}
