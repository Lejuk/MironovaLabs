package mironova.pkg19;

public class Mironova19 {

    public static void main(String  args[]){

    int winnable = 0; // змінна для підрахунку виграшних білетів
    int number; // змінна номеру білету
    
    for (number = 1; number < 1000000; number++) {  // цикл для визначення кількості виграшних білетів
        if (number / 100000 + (number / 10000) % 10 + (number / 1000) % 10 == (number / 100) % 10 + (number / 10) % 10 + number % 10) { // умова виграшного білету      
            winnable ++;
        }
    }
        
    System.out.println("There are " + winnable + " winnable tickets");
    }
}
    

