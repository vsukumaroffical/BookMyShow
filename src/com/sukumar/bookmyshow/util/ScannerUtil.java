package com.sukumar.bookmyshow.util;

import java.util.Scanner;

public class ScannerUtil {
    private static ScannerUtil instance;
    private final Scanner scanner = new Scanner(System.in);
    private ScannerUtil(){ }

    public static ScannerUtil getInstance(){
        if(instance == null) {
            instance = new ScannerUtil();
        }
        return instance;
    }
    public int getInt(){
        int input = 0;
        while (true){
            if(scanner.hasNextInt()){
                input = scanner.nextInt();
                break;
            }else{
                System.out.println("Plz enter integer value");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return input;
    }
    public byte getByte(){
        byte input = 0;
        while (true){
            if(scanner.hasNextByte()){
                input = scanner.nextByte();
                break;
            }else{
                System.out.println("Plz enter byte value");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return input;
    }
    public Long getLong(){
        Long input = null;
        while (true){
            if(scanner.hasNextLong()){
                input = scanner.nextLong();
                break;
            }else{
                System.out.println("Plz enter long value");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return input;
    }
    public String getString(){
        return scanner.nextLine();
    }
    public char getCharacter(){
        return scanner.nextLine().charAt(0);
    }
}
