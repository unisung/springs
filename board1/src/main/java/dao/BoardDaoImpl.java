package dao;
import java.util.List;

import model.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibatis.sqlmap.client.SqlMapClient;
@Repository
@Transactional
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlMapClientTemplate mapper; 
	public List<Board> list() {
		return mapper.queryForList("listAll");
	}
	public int totalCnt() {
		return (Integer)mapper.queryForObject("totalCnt");
	}
	public int searchCnt() {
		return (Integer)mapper.queryForObject("searchCnt");
	}
	public List<Board> search(String search) {
		return mapper.queryForList("listSearch",search);
	}
	public void insert(Board board) {
		mapper.insert("insert",board);
	}
	public Board select(int id) {
		return (Board)mapper.queryForObject("select",id);
	}
	public void hitUpdate(int id) {
		mapper.update("hitUpdate",id);			
	}
	public int update(Board board) {
		return mapper.update("update",board);
	}
	public int delete(int id) {
		return mapper.delete("delete",id);
	}
}