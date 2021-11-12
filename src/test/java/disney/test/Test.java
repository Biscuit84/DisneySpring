package disney.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import disney.App.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
