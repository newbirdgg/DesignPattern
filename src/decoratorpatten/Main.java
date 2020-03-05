package decoratorpatten;
/**
 *  @Author: liyuzhan
 *  @classDesp： 客户端代码
 *  @Date: 2020/3/5 10:58
 *  @Email: 1031759184@qq.com
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();
        d1.setComponent(c);
        d2.setComponent(d1);
        d2.operation();
    }

}
