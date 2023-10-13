package com.webspring.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		NewsPage newsPage = context.getBean(NewsPage.class);

		Project project = newsPage.getNews().getProject();
		System.out.println("Проект: " + project.getProjectName());
		System.out.println("URL сторінки: " + newsPage.getPageUrl());
		System.out.println("Заголовок новини: " + newsPage.getNews().getHeadline());
		System.out.println("Текст новини: " + newsPage.getNews().getContent());
	}
}
