package com.xiejiahao.service.impl;

import com.xiejiahao.entity.User;
import com.xiejiahao.mapper.UserMapper;
import com.xiejiahao.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author XieJiaHao
 * @since 2021-12-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
