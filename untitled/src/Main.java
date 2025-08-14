import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иван", 8);
        person1.Kotik();
        person1.displayInfo();

        Class<?> clazz = Person.class;
        System.out.println("Поля класса:");
Field[] fields = clazz.getDeclaredFields();
for (Field field : fields) {
    System.out.println(field.getName());
}
System.out.println("Методы класса:");
Method[] methods = clazz.getDeclaredMethods();
for (Method method : methods) {
    System.out.println(method.getName());
}
    }
}