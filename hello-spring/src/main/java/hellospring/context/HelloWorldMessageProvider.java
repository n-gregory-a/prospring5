package hellospring.context;

import hellospring.api.MessageProvider;
import org.jetbrains.annotations.NotNull;

public final class HelloWorldMessageProvider implements MessageProvider {

    @NotNull
    @Override
    public String getMessage() {
        return "Hello World";
    }

}
