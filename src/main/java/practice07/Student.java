package practice07;

public class Student extends Person{
    protected  Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public String introduce(){//My name is Tom. I am 21 years old. I am a Student. I am at Class 2.
        return  super.introduce() + " I am a Student. I am at Class "+ this.klass.number +".";
    }
}
