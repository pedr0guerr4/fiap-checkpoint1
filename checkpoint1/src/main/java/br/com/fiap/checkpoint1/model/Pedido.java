package br.com.fiap.checkpoint1.model;

import jakarta.persistence.*;
import lombok.NonNull;

import java.time.LocalDate;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 

	@NonNull
	private String clienteNome;

	private LocalDate dataPedido = LocalDate.now();

	private double valorTotal;

	public Pedido() {
	}

	public Pedido(Long id, String clienteNome, LocalDate dataPedido, double valorTotal) {
		this.id = id;
		this.clienteNome = clienteNome;
		this.dataPedido = dataPedido;
		this.valorTotal = valorTotal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
}
