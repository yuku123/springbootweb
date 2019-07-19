/**
 * 2015-2016 龙果学院 (www.roncoo.com)
 */
package com.zifang.springboot.web.restful;

import com.zifang.springboot.web.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

/**
 * spring-boot-demo-2-1
 * 
 * @author wujing
 */
@RestController
@RequestMapping(value = "/test_restful")
public class IndexController {

	@Value(value = "${roncoo.secret}")
	private String secret;

	@Value(value = "${roncoo.number}")
	private int id;

	@Value(value = "${roncoo.desc}")
	private String desc;

	// @RequestParam 简单类型的绑定，可以出来get和post
	@RequestMapping(value = "/get")
	public HashMap<String, Object> get(@RequestParam String name) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("title", "hello world");
		map.put("name", name);
		map.put("secret", secret);
		map.put("id", id);
		map.put("desc", desc);
		return map;
	}

	// @PathVariable 获得请求url中的动态参数
	@RequestMapping(value = "/get/{id}/{name}")
	public User getUser(@PathVariable int id, @PathVariable String name) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setDate(new Date());
		return user;
	}

}
