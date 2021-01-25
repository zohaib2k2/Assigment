
class Employee{
    int emp_code;
    String name;
    String designation;
    int salary;
    static int count = 0;

    Employee(){
        salary =0;
        emp_code = -1;
        name = "\0";
        designation = "\0";
        count++;
    }
    Employee(int emp_code,String name,String designation){
        this.name = name;
        this.emp_code = emp_code;
        this.designation = designation;

        if(this.designation.toLowerCase().equals("clerk")) salary = 5000;
        else if (this.designation.toLowerCase().equals("peon")) salary = 2000;
        else if (this.designation.toLowerCase().equals("manager"))
            salary = 10000;

        else salary = 1500;
        count++;
    }
    Employee(int emp_code,String name,String designation,int salary){
        this.name = name;
        this.emp_code = emp_code;
        this.designation = designation;
        this.salary = salary;
        count++;
    }
    void show_info(){
        System.out.println("salary = "+this.salary);
        System.out.println("designation = "+designation);
    }

}

public class Employee_class{
    public static void main(String[] args) {
        Employee manager1 = new Employee(177,"Beatle juice","Manager");
        Employee e1 = new Employee();
        Employee clk = new Employee(81,"wrench","clerk",3000);
        Employee comp_prog = new Employee(13,"apple juice","Programmer");
        comp_prog.show_info();
        e1.show_info();
        manager1.show_info();
        clk.show_info();
        System.out.println(Employee.count);
        System.out.println(comp_prog.count);
    }
}
