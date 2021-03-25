package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.WriterCntVO;

public interface BoardMapper {
	//글 목록 가져오기
	public List<BoardVO> getList();
	//글 쓰기
	public void insert(BoardVO board);
	//글 상세보기
	public BoardVO read(int bno);
	//글 삭제하기
	public int delete(int bno);
	//글수정
	public int update(BoardVO board);
	//전체 글 개수 구하기
	public int count();
	//글 검색
	public List<BoardVO> searchList();
	//작성 글 카운트
	public List<WriterCntVO> writercnt();
}
