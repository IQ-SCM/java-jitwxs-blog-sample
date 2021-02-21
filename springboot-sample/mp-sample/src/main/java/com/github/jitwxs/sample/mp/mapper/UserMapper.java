package com.github.jitwxs.sample.mp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.github.jitwxs.sample.mp.enity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jitwxs
 * @since 2018-03-19
 */
public interface UserMapper extends BaseMapper<User> {
    /*
    编写自定义查询方式和MyBatis相同：
    @Select("SELECT * FROM mp_user WHERE sex = #{sex}")
    List<User> listUserBySex(@Param("sex") String sex);
    */
}