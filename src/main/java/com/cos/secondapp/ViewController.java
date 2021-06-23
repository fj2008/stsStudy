package com.cos.secondapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//컴포넌트 스켄시에 @RestController, @Controler를 IOC에 등록한다.
//디스페쳐는 위 두개를 관리한다.
//차이점은 @RestController는 데이터를 응답, @Controller는 View를 응답한다.


@Controller
public class ViewController {

	@GetMapping("/home")
	public String home() {
		System.out.println("나호출 됐음?");
		return "home";//ViewResolver가 발동=> src/main/webapp/WEB-INF/views
	}
}
