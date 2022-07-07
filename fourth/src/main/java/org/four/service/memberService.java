package org.four.service;

import org.four.domain.memberVO;

public interface memberService {
	
	//회원가입
	public void memberJoin(memberVO member) throws Exception;

}
