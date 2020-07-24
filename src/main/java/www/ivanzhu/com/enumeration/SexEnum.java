package www.ivanzhu.com.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author ivanzhu
 * @date 2020/7/23
 * @time 18:24
 */
@Getter
@AllArgsConstructor
public enum SexEnum implements BaseEnum {
    /**
     * 性别枚举
     */
    UN_KNOWN(0, "未知"),
    MAN(1, "男性"),
    WOMAN(2, "女性")
    ;

    private final int id;
    private final String name;

    public int gerId() {
        return 0;
    }
}
