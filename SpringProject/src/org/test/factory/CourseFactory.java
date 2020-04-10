package org.test.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.newinstance.HtmlCourse;
import org.test.newinstance.Icourse;
import org.test.newinstance.JavaCourse;

//�γ̹������ڲ����γ�
public class CourseFactory {
//	�������ֻ�ȡ�γ�
	public static Icourse getCourse(String name) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(name);
		if(name.equals("java")) {
			return (Icourse)context.getBean("javaCourse");
		}else {
			return (Icourse)context.getBean("htmlCourse");
		}
	} 
}
