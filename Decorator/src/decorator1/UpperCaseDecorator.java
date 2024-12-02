package decorator1;

// Decorador concreto
public class UpperCaseDecorator extends TextDecorator {
    public UpperCaseDecorator(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return text.render().toUpperCase();
    }
}
