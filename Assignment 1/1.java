// 2. Define a class Student with following members:

// int roll, String name, float marks.

// input() to take input of the details

// display() to all details of a student.

// Write a program to which will store details of a student and print the
// details using the above class.

class Student {
    int roll;
    String name;
    float marks;

    void display() {
        System.out.println("Student :" + roll + " " + name + " " + marks);
    }
}

class StudentDetails {
    public static void main(String[] args) {
        Student a = new Student();
        Student b = new Student();
        Student c = new Student();
        a.roll = 1;
        a.name = "veena";
        a.marks = 86;
        b.roll = 2;
        b.name = "manu";
        b.marks = 78;
        c.roll = 3;
        c.name = "kush";
        c.marks = 93;
        a.display();
        b.display();
        c.display();
    }

}