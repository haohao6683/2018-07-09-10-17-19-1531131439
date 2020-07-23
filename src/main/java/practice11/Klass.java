package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass implements Observerable{
    private int number;
    private Student leader;
    private List<Integer> studentIdList;

    private List<Observer> observerList;

    public Klass(int number) {
        this.number = number;
        studentIdList = new ArrayList<>();
        leader = null;
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public boolean equals(Object obj) {
        Klass klass = (Klass) obj;
        return (obj != null && klass.number == this.number);
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  String getDisplayName(){
        return "Class " + this.number;
    }

    public void assignLeader(Student student){
        if(studentIdList.contains(student.getId())){
            this.leader = student;
            observerList.forEach(observer -> {
                observer.assignUpdate(student);
            });
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        studentIdList.add(student.getId());
        student.setKlass(this);
        observerList.forEach(observer -> {
            observer.appendUpdate(student);
        });
    }
}
