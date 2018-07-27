import com.sglab.reflect.Operations;

import java.lang.reflect.Method;

public class ReflectionFunctionCall {
    public static void main(String []args)throws Exception{
//        Method sumInstanceMethod
//                = com.sglab.reflect.Operations.class.getMethod("publicSum", int.class, double.class);
//
//        com.sglab.reflect.Operations operationsInstance = new com.sglab.reflect.Operations();
//        Double result
//                = (Double) sumInstanceMethod.invoke(operationsInstance, 1, 3);
//        Double result1 = operationsInstance.publicSum(1,4);
//        System.out.println(result);
//        System.out.println(result1);
//
//        Method multiplyStaticMethod
//                = com.sglab.reflect.Operations.class.getDeclaredMethod(
//                "publicStaticMultiply", float.class, long.class);
//
//        Double result2
//                = (Double) multiplyStaticMethod.invoke(null, 3.5f, 2);


//        Method andPrivateMethod
//                = com.sglab.reflect.Operations.class.getDeclaredMethod(
//                "privateAnd", boolean.class, boolean.class);
//
//        com.sglab.reflect.Operations operationsInstance = new com.sglab.reflect.Operations();
//        Boolean result
//                = (Boolean) andPrivateMethod.invoke(operationsInstance, true, false);
//        Method maxProtectedMethod
//                = Operations.class.getDeclaredMethod(
//                "protectedMax", int.class, int.class);
//
//        Operations operationsInstance = new Operations();
//        Integer result
//                = (Integer) maxProtectedMethod.invoke(operationsInstance, 2, 4);

        Method maxProtectedMethod = Operations.class.getDeclaredMethod(
                "protectedMax", int.class, int.class);

        maxProtectedMethod.setAccessible(true);
        Operations operationsInstance = new Operations();
        Integer result
                = (Integer) maxProtectedMethod.invoke(operationsInstance, 2, 4);
        System.out.println(result);


    }
}
