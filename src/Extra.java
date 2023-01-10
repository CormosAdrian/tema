public class Extra {
    public static void main(String[] args) {


        int luna=11;
        int zi=12;
        System.out.println(luna+","+zi+","+"1989");
        System.out.println(luna+","+zi+",1989");

        int anulNasteri=1989;
        String nume="Cormos Adrian";
        System.out.println("Numele meu este "+nume+ "Anul nasterii este "+anulNasteri);
        System.out.println("-------------------------------------------------------------------------------------");

        int x=1;
        String y="Cadouri !";
        System.out.println("Sotia a primit "+ x +" "+y);
        if (x<=0) {
            System.out.println("Sad Women");
        }

        else
            System.out.println("Happy Women");
        System.out.println("---------------------------------------------2023------------------------------");
        int myNum = 9;
         float myFloatNum = 8.99f;
          char myLetter = 'A';
           boolean myBool = false;
            String myText = "Hello World";
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        byte h=4;
        int c=h;
        System.out.println(c);
/*
        float j=5.5f;
        int k=j;
        System.out.println(k);

 */
        String nume1="Cormos Adrian Vasile";
        int lungime=nume1.length();
        System.out.println("Lungimea numelui este "+ lungime);


        double numere[]={3.2,2.3,4.5,5.4};
        System.out.println("Al doilea numar este "+numere[1]);
        System.out.println("Al patrulea numar este "+numere[3]);
        System.out.println(">>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        int doi=2;
        //doi +=3;
        doi=doi+3;
        System.out.println(doi);
        ++doi;
        ++doi;
        System.out.println("'doi' incrementat de 2 ori ="+doi);

        int w=5;
        int e=2;
        int r=(w+e);
        System.out.println(r);
        if (r%2==0)
        System.out.println("r numar par");

        else
            System.out.println("r numar impar");


        for (int i = 0; i < 5; i++)
        { System.out.print( i); }
        System.out.println( );

        for (int o = 10; o >= 5; o--)
        { System.out.println("o ="+ o); }

        String[] cars = {"BMW", "Ford", "Mazda"};
        for (String it : cars)
        { System.out.println(it); }

        int i = 0;
        while (i < 4) { System.out.println(i); i++; }
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,");

        int t=0;
        do {
            System.out.println(t);
        t++;}
        while (t<4);

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[3]); }
        catch (Exception u)
        { System.out.println("Something went wrong."); }
















    }



    }

