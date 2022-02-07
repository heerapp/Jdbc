package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDao dao = (EmployeeDao)ctx.getBean("edao");
        dao.saveEmployeeByPreparedStatement(new Employee(108,"Amit",35000));
        List<Employee> list = dao.getAllEmployees();

        for (Employee e:list){
            System.out.println(e);
        }

    }
}
