package hellospring.configuration;

import hellospring.api.MessageProvider;
import hellospring.api.MessageRenderer;
import hellospring.context.HelloWorldMessageProvider;
import hellospring.context.StandardOutMessageRenderer;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer() {
        @NotNull final MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(provider());
        return renderer;
    }

}
