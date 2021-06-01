package Exam;

import java.sql.SQLOutput;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
            Box3 box3 = new Box3();
            Box5 box5 = new Box5();
            Scanner scan = new Scanner(System.in);
            System.out.println("give me the box's length");
            int length = Integer.parseInt(scan.next());
            System.out.println("give me the box's width");
            int width = Integer.parseInt(scan.next());
            System.out.println("give me the box's height");
            int height = Integer.parseInt(scan.next());
            System.out.println("length: " + length + ", width: " + width + ", height: " + height);
            if(box3.validate(length ,height ,width)){
                System.out.println(box3.getName());
            }
            else {
                System.out.println(box5.getName());
            }
        }

    }

