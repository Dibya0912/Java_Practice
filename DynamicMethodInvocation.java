import java.lang.reflect.Method;

class MyService {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            // 1. Get the Class object for MyService
            Class<?> serviceClass = MyService.class;
            MyService instance = new MyService();
            
            // 2. Get the Method object by name and parameter type(s)
            String methodName = "greet";
            Method method = serviceClass.getMethod(methodName, String.class);
            
            // 3. Invoke the method dynamically
            String argument = "Dibya";
            System.out.print("Invoking method '"+ methodName +"': ");
            method.invoke(instance, argument);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}