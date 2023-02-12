/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Pessoa;
import Interface.IPessoaDAO;
import java.util.HashSet;
import java.util.Set;

public class PessoaDAO implements IPessoaDAO{
    
    public static Set<Pessoa> pessoas = new HashSet<>();
    
    public void adicionarPessoa(Pessoa a){
        pessoas.add(a);
    }
    
    public Set<Pessoa> retornarTodasPessoas(){
        return (HashSet<Pessoa>) pessoas;
    }    
}
