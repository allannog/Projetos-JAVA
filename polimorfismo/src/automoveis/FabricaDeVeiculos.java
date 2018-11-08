package Automoveis;

public class FabricaDeVeiculos {

	public static void main(String[] args) {
		
		Veiculo carro01 = new Carro("Fiat", "Uno", 2018, true);
		
		carro01.acelerar();
		carro01.frear();
		((Carro) carro01).possuiQuatroPortas();
		
		Veiculo moto01 = new Motocicleta("Yamaha", "Fizer", 2015);
		
		moto01.acelerar();
		moto01.frear();
		((Motocicleta) moto01).empinar();
		
		Veiculo caminhao01 = new Caminhao("Iveco", "Tector", 2017, false);
		
		caminhao01.acelerar();
		caminhao01.frear();
		((Caminhao) caminhao01).caminhaoCarregado();

	}

}
