package dao;
import java.util.List;
import model.Board;
public interface BoardDao {
	List<Board> list();
	List<Board> search(String search);
	void insert(Board board);
	Board select(int id);
	void hitUpdate(int id);
	int update(Board board);
	int delete(int id);
	int totalCnt();
	int searchCnt();
}