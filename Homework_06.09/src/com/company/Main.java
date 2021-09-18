package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner str_line = new Scanner(System.in);
        String str = str_line.nextLine();
        int count_rus_char = 0;
        for (int i = 0; i < str.length(); i++){
            int str_i = (int)str.charAt(i);
            if (1072 <= str_i && str_i <= 1103){ //а-я = [1072-1103]
                count_rus_char++;
            }
        }
        System.out.println("кол-во маленьких русских символов: " + count_rus_char);
        //str_line.close();

        String str2 = "";
        System.out.println("Введите число: ");
        Scanner num_line = new Scanner(System.in);
        int num = num_line.nextInt();
        System.out.println("Введите первый символ: ");
        Scanner char1_line = new Scanner(System.in);
        char char1 = char1_line.nextLine().charAt(0);
        System.out.println("Введите второй символ: ");
        Scanner char2_line = new Scanner(System.in);
        char char2 = char2_line.nextLine().charAt(0);
        for (int i = 0; i < num; i++){
            str2 = str2 + char1 + char2;
        }
        System.out.println("полученная строка: " + str2);
        //num_line.close();
        //char1_line.close();
        //char2_line.close();

        System.out.println("Введите строку: ");
        Scanner str_line3 = new Scanner(System.in);
        String str3 = str_line3.nextLine();
        System.out.println("Введите искомый символ: ");
        Scanner char_line = new Scanner(System.in);
        char search_char = char_line.nextLine().charAt(0);
        int count_search_char = 0;
        for (int i = 0; i < str3.length(); i++){
            if (str3.charAt(i) == search_char){
                count_search_char++;
            }
        }
        System.out.println("кол-во вхождений символа: " + count_search_char);
        //str_line.close();
        //char_line.close();

    }
}
