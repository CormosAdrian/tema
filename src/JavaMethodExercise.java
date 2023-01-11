public class JavaMethodExercise {
    public static void main(String[] args) {
        metoda();
        varsta(16);
        aritmetica(12,10,8);
        System.out.println(aritmetica(5,10,8));

    }
    public static void metoda() {
        System.out.println("Urmeaza vacanta!");
    }
       public static void varsta(int age) {

           if (age >= 18)
               System.out.println("Esti major!");

           else
               System.out.println("Esti minor!");
       }
       public static int aritmetica(int a, int b,int c){
        return (a+b+c);
       }

}