package service;
import java.util.List;
import model.Board;
public interface BoardService {
	List<Board> list();
	void insert(Board board);
	Board select(int id);
	void hitUpdate(int id);
	int update(Board board);
	int delete(int id);
	List<Board> search(String search);
	int totalCnt();
	int searchCnt();
}