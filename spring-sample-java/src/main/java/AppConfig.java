import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"com.adonayg"})
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//  Without Autowiring
//	@Bean(name = "customerService")
//	public CustomerService getCustomerService() {
//		CustomerServiceImpl service = new CustomerServiceImpl();
//		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
//		service.setCustomerRepository(getCustomerRepository());
//		return service;
//	}
//	
//	@Bean(name= "customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}
