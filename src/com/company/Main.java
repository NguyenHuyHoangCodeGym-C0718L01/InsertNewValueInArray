package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5};
        System.out.print("Old array: ");
        for(int i = 0; i <array.length; i++){
            System.out.print(array[i]+" ");
        }
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int index;
        do {
            System.out.print("Input index : ");
            index = scanner.nextInt();
            if(index>=array.length || index < 0){
                System.out.println("Index must be in range of array length");
            }
        }while (index>=array.length || index < 0 );

        System.out.print("Input value: ");
        int value = scanner.nextInt();
        array[index] = value;
        System.out.println("New Value: "+value+" just add at "+index);

        System.out.print("New Array: ");
        for(int j=0; j<array.length; j++){
            System.out.print(array[j]+" ");
        }
    }
}
