package core.java;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String... args) {
        Student student1 = new Student("Dinesh", 1, "Algorithms", 75);
        Student student2 = new Student("Arnav", 2, "Automata", 55);
        Student student3 = new Student("Anamika", 3, "Databases", 80);
        Student student4 = new Student("Vishal", 4, "Networking", 40);

        List<Student> studentList = Arrays.asList(student1, student2, student3, student4);

        Map<Boolean, List<Student>> partitionsStudents60 = studentList.stream()
                .collect(Collectors.groupingBy(stu -> stu.getPercentage() > 60));
        System.out.println("Partition the students who got above 60% from those who didn’t.");
        partitionsStudents60.forEach((k,v) ->{
            System.out.println("Students -> "+v);
        });


        List<Student> topPerformers = studentList.stream()
                .sorted(Comparator.comparing(Student::getPercentage)).limit(3)
                .toList();
        System.out.println("Get the names of the top 3 performing students.");
        topPerformers.forEach(topPerformer ->{
            System.out.println(topPerformer.getName());
        });

        System.out.println("Get the name and percentage of each student.");
        Map<String, Double> nameAndPercentage = studentList.stream()
                .collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(nameAndPercentage);

        System.out.println("Get the set of subjects offered in the college");
        Set<String> offeredSubjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        offeredSubjects.forEach(System.out::println);

        System.out.println("Get the highest, the lowest, and the average percentage of students");

        OptionalDouble highest = studentList.stream().mapToDouble(Student::getPercentage).max();
        System.out.println("Highest Percentage :" + highest.getAsDouble());
        OptionalDouble lowest = studentList.stream().mapToDouble(Student::getPercentage).min();
        System.out.println("Lowest Percentage :" + lowest.getAsDouble());
        OptionalDouble average = studentList.stream().mapToDouble(Student::getPercentage).average();
        System.out.println("Average Percentage :" + ( average.isPresent() ? average.getAsDouble() : 0));

        System.out.println("Get the total number of students from the given list of students");
        System.out.println("Total students: " + studentList.size());

        System.out.println("Get the students grouped by subject from the given list of students");
        Map<String, List<Student>> groupBySubject = studentList.stream()
                .collect(Collectors.groupingBy(Student::getSubject));
        System.out.println(groupBySubject);
    }
}
