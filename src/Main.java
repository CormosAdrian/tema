public class Main {
    public static void main(String[] args) {

/*
        int myNumber;
         myNumber=10;
          String nume= "Nota";

            System.out.println(nume+" "+myNumber);




        int myNum = 9;
         float myFloatNum = 8.99f;
          char myLetter = 'A';
           boolean myBool = false;
            String myText = "Hello World";


byte x=100;
int y= x;
        System.out.println(y);


        float myFloatNumber =11111111f;
        int z =(int) myFloatNumber ;
        System.out.println(z);

String myName = "Cormos Adrian Vasile";
int lungimenume = myName.length();
        System.out.println(lungimenume);

double[] height={10.5,5.2,4.8,7};
        System.out.println(height[1]);
        System.out.println(height[3]);

 */
/*
        Animal animal1 =new Animal("soricel","cenusie",false );
        System.out.println(animal1.afiseaza());
        Animal animal2 =new Animal("Ursul","alba", false);
        Animal animal3= new Animal("Ursul","Alba");
        animal3.doarme(animal3.nume);
        animal3.mananca(animal3.nume);
        System.out.println(animal3.afiseaza());
        Animal animal4=new Animal("Pinguinul","alb/negru");
        animal4.doarme(animal4.nume);
        animal4.mananca(animal4.nume);
        System.out.println(animal4.afiseaza());
*/


        Animal animal5=new Animal(" Cainele","Maro",4, "Pe uscat");
         System.out.print(animal5.nume);
          animal5.afiseazaPicioarele();
           System.out.println("Traieste-"+animal5.undeTraieste);
             System.out.println("<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");


        Animal animal6=new Animal(" Rata","Alb",2,"Pe uscat||Apa");
         System.out.print(animal6.nume);
          animal6.afiseazaPicioarele();
           System.out.println("Traieste-"+animal6.undeTraieste);
            System.out.println("<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");

        Animal animal7=new Animal(" Caracatita","Rosu",8,"In apa");
         System.out.print(animal7.nume);
          animal7.afiseazaPicioarele();
           System.out.println("Traieste-"+animal7.undeTraieste);



    }
}