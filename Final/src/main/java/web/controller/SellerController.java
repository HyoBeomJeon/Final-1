package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SellerController {
	
	@RequestMapping(value="/seller/main", method=RequestMethod.GET)
	public void sellerMain() { }

}
