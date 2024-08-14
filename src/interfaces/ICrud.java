package interfaces;

import java.util.List;


public interface ICrud<T> {
    public void salvar(T t);
    public void excluir(int id);
    public void update(T t);
    public void atribuir(int id, int id_cliente);
    public List<T> consultarTodos();
    public List<T> consultarPorNome(String nome);
}
