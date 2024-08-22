//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// class principal
public class Main {

    public static void main(String[] args) {

        int age = 8;
        String pseudo = "antho";
        // (age - 1) age--;
        // (age + 1) age++;
        System.out.println(age +" "+pseudo);

        int note1 = 10;
        int note2 = 13;
        int note3 = 15;

        // calculating an average
        int calcul = (note1+note2+note3)/3;
        System.out.print("moyenne des notes : ");
        System.out.println(calcul);

        int money = 1900;

        // Conditions if,else et else if
        if(money < 1000 || money == 2000) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        if (age >= 18){
            System.out.println("Majeur");
        }else if(age <=10) {
            System.out.println("Mineur et moins de 10");
        }else {
            System.out.println("Mineur");
        }

        // switch condition
        int euro = 19;

        switch(euro) {

            case 10:
                System.out.println("Le nombre est 10");
                break;

            case 11:
                System.out.println("Le nombre est 11");
                break;

            case 12:
                System.out.println("Le nombre est 12");
                break;

            case 13:
                System.out.println("Le nombre est 13");
                break;

            default: System.out.println("Pas d'info sur le nombre");
        }
    }

}
