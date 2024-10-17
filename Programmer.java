class Employee{
    float salary=500;
}
class Programmer extends Employee{
    int bonus;
    void display(){

    }
    public static void main(String args[]){
        Employee e = new Employee();
        Programmer p = new Programmer();
        e.salary=500;
        p.bonus=100;
        System.out.println("Salary of employee is "+e.salary);
        System.out.println("Bonus for programmer is"+p.bonus);
    }
}
