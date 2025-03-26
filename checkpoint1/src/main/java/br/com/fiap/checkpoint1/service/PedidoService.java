package br.com.fiap.checkpoint1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.repository.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;

	public List<Pedido> listarTodos() {
		return repository.findAll();
	}

	public Pedido buscarPorId(Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
	}

	public Pedido criarPedido(Pedido pedido) {
		return repository.save(pedido);
	}

	public Pedido atualizarPedido(Long id, Pedido pedidoAtualizado) {
		Pedido pedido = buscarPorId(id);
		pedido.setClienteNome(pedidoAtualizado.getClienteNome());
		pedido.setValorTotal(pedidoAtualizado.getValorTotal());
		return repository.save(pedido);
	}

	public void deletarPedido(Long id) {
		repository.deleteById(id);
	}
}
