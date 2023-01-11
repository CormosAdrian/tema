import javax.swing.*;

public class Animal {
        String nume;
        String culoare;
        boolean vegetarian;
        int nrPicioare;
        String undeTraieste;

private class undeTraieste {
}

    public String getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    Animal() {
            this.nume = "unknown";
             this.culoare = "unknown";
              this.vegetarian = false;
               this.nrPicioare = 0;
                this.undeTraieste="unknown";

        }

        Animal(String nume) {
            this.nume = nume;
        }

        Animal(String nume, String culoare) {
            this.nume = nume;
             this.culoare = culoare;
        }

        Animal(String nume, String culoare, boolean vegetarian){
            this.nume = nume;
             this.culoare = culoare;
              this.vegetarian = vegetarian;
        }
        Animal(String nume, String culoare, int nrPicioare, String undeTraieste) {
            this.nume = nume;
             this.culoare = culoare;
              this.nrPicioare = nrPicioare;
               this.undeTraieste= undeTraieste;

        }
        public String afiseaza () {
            return (nume + " are culoarea " + culoare);
        }
        public void mananca (String nume){
            System.out.println(nume + " mananca");
        }
        public void doarme (String nume){
            System.out.println(nume + " doarme");
        }
        public void afiseazaPicioarele () {
            if (this.nrPicioare == 0) {
                System.out.println(" Nu are picioare");
            } else if (this.nrPicioare == 2) {
                System.out.println(" Are 2 picioare");
            } else if (this.nrPicioare == 4) {
                System.out.println(" Are 4 picioare");
            } else {
                System.out.println(" Are alt numar de picioare ");
            }

        }

    }
