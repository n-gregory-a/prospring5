package hellospring.api;

import org.jetbrains.annotations.Nullable;

public interface MessageRenderer {

    void render();

    void setMessageProvider(MessageProvider provider);

    @Nullable
    MessageProvider getMessageProvider();

}
