package org.openSource.ceshidao;

import org.openSource.pojo.UserBean;

public interface UserMapper {
    /**
     *
     * @param id 传入的用户id
     * @return 查询到的用户数据
     */
    public abstract UserBean selectOne(int id);
}
