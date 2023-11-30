package pole_prostokata;

import java.io.*;

public class PoleProstokata {

    public static void main(String[] args)
        throws IOException
    {

        double a, b, pole;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Program obicza pole prostokata.");
        System.out.println("podaj bok a:");
        a = Double.parseDouble(br.readLine());
        System.out.println("podaj bok b:");
        b = Double.parseDouble(br.readLine());

        pole = a*b;//obliczamy pole

        System.out.println("Pole prostokąta o boku a = "+a+" i boku b = "+b);
        System.out.println("wynosi " +pole+ ".");

    }
}
