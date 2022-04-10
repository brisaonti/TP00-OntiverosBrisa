package ar.edu.unju.edm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import ar.edu.unju.edm.model.Calculadora;
@Controller
public class CalculadoraController{
@GetMapping("/menu")
public String mostrarMenuCalculadora() {
	return "index";
}
@GetMapping("/calculoSuma")
public String getSumaPage (@RequestParam (name="num1") int num1 , @RequestParam (name="num2") int num2, Model model)
   {
	int resultadoS = 0;
	Calculadora nuevaCalculadora = new Calculadora();
	nuevaCalculadora.setNumeroA(num1);
	nuevaCalculadora.setNumeroB(num2);
	resultadoS = nuevaCalculadora.resolverSuma();
	model.addAttribute("resultadoS", resultadoS);
	return "resultado";
	}
@GetMapping("/calculoResta")
public String getRestaPage (@RequestParam (name="num1") int num1 , @RequestParam (name="num2") int num2, Model model)
{
	int resultadoS = 0;
	Calculadora nuevaCalculadora = new Calculadora();
	nuevaCalculadora.setNumeroA(num1);
	nuevaCalculadora.setNumeroB(num2);
	resultadoS = nuevaCalculadora.resolverResta();
	model.addAttribute("resultadoS", resultadoS);
	return "resultado";
	}
@GetMapping("/calculoProducto")
public String getProductoPage (@RequestParam (name="num1") int num1 , @RequestParam (name="num2") int num2, Model model)
{
	int resultadoS = 0;
	Calculadora nuevaCalculadora = new Calculadora();
	nuevaCalculadora.setNumeroA(num1);
	nuevaCalculadora.setNumeroB(num2);
	resultadoS = nuevaCalculadora.resolverMultiplicar();
	model.addAttribute("resultadoS", resultadoS);
	return "resultado";
	}
@GetMapping("/calculoCociente")
public String getCocientePage (@RequestParam (name="num1") int num1 , @RequestParam (name="num2") int num2, Model model)
{
	int resultadoS = 0;
	Calculadora nuevaCalculadora = new Calculadora();
	nuevaCalculadora.setNumeroA(num1);
	nuevaCalculadora.setNumeroB(num2);
	resultadoS = nuevaCalculadora.resolverDivicion();
	model.addAttribute("resultadoS", resultadoS);
	return "resultado";
	}
@GetMapping("/calculoPotenciacion")
public String getPotenciaPage (@RequestParam (name="num1") int num1 , @RequestParam (name="num2") int num2, Model model)
{
	int resultadoS = 0;
	Calculadora nuevaCalculadora =  new Calculadora();
	nuevaCalculadora.setNumeroA(num1);
	nuevaCalculadora.setNumeroB(num2);
	resultadoS = nuevaCalculadora.resolverPotencia();
	model.addAttribute("resultadoS", resultadoS);
	return "resultado";
	}
@GetMapping("/calculoRaiz")
public String getRaizPage (@RequestParam (name="num1") int num1 , @RequestParam (name="num2") int num2, Model model)
{
	double resultadoS = 0;
	Calculadora nuevaCalculadora =  new Calculadora();
	nuevaCalculadora.setNumeroA(num1);
	nuevaCalculadora.setNumeroB(num2);
	resultadoS = nuevaCalculadora.resolverRaiz();
	model.addAttribute("resultadoS", resultadoS);
	return "resultado";
	}

}
