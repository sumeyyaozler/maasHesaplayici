public class Employee {
    String name;

    double workHours;
    int hireYear;
    double salary;


    Employee(String name ,  int workHours, int hireYear, double salary){
        this.name=name;

        this.workHours =workHours;
        this.hireYear=hireYear;
        this.salary = salary;



    }public double tax() {
        double tax = 0;
        if (salary > 1000) {
            tax = (salary * 0.03);
        } else {
            tax = 0;
        }
        return tax;
    } public double bonus() {
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours-40) * 30;

        } else {
            bonus = 0;
        }
        return bonus;
    }
    public double raiseSalary () {
       double increasedSalary =0;
       if((2021-hireYear)<10){
           increasedSalary +=salary*0.05;
       } if(((2021-hireYear)>=10)&&((2021-hireYear)<20)){
           increasedSalary +=salary*0.1;
       }if((2021-hireYear)>=20){
           increasedSalary +=salary*0.15;
        }
       return increasedSalary;



    }
    public void printInfo() {
        System.out.println("Employee :" + this.name);
        System.out.println("Salary :" + this.salary);
        System.out.println("workHours :" +this.workHours);
        System.out.println("hireyear :" +this.hireYear);
        System.out.println("tax :" + tax());
        System.out.println("bonus :" + bonus());
        System.out.println("Maaş artışı :" + raiseSalary());
        System.out.println("vergi ve maaş ile birlikte maaş :" + (salary +bonus()-tax()));
        System.out.println("toplam maaş :"+(salary + raiseSalary()));
    }


}
