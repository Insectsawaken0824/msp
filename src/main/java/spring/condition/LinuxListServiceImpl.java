package spring.condition;

/**
 * Created by zhao on 2017/2/7.
 */
public class LinuxListServiceImpl implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
