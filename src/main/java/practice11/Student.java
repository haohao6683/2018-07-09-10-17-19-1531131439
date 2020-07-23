package practice11;

public class Student extends Person{
    private  Klass klass;

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

    public String introduce(){
        return String.format(
                super.introduce() +" I am a Student. I am %s Class " + klass.getNumber() +".",
                (klass.getLeader() != null && getName() == klass.getLeader().getName()) ? "Leader of" : "at");
    }
}
