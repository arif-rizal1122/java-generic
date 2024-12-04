package boundedParameter;

public class App {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(300);
        // NumberData<String> stringNumberData = new NumberData<>("hello"); // error karena harus dari turunan NUMBER saja
        System.out.println(integerNumberData.getData());
    }

    public static  class NumberData<T extends Number>{
        private T data;

        public NumberData(T data){
            this.data = data;
        }
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
