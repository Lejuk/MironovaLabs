package mironova10;
import java.util.Scanner;

public class Mironova10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int departure = 211221; // місто-відправлення
        int destination = 21221; // місто-прибуття
        char [] alphavet = new char [34]; // масив для рос. алфавіту
        System.out.println("Russian alphavet is:");

        alphavet[0] = 'I';     // так, мені відомо про існування цилку for для заповнення масиву,
        alphavet[1] = 'А';     // але netBeans чомусь не розпізнає російські символи, коли заповнюєш чар-масив через цикл:  
        alphavet[2] = 'Б';     // for(int 0=1; i<34; i++)
        alphavet[3] = 'В';     //   alphavet[i] = sc.next().charAt(0); 
        alphavet[4] = 'Г';     //   ¯\_(ツ)_/¯
        alphavet[5] = 'Д';
        alphavet[6] = 'Е';
        alphavet[7] = 'Ё';
        alphavet[8] = 'Ж';
        alphavet[9] = 'З';
        alphavet[10] = 'И';
        alphavet[11] = 'Й';
        alphavet[12] = 'К';
        alphavet[13] = 'Л';
        alphavet[14] = 'М';
        alphavet[15] = 'Н';
        alphavet[16] = 'О';
        alphavet[17] = 'П';
        alphavet[18] = 'Р';
        alphavet[19] = 'С';
        alphavet[20] = 'Т';
        alphavet[21] = 'У';
        alphavet[22] = 'Ф';
        alphavet[23] = 'Х';
        alphavet[24] = 'Ц';
        alphavet[25] = 'Ч';
        alphavet[26] = 'Ш';
        alphavet[27] = 'Щ';
        alphavet[28] = 'Ъ';
        alphavet[29] = 'Ы';
        alphavet[30] = 'Ь';
        alphavet[31] = 'Э';
        alphavet[32] = 'Ю';
        alphavet[33] = 'Я';
        
        for(int i=1; i<34; i++)
            System.out.println(alphavet[i] + " "); // виведення рос. алфавіту
        

        System.out.println("Possible letters for departure city are :");
              
            for (int i=100000; i>=1; i/=10)     // цикл, для знаходження індексів, щоб дізнатись місто-відправлення
                for(int j=10; j<=100; j*=10){
                    departure=departure/i%j;
                    System.out.print(alphavet[departure] + " ");
                     departure = 211221;
                }
            System.out.println(" ");
            
        
        
        System.out.println("Possible letters for destination city are :");
              
            for (int i=10000; i>=1; i/=10)      // цикл, для знаходження індексів, щоб дізнатись місто-прибуття
                for(int j=10; j<=100; j*=10){
                    destination=destination/i%j;
                    System.out.print(alphavet[destination] + " ");
                     destination = 21221;
                }
            System.out.println(" ");    
            
       System.out.println("In vain, compiller doesn't know names of Russian cities, but it's very likely that girls is travelling from 'Баку' to 'Уфа' ");

        
    }
}