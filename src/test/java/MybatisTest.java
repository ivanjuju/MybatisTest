import com.alibaba.fastjson.JSON;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import www.ivanzhu.com.repository.mysql.UserMapper;
import www.ivanzhu.com.repository.mysql.po.UserPO;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ivanzhu
 * @date 2020/7/23
 * @time 18:35
 */

public class MybatisTest {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        List<Object> objects = sqlSession.selectList("www.ivanzhu.com.repository.mysql.UserMapper.queryAll");
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<UserPO> userPOS = mapper.queryAll();
            System.out.println(JSON.toJSONString(userPOS));
    }
}
