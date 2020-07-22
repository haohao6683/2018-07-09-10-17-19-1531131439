package practice09;

public class Student extends Person{
    protected  Klass klass;


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){//>My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.
//        String introduce =  super.introduce() + " I am a Student. I am ";//"at Class "+ this.klass.number +".";
//        introduce += (name == klass.leader.name) ? "Leader of Class " + klass.number + "." : "at Class "+ klass.number +".";
        return String.format(
                super.introduce() +" I am a Student. I am %s Class " + klass.number +".",
                (klass.leader != null && name == klass.leader.name) ? "Leader of" : "at");
    }
}
