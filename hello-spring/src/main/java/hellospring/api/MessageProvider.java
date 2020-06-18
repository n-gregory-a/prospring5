package hellospring.api;

import org.jetbrains.annotations.NotNull;

public interface MessageProvider {

    @NotNull
    String getMessage();

}
