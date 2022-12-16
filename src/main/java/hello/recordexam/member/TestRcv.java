package hello.recordexam.member;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class TestRcv {

    @Id
    private String sndId;
    private String sndName;
    private String sndNo;


    @Builder
    public TestRcv(String sndId,String sndName, String sndNo){
        this.sndId =sndId;
        this.sndName = sndName;
        this.sndNo = sndNo;
    }

}
