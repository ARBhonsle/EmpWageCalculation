package org.example;

/**
 * EmpWageCalculation computes wage of employee
 * checks attendance using random and evaluates wage by
 * multiplying Hrs worked(from attendance) and WAGE_PER_HR
 * and monthly wage by repeating for working days of a month
 */
public class EmpWageCalculation
{
    // constants
    final static int EMP_PRESENT=1,PART_TIME=2;
    final static int WAGE_PER_HR=20,FULL_DAY=8,PART_TIME_HR=4,ABSENTEE_WAGE=0;
    final static int WORKING_DAYS=20;
    //variables
    static int empAttendance,salary,monthlySalary,day;
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        monthlySalary=0;
        for(day=0;day<WORKING_DAYS;day++){
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
            monthlySalary+=salary;
            System.out.println("Wage: "+salary);
        }
        System.out.println("Monthly Wage: "+monthlySalary);
    }
}

