package Summer2025_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Applicant implements Comparable<Applicant>
{
    String name;
    double cgpa;
    int probation;
    Applicant(String name, double cgpa, int probation) {
        this.name = name;
        this.cgpa = cgpa;
        this.probation = probation;
    }
    public int compareTo(Applicant obj) {
        if (cgpa < obj.cgpa) return 1;
        else if (cgpa< obj.cgpa) return -1;
        else return 0;
    }
    public String toString () {
        return name+"-"+cgpa+"-"+probation;
    }
}
public class EligibiltyList{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Applicant> all = new ArrayList<>();

        for (int i=0; i<n; i++) {
            String name = sc.next();
            double cgpa = sc.nextDouble();
            int probation = sc.nextInt();

            Applicant applicant = new Applicant(name, cgpa ,probation);
            all.add (applicant);
        }
        ArrayList<Applicant> eligible = new ArrayList<>();

        for (int i=0; i<all.size(); i++) {
            if (all.get(i).probation==0) {
                eligible.add(all.get(i));
            }
        }
        for (int i=0; i<eligible.size(); i++) {
            if (i==3) break;
            System.out.println(eligible.get(i).name+" - " + eligible.get(i).cgpa);

        }
//        System.out.println(all);
        sc.close();
        all.sort((Object o1, Object o2)->{
            Applicant a = (Applicant) o1;
            Applicant b = (Applicant) o2;

            if (a.cgpa>b.cgpa) return 1;
            else if (a.cgpa<b.cgpa) return -1;
            else return 0;
        });
        System.out.println(all);
    }
}
