package ExceptionStudy;

public class BizException extends RuntimeException{
    public BizException(String msg){
        super(msg);

    }
    public BizException(ExceptionExam ex){
        super(ex);
    }
}
