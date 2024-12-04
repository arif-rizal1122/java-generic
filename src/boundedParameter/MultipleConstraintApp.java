package boundedParameter;

public class MultipleConstraintApp {
    public static void main(String[] args) {

        // Data<Manager> managerData = new Data<>(new Manager()); // manager tidak implement CanSayHello
        Data<ViceManager> viceManagerData = new Data<>(new ViceManager());
        ViceManager retriveData = viceManagerData.getData();

        retriveData.sayHello("hy angel");
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee{

    }

    public static class ViceManager extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }
    public static class Data<T extends Employee & CanSayHello>{
        private T data;
        public Data(ViceManager data){
            this.data = (T) data;
        }
        public T getData(){
            return data;
        }
        public void setData(T data){
            this.data = data;
        }
    }

}
