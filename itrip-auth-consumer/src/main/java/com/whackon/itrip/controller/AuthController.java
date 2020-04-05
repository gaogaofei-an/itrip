package com.whackon.itrip.controller;

import com.whackon.itrip.base.controller.BaseController;
import com.whackon.itrip.base.pojo.vo.ResponseDto;
import com.whackon.itrip.pojo.entity.User;
import com.whackon.itrip.pojo.vo.UserVO;
import com.whackon.itrip.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.Query;
import java.util.List;

/**
 * <b>爱旅行-认证模块控制器</b>
 * @author ggf
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("authController")
@RequestMapping("/auth/api")
public class AuthController extends BaseController {
	@Autowired
	private UserTransport userTransport;
	/**
	 * <b>用户名注册验证-电子邮件</b>
	 * @param name
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/ckusr")
	public ResponseDto<Object> checkUserEmailForRegistry(String name) throws Exception{
		// 校验用户所提交的电子邮件是否有效（是否为空，以及是不是一个电子邮件格式）
		if (name != null && !"".equals(name.trim())) {
			// 校验通过之后，通过注册中心找到对应的生产者进行数据库校验
			//封装查询对象
			User query = new User();
			query.setUserCode(name);
			//进行查询
			List<User> userList = userTransport.getListByQuery(query);
			// 进行结果判断
			if (userList == null || userList.size() == 0) {
				// 此时用户注册时所填写的邮箱地址可用
				return ResponseDto.success();
			}
		}

		return ResponseDto.failure("该邮箱地址已被注册");
	}
	/**
	 * <b>使用电子邮件注册用户信息</b>
	 * @param userVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/doregister")
	public ResponseDto<Object> registryUser(UserVO userVO) throws Exception {
		return ResponseDto.failure("注册失败");
	}
}
