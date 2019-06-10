package mironova6;
import java.util.Scanner;

public class Mironova6 {

    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);    
int n; // кількість каменів
System.out.println("How many stones do you have? ");
n=sc.nextInt();
int [] stones = new int[n]; // масив для роботи з каменями

System.out.println("Write weight each of them: ");
    for(int i=0;i<n;i++){       // заповнення масиву 
        System.out.print((i+1) + ". ");
        stones[i]=sc.nextInt();
    }

int temp; //змінна для сортування масиву

    for(int i=0;i<n-1;i++)
        for(int j=i+1;j<n;j++)  // сортування масиву
            if(stones[i]<stones[j]){
                temp=stones[i];
                stones[i]=stones[j];
                stones[j]=temp;  
            }
 
int sum1 = 0; // змінна для підрахунку ваги каменів першої купи
int sum2 = 0; // змінна для підрахунку ваги каменів другої купи
int k1 = 0; // змінна для роботи з індексами першої купи
int k2 = 0; // змінна для роботи з індексами другої купи

int[] bunch1 = new int [n-1]; // масив для роботи із першою купою

int[] bunch2 = new int [n-1]; // масив для роботи із другою купою

for(int i=0;i<n;i++){
    if(sum1<=sum2){     // умова розприділення кожного до певної купи, першу купу робимо важчою ніж другу
        bunch1[k1]=stones[i];
        sum1+=stones[i];
        k1++;
    }
    else{
        bunch2[k2]=stones[i];
        sum2+=stones[i];
        k2++;
    }
}
if(1.0*sum1/sum2 <=2){                      // виведення результатів
    
    System.out.println("The first bunch has stones with weight : ");
    
    for(int i=0;i<k1;i++)
        System.out.println(bunch1[i] + "  ");
    
    System.out.println("Its total weight is : " + sum1);
    
    System.out.println("The second bunch has stones with weight : ");
    
    for(int i=0;i<k2;i++)
        System.out.println(bunch2[i] + "  ");
    
    System.out.println("Its total weight is : " + sum2);
}
else 
    System.out.println("The first bunch is more than 2 times bigger than the second one\n");
    
    
    }
    
}
