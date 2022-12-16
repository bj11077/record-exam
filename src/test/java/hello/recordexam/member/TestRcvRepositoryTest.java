package hello.recordexam.member;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class TestRcvRepositoryTest {

    @Autowired
    TestRcvRepository repository;


    @Test
    void TestRcvFindAll(){
        List<TestRcv> result = repository.findAll();
        result.stream().map(TestRcvDto::new).forEach(e-> System.out.println(e.sndId()));

    }

}