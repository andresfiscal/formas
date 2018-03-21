import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class formas {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int option;
		do{
			option = option();
			int[] parameters = getparameters(option);
			operation(option, parameters);
		}
		while(option != 6);
	}
	public static int option() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("seleccione el area de cual forma quiere calcular: \n1. Circulo\n2. Triangulo\n3." +
				 " Rectangulo\n4. Trapecio\n5. Salir\n");
		bw.flush();
		
		int option = Integer.parseInt(br.readLine());
		
		return option;
	}
	public static int[] getparameters(int opcion) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] parameters = null;
		
		switch(opcion){
			case 1: //circulo
			{
				parameters = new int[1];
				
				bw.write("se calculara el area de un circulo \n");
				bw.write("ingrese el radio del circulo: \n");
				bw.flush();
				parameters[0] = Integer.parseInt(br.readLine());
				
			}
			break;
			case 2: // triangulo
			{
				parameters = new int[2];
				
				bw.write("se calculara el area de un triangulo \n");
				bw.write("ingrese la base del triangulo: \n");
				bw.flush();
				parameters[0] = Integer.parseInt(br.readLine());
				bw.write("ingrese la altura de el triangulo: \n");
				bw.flush();
				parameters[1] = Integer.parseInt(br.readLine());
			}
			break;
			case 3: //rectangulo
			{
				parameters = new int[2];
				
				bw.write("se calculara el area de un rectangulo \n");
				bw.write("ingrese la base del rectangulo: \n");
				bw.flush();
				parameters[0] = Integer.parseInt(br.readLine());
				bw.write("ingrese la altura de el rectangulo: \n");
				bw.flush();
				parameters[1] = Integer.parseInt(br.readLine());
			}
			break;
			case 4: // trapecio
			{
				parameters = new int[3];
				bw.write("se calculara el area de un trapecio \n");
				bw.write("ingrese la base 1 del trapecio: \n");
				bw.flush();
				parameters[0] = Integer.parseInt(br.readLine());
				bw.write("ingrese la base 2 del trapecio: \n");
				bw.flush();
				parameters[1] = Integer.parseInt(br.readLine());
				bw.write("ingrese la altura del trapecio: \n");
				bw.flush();
				parameters[2] = Integer.parseInt(br.readLine());
			}
			break;
			default:
			{
				System.exit(0);
			}
		}
		return parameters;
	}
	
	public static void operation(int option, int[]parameters) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		figura figura = new figura();
		
		switch(option)
		{
			case 1:
			{
				double result = figura.Acirculo(parameters[0]);
				bw.write("el area del circulo es: "+ result + "\n");
				bw.flush();
			}
			break;
			case 2:
			{
				double result = figura.Atriangulo(parameters[0], parameters[1]);
				bw.write("el area del triangulo es: " + result + "\n");
				bw.flush();
			}
			break;
			case 3:
			{
				double result = figura.Arectangulo(parameters[0], parameters[1]);
				bw.write("el area del rectangulo es: "+ result + "\n");
				bw.flush();
			}
			break;
			case 4:
			{
				double result = figura.Atrapecio(parameters[0], parameters[1], parameters[2]);
				bw.write("el area del trapecio es: " + result + "\n");
				bw.flush();
			}
			break;
			default:
			{
				System.exit(0);
			}
		}
	}

}
