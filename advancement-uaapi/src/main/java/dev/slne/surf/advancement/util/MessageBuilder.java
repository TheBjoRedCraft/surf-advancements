package dev.slne.surf.advancement.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.event.ClickEvent;
import net.kyori.adventure.text.event.HoverEvent;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class MessageBuilder {
    private Component message = Component.empty();

    public MessageBuilder primary(String text) {
        message = message.append(Component.text(text, Colors.PRIMARY));
        return this;
    }

    public MessageBuilder secondary(String text) {
        message = message.append(Component.text(text, Colors.SECONDARY));
        return this;
    }

    public MessageBuilder info(String text) {
        message = message.append(Component.text(text, Colors.INFO));
        return this;
    }

    public MessageBuilder success(String text) {
        message = message.append(Component.text(text, Colors.SUCCESS));
        return this;
    }

    public MessageBuilder warning(String text) {
        message = message.append(Component.text(text, Colors.WARNING));
        return this;
    }

    public MessageBuilder error(String text) {
        message = message.append(Component.text(text, Colors.ERROR));
        return this;
    }

    public MessageBuilder variableKey(String text) {
        message = message.append(Component.text(text, Colors.VARIABLE_KEY));
        return this;
    }

    public MessageBuilder variableValue(String text) {
        message = message.append(Component.text(text, Colors.VARIABLE_VALUE));
        return this;
    }

    public MessageBuilder prefixColor(String text) {
        message = message.append(Component.text(text, Colors.PREFIX_COLOR));
        return this;
    }

    public MessageBuilder darkSpacer(String text) {
        message = message.append(Component.text(text, Colors.DARK_SPACER));
        return this;
    }

    public MessageBuilder miniMessage(String text) {
        message = message.append(MiniMessage.miniMessage().deserialize(text));
        return this;
    }

    public MessageBuilder component(Component component) {
        message = message.append(component);
        return this;
    }

    public MessageBuilder command(MessageBuilder text, MessageBuilder hover, String command) {
        message = message.append(
                text.build().clickEvent(ClickEvent.runCommand(command))
                        .hoverEvent(HoverEvent.showText(hover.build()))
        );
        return this;
    }

    public MessageBuilder suggest(MessageBuilder text, MessageBuilder hover, String command) {
        message = message.append(
                text.build().clickEvent(ClickEvent.suggestCommand(command))
                        .hoverEvent(HoverEvent.showText(hover.build()))
        );
        return this;
    }

    public MessageBuilder white(String text) {
        message = message.append(Component.text(text, Colors.WHITE));
        return this;
    }

    public MessageBuilder newLine() {
        message = message.append(Component.newline());
        return this;
    }

    public Component build() {
        return message;
    }
}
