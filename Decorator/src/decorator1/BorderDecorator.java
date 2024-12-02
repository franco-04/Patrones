package decorator1;

// Decorador concreto
public class BorderDecorator extends TextDecorator {
    public BorderDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "*****\n" + text.render() + "\n*****";
    }
}
