public class Guitarra {
	
	private String numeroSerie, fabricante, modelo, tipo, madeira;
	private double preco;
	
	public Guitarra(
	String numeroSerie, String fabricante, String modelo,String tipo, String madeira, double preco) {
	this.numeroSerie = numeroSerie;
	this.fabricante = fabricante;
	this.modelo = modelo;
	this.tipo = tipo;
	this.madeira = madeira;
	this.preco = preco;
	}
	
	public String getNumeroSerie(){
	return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie){
		this.numeroSerie = numeroSerie;
		}
		
	public String getFabricante(){
		return fabricante;
	}
	public void setFabricante(){
		this.fabricante = fabricante;
		}
		
		public String getModelo(){
			return modelo;
	}
	public void setModelo(){
		this.modelo = modelo;
		}
		
		public String getTipo(){
			return tipo;
	}
	public void setTipo(){
		this.tipo = tipo;
		}
		
		public String getMadeira(){
			return madeira;
	}
	public void setMadeira(){
		this.madeira = madeira;
		}
		
		public double getPreco(){
			return preco;
	}
	public void setPreco(double preco){
		this.preco= preco;
		}
		
		
		public static void main(String[] args){
			
			Guitarra minhaGuitarra = new Guitarra("0205304","fender", "telecaster", 
			"eletrica", "mogno", 1500);
			
			System.out.println(minhaGuitarra.getNumeroSerie());
			System.out.println(minhaGuitarra.getMadeira());
			System.out.println(minhaGuitarra.getPreco());
			System.out.println(minhaGuitarra.getTipo());
			}
}
