public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped < 5) {
            return 1.0;
        } else {
            return 0.85;
        }
    }

    public int bonusMultiplier(int productsSold) {

        if (productsSold == 0) {
            return 0;
        } else if (productsSold > 0 && productsSold <= 20) {
            return 10;
        } else {
            return 13;
        }

    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary = 1000.0;
        double Salary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        if (Salary > 2000.0) {
            return 2000.0;
        } else {
            return Salary;
        }
    }
}
