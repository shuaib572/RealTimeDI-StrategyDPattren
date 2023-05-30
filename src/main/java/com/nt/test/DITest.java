package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controlar.MainControlar;
import com.nt.vo.CustomerVO;

public class DITest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		String name = sc.next();
		System.out.println("Enter Customer Addrress:");
		sc.hasNext();
		String add = sc.nextLine();
		System.out.println("Enter Princple Amount:");
		sc.next();
		String pAmt = sc.next();
		System.out.println("Enter rate of intrest:");
		String rate = sc.next();
		System.out.println("Enter Month of intrest");
		String time = sc.next();

		CustomerVO vo = new CustomerVO();
		vo.setCusName(name);
		vo.setCusAddres(add);
		vo.setPamt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		// create ioc

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/conf/ApplicationContext.xml");

		// get Controllar class obj
		MainControlar controllar = factory.getBean("con", MainControlar.class);
		MainControlar ob = new MainControlar();

		// busniness Method
		try {
			String result = controllar.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Try Again");
		}
	}
}
