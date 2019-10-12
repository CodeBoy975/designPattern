package com.yao.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjie_yao
 * @date 2019/10/1214:45
 */
public class Employee {

    /**
     *  姓名
     */
    private String name;

    /**
     *  部门
     */
    private String dept;

    /**
     *  工资
     */
    private int salary;

    /**
     *  管理的员工
     */
    private List<Employee> subordinates;

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    /**
     *  添加对应管理的员工
     * @param employee
     */
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    /**
     *  移除对应管理的员工
     * @param employee
     */
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", subordinates=" + subordinates +
                '}';
    }
}
