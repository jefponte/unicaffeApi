package br.edu.unilab.unicafe.registro.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OutroTeste {

	public static void main(String[] args) {
		Process process;
		Scanner leitor;
		
		try {
			
			
			process = Runtime.getRuntime().exec(" tasklist /v /FO csv");
			leitor = new Scanner(process.getInputStream());
			while(leitor.hasNext()){
				System.out.println(leitor.nextLine());
			}
			
			
			Thread.sleep(3000);
			
			
			Thread.sleep(3000);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
