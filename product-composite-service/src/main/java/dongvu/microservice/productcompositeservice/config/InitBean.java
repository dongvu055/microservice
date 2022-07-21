package dongvu.microservice.productcompositeservice.config;

import com.squareup.okhttp.OkHttpClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InitBean {
    @Bean
    @LoadBalanced
    public OkHttpClient okHttpClient() {
        return new OkHttpClient();
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
