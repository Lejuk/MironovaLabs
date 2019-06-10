package mironova7;
import java.util.Scanner;
public class Mironova7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] table_A = new int [10]; // масив для створення таблиці А
        int [] table_B = new int [15]; // масив для створення таблиці Б
        int equal = 0; // змінна для підрахунку одинакових елементів у двох таблицях
        boolean eq;
        
        do{
            eq = true; // змінна для підрахунку одинакових елементів в одному окремому масиві
            System.out.println("Fill the 'A' table (all the elements must be different)");
            
            for(int i=0; i<10; i++)         // заповнення масиву А
                table_A[i]=sc.nextInt();
            
            for(int i=0; i<10; i++)        
                for(int j=i-1; j>=0; j--){
                    if(table_A[i] == table_A[j]){ // умова, що всі елементи масиву різні
                        eq = false;
                    }
                }
                
            if(eq==false)
                System.out.println("There are equal elements in 'A' table, try one more time");
        
        }while(eq!=true);   // якщо зустрічаються одинакові елементи - заповнюємо масив ще раз, до поки всі елементи не будуть різними
        
        do{
            eq = true;
            System.out.println("Fill the 'B' table (all the elements must be different)");
            
            for(int i=0; i<15; i++)     // заповнення масиву Б
                table_B[i]=sc.nextInt();
            
            for(int i=0; i<15; i++)
                for(int j=i-1; j>=0; j--){
                    if(table_B[i] == table_B[j]){   // умова, що всі елементи масиву різні
                        eq = false;
                        break;
                    }
                }
            if(eq==false)
                System.out.println("There are equal elements in 'B' table, try one more time");
        
        }while(eq!=true);   // якщо зустрічаються одинакові елементи - заповнюємо масив ще раз, до поки всі елементи не будуть різними
        
        System.out.println(" ");
        
        System.out.println("Index\tTable'A'");      //вивід таблиці А
        for(int i=0; i<table_A.length; i++)
            System.out.println(i + "\t" + table_A[i]);
       
        System.out.println(" ");
        
        System.out.println("Index\tTable'B'");      //вивід таблиці Б
        for(int j=0; j<table_B.length; j++)
            System.out.println(j + "\t" + table_B[j]);
        
        for(int i=0; i<table_A.length; i++)
            for(int j=0; j<table_B.length; j++){
                if(table_A[i]==table_B[j])          //умова підрахунку одинакових елементів
                    equal++;
            }
        
        System.out.println(" ");
        
        System.out.println("There are " + equal + " equal elements");
        
        if(equal>=6) // осклільки в умові задачі точно не сказано конкретної цифри для схожісті таблиць, припустимо, що таблиці схожі, коли в них 6 одинакових елементів 
            System.out.println("Table A is similar to table 'B'");  // умови висновку: таблиці схожі/не схожі
        else
            System.out.println("Tables are not similar");
    }
    
}
