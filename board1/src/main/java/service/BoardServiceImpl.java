package service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BoardDao;
import model.Board;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDao bd;
	public List<Board> list() {
		return bd.list();
	}
	public List<Board> search(String search) {
		return bd.search(search);
	}
	public void insert(Board board) {
		bd.insert(board);
	}
	public Board select(int id) {
		return bd.select(id);
	}
	public void hitUpdate(int id) {
		bd.hitUpdate(id);
	}
	public int totalCnt() {
		return bd.totalCnt();
	}
	public int searchCnt() {
		return bd.searchCnt();
	}
	public int update(Board board) {
		return bd.update(board);
	}
	public int delete(int id) {
		return bd.delete(id);
	}
}