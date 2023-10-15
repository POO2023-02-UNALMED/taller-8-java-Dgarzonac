package futbol;

public class Portero extends Futbolista implements Comparable<Portero>{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal){
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	 @Override
	public int compareTo(Portero portero){
		return Math.abs(this.getGolesRecibidos() - portero.getGolesRecibidos());
	}
	 @Override
	public String toString(){
		return "El futbolista " + this.getNombre() +" tiene "+ this.getEdad()+ ", y juega de "+ this.getPosicion()+
				" con el dorsal "+ this.getDorsal()+ ". Le han marcado"+ this.getGolesRecibidos();
	}
	public short getGolesRecibidos(){
		return this.golesRecibidos;
	}
	
	public byte getDorsal(){
		return this.dorsal;
	}
	
	public void setGolesRecibidos(short golesRecibidos){
		this.golesRecibidos = golesRecibidos;
	}
	
	public void setDorsal(byte dorsal){
		this.dorsal = dorsal;
	}
}
