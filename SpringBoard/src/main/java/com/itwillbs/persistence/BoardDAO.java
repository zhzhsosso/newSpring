package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardDAO {

	// 서버시간정보 조회
	public String getTime();
	
	// 게시판 글쓰기
	public void createBoard(BoardVO vo) throws Exception;
	
	// 게시판 목록(All)
	public List<BoardVO> getBoardListAll() throws Exception;
	
	// 글 조회수 1증가
	public void updateViewcnt(Integer bno) throws Exception;
	
	// 글번호(bno)를 사용한 정보 조회
	public BoardVO getBoard(Integer bno) throws Exception;
	
	// 글정보 수정
	/**
	 * 글정보 수정하는 메서드
	 * @param vo
	 * @return 수정여부 0,1
	 * @throws Exception
	 */
	public Integer updateBoard(BoardVO vo) throws Exception;
	
	//글정보 삭제
	public void deleteBoard(Integer bno) throws Exception;
	
	
}
