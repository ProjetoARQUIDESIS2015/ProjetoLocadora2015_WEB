package com.locadora.Locadora2015.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.locadora.Locadora2015.model.Usuario;

 
@Controller
public class IndexController{

	@RequestMapping("index.do")
	public String Index(){
		return "index";
	}
	
	@RequestMapping("login.do")
	public String login(Usuario user){
	
		if (user.getNomeUsuario().equals("teste")&&user.getSenha().equals("teste")){
			return "main";
		} else {
			return "errologin";
		}
	}
	@RequestMapping("main.do")
	public String Main(){
		return "main";
	}
	@RequestMapping("gerenciarCliente.do")
	public String GerenciarCliente(){
		return "gerenciarCliente";
	}
	@RequestMapping("gerenciarEmprestimo.do")
	public String GerenciarEmprestimo(){
		return "gerenciarEmprestimo";
	}
	@RequestMapping("gerenciarModelo.do")
	public String GerenciarModelo(){
		return "gerenciarModelo";
	}
	@RequestMapping("gerenciarVeiculo.do")
	public String GerenciarVeiculo(){
		return "gerenciarVeiculo";
	}
	@RequestMapping("relatorioDiario.do")
	public String RelatorioDiario(){
		return "relatorioDiario";
	}
	@RequestMapping("relatorioGeral.do")
	public String RelatorioGeral(){
		return "relatorioGeral";
	}
	@RequestMapping("devolverVeiculo.do")
	public String DevolverVeiculo(){
		return "devolverVeiculo";
	}
	@RequestMapping("dadosUsuario.do")
	public String DadosUsuario(){
		return "dadosUsuario";
	}
	@RequestMapping("sair.do")
	public String Sair(){
		return "index";
	}
}
