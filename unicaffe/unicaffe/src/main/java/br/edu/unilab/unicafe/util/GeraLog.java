package br.edu.unilab.unicafe.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class GeraLog {

	
	public static void LogTxt(String nome,String classe)
    {
        File arquivoTxt = new File("log_programa.txt");

        if(!arquivoTxt.exists())
        {
            try
            {   //Cria o arquivo
                arquivoTxt.createNewFile();
                System.out.println("Arquivo criado");

                //salva o arquivo
                FileWriter  writer = new FileWriter(arquivoTxt);
                writer.write(nome+"\n");
              

                writer.close();
                System.out.println("Arquivo salvado");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            try
            {
                FileReader reader = new FileReader(arquivoTxt);
                BufferedReader br = new BufferedReader(reader);
                String linha = br.readLine();
                FileWriter  writer = new FileWriter(arquivoTxt);

                while(linha != null)
                {
                    writer.write(linha+"\n");
                    br.readLine();
                    linha = br.readLine();
                }

                br.close();
                reader.close();

                writer.write(nome+"\n");
              
                writer.close();
                System.out.println("Arquivo salvado");
            }
            catch(IOException err)
            {
                err.printStackTrace();
            }
        }
    }
}
