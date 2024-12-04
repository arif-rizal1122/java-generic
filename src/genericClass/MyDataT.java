package genericClass;

public class MyDataT<T> {

    private T data;

    public MyDataT(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
