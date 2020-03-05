package decoratorpatten;
/**
 *  @Author: liyuzhan
 *  @classDesp：
 *  @Date: 2020/3/5 10:51
 *  @Email: 1031759184@qq.com
 */
public class Decorator extends Component{
    protected Component component;
    public void setComponent(Component component){
        this.component=component;
    }

    @Override
    public void operation() {
        if (component!=null){
            component.operation();
        }
    }
}
