package mironova23;

import java.util.Scanner;

public class Mironova23 {

    public static void main(String[] args) {
        int i,k; // змінні для роботи з циклами
        int equals = 0; // змінна для підрахунку одинакових елементів
        int straight = 0; // змінна для роботи із послідовним рядом
        int [] array = new int [5]; // створення нового масиву
        
        System.out.println("Fill your array with 5 numbers (1 to 13 required) ");
        
        Scanner sc = new Scanner(System.in);
        
        for( i=0; i<5; i++)
            array[i] = sc.nextInt();       // заповнення масиву
        
        for (i=0; i<array.length; i++){    // сортування масиву
        int num = array[i];
            for(int j=i-1; j>=0; j--){
                int left = array[j];
                if (num<left){
                    array[j+1] = left;
                    array[j] = num;
                }
            }
        }
           
//        for (int p : array){              // цикл для виведення відсортованого масиву
//            System.out.print(p + " ");
//        }
//
//        System.out.println(" ");              
//        

           
            
        for (i=0; i<5; i++) {               // цикл для підрахунку однакових елементів
            for(k=4; k>i; k--){
                if(array[i]==array[k]){
                    equals ++;              
                }
            }
        }
        
        
        switch (equals) {
            case 1:
                System.out.println("One pair");
                break;
            case 2:
                System.out.println("Two pairs");
                break;    
            case 3:
                System.out.println("Three of a Kind");
                break;    
            case 4:
                System.out.println("Full House");
                break;    
            case 6:
                System.out.println("Four of a Kind");
                break;
            case 10:
                System.out.println("IMPOSSIBLE");
                break;
            default:
                System.out.println("Nothing");
 
                for (i=0; i<array.length; i++){            // цикл для обчислення послідовності елементів
                    for (k=4; k>i; k--){
                        if(array[k] - array[i] == 1)
                            straight ++;
                    }
                }
        
                if(straight == 4)
                System.out.println("Straight");
        }        
    }
}