package com.company;


import java.util.Objects;


public final  class Person {
    private final String firstName;
    private final  String secondName;
    private final String sex;
    private final int age;

    public Person(String firstName, String secondName, String sex, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }



    public String getSecondName() {
        return secondName;
    }


    public String getSex() {
        return sex;
    }



    public int getAge() {
        return age;
    }



    @Override
    public boolean equals(Object object) {
        if (this == object ) return true;
        if (object == null || !getClass().equals(object.getClass())) return false;
        Person person = (Person) object;
        return this.getAge() == person.getAge() &&
                (Objects.equals(person.getFirstName(),this.getFirstName())) &&
                (Objects.equals(this.getSecondName(),person.getSecondName())) &&
                (Objects.equals(this.getSex(),person.getSex()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + this.age;
        result = prime * result + ((this.secondName == null) ? 0 : this.secondName.hashCode());
        result = prime * result + ((this.sex == null) ? 0 : this.sex.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
