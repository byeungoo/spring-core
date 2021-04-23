package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)       //어노테이션이 어디에 붙는지. TYPE이면 클래스
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
