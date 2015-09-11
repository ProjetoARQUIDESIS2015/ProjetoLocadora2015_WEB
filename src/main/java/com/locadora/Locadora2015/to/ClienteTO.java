package com.locadora.Locadora2015.to;

public class ClienteTO {
	private String bairro;
	private String cep;
	private String cidade;
	private String cnh;
	private String complemento;
	private String cpf;
	private String dataNascimento;
	private String email;
	private String logradouro;
	private String nome;
	private String num;
	private String primeiraCNH;
	private String rg;
	private String sexo;
	private String telefone;
	private String celular; 
	private String uf;
	private String ufCNH;
	private String validadeCNH;
	private int idCliente;
	

	public ClienteTO(String bairro, String cep, String cidade, String cnh,
			String complemento, String cpf, String dataNascimento,
			String email, String logradouro, String nome, String num,
			String primeiraCNH, String rg, String sexo, String telefone,String celular,
			String uf, String ufCNH, String validadeCNH) {
		setBairro(bairro);
		setCep(cep);
		setCidade(cidade);
		setCnh(cnh);
		setComplemento(complemento);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setEmail(email);
		setLogradouro(logradouro);
		setNome(nome);
		setNum(num);
		setPrimeiraCNH(primeiraCNH);
		setRg(rg);
		setSexo(sexo);
		setTelefone(telefone);
		setCelular(celular);
		setUf(uf);
		setUfCNH(ufCNH);
		setValidadeCNH(validadeCNH);
		
		
	}
	public ClienteTO (){
		
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getCnh() {
		return cnh;
	}


	public void setCnh(String cnh) {
		this.cnh = cnh;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNum() {
		return num;
	}


	public void setNum(String num) {
		this.num = num;
	}


	public String getPrimeiraCNH() {
		return primeiraCNH;
	}


	public void setPrimeiraCNH(String primeiraCNH) {
		this.primeiraCNH = primeiraCNH;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getUfCNH() {
		return ufCNH;
	}


	public void setUfCNH(String ufCNH) {
		this.ufCNH = ufCNH;
	}


	public String getValidadeCNH() {
		return validadeCNH;
	}


	public void setValidadeCNH(String validadeCNH) {
		this.validadeCNH = validadeCNH;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
}
