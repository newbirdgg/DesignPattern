package decoratorpatten;
/**
 *  @Author: liyuzhan
 *  @classDesp：
 *  @Date: 2020/3/5 10:56
 *  @Email: 1031759184@qq.com
 */
public class ConcreteDecoratorA extends Decorator{
    /**
     * 本类独有的功能，区别于B
     */
    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "New State";
        System.out.println(addedState+"具体装饰对象A的操作");
    }


}
