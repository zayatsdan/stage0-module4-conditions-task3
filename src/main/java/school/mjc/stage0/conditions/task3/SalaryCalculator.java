package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int taxes;
        if (salary<=10000&&salary>0){
            taxes=15;
            System.out.println((salary * (100 - taxes ))/100);
        }
        if (salary>10000&&salary<=20000) {
            taxes = 18;
            System.out.println((salary * (100 - taxes ))/100);
        }
        if (salary>20000) {
            taxes = 20;
            System.out.println((salary * (100 - taxes ))/100);
        }
        if (salary<=0){
            System.out.println("Wrong input!");
        }
    }
}
