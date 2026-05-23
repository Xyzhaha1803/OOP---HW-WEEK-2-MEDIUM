/*Employee Bonus Calculation Create a class Employee with name, salary, and yearsOfExperience. 
Write a method calculateBonus():

If experience > 5 years, bonus = 20% of salary

Otherwise, bonus = 10% of salary Display the bonus amount for each employee. */

class Employee{
    String name = "Kahib";
    double salary = 1000;
    int yearsOfExperience = 21;
    double bonus = 0.0;

    public void calculateBonus(){
        if (yearsOfExperience > 5){
            this.bonus += (1.0/5.0) * salary;
        } else {
            this.bonus += (1.0/10.0) * salary;
        }

        System.out.println("The bonus is: $" + bonus);
    }
}

public class Q06{
    public static void main(String[] args){
        Employee worker = new Employee();

        worker.calculateBonus();
    }
}
