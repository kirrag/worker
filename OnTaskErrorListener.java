@FunctionalInterface
public interface OnTaskErrorListener<T> {
    void onError(String result);
}
