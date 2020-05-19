package kr.inhatc.spring.member.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.dto.FileDto;
import kr.inhatc.spring.board.mapper.BoardMapper;
import kr.inhatc.spring.member.dto.MemberDto;
import kr.inhatc.spring.member.mapper.MemberMapper;
import kr.inhatc.spring.utils.FileUtils;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Override
	public List<MemberDto> memberList() {

		return memberMapper.memberList();
	}

	@Override
	public void memberInsert(MemberDto board) {
		// TODO Auto-generated method stub
		memberMapper.memberInsert(board);

	}

	@Override
	public MemberDto memberDetail(String memberid) {
		// TODO Auto-generated method stub
		MemberDto board = memberMapper.memberDetail(memberid);
		return board;
	}

}

