package org.example;

public class EmpWageCalculation
{
    static int EMP_PRESENT=1,WAGE_PER_HR=20,FULL_DAY=8,PART_TIME=2,PART_TIME_HR=4;
    static int empAttendance,salary;
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        empAttendance = (int) Math.floor(Math.random() * 10) % 3;
        if(empAttendance==EMP_PRESENT){
            System.out.println("Employee is present");
            salary=WAGE_PER_HR*FULL_DAY;
        } else if(empAttendance==PART_TIME){
            System.out.println("Employee is present part time");
            salary=WAGE_PER_HR*PART_TIME_HR;
        }
        else{
            System.out.println("Employee is absent");
            salary=0;
        }
        System.out.println("Employee's Wage= "+salary);
    }


}

