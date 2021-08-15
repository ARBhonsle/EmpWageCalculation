package org.example;

import java.util.ArrayList;

/**
 * EmpWageCalculation computes wage of employee
 * checks attendance using random and evaluates wage by
 * multiplying Hrs worked(from attendance) and WAGE_PER_HR
 * and monthly wage by repeating for working days of a month
 * or until no of total working hours reached for a month
 * saves wage, compute for multiple companies using classes and OOPs Concepts and ArrayList
 */
public class EmpWageCalculation implements IEmpWageCalc
{
    // constants
    final static int EMP_PRESENT=1,PART_TIME=2;
    final static int FULL_DAY=8,PART_TIME_HR=4;
    // for multiple companies
    private ArrayList<CompanyEmpWage> companyEmpWageArray =new ArrayList<>();
    static private ArrayList<Integer> dailyWage=new ArrayList<>();


    // add company details
    public void addCompany(String companyName, int workingDays, int working_hrs_total, int wagePerHr){
        CompanyEmpWage companyEmpWage=new CompanyEmpWage(companyName,wagePerHr,working_hrs_total,workingDays);
        companyEmpWageArray.add(companyEmpWage);
    }
    // computes employee wage for all companies
    public void computeEmpWage(){
        for(int i=0;i<companyEmpWageArray.size();i++){
            CompanyEmpWage companyEmpWage=companyEmpWageArray.get(i);
            companyEmpWage.setTotalWage(this.computeEmployeeWage(companyEmpWage));
            System.out.println(companyEmpWage);
            System.out.println("Total wage: "+companyEmpWage.getTotalWage());
        }
    }
    // compute employee wage for given company
    public int computeEmployeeWage(CompanyEmpWage companyEmpWage){
        //variables
        int empAttendance,salary,monthlySalary=0,day=0,hrs=0;
        System.out.println("Company: "+companyEmpWage.COMPANY_NAME);
        while(day++ <companyEmpWage.WORKING_DAYS_TOTAL && hrs<companyEmpWage.WORKING_HRS_TOTAL){
            empAttendance = (int) Math.floor(Math.random() * 10) % 3;
            switch (empAttendance){
                case EMP_PRESENT:
                    System.out.println("Employee is present");
                    salary=companyEmpWage.WAGE_PER_HR*FULL_DAY;
                    System.out.println("Hours: "+FULL_DAY);
                    hrs+=FULL_DAY;
                    break;
                case PART_TIME:
                    System.out.println("Employee is present part time");
                    salary=companyEmpWage.WAGE_PER_HR*PART_TIME_HR;
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
            dailyWage.add(salary);
        }
        displayDailyWages();
        System.out.println("Monthly Wage: "+monthlySalary);//total wage given by company
        System.out.println("Working hrs: "+hrs);
        System.out.println("Wage given by company: "+monthlySalary);
        System.out.println();
        return monthlySalary;
    }
    static void displayDailyWages(){
        System.out.println("Daily wages earned: ");
        for(int i=0;i<dailyWage.size();i++){
            System.out.print(dailyWage.get(i)+" ");
        }
        System.out.println();
    }
    public static void main( String[] args)
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        // object created
        EmpWageCalculation company = new EmpWageCalculation();// since two company params passed
        // for different companies different parameters are passed
        company.addCompany("DMart",20,100,20);
        company.addCompany("Reliance",30,120,30);
        company.computeEmpWage();
    }
}

