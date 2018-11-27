package com.company.hashcode;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 25);
        Person p2 = new Person("Ivan", "Ivanov", 25);
        System.out.println("The p1 hashCode is: " + p1.hashCode());
        System.out.println("The p1 hashCode is: " + p2.hashCode());
    }
    }
