package org.example;

/**
 * Company Employee wage calculates wage for multiple companies
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
    public int getTotalWage(){return totalWage;}
}

