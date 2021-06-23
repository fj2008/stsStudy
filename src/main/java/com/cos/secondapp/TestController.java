package com.cos.secondapp;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//이렇게 하면 자동 컨트롤러가 된다
//사용자가 주소요청을 할때 그 주소요청을 받는 것이 컨트롤러
//그래서 이렇게 붙여주면 요청이 들어오면 다 이 컨트롤러로 들어온다
//http://localhost:8000여기까지 도착한다 
//그리고 어떤 것을 사용할지 @GetMapping애너테이션을 사용한다
public class TestController {
	
	//http://localhost:8000/
	@GetMapping("/")
	public String get() {
		return "get"; // MessageConverter->String->text/plain
	}

	//http://localhost:8000/
	@PostMapping("/")
	public User post(User data) {
		System.out.println(data.getUsername());
		System.out.println(data.getPassword());
		return data; // MessageConverter->User(오브젝트일때만)->application/json
	}	
	
	//http://localhost:8000/
	@PutMapping("/")
	public String put(@RequestBody User data) {//x-www-form-urlencoded기본전략, (오브젝트로 받으면 자동 파싱)
		System.out.println(data.getUsername()); // @ReqeustBody =>BufferedReader(오브젝트로 받으면 자동 파싱)
		return "put";//text/plain
	}	
	
	//http://localhost:8000/
	@DeleteMapping("/")
	public String delete() {
		return "delete";//text/plain
	}
}
