package com.sparta.week03.service;

import com.sparta.week03.domain.Memo;
import com.sparta.week03.domain.MemoRepository;
import com.sparta.week03.domain.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service //spring에게 서비스임을 알려준다.
public class MemoService {

    private final MemoRepository memoRepository; //반드시 생성자가 있어야 한다.

    @Transactional // update할 때 db에 진짜 반영 되야 한다고 알려주는 것.
    public Long update(Long id, MemoRequestDto requestDto) { //파라미터 : 변경시킬 id,그리고 변경할 내용에 대한 정보
        Memo memo = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        memo.update(requestDto);
        return memo.getId(); //변경한 녀석의 id를 리턴한다.
    }
}

/*
    필요한 정보를 찾는다. => memoRepository.findById(id)
    업데이트 해야 한다.
 */