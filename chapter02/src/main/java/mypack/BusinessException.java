package mypack;

public class BusinessException extends Exception {

    private static final long serialVersionUID = 1L;

    public BusinessException() {
    }

    public BusinessException(String msg) {
        super(msg);
    }
}
