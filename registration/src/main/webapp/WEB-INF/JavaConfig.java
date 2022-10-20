

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "net.control")
public class JavaConfig {
	@Bean
	public ViewResolver viewResolver() {
		ViewResolver viewResolver = new InternalResourceViewResolver("/WEB-INF/view/", ".jsp");
		return viewResolver;
	}
}
