package generic.ex4;

public class MethodMain {
    public static void main(String[] args) {
       Integer a = (Integer) GenericMethod.objMethod(10);
        System.out.println(a);

        Integer b = GenericMethod.<Integer>geniricMethod(10);
        System.out.println(b);

        String c = GenericMethod.geniricMethod("10"); // 타입추론 인자가 String이기 때문에 자바 컴파일러가 String이라는 것을 알아채서 그 앞에 <>쓰지 않아도 됨
        System.out.println(c);
    }
}
