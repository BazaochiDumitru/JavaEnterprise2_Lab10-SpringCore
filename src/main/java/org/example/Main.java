package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Crearea și inițializarea unui container Spring ApplicationContext, încărcând fișierul "beans.xml"
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("beans.xml");

        // Obținerea unui obiect "Hello" din containerul Spring folosind numele "nume1" specificat în fișierul "beans.xml"
        Hello myBean = (Hello) beanFactory.getBean("nume1");
        myBean.printHello();

        myBean = (Hello) beanFactory.getBean("nume2");
        myBean.printHello();
    }
}