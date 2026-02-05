class Maximum extends Thread{
    int [] arr;
    Maximum(int [] arr){
        this.arr = arr;
    }
    int mx;
    public void run () {
        mx = arr [0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i]>mx) mx = arr[i];
        }
    }
}

class Minimum extends Thread {
    int [] arr;
    Minimum(int [] arr) {
        this.arr = arr;
    }
    int mn;
    public void run () {
        mn = arr [0];
        for (int i=1; i<arr.length; i++) if (arr[i] < mn)
            mn = arr [i];
    }
}

public class SelfMade {
    public static void main(String[] args) {
        int [] arr = {5, 8, 3, 1, 2, 7, 9, 4};

        Maximum Max = new Maximum(arr);
        Minimum Min = new Minimum(arr);

        Max.start();
        Min.start();

        try{
            Max.join();
            Min.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println(Max.mx+Min.mn);
        }
    }
}
