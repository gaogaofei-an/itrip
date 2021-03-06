package com.whackon.itrip.service;

import com.whackon.itrip.pojo.entity.User;

import java.util.List;

/**
 * <b>爱旅行-用户信息业务层接口</b>
 * @author ggf
 * @version 1.0.0
 * @since 1.0.0
 */

public interface UserService {
	/**
	 * <b>根据查询对象查询用户信息列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> getListByQuery(User query) throws Exception;

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean saveUser(User user) throws Exception;
}
