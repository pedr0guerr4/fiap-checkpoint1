package br.com.fiap.checkpoint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.model.Pedido;
import br.com.fiap.checkpoint1.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
    @Autowired
    private PedidoService service;

    @GetMapping
    public List<Pedido> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return service.criarPedido(pedido);
    }

    @PutMapping("/{id}")
    public Pedido atualizarPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
        return service.atualizarPedido(id, pedido);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id) {
        service.deletarPedido(id);
    }
}
