package cn.wj.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 注解方式的切面类
 * Created by WJ on 2017/10/22
 */
@Aspect
public class MyAspectAnno {

    /**
     * 通知类型:@Before前置通知(切入点的表达式)
     */
    @Before(value = "execution(public * cn.wj.demo1.CustomerDaoImpl.save())")
    public void log(){
        System.out.println("记录日志");
    }
}
