package hello.recordexam.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRcvRepository extends JpaRepository<TestRcv,String> {

}
