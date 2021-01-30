package sMs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher balbo=new Teacher(1,"Flavian Balbo",1000);
        Teacher leturc=new Teacher(2,"Christopher Leturc",750);
        Teacher bonnet=new Teacher(3,"Gregory Bonnet",875);

        List<Teacher>teacherList=new ArrayList<>();
        teacherList.add(balbo);
        teacherList.add(leturc);
        teacherList.add(bonnet);


        Student maulik=new Student(1,"Aninda Maulik",12);
        Student dharmalingam=new Student(2,"Dayanand Dharmalingam",12);
        Student nandy=new Student(3,"Poulomi Nandy",12);
        Student das=new Student(4,"Aditya Das",11);
        Student tades=new Student(5,"Rediette Tades",11);
        Student bader=new Student(6,"Mohammed Bader",10);

        List<Student>studentList=new ArrayList<>();
        studentList.add(maulik);
        studentList.add(dharmalingam);
        studentList.add(nandy);
        studentList.add(das);
        studentList.add(tades);
        studentList.add(bader);

        School ecoleDmines=new School(teacherList,studentList);
//        ecoleDmines.getTotalMoneyEarned(); -->Result of 'School.getTotalMoneyEarned()' is ignored

        //let's try to make students pay fees
        maulik.payFees(250);
        dharmalingam.payFees(250);
        nandy.payFees(50);
        nandy.payFees(100);
        tades.payFees(150);
        bader.payFees(250);
        System.out.println("Ecole D'mines have earned €"+ecoleDmines.getTotalMoneyEarned());

    }
}
