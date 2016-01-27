package com.myla;

import com.myla.bean.Person;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {
	// write your code here
        TestLambda testLambda = new TestLambda();
        testLambda.testListStreams();
    }

    public void testListStreams(){
        List<Person> persons = new ArrayList<Person>();
        Person temp = new Person();
        temp.setName("Name1");
        temp.setAge(21);
        temp.setSex("M");
        persons.add(temp);

        temp = new Person();
        temp.setName("Name2");
        temp.setAge(22);
        temp.setSex("F");
        persons.add(temp);

        temp = new Person();
        temp.setName("Name3");
        temp.setAge(23);
        temp.setSex("M");
        persons.add(temp);

        temp = new Person();
        temp.setName("Name4");
        temp.setAge(24);
        temp.setSex("M");
        persons.add(temp);

        //System.out.println(persons.stream().filter(e -> e.getSex().equalsIgnoreCase("m")).count());
        //System.out.println(persons.stream().filter(e -> e.getSex().equalsIgnoreCase("m")).mapToInt(Person :: getAge).sum());
        persons.stream().filter(e -> e.getSex().equalsIgnoreCase("m")).mapToInt(Person :: getAge);
    }
}
