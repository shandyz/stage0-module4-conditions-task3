package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10_000) System.out.println(salary*15/100);
        if (10000 < salary && salary <= 20000) System.out.println(salary*18/100);
        if (20000 < salary) System.out.println(salary*20/100);
        if (0> salary) System.out.println("wrong input!");
    }
}
