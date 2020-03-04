package strategypatten;
/**
 *  @Author: liyuzhan
 *  @classDesp： 策略模式测试
 *  @Date: 2020/3/3 12:10
 *  @Email: 1031759184@qq.com
 */
public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();
        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }

}
