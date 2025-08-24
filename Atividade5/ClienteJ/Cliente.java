package Desafio_5_Java;

import java.util.ArrayList;

public class Cliente{
    private int id;
    private String nome;
    private ArrayList<ContaBancaria> contas;

    public Cliente (int id, String nome){
        this.id = id;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public ArrayList<ContaBancaria> getContas(){
        return contas;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
}