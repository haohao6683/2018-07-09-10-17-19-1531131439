package practice06;

public class Teacher extends Person{
    protected  int klass = 0;

    public Teacher(String name, int age) {
        super(name,age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.setKlass(klass);
    }

    public String introduce(){//My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
        String classString = "";
        classString += (this.klass == 0) ? "No Class." : "Class " + this.klass+".";
        return  super.introduce() + " I am a Teacher. I teach "+ classString;
    }
}
