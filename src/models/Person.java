package models;

import java.util.Arrays;

public class Person {
    private String name;
    private int age;
    private int[] grades;
    public Person(String name, int age , int[] grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int[] getGrades() {
        return grades;
    }


    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;

        
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", grades=" + Arrays.toString(grades) + ", averageGrade=" + String.format("%.2f", getAverageGrade()) + "]";
    }
    

    

    
}