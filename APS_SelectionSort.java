
package aps_selectionsort;

import static java.lang.Math.random;
import java.util.Random;

public class APS_SelectionSort {
    
    //Numero de 0 a tanto de numeros randomicos as serem colocados no vetor
    int NumDeRandom = 44;
    //Numero de posicoes que estarao no vetor
    int NumVetor = 20;
    Random random = new Random();
    int[] vetor = new int[NumVetor];
    int[] vetor2 = new int[NumVetor];
    int x = 0;
    
    //Criando o Vetor com os Numeros Inteiros
    void APS_SelectionSort(){
        System.out.print("Elementos Vetor: ");
        for (int c = 0; c < vetor.length; c++){
          vetor[c]= random.nextInt(NumDeRandom);
          System.out.print(vetor[c]+" ");
          
        }
    }
    
    //Ordenando os Numeros no mesmo Vetor, Cada numero aparesserá com 1,5 seg de intervalo
    void ordem(){
       int b = 0;
       int d = 0;
       try{
       System.out.print("\nElementos Vetor: ");
       while(true){
       for (int a = 0;a < vetor.length;a++ ){
           if (d == vetor[a]){
               vetor2[b]=vetor[a];
               Thread.sleep(1500);
               System.out.print(vetor2[b]+" ");
               b = b+1;
                    }
                } 
                d++;
                if(d == NumDeRandom){
                    break;
                }
            }       
        }catch(InterruptedException erro){
            System.out.println("Tente de novo, ocorreu algum erro.");
                }
    }
    
    //Main
    public static void main(String[] args) {
        APS_SelectionSort inicia = new APS_SelectionSort();
        
       inicia. APS_SelectionSort();
       inicia.ordem();
        
        }
}
