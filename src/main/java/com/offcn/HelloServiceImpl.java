package com.offcn;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello() {
		

		return "欢迎来here学习";
	}

}
