package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    protected List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id,name,age);
        classes = new LinkedList<>();
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.setClasses(classes);
    }

    public String introduce(){//My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.
//        String classString = "";
//        classString += (this.klass == null) ? "No Class." : "Class " + this.klass.number+".";
//        return  super.introduce() + " I am a Teacher. I teach "+ classString;
        List<String> classList = new ArrayList<>();
        classes.forEach(klass -> {
            classList.add(String.valueOf(klass.getNumber()));
        });
        return String.format(super.introduce() + " I am a Teacher. I teach %s.",
                (this.classes.isEmpty()) ? "No Class" : "Class " + String.join(", ",classList));
    }

    public  String introduceWith(Student student){//>My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.
//        String teachingStr = "";
//        teachingStr += (student.klass.number == this.klass.number) ? "teach " + student.name + "." : "don't teach " + student.name + ".";
//        return  super.introduce() + " I am a Teacher. I "+ teachingStr;
        return String.format(super.introduce() + " I am a Teacher. I%s teach %s.",
                (classes.contains(student.klass)) ? "" : " don't", student.name);
    }

    public boolean isTeaching(Student student){
        return classes.contains(student.klass);
    }
}
