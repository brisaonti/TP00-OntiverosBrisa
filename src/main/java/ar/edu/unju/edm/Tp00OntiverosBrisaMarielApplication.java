package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class Tp00OntiverosBrisaMarielApplication {

	public static  void main(String[] args) {
		SpringApplication.run(Tp00OntiverosBrisaMarielApplication.class, args);
		Calculadora unCalculadora = new Calculadora();//MétodoConstructor
		unCalculadora.setNumeroA(10);
		unCalculadora.setNumeroB(2);
		System.out.println("EL resultado de la Suma es: " + unCalculadora.resolverSuma() );
	}
	public static String darNombre() {
		String nuevonombre ="Sebastian";
		return nuevonombre;
	}
}
