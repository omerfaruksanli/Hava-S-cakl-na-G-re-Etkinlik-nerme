import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  sicaklik;

        Scanner input= new Scanner(System.in);
        System.out.println("Hava Kaç Derece ?");
        sicaklik = input.nextInt();

        if (sicaklik < 5 ){
            System.out.println("Kayak Yapmanızı Tavsiye Ediyoruz :) ");
        }
        else if (sicaklik >=5 && sicaklik<15 ){
            System.out.println("Sinemaya Gitmenizi Tavsiye Ediyoruz\n Mısır almayı unutmayın :)");
        }
        else if (sicaklik >=15  && sicaklik <25 ){
            System.out.println("Piknik Yapmalısınız :) ");
        }else {
            System.out.println("Yüzmeye Gidinnnn :) ");
        }


    }
}