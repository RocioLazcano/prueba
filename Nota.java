
class Nota {
	int valor;
	public Nota(int valorInicial){
		this.valor = valorInicial; 
		
		if (valorInicial <0 || valorInicial >10){
			throw new Error ("lee el ejercicio boludo");
		}
	}
	
	int obtenerValor() {
		return valor ;
		
	}
	
	boolean aprobado(){
		return valor >= 4;
		
	}
	
	boolean desaprobado(){
		return valor < 4;
	}
	
	void recuperar(int nuevoValor){
		if(nuevoValor > valor){
			valor = nuevoValor;
			
		}
	}

}
