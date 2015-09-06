package com.locadora.Locadora2015.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
			return "login";
		}
			return "errologin";
		}
	}
