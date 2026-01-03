package com.rahultech.webmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    /*	 older way of reading data
	@PostMapping("/displayBook")
	public String displayBook(HttpServletRequest request) {
		int bid= Integer.parseInt(request.getParameter("bid"));
		retrun some string value
	}*/
	
	// Spring boot way of reading HTML data: 
	// Just use @RequestParam annotation
	
	@PostMapping("/displayBook")
	public String displayBook(@RequestParam int bid, String bname, int price, Model model) {
		Book b =new Book();
		b.setBid(bid);
		b.setBname(bname);
		b.setPrice(price);
		model.addAttribute("book", b);
		return "display"; // view file name is display.jsp
		
	}
	

}
