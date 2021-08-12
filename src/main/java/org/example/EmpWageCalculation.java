package org.example;

/**
 * EmpWageCalculation computes wage of employee
 * checks attendance using random and evaluates wage by
 * multiplying Hrs worked(from attendance) and WAGE_PER_HR
 * and monthly wage by repeating for working days of a month
 * or until no of total working hours reached for a month
 * saves wage
 */
public class EmpWageCalculation
{
    // constants
    final static int EMP_PRESENT=1,PART_TIME=2;
    final static int FULL_DAY=8,PART_TIME_HR=4;
    final int WORKING_DAYS,WORKING_HRS_TOTAL,WAGE_PER_HR;
    final String COMPANY_NAME;

    public EmpWageCalculation(String companyName, int workingDays, int working_hrs_total, int wagePerHr){
        this.COMPANY_NAME = companyName;
        this.WORKING_DAYS = workingDays;
        this.WORKING_HRS_TOTAL = working_hrs_total;
        this.WAGE_PER_HR = wagePerHr;
    }

    void computeEmployeeWage(){
        //variables
        int empAttendance,salary,monthlySalary=0,day=0,hrs=0;
        System.out.println("Company: "+COMPANY_NAME);
        while(day++ <WORKING_DAYS && hrs<WORKING_HRS_TOTAL){
            empAttendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (empAttendance){
                case EMP_PRESENT:
                    System.out.println("Employee is present");
                    salary=WAGE_PER_HR*FULL_DAY;
                    System.out.println("Hours: "+FULL_DAY);
                    hrs+=FULL_DAY;
                    break;
                case PART_TIME:
                    System.out.println("Employee is present part time");
                    salary=WAGE_PER_HR*PART_TIME_HR;
                    System.out.println("Hours: "+PART_TIME_HR);
                    hrs+=PART_TIME_HR;
                    break;
                default:
                    System.out.println("Employee is absent");
                    System.out.println("Hours: "+0);
                    salary=0;
                    break;
            }
            monthlySalary+=salary;
            System.out.println("Wage: "+salary);
        }

        System.out.println("Monthly Wage: "+monthlySalary);//total wage given by company
        System.out.println("Working hrs: "+hrs);
        System.out.println("Wage given by company: "+monthlySalary);
        System.out.println();
    }

    public static void main( String[] args)
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        // for different companies different parameters are passed
        EmpWageCalculation company = new EmpWageCalculation("DMart",20,100,10);
        company.computeEmployeeWage();
        EmpWageCalculation company2 = new EmpWageCalculation("Reliance",10,40,20);
        company2.computeEmployeeWage();
    }
}

