package helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//COntroller

@RestController
public class HelloWorldController {
	
	//GET
	//URI -/hello-world
	//method - "Hello World"
	
	
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello world";
	}
	
	//returning beans
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello world");
	}
	
	//hello-world/path-variable/in28minutes
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean HelloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world,%s",name));
	}

}
 