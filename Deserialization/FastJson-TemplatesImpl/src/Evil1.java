
import java.io.IOException;

public class Evil1 {

    public String getName() {
        System.out.println("i am getterName!");
        return name;
    }

    public void setName(String name) {
        System.out.println("i am setterName!");
        this.name = name;
    }

    public String name;

    public int getAge() {
        System.out.println("i am getterAge!");
        return age;
    }

    public void setAge(int age) {
        System.out.println("i am setterAge!");
        this.age = age;
    }

    private int age;

    public Evil1() throws IOException{
        System.out.println("i am constructor!");
        Runtime.getRuntime().exec("open /Applications/Calculator.app");
    }

    public static void evilin (){
        System.out.println("I am test method!");
    }

    public String getSex() {
        System.out.println("i am getterSex!");
        return sex;
    }

    public void setSex(String sex) {
        System.out.println("i am setterSex!");
        this.sex = sex;
    }

    public String sex;


}