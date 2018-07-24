import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Test {
    public static void main(String []args)throws Exception{
        //1. create an Object with new
        Employee emp1 = new Employee("liming","man",18);
        emp1.setName("lihua");
        System.out.println(emp1.getName());

        //2. create an Object with newInstance
        Employee emp2 = (Employee) Class.forName("Employee").newInstance();

        //3. use new instalnce() method of Constructor class
        Constructor<Employee> constructor = Employee.class.getDeclaredConstructor();
        Employee emp3  = constructor.newInstance();

        //4. create an Object with constructor arguments,similiar with 3
        Class ctClass = Employee.class;
        Constructor constructor1 = ctClass.getDeclaredConstructor(new Class[]{String.class,String.class,int.class});
        Employee emp4 = (Employee) constructor1.newInstance(new Object[] {"emp4","women",20});
        /*
        like
        Class classToLoad = MyClass.class;
        Class[] cArg = new Class[3]; //Our constructor has 3 arguments
        cArg[0] = Long.class; //First argument is of *object* type Long
        cArg[1] = String.class; //Second argument is of *object* type String
        cArg[2] = int.class; //Third argument is of *primitive* type int

        Long l = new Long(88);
        String s = "text";
        int i = 5;

        classToLoad.getDeclaredConstructor(cArg).newInstance(l, s, i);
         */

        //5. Using clone()method     no constructor call
        Employee emp5 = (Employee)emp4.clone();
        emp5.setName("emp5");
        System.out.println(emp5.getName());

        //6. Using deserialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ser.obj"));
        out.writeObject(emp5);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("ser.obj"));
        Employee emp6 = (Employee) in.readObject();
        in.close();
        System.out.println(emp6.getName());






    }
}
