import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Info { String author(); }

@Info(author="Dibya")
class Demo {}

public class AnnotationsExample {
    public static void main(String[] args) {
        Info info = Demo.class.getAnnotation(Info.class);
        System.out.println("Author: " + info.author());
    }
}
