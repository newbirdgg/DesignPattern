package strategypatten;
/**
 *  @Author: liyuzhan
 *  @classDesp： 封装了具体的算法或行为
 *  @Date: 2020/3/3 12:05
 *  @Email: 1031759184@qq.com
 */
public class ConcreteStrategyB extends Strategy{
    /**
     * 算法B实现
     */
    @Override
    public void algorithmInterface() {
        System.out.println("算法B实现");
    }
}
