package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person implements Observer{
    private List<Klass> classes;

    @Override
    public void appendUpdate(Student student) {
        System.out.print(String.format("I am %s. I know %s has joined Class %s.\n",
                this.getName(),student.getName(),student.getKlass().getNumber()));
    }
    @Override
    public void assignUpdate(Student student) {
        System.out.print(String.format("I am %s. I know %s become Leader of Class %s.\n",
                this.getName(),student.getName(),student.getKlass().getNumber()));
    }

    public Teacher(int id, String name, int age) {
        super(id,name,age);
        classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        this.classes.forEach(klass -> {
            klass.registerObserver(this);
        });
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        List<String> classList = new ArrayList<>();
        classes.forEach(klass -> {
            classList.add(String.valueOf(klass.getNumber()));
        });
        return String.format(super.introduce() + " I am a Teacher. I teach %s.",
                (this.classes.isEmpty()) ? "No Class" : "Class " + String.join(", ",classList));
    }

    public  String introduceWith(Student student){
        return String.format(super.introduce() + " I am a Teacher. I%s teach %s.",
                (classes.contains(student.getKlass())) ? "" : " don't", student.getName());
    }

    public boolean isTeaching(Student student){
        return classes.contains(student.getKlass());
    }
}
