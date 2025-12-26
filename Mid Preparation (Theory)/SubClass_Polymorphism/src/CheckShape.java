class shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class circle extends shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class rectangle extends shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class triangle extends shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

class square extends shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}
public class CheckShape {
    public void drawShape(shape s) {
        s.draw();
    }

    public static void main(String[] args) {
        new CheckShape().drawShape(new square());

        shape [] [] obj = new shape[3][];

        obj [0] = new triangle[2];
        obj [1] = new square [3];
        obj [2] = new rectangle [4];
//        new CheckShape().drawShape(obj[1][2]);
        for (int i= 0; i<obj.length; i++) {
            for (int j=0; j< obj [i].length; j++) {
                if (i==0)  obj [i][j] = new triangle();
                else if (i==1) obj [i][j] = new square();
                else obj [i][j] = new rectangle();
            }
        }
        for (int i=0; i<obj.length; i++) {
            for (int j=0; j<obj[i].length; j++) {
                obj [i][j].draw();
            }
        }
    }
}
