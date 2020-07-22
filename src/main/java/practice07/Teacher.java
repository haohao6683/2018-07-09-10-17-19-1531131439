package practice07;

public class Teacher extends Person{
    protected  Klass klass;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.setKlass(klass);
    }

    public String introduce(){//My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
        String classString = "";
        classString += (this.klass == null) ? "No Class." : "Class " + this.klass.number+".";
        return  super.introduce() + " I am a Teacher. I teach "+ classString;
    }

    public  String introduceWith(Student student){//>My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
        String teachingStr = "";
        teachingStr += (student.klass.number == this.klass.number) ? "teach " + student.name + "." : "don't teach " + student.name + ".";
        return  super.introduce() + " I am a Teacher. I "+ teachingStr;
    }
}
