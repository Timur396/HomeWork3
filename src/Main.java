public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double a = 27.12;
        long b = 987678965549L;
        double c =2.786;
        String d =  " false ";
        int e = 569;
        int f = -159;
        int g = 27897;
        byte h = 67;

        byte L = 23;
        byte A = 27;
        int E = 30;
        int paper = 480;
        int over = L + A + E;
        System.out.println(" На каждого ученика " + over +" листов бумаги ");

        int time1munute = 8;
        int time20munute = 20;
        int time20munuteBottle = time1munute * time20munute;
        System.out.println(" За "+ time20munute + " минут машины произвела бутылок " + time20munuteBottle + " штук " );

        int time1day = 1440;
        int time1dayBottle = time1munute * time1day;
        System.out.println(" За "+ time1day + " минут машины произвела бутылок " + time1dayBottle + " штук " );

        int time1month =43200;
        int time1monthBottle = time1month * time1munute;
        System.out.println(" За "+ time1month  + " минут машины произвела бутылок " + time1monthBottle  + " штук " );

        int Jar = 120;
        int whiteJar1class =2;
        int brownJar1class =4;
        int OverClass = Jar / (whiteJar1class + brownJar1class );
        int OverwhiteJar =  OverClass * whiteJar1class ;
        int OverbrownJar = OverClass * brownJar1class ;
        System.out.println (" В школе, где " + OverClass + " классов, нужно " + OverwhiteJar + " банок белой краски и " + OverbrownJar + " банок коричневой краски " );

        int banana1 = 80;
        int milk100 = 105;
        int iceCreame = 100;
        int egg = 70;
        double totalWeightgram = (banana1 * 5) + (milk100 *2) + (iceCreame * 2) +( egg *4);
        double  totalWeightkg = totalWeightgram / 1000;
        System.out.println(totalWeightgram  +" gram" );
        System.out.println(totalWeightkg   +" kg" );

        double totalWeight = 7;
        double resetWeight1 = 0.25;
        double resetWeight2 =0.5;
        double overDay1 = totalWeight / resetWeight1;
        double overDay2 = totalWeight / resetWeight2;
        System.out.println(overDay1 );
        System.out.println(overDay2 );

        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int Masha1 = (Masha*10) /100 ;
        int Masha2 = Masha1 + Masha;

        int Denis1 =(Denis *10)/ 100;
        int Denis2 = Denis1 +Denis ;

        int Kristina1 = (Kristina *10) /100;
        int Kristina2 = (Kristina1 + Kristina );

        System.out.println(" Маша теперь получает " + Masha2 + " рублей. Годовой доход вырос на " + Masha1 +" рублей"  );
        System.out.println(" Денис теперь получает" + Denis2  + " рублей.Годовой доход вырос на " + Denis1  + " рублей");
        System.out.println(" кристина теперь получает  " + Kristina2+ "рублей. Годовой доход вырос на " +Kristina1 + "рублей"    );









    }
}