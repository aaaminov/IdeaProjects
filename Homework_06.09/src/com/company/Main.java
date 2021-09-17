package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ex_line = new Scanner(System.in);
        int ex = ex_line.nextInt(); //задание
        if (ex == 1){
            Scanner str_line = new Scanner(System.in);
            String str = str_line.nextLine();
            int count_rus_char = 0;
            for (int i = 0; i < str.length(); i++){
                int str_i = (int)str.charAt(i);
                if (1072 <= str_i && str_i <= 1103){ //а-я = [1072-1103]
                    count_rus_char++;
                }
            }
            System.out.println(count_rus_char);
            //str_line.close();
        }
        else if (ex == 2){
            String str = "";
            Scanner num_line = new Scanner(System.in);
            int num = num_line.nextInt();
            Scanner char1_line = new Scanner(System.in);
            char char1 = char1_line.nextLine().charAt(0);
            Scanner char2_line = new Scanner(System.in);
            char char2 = char2_line.nextLine().charAt(0);
            for (int i = 0; i < num; i++){
                str = str + char1 + char2;
            }
            System.out.println(str);
            //num_line.close();
            //char1_line.close();
            //char2_line.close();
        }
        else if (ex == 3){
            Scanner str_line = new Scanner(System.in);
            String str = str_line.nextLine();
            Scanner char_line = new Scanner(System.in);
            char search_char = char_line.nextLine().charAt(0);
            int count_search_char = 0;
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == search_char){
                    count_search_char++;
                }
            }
            System.out.println(count_search_char);
            //str_line.close();
            //char_line.close();
        }
        ex_line.close();
    }
}
