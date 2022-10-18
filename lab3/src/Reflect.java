import java.lang.reflect.*;

public class Reflect {
    public static void dumpEverything(String className) {
        try {
            Class<?> c = Class.forName(className);
            System.out.println("Name:  "+className);
            Method[] m = c.getMethods();
            System.out.println("Methods:");
            for (Method method : m)
                System.out.println(method.toString());
            Field[] f = c.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : f)
                System.out.println(field.toString());

        }
        catch (Throwable err) {
            System.err.println(err);
        }
    }
}
