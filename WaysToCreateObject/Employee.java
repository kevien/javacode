import java.io.Serializable;

public class Employee implements Cloneable,Serializable {

    //how to generate serialVersionUID
    //https://stackoverflow.com/questions/12912287/intellij-idea-generating-serialversionuid
    private static final long serialVersionUID = 6683773145255403096L;
    private String Name;
    private String Sex;
    private int Age;
    public Employee(){
        System.out.println("Employee Constructor without param Called");
    }

    public Employee(String name,String sex,int age){
        this.Name = name;
        this.Sex = sex;
        this.Age = age;
        System.out.println("name: " + getName() + " Sex: " + getSex() + " Age: " + getAge());
    }
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return Sex;

    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}
