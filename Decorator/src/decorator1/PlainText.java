package decorator1;

// Clase concreta
public class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    @Override
    public String render() {
        return content;
    }
}
