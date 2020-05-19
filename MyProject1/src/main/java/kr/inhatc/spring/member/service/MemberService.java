package kr.inhatc.spring.member.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.dto.FileDto;
import kr.inhatc.spring.member.dto.MemberDto;

@Service
public interface MemberService {

	List<MemberDto> memberList();

	MemberDto memberDetail(String member_id);

	void memberInsert(MemberDto board);

	

}
