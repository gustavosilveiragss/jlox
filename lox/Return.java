package lox;

public class Return extends RuntimeException {
    final public Object value;

    public Return(Object value) {
        super(null, null, false, false);
        this.value = value;
    }
}
