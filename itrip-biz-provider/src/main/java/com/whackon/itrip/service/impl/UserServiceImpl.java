package com.whackon.itrip.service.impl;

import com.whackon.itrip.dao.UserDao;
import com.whackon.itrip.pojo.entity.User;
import com.whackon.itrip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>爱旅行-用户信息业务层接口实现类</b>
 * @author ggf
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	/**
	 * <b>根据查询对象查询用户信息列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	public List<User> getListByQuery(User query) throws Exception{
		// 调用数据持久层查询列表信息
		return userDao.findListByQuery(query);
	}
}
