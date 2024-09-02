import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHelloWorld =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHelloWorld.getMessage());
        HelloWorld beanHelloWorld1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        boolean compose = beanHelloWorld1 == beanHelloWorld;
        System.out.println(compose);
        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getMessage());
        boolean compose1 = beanCat1 == beanCat;

        System.out.println(compose1);
    }
}