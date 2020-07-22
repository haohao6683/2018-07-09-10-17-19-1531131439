package practice09;

public class Teacher extends Person{
    protected  Klass klass;

    public Teacher(int id, String name, int age) {
        super(id,name,age);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.setKlass(klass);
    }

    public String introduce(){//My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
//        String classString = "";
//        classString += (this.klass == null) ? "No Class." : "Class " + this.klass.number+".";
//        return  super.introduce() + " I am a Teacher. I teach "+ classString;
        return String.format(super.introduce() + " I am a Teacher. I teach %s.",
                (this.klass == null) ? "No Class" : "Class " + this.klass.number);
    }

    public  String introduceWith(Student student){//>My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
//        String teachingStr = "";
//        teachingStr += (student.klass.number == this.klass.number) ? "teach " + student.name + "." : "don't teach " + student.name + ".";
//        return  super.introduce() + " I am a Teacher. I "+ teachingStr;
        return String.format(super.introduce() + " I am a Teacher. I%s teach %s.",
                (student.klass.number == this.klass.number) ? "" : " don't", student.name);
    }
}
