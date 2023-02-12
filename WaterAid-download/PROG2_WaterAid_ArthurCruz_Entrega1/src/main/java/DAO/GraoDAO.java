/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Interface.IComidaDAO;
import Model.Comida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuário
 */
public class GraoDAO implements IComidaDAO{
    private static List<Comida> graos = new ArrayList<>();
    
    @Override
    public void adicionarComida(Comida a) {
        graos.add(a);
    }

    @Override
    public List<Comida> retornarTodasComidas() {
        return graos;
    }
    
}
