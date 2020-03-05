package decoratorpatten;
/**
 *  @Author: liyuzhan
 *  @classDesp：
 *  @Date: 2020/3/5 10:49
 *  @Email: 1031759184@qq.com
 */
public class ConcreteComponent extends Component{

    @Override
    public void operation() {
        System.out.println("具体对象操作");
    }
}
