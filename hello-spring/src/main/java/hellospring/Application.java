package hellospring;

import hellospring.api.MessageRenderer;
import hellospring.configuration.HelloWorldConfiguration;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class Application {

    public static void main(String[] args) {
        @NotNull final ApplicationContext context =
                new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        @NotNull final MessageRenderer messageRenderer =
                context.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }

}
