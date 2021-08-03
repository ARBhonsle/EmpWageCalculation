package org.example;

public class EmpWageCalculation
{
    final static int EMP_PRESENT=1,PART_TIME=2;
    final static int WAGE_PER_HR=20,FULL_DAY=8,PART_TIME_HR=4,ABSENTEE_WAGE=0;
    static int empAttendance,salary;
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        empAttendance = (int) Math.floor(Math.random() * 10) % 3;
        switch (empAttendance){
            case EMP_PRESENT:
                System.out.println("Employee is present");
                salary=WAGE_PER_HR*FULL_DAY;
                break;
            case PART_TIME:
                System.out.println("Employee is present part time");
                salary=WAGE_PER_HR*PART_TIME_HR;
                break;
            default:
                System.out.println("Employee is absent");
                salary=ABSENTEE_WAGE;
                break;
        }
        System.out.println("Employee's Wage= "+salary);
    }


}

