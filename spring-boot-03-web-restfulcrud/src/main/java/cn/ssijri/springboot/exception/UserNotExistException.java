package cn.ssijri.springboot.exception;

/**
 * @author inta
 * @date 2019/3/12
 * @describe
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
