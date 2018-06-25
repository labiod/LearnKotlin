import java.lang.reflect.Proxy;

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/19/18.
 */
public class Service {

    public static void main(String[] args) {
        HelloDupa dupa = (HelloDupa) Proxy.newProxyInstance(
                HelloDupa.class.getClassLoader(),
                new Class[]{HelloDupa.class},
                (proxy, method, args1) -> {
                    System.out.println("test dupa ");
                    System.out.println(method.getReturnType());
                    if (method.getName().equals("getDupa")) {
                        return "Dupa";
                    }
                    return null;
                });

        dupa.sayDupa();
        System.out.println(dupa.getDupa());
    }
}
