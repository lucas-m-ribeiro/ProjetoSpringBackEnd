package fatec.com.projeto.service;
import java.util.List;

import fatec.com.projeto.model.Carro;


public interface CarroService{
	
	public Carro salvar(Carro carro);
	public void excluir(Long idCarro);
	public List<Carro> listarTodos();
	public Carro buscarPorId(Long idCarro);
}
