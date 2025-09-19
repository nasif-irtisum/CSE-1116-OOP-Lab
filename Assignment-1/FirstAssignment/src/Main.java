abstract class User {
    String name, email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    abstract void performRole ();
}
class Student extends User{

    String [] courseName;
    private double grade;
    Student(String name, String email, String [] courseName, double grade){
        super(name,email);
        this.courseName= courseName;
        this.grade=grade;
    }

    public double getGrade() {
        return grade;
    }


    void performRole() {
        System.out.println("Enrolled Courses:");
        for (String str:courseName){
            System.out.println("\t"+str);
        }
    }
}
class Teacher extends User{

    String [] courses;

    public Teacher(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    void performRole() {
        System.out.println("Teaching Courses: ");
        for (String str:courses){
            System.out.println("\t"+str);
        }
    }
}
class Administrator extends User {
    String [] addUser, deleteUser;

    public Administrator(String name, String email, String[] addUser, String[] deleteUser) {
        super(name, email);
        this.addUser = addUser;
        this.deleteUser = deleteUser;
    }

    void performRole(){
        System.out.println("Added Users:");
        for (String name: addUser) {
            System.out.println("\t"+name);
        }
        System.out.println();
        System.out.println("Deleted Users:");
        for (String name: deleteUser) {
            System.out.println("\t"+name);
        }
    }
}
public class Main{
    public static void main(String[] args) {
        User [] obj = new User[3];
        obj[0]= new Student("Jon Doe", "John@Doe.com", new String[]{"CSE1110", "CSE1115"}, 3.54);
        obj[1] = new Teacher("Jen Doe", "jen@Doe.com", new String[]{"EEE1226","CSE550"});
        obj[2] = new Administrator("Jin Doe", "Jin@Doe.com", new String [] {"Tanjiro", "Inosking", "Muzan"}, new String[]{"Nazuko", "Zenitsu"});

        for (int i=0; i<obj.length; i++) {
            obj [i].performRole();
        }
    }
}