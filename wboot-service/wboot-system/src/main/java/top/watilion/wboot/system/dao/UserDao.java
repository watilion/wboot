package top.watilion.wboot.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import top.watilion.wboot.system.po.UserPo;

/**
 * @author watilion
 * @date 2022/5/21 17:37
 */
@Mapper
@Repository
public interface UserDao extends BaseMapper<UserPo> {
}
