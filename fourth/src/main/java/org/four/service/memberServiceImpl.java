package org.four.service;

import org.four.domain.memberVO;
import org.four.mapper.memberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memberServiceImpl implements memberService {
	
	@Autowired
	memberMapper mapper;

	@Override
	public void memberJoin(memberVO member) throws Exception {
		// TODO Auto-generated method stub
		
		mapper.memberJoin(member);

	}

}
