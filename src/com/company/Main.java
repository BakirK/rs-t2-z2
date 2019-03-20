package com.company;

import java.util.Scanner;

public class Main {

    public static int sumacifara(int broj) {
        int suma = 0;
        while(broj !=0 ){
            suma = suma + (broj % 10);
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args){
        int broj;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        broj = ulaz.nextInt();
        for(int i = 1; i <= broj; i++){
            if(i % sumacifara(i)==0){
                System.out.println(i);
            }
        }
    }
}
