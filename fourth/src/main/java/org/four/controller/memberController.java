package org.four.controller;

import org.four.domain.memberVO;
import org.four.service.memberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class memberController {
	
	private static final Logger logger=LoggerFactory.getLogger(memberController.class);
	
	@Autowired
	private memberService service;
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinPOST(memberVO member) throws Exception{
		
		logger.info("join 吏꾩엯");
		
		service.memberJoin(member);
		
		logger.info("join Service �꽦怨�");
		
		return "redirect:/main";
	}
	
	//濡쒓렇�씤 �럹�씠吏� �씠�룞
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void joinGET() {
		
		logger.info("濡쒓렇�씤 �럹�씠吏� 吏꾩엯");
		
	}

}
