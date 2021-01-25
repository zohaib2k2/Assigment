class Computer{
    String model,CPU,GPU,OS;
    double clock;
    int memory;
    int storage;
    Computer(String model, String CPU,double clock,int memory,int storage,
            String GPU,String OS){
        this.model  = model;
        this.clock = clock;
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
        this.GPU = GPU;
        this.OS = OS;
    }
    Computer(String model,String CPU,double clock,int memory,int storage){
        this.model  = model;
        this.clock = clock;
        
        this.CPU = CPU;
        this.memory = memory;
        this.storage = storage;
        this.OS = "\0";
        this.GPU = "\0";
    }
    Computer(Computer c1){
        this.model  = c1.model;
        this.clock = c1.clock;
        
        this.CPU = c1.CPU;
        this.memory = c1.memory;
        this.storage = c1.storage;
        this.OS = "\0";
        this.GPU = "\0";
    }
    
    void compareProcessors(Computer c1,Computer c2){
        if(c1.clock > c2.clock){
            System.out.println(c1.model+" processor is better then "+c2.model);
        } else if(c1.clock == c2.clock){
           System.out.println("Both systems are requal in speed");
        } else {
            System.out.println(c2.clock+" processor is better then "+c1.clock);
        }
    }
    
}
class myComputer extends Computer{
    String user;
    myComputer(String name, String model,String CPU,double clock,int memory,
        int storage){
        super(model, CPU, clock, memory, storage);
        this.user = user;
    }
    myComputer(String name,Computer c1){
        super(c1);
        this.user = user;
    }
}
class yourComputer extends Computer{
    String user;
    yourComputer(String name, String model,String CPU,double clock,int memory,
            int storage){
        super(model, CPU, clock, memory, storage);
        this.user = user;
    }
    yourComputer(String name, Computer c1){
        super(c1);
        this.user = user;
    }
}
public class my_computer{
    public static void main(String[] args){
        myComputer my_comp = new myComputer("Zohaib","think pad T420","intel i5",
                                                    3.3,4096,250);
        
        yourComputer your_comp = new yourComputer("Zobia","Optiplex 755",
                                                "Core 2 quad",3.2,6124,500);
        my_comp.compareProcessors(my_comp, your_comp);
        
    }
}