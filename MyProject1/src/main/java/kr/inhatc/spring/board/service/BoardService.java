package kr.inhatc.spring.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.dto.FileDto;

@Service
public interface BoardService {

	List<BoardDto> boradList();

	void boardInsert(BoardDto board, MultipartHttpServletRequest multipartHttpServletRequest);

	BoardDto boardDetail(int boardIdx);

	void boardUpdate(BoardDto board);

	void boardDelete(int boardIdx);

	FileDto selectFileInfo(int idx, int boardIdx);

}
