package jp.te4a.spring.boot.myapp1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* Hello world!
*
*/
@RestController
public class HelloController
{
@RequestMapping("/")
public String index() {
return "Hello, Spring Boot!";
}
}
