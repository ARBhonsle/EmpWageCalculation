package org.example;

public class EmpWageCalculation
{
    static int EMP_PRESENT=1;
    static int empAttendance;
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        empAttendance = (int) Math.floor(Math.random() * 10) % 2;
        if(empAttendance==EMP_PRESENT){
            System.out.println("Employee is present");
        } else{
            System.out.println("Employee is absent");
        }
    }


}

