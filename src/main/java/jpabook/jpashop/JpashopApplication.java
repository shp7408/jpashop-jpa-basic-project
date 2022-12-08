package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		Hello hello = new Hello();
		hello.setData("Hello");
		String data = hello.getData();

		/*
		* hello.getD.. 치고난 후, control + option + v 단축키 누르면,
		* String data = 부분을 자동완성 해준다. extract variable 기능
		 * */
		System.out.println("data = " + data );

		SpringApplication.run(JpashopApplication.class, args);
	}

}
