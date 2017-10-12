package spring.condition;

/**
 * Created by zhao on 2017/2/7.
 */
public class WindowsListServiceImpl implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
