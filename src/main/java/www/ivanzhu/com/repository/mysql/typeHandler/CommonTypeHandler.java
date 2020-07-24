package www.ivanzhu.com.repository.mysql.typeHandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import www.ivanzhu.com.enumeration.BaseEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ivanzhu
 * @date 2020/7/23
 * @time 18:32
 */
public class CommonTypeHandler extends BaseTypeHandler<BaseEnum> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, BaseEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.gerId());
    }
    @Override
    public BaseEnum getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return null;
    }
    @Override
    public BaseEnum getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return null;
    }
    @Override
    public BaseEnum getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return null;
    }
}
