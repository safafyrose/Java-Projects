public class superclass {
    superclass(){
        System.out.println("Parent");
    }}
    class Child13 extends superclass {
        Child13() {
            super();
            System.out.println("Child");
        }

        public static void main(String[] args) {
            Child13 ch = new Child13();
        }
    }

