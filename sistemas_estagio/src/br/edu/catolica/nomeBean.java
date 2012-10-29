package br.edu.catolica;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name="nomeBean")
@RequestScoped
public class nomeBean implements Serializable 
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String nome;
    private String email;
    private String senha;
    private String confirmasenha;

    public String salvar()
    {
        //Toda implementação do negócio.
        return "home_user";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getConfirmasenha() {
		return confirmasenha;
	}

	public void setConfirmasenha(String confirmasenha) {
		this.confirmasenha = confirmasenha;
	}

}