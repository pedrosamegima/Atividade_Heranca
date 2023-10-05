package AtivHeranca;



public class Principal {

	public static void main(String[] args) {
	Veiculo veiculo = new Veiculo ("Toyota", "corola Gr", 2020, "Cinza");
	System.out.println("Veiculo: ");
	System.out.println("Marca: "+veiculo.getMarca());
	System.out.println("Modelo: "+veiculo.getModelo());
	System.out.println("ano: "+veiculo.getAno());
	System.out.println("cor: "+veiculo.getCor());
	
	System.out.println("--------------------------------------------------------------------------------------");
	Automovel automovel = new Automovel ("Honda","city",2020,"Branco",4,"1.6 turbo");
	System.out.println("\nAutomovel:");
	System.out.println("Marca"+automovel.getMarca());
	System.out.println("Modelo: "+automovel.getModelo());
	System.out.println("Ano:" +automovel.getAno());
	System.out.println("Cor: "+automovel.getCor());
	System.out.println("Numero Portas: "+automovel.getNumeroPortas());
	System.out.println("Motor: "+automovel.getMotor());
	
	System.out.println("--------------------------------------------------------------------------------------");
	Moto moto = new Moto("Honda","biz",2012,"branco",350);
	System.out.println("\nMoto:");
	System.out.println("Nome:"+moto.getMarca());
	System.out.println("Telefone: "+moto.getModelo());
	System.out.println("Cnpj:" +moto.getAno());
	System.out.println("Cnpj:" +moto.getCor());
	System.out.println("Cnpj:" +moto.getCilindrada());
	}

}
