public class Person {
    String name;
    String surename;
    int age;
    SexType sex;

    public Person(String name, String surename, int age, SexType sex){
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString(){
        
        return "Person{"+
        " name = " + name +
        " surename = " + surename +
        " age = " + age +
        " sex = " + sex +
        " }";
    }
}
