package practice04;

public class Student extends Person{
    protected  int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){//My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
        return  super.introduce() + " I am a Student. I am at Class "+ this.klass +".";
    }
}
