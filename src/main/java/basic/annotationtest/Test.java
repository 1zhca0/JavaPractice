package basic.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: JavaPractice
 * @Package: basic.annotationtest
 * @ClassName: Test
 * @Author: Frank.Cao
 * @Description:
 * @Date: 2021/4/6 12:14
 * @Version: 1.0
 */
@testAnno
public class Test {
}

/**
 * @author Frank.Cao
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface testAnno{

}