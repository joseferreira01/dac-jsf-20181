/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.dac.jsf;

import br.edu.ifpb.dac.dac.model.ClienteService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author jose
 */
@Named
@RequestScoped
public class Controler {
      private String nome;
    private ClienteService service; 

    public Controler() {
        this.service = new ClienteService();
    }
    public String salvar(){
       this.nome = service.nono(this.nome);
        return "home.xhtml";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
