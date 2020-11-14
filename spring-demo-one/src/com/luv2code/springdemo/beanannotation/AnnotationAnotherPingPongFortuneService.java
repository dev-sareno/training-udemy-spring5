package com.luv2code.springdemo.beanannotation;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.beanlifecycle.BeanLifecycle;

@Component
public class AnnotationAnotherPingPongFortuneService implements FortuneService, BeanLifecycle {
	
	@Value("${foo.fortunes.filePath}")
	private String fortunesFilePath;
	
	private String fortunes = "";

	@Override
	public String getFortune() {
		return this.fortunes.split("\\u007C")[new Random().nextInt(this.fortunes.split("\\u007C").length)];
	}

	@PostConstruct
	@Override
	public void onInit() {
		Path path = Path.of(URI.create("file:/C:/Users/EladioSareno/Documents/Jay-ar/Udemy/spring5/eclipse-workspace/spring-demo-one/src/com/luv2code/springdemo/beanannotation/fortunes.txt"));
		try {
			this.fortunes = Files.readString(path, StandardCharsets.UTF_8);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	@PreDestroy
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		
	}

}
