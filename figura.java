
public class figura {
	
	public figura(){}
	/**
	 * @param args
	 */
	public double Acirculo(int radio) {
		
		return (int) (3.14 * Math.pow(radio, 2));//area del circulo
	}
	
	public double Atriangulo(int base, int altura){
		return (int) (base*altura)/2;//area del triangulo
	}
	
	public double Arectangulo(int base, int altura){
		return (int) (base*altura);//area del rectangulo
	}
	
	public double Atrapecio(int base1, int base2, int altura){
		return (int) ((base1+base2)*altura)/2;// area del trapecio
	}

}
