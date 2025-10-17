import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String message();
}

class Demo {
    @Info(message = "Hello from annotation!")
    public void display() {
        System.out.println("Display method executed!");
    }
}

public class ReflectionAnnotationExample {
    public static void main(String[] args) throws Exception {
        Demo obj = new Demo();

        Method m = obj.getClass().getMethod("display");
        if (m.isAnnotationPresent(Info.class)) {
            Info info = m.getAnnotation(Info.class);
            System.out.println("Annotation message: " + info.message());
        }

        m.invoke(obj);
    }
}
