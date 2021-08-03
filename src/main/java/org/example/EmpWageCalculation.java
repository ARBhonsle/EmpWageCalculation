package org.example;

public class EmpWageCalculation
{
    static int EMP_PRESENT=1,WAGE_PER_HR=20,FULL_DAY=8;
    static int empAttendance,salary;
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        empAttendance = (int) Math.floor(Math.random() * 10) % 2;
        if(empAttendance==EMP_PRESENT){
            System.out.println("Employee is present");
            salary=WAGE_PER_HR*FULL_DAY;
        } else{
            System.out.println("Employee is absent");
            salary=0;
        }
        System.out.println("Employee's Wage= "+salary);
    }


}

