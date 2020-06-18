package hellospring.context;

import hellospring.api.MessageProvider;
import hellospring.api.MessageRenderer;
import org.jetbrains.annotations.Nullable;

public final class StandardOutMessageRenderer implements MessageRenderer {

    @Nullable
    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class:" +
                    StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(@Nullable final MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Nullable
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

}
