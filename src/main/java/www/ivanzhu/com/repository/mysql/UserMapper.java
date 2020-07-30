package www.ivanzhu.com.repository.mysql;

import www.ivanzhu.com.repository.mysql.po.UserPO;

import java.util.List;

/**
 * @author ivanzhu
 */
public interface UserMapper {

    List<UserPO> queryAll();
    default void queryAll2(){
        System.out.println("哈哈哈哈");
        return;
    }
}
