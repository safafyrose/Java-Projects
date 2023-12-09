public class method_overriding {
    int add(){
        int a=10,b=20,c=30;
        return a+b+c;
    }
}
class child_method extends method_overriding{
    int add(){
        int a=24,b=43,c=83;
        return a+b+c;
    }
        public static void main(String args[]){
        child_method chmthd = new child_method();
        System.out.println(chmthd.add());

        }
    }

