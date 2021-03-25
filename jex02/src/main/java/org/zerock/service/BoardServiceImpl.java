package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.WriterCntVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public void register(BoardVO board) {
		mapper.insert(board);
	}

	@Override
	public boolean remove(int bno) {
		return mapper.delete(bno) == 1;
	}

	@Override
	public boolean modify(BoardVO board) {
		return mapper.update(board) == 1;
	}

	@Override
	public BoardVO get(int bno) {
		return mapper.read(bno);
	}
	
	@Override
	public List<WriterCntVO> writercnt() {
		return mapper.writercnt();
	}

}
