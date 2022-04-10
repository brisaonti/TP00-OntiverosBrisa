package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
 private int numeroA;
 private int numeroB;
 public Calculadora() {

 }
public int getNumeroA() {
	return numeroA;
}
public void setNumeroA(int numeroA) {
	this.numeroA = numeroA;
}
public int getNumeroB() {
	return numeroB;
}
public void setNumeroB(int numeroB) {
	this.numeroB = numeroB;
}

 public int resolverSuma() {
		int resultado = numeroA + numeroB;
		return resultado;
	}
 public int resolverResta() {
		int resultado = numeroA - numeroB;
		return resultado;
	}
 public int resolverMultiplicar() {
		int resultado = numeroA * numeroB;
		return resultado;
	}
 public int resolverDivicion() {
		int resultado;
		if(numeroB==0)
		{
			System.out.println("NO SE PUEDE");
			resultado=0;
		}
		else {
		resultado = numeroA / numeroB;
		}
		return resultado;
	}
 public int resolverPotencia() {
		int resultado = (int) Math.pow(numeroA, numeroB);
		return resultado;
	}

 public double resolverRaiz()
 {
	 double resultadoraiz =Math.pow((double)this.numeroA, (double)1/this.numeroB);
	 return resultadoraiz;
 }
}
