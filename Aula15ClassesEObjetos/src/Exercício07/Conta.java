package Exercício07;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	/*
	 * Faça uma classe chamada Conta, com os atributos nome e saldo.
	 * 
	 * Faça um método para sacar dinheiro Outro método para depositar dinheiro E
	 * outro método para transferir dinheiro de uma conta para outra
	 */

	private String nome;
	private double saldo;

	public static List<Conta> ListaConta = new ArrayList<>();

	public Conta(String nome, double saldo) {
		setNome(nome);
		setSaldo(saldo);
		ListaConta.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	 public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque de " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saque não pode ser realizado. Saldo insuficiente ou valor inválido.");
	        }
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito de " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Depósito não pode ser realizado. Valor inválido.");
	        }
	    }

	    public void transferir(Conta contaDestino, double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            contaDestino.saldo += valor;
	            System.out.println(
	                    "Transferência de " + valor + " para a conta de " + contaDestino.nome + " realizada com sucesso.");
	        } else {
	            System.out.println("Transferência não pode ser realizada. Saldo insuficiente ou valor inválido.");
	        }
	    }

	    public void mostrarSaldo() {
	        System.out.println("Saldo da conta de " + nome + ": " + saldo);
	    }
	}