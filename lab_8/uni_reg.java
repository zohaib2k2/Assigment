class Student{
    static String name;
    static int roll_no;
    static int semester;
    static  double GPA;
    Student(String name,int roll,int sem, double gpa){
        this.name = name;
        this.roll_no = roll;
        this.semester = sem;
        this.GPA = gpa;     
        
    }
    void show_info(){
        System.out.println("\tThe name of student is "+Student.name);         
        System.out.println("\tThe roll is "+Student.roll_no);
        System.out.println("\tThe semester is "+this.semester);
        System.out.println("\tThe GBA is "+this.GPA);
    }
}
class Teacher{
    static String name;
    static String address;
    static String[] qualifications;
    static String phone_num;
    Teacher(String name, String address, String[] qualifications,
            String phone_num){
        this.name = name;
        this.address = address;
        this.qualifications = qualifications;
        this.phone_num = phone_num;        
    }
    Teacher(Teacher t){
        this.name = t.name;
        this.address = t.address;
        this.qualifications = t.qualifications;
        this.phone_num = t.phone_num;        
         
    }
    void show_info(){
        System.out.println("Name : "+this.name);
        System.out.println("Address : "+this.address);
        System.out.println("Phone number : "+this.phone_num);
        System.out.println("Qualifications");
        for(int i = 0 ; i < this.qualifications.length; i++){
            System.out.println("\t"+qualifications[i]); 
        }        
    }
}
class Course extends Teacher{
    Student[] students;
    String course_name;
    int course_points;
    Course(Teacher teacher ,Student[] students, String course_name, int course_points){
        super(teacher);
        this.students = students;
        this.course_name = course_name;
        this.course_points = course_points;

    }
    void printDetails(){
        System.out.println("Course "+this.course_name);
        System.out.println("Teacher :");
        this.show_info();
        System.out.println("Students: ");
        for (Student student : this.students) {
            student.show_info();
        }
    }
}
public class uni_reg{
    public static void main(String[] args){
        Student[] class_fellows = {
            new Student("Mustaba Unus",74,2,3.0),
            new Student("Haider yousuf",50,2,3.2),
            new Student("yameen mughal",40,2,2.8),
            new Student("Zahid Azhar",12,2,3.5),
            new Student("sahid Azher",22,2,3.6)
        };
        Teacher course_teacher;
        String[] q = {"bachelours in Comp sci","masters in comp sci"};
        course_teacher = new Teacher("Sir Khaliq","G house Grove street Ganton",q,"290886");
        Course algo_course = new Course(course_teacher,class_fellows,"Introduction to algorithums",100);
        algo_course.printDetails();
    }    
} 
