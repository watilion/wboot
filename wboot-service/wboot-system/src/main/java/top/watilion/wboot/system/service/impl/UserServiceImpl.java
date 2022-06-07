package top.watilion.wboot.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.watilion.wboot.system.dao.UserDao;
import top.watilion.wboot.system.po.UserPo;
import top.watilion.wboot.system.service.UserService;

/**
 * @author watilion
 * @date 2022/5/21 17:41
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserPo> implements UserService {
}
