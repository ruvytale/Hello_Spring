package hello.hellospring.config;

import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// JDBC 및 Srping Bean 설정 Config 클래스
@Configuration
public class SpringConfig {

    private final DataSource dataSource;
    private final EntityManager em;
    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }
    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return  new JdbcMemberRepository(dataSource);

        return new JpaMemberRepository(em);
    }
}
