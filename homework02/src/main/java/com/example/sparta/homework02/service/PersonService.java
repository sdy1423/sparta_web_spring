package com.example.sparta.homework02.service;

import com.example.sparta.homework02.domain.Person;
import com.example.sparta.homework02.domain.PersonRepository;
import com.example.sparta.homework02.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service //스프링에게 이 클래스가 서비스임을 암시한다.
public class PersonService {

    //final : 서비스에게 꼭 필요한 것임을 명시한다. (변경 불가)
    private final PersonRepository personRepository;

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌 -> 자동으로 DB에 적용
    public Long update(Long id, PersonRequestDto requestDto){
        Person person1 = personRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("해당 아이디가 없습니다.")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
