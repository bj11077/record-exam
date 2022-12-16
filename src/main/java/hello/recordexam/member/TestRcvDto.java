package hello.recordexam.member;

public record TestRcvDto(String sndId, String sndName, String sndNo) {

    public TestRcvDto(TestRcv entity){
       this(entity.getSndId(),entity.getSndName(),entity.getSndNo());
    }

    public TestRcv toEntity(){
        return TestRcv.builder().sndId(this.sndId).sndName(this.sndName).sndNo(this.sndNo).build();
    }
}
