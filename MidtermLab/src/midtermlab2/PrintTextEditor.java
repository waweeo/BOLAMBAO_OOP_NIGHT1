package midtermlab;

public class PrintTextEditor extends TextEditor {
    public PrintTextEditor(String initialText) {
        super(initialText);
    }

    public void print() {
        System.out.println(this.getText());
    }
}
