package controller;
import java.util.List;

import model.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.BoardService;
@Controller
public class BoardController {
	@Autowired
	private BoardService bs;
	@RequestMapping(value="list")
	public String list(Model model) {
		int total = bs.totalCnt();
		List<Board> list = bs.list();
		model.addAttribute("list",list);
		model.addAttribute("total",total);
		return "list";
	}
	@RequestMapping(value="writeForm")
	public String writeForm() {
		return "writeForm";
	}
	@RequestMapping(value="write",method=RequestMethod.POST)
	public String write(Board board, Model model) {
		bs.insert(board);
		return "redirect:list.do";	
	}
	@RequestMapping(value="detail")
	public String detail(int id, Model model) {
		Board board = bs.select(id);
		bs.hitUpdate(id);
		model.addAttribute("board", board);
		return "detail";
	}
	@RequestMapping(value="updateForm")
	public String updateForm(int id, Model model) {
		Board board = bs.select(id);
		model.addAttribute("board", board);
		return "updateForm";
	}
	@RequestMapping(value="update")
	public String update(Board board, Model model) {
		int result = bs.update(board);
		if (result > 0) {	return "redirect:list.do";
		} else {	
			return "redirect:updateForm.do?id="+board.getId();
		}
	}
	@RequestMapping(value="delete")
	public String delete(int id, Model model) {
		int result = bs.delete(id);
		if (result > 0) {	return "redirect:list.do";
		} else {	
			model.addAttribute("msg", "삭제 완료");
			return "forward:detail.do?id="+id;
		}
	}
	@RequestMapping(value="search")
		public String search(String search, Model model) {
		int total = bs.searchCnt();
		List<Board> list = bs.search(search);
		model.addAttribute("total", total);
		model.addAttribute("list",list);
		return "list";
	}
}