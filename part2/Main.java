package part2;

//import java.lang.*;
//import java.util.*;
//import java.awt.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\최석휘\\Desktop\\output.txt");
			String str = "자바로 파일 입출력을 해보자!!";
			byte[] by = str.getBytes();
			output.write(by);		
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		try {
			File file = new File("C:\\Users\\최석휘\\Desktop\\output.txt");
			FileReader fr = new FileReader(file);
			int cur = 0;
			while ((cur = fr.read()) != -1) {
				System.out.print((char)cur);
			}
			System.out.println();
			fr.close();
		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}
}
