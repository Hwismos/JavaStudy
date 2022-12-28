package part2;

//import java.lang.*;
//import java.util.*;
//import java.awt.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		String s1 = new String("Book");
		String s2 = new String("Book");
		String s3 = "Book";
		String s4 = "Book";
		
		compare(s1, s2);  // s1과 s2는 별개의 객체
		compare(s3, s4);  // s3과 s4는 동일한 객체
		
		s4 = s4.toUpperCase();  // toUpperCase 메소드가 새로운 String 객체를 반환
		System.out.println(s4);  // s4는 다른 객체가 됨
		
		compare(s3, s4);
	}
	
	public static void compare(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("두 객체는 동일한 객체");
		} else {
			System.out.println("두 객체는 별개의 객체");
		}
	}
}
