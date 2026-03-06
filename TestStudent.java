// Experiment 4:
//3) a)create a class student with a vriable rollno and method getrollno and setrolno
class Student {
    int rollno;

    void setRollno(int r) {
        rollno = r;
    }

    int getRollno() {
        return rollno;
    }
}

public class TestStudent {
    public static void main(String[] args) {

        Student s = new Student();

        s.setRollno(101);
        System.out.println("Roll Number: " + s.getRollno());
    }
}