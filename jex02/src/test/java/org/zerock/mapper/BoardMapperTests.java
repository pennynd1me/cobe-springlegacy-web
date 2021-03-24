package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { org.zerock.config.RootConfig.class })
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;

	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
//		List<BoardVO> list = mapper.getList();
//				for(BoardVO temp: list) {
//					log.info("이거다 !!!" + temp.getTitle());
//				}
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새 글 작성");
		board.setContent("새 내용 작성");
		board.setWriter("newbie");
		mapper.insert(board);
		log.info("무야호 " + board);
	}
	
	@Test
	public void testRead() {
		log.info("글 하나 가져오기 " + mapper.read(1));
	}
	
	@Test
	public void testDelete() {
		log.info("글 하나 삭제하기 " + mapper.delete(1));
	}
	
	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setTitle("수정제목");
		board.setContent("수정 내용");
		board.setWriter("수정자");
		board.setBno(2);
		
		log.info("업데이트 개수:" + mapper.update(board));
	}
	
	@Test
	public void testCount() {
		log.info("전체글 개수" + mapper.count());
	}
}
