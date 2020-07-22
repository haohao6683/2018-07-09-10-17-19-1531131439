package practice11;

public class Person {
    private  int id = 0;
    private  String name = "";
    private  int age = 0;

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return (obj != null && person.id == this.id);
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        //return "My name is " + this.name + ". I am " + this.age + " years old.";
        return String.format("My name is %s. I am %s years old.",this.name,this.age);
    }
}
