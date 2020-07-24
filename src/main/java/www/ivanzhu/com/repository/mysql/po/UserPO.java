package www.ivanzhu.com.repository.mysql.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import www.ivanzhu.com.enumeration.SexEnum;

/**
 * @author ivanzhu
 * @date 2020/7/23
 * @time 18:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPO {
    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 用户年龄
     */
    private Integer age;
    /**
     * 用户电话
     */
    private String phone;
    /**
     * 性别
     */
    private SexEnum sex;
}
