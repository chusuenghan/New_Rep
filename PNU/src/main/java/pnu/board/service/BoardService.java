package pnu.board.service;

import java.util.List;

import pnu.board.vo.BoardVO;

public interface BoardService {
	public int insertBoard(BoardVO board);
	public List<BoardVO> selectBoardList();
	public BoardVO selectBoard(int boardId);
}
