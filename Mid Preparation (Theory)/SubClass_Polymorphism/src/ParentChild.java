class Object {
    
}
class Parent extends Object {
    
}
class Uncle extends Object{
    
}
class Child extends Parent{
    
}
public class ParentChild {


    public static void main(String[] args) {
        Object object;
        Parent parent;
        
        Child child = new Child();

        parent = child;
        object = child;

        Parent pr = new Parent();
        //child = (Child)pr;
        Uncle un = new Uncle();

        if (child instanceof Parent) System.out.println("Yup");
        if (child instanceof Object) System.out.println("Yup");

        Child ch = new Child();

        parent = ch;
        object = ch;

        ch = (Child) object;

        Parent pr2 = new Child ();
        ch = (Child) pr2;

        Parent pr3 = new Parent();
        //ch = (Child) pr3;// NOt Possible

        
    }
}
