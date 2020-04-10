package org.test.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test.entity.AllCollectionType;
import org.test.entity.Course;
import org.test.entity.Student;
import org.test.factory.CourseFactory;
import org.test.newinstance.Icourse;

public class Test {
	
	public static void springIoc() {
//		Student student = new Student();
//		student.setStuName("zs");
//		student.setStuAge(20);
//		student.setStuNo(1);
//		System.out.println(student);
		
//		spring�����Ķ���
		ApplicationContext contxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)contxt.getBean("student");
		System.out.println(student);
//		1.new
//		2.
	}
	
	public static void learnCourse() {
//		���ַ�ʽ�Ĵ�������ʮ�ַ�ɢ����ɺ���ά������
//		�Ľ���ʽ1.�����򵥹�����������Ĵ���������м���
		Student student = new Student();
		student.learnHtml();
		student.learnJava();
	}
	
	public static void learnCourseWithFactory() {
//		�Ľ���ʽ1.�����򵥹�����������Ĵ���������м���,�������ά��
//		��Ȼ�򵥹��������˴��룬���Ǵ�����Ȼ�ȽϷ�ɢ�������ף���Ȼ���ԸĽ�
		Student student = new Student();
		student.learn("java");
	}
	
	public static void learnCourseWithIoc() {
//		�Ľ���ʽ2.����IOC������bean�����ö���
//		�÷���������ֻ�Ƕ�new�������滻����δ��ʵ���õ�ioc�ļ���
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = (Student)context.getBean("student");
		student.learn("javaCourse");
		
	}

	public static void testDI() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course course = (Course)context.getBean("course");
		course.showInfo();
		
	}
	
	public static void allCollectionDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AllCollectionType ss = (AllCollectionType)context.getBean("collectionDemo");
		System.out.println(ss);
	}
	
	public static void main(String[] args) {
//		learnCourse();
//		learnCourseWithFactory();
//		learnCourseWithIoc();
//		springIoc();
		testDI();
//		allCollectionDemo();
	}
}
