package decoratorpatten;
/**
 *  @Author: liyuzhan
 *  @classDesp：
 *  @Date: 2020/3/5 10:56
 *  @Email: 1031759184@qq.com
 */
public class ConcreteDecoratorB extends Decorator{
    @Override
    public void operation() {
        super.operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    private void AddedBehavior(){

    }
}
