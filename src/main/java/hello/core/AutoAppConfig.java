package hello.core;

import hello.core.member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //basePackages = "hello.core.member",
        //basePackageClasses = AutoAppConfig.class,   //지정한 클래스의 패키지를 탐색 시작 위치로 지정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


    @Autowired
    private MemberService memberService;


}
