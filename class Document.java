
public class Document {

    private StringBuffer textBuffer;

    public Document() {
        textBuffer = new StringBuffer();
    }

    public void addText(String input) {
        textBuffer.append(input);
    }

    public void clearText() {
        textBuffer.setLength(0);
    }

    public void reverseText() {
        textBuffer.reverse();
    }

    public void deleteText(int start, int end) {
        textBuffer.delete(start, end);
    }

    public void displayText() {
        System.out.println("Current Text: " + textBuffer.toString());
    }

    public static void main(String[] args) {

        Document doc = new Document();

        doc.addText("Hello World");
        System.out.print("Text after adding: ");
        doc.displayText();

        doc.reverseText();
        System.out.print("Text after reverse: ");
        doc.displayText();

        doc.addText(" Java");
        System.out.print("Text after adding more: ");
        doc.displayText();

        doc.deleteText(11, 16);
        System.out.print("Text after delete: ");
        doc.displayText();

        doc.clearText();
        System.out.print("Text after clear: ");
        doc.displayText();
    }
}
