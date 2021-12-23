package com.sparta.week02;

import com.sparta.week02.domain.Course; //정보를 가져온다.
import com.sparta.week02.domain.CourseRepository;
import com.sparta.week02.service.CourseService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing //이게 있어야 생성일자, 수정일자에 따라 날자가 자동으로 업데이트 될 것이다. 
@SpringBootApplication
public class Week02Application {

    public static void main(String[] args) {
        SpringApplication.run(Week02Application.class, args);
    }


/*
    @Bean
    public CommandLineRunner demo(CourseRepository repository) {
        //repository : SQL쿼리를 날린다.
        return (args) -> {
			*/
/*
			Course course1 = new Course("웹개발의 봄 Spring","남병관");
			repository.save(course1);

			//	내가 작성한 메소드가 아님. JPA에 이미 만들어져 있기 때문에 쓰기만 하면 된다.

			List<Course> courseList = repository.findAll();

			//	SELECT * FROM course; 대신 메소드 사용하기만 하면 된다.
			//	여러개가 오니까 List에 담아라.

			for(int i=0;i<courseList.size();i++){
//				System.out.println(courseList.get(i));
				System.out.println(courseList.get(i).getTitle());
				System.out.println(courseList.get(i).getTutor());
			}
			*//*



            // [2-7]
            // 데이터 저장하기
            repository.save(new Course("프론트엔드의 꽃, 리액트", "임민영"));

            // 데이터 전부 조회하기
            List<Course> courseList = repository.findAll();
            for (int i = 0; i < courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

            // 데이터 하나 조회하기
            Course course = repository.findById(1L).orElseThrow(
                    () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
                    //해당 Id가 없으면 던진다.
                    //Id를 2로 바꾸면 오류 확인 가능
            );

        };
    }
*/

    /*
    //UpDate 실행해보기
    @Bean
    public CommandLineRunner demo(CourseRepository courseRepository, CourseService courseService) {
        return (args) -> {
            courseRepository.save(new Course("프론트엔드의 꽃, 리액트", "임민영"));

            System.out.println("데이터 인쇄");
            List<Course> courseList = courseRepository.findAll();
            for (int i=0; i<courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

            Course new_course = new Course("웹개발의 봄, Spring", "임민영");
            courseService.update(1L, new_course);
            courseList = courseRepository.findAll();
            for (int i=0; i<courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }
        };
    }

    */

    //Delete 해보기
    @Bean
    public CommandLineRunner demo(CourseRepository courseRepository, CourseService courseService) {
        return (args) -> {
            courseRepository.save(new Course("프론트엔드의 꽃, 리액트", "임민영"));

            System.out.println("데이터 인쇄");
            List<Course> courseList = courseRepository.findAll();
            for (int i=0; i<courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

            Course new_course = new Course("웹개발의 봄, Spring", "임민영");
            courseService.update(1L, new_course);
            courseList = courseRepository.findAll();
            for (int i=0; i<courseList.size(); i++) {
                Course course = courseList.get(i);
                System.out.println(course.getId());
                System.out.println(course.getTitle());
                System.out.println(course.getTutor());
            }

            courseRepository.deleteAll();
        };
    }
}
