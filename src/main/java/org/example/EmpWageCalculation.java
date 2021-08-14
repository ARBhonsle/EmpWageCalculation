package org.example;

import java.util.Scanner;

/**
 * EmpWageCalculation computes wage of employee
 * checks attendance using random and evaluates wage by
 * multiplying Hrs worked(from attendance) and WAGE_PER_HR
 * and monthly wage by repeating for working days of a month
 * or until no of total working hours reached for a month
 * saves wage, compute for multiple companies using classes and OOPs Concepts
 */
class CompanyEmpWage{
    public final String COMPANY_NAME;
    public final int WAGE_PER_HR,WORKING_DAYS_TOTAL,WORKING_HRS_TOTAL;
    public int totalWage;
    public CompanyEmpWage(String company,int empRatePerHour,int numOfWorkingHrs,int workingDaysPerMonth){
        this.COMPANY_NAME=company;
        this.WAGE_PER_HR=empRatePerHour;
        this.WORKING_HRS_TOTAL=numOfWorkingHrs;
        this.WORKING_DAYS_TOTAL=workingDaysPerMonth;
    }
    public void setTotalWage(int totalWage){
        this.totalWage=totalWage;
    }
    public String printResult(){
        return "Total Employee wage for Company: "+COMPANY_NAME+" is = "+totalWage;
    }
}
public class EmpWageCalculation
{
    // constants
    final static int EMP_PRESENT=1,PART_TIME=2;
    final static int FULL_DAY=8,PART_TIME_HR=4;
    private int numberOfCompany=0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageCalculation(int number){
        if(number>0){
            companyEmpWageArray=new CompanyEmpWage[number];
        }
        else{
            System.out.println("Incorrect Input");
        }
    }

    public void addCompany(String companyName, int workingDays, int working_hrs_total, int wagePerHr){
        companyEmpWageArray[numberOfCompany]=new CompanyEmpWage(companyName,wagePerHr,working_hrs_total,workingDays);
        numberOfCompany++;
    }

    public void computeEmpWage(){
        for(int i=0;i<numberOfCompany;i++){
            companyEmpWageArray[i].setTotalWage(this.computeEmployeeWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

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
            System.out.println("Wage: "+salary);
        }
        System.out.println("Monthly Wage: "+monthlySalary);//total wage given by company
        System.out.println("Working hrs: "+hrs);
        System.out.println("Wage given by company: "+monthlySalary);
        System.out.println();
        return monthlySalary;
    }

    public static void main( String[] args)
    {
        System.out.println( "Welcome to Employee Wage Calculation!" );
        // for different companies different parameters are passed
        EmpWageCalculation company = new EmpWageCalculation(2);// since two company params passed
        company.addCompany("DMart",20,100,20);
        company.addCompany("Reliance",30,120,30);
        company.computeEmpWage();
    }
}

