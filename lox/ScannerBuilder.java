package lox;

public class ScannerBuilder {
    private String source;

    public ScannerBuilder setSource(String source) {
        this.source = source;
        return this;
    }

    public Scanner createScanner() {
        return new Scanner(source);
    }
}