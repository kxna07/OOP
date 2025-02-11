public class MethodsAll {
    public static void main(String args[]){
        int sumOfTwo = add(10,20);
        System.out.printf("Sum : %d \n",sumOfTwo);

        int sumOf3 = add(10,20,30);
        System.out.printf("Sum : %d \n",sumOf3);

        int sumOf4 = add(10,20,30,40);
        System.out.printf("Sum : %d \n",sumOf4);
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b,int c){
        return a+b+c;
    }

    public static int add(int a, int b,int c,int d){
        return a+b+c+d;
    }
}
