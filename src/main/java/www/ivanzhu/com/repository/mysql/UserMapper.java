package www.ivanzhu.com.repository.mysql;

import www.ivanzhu.com.repository.mysql.po.UserPO;

import java.util.List;

/**
 * @author ivanzhu
 */
public interface UserMapper {

    List<UserPO> queryAll();
}
