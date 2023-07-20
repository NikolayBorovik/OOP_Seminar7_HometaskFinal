package hometask;

public interface CalcModel<T> {

    public void SetA(T a);
    public void SetB(T b);

    public T add();
    public T substact();
    public T multiply();
    public T divide();
}
