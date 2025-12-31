class Faculty {
    int id;
    double selary;
    String name;

    public Faculty(int id, double selary, String name) {
        this.id = id;
        this.selary = selary;
        this.name = name;
    }

    void responsibility (){
        System.out.println("Take the class");
    }
}
class UGA extends Faculty {
    int id;
    double cgpa;

    public UGA(int id, double selary, String name, double cgpa) {
        super(id, selary, name);
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    void responsibility() {
        System.out.println("Helping Faculty to the online class");
    }

    void addtional_duty()
    {
        System.out.println("Mark I/O");
    }


}

public class Student extends UGA{
    public Student(int id, double selary, String name, double cgpa) {
        super(id, selary, name, cgpa);
    }

    @Override
    void responsibility() {

        System.out.println("Study Well");
        super.responsibility();
    }

    public static void main(String[] args) {
        Faculty obj1 = new Student(02,0, "Alim", 3.5);

        obj1.responsibility();

        if (obj1 instanceof UGA){
            if (obj1 instanceof Faculty) {
                if (obj1 instanceof Student) {
                    System.out.println(true);
                    ((UGA)obj1).addtional_duty();
                }
            }

        }
    }
}
