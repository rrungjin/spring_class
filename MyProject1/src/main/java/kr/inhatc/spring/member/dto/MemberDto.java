package kr.inhatc.spring.member.dto;

import lombok.Data;

// DTO : Data Transfer Object (데이터 전달 객체)
@Data
public class MemberDto {
	private String memberid;
	private String role;
	private String pw;
	private String name;
	private String joindate;
	private String enabled;
	private String email;
	
	
}
