package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    protected int number;
    protected Student leader;
    protected List<Integer> studentIdList;

    public Klass(int number) {
        this.number = number;
        studentIdList = new ArrayList<>();
        leader = null;
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
        if(studentIdList.contains(student.id)){
            this.leader = student;
        }
        else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student){
        studentIdList.add(student.id);
    }
}
