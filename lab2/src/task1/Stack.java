package task1;

public interface Stack {
    void push(int value);
    int pop();
    void forEach(ElementAction action);
}
