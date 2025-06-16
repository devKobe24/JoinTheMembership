package com.kobe.jointhemembership.config;

import com.kobe.jointhemembership.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@RequiredArgsConstructor
@Configuration
public class WebSecurityConfig {

	private final UserDetailService userService;

	// 스프링 시큐리티 기능 비활성화
	@Bean
	public WebSecurityCustomizer configure() {
		return (web) -> web.ignoring()
			.requestMatchers(toH2Console())
			.requestMatchers("/static/**");
	}

	// 특정 HTTP 요청에 대한 웹 기반 보안 구성
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return http
			.csrf(csrf -> csrf.disable()) // CSRF 비활성화
			.authorizeHttpRequests(auth -> auth // 인증, 인가 설정
				.requestMatchers("/login", "/signup", "/user", "/user/login").permitAll()
				.anyRequest().authenticated()
			)
			.formLogin(form -> form // 폼 기반 로그인 설정
				.loginPage("/login")
				.defaultSuccessUrl("/user/logout", true) // 항상 리디렉션
			)
			.logout(logout -> logout // 로그아웃 설정
				.logoutSuccessUrl("/login")
				.invalidateHttpSession(true)
			)
			.build();
	}

	// 인증 관리자 관련 설정
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
		AuthenticationManagerBuilder builder = http.getSharedObject(AuthenticationManagerBuilder.class);
		builder.userDetailsService(userService) // 사용자 정보 서비스 설정
			.passwordEncoder(bCryptPasswordEncoder());
		return builder.build();
	}

	// 패스워드 인코더로 사용할 빈 등록
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
