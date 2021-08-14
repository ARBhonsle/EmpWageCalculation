package org.example;

/**
 * Interface used to define methods implemented in classes
 */
public interface IEmpWageCalc {
    public void addCompany(String companyName, int workingDays, int working_hrs_total, int wagePerHr);
    public void computeEmpWage();
    public int computeEmployeeWage(CompanyEmpWage companyEmpWage);
}
