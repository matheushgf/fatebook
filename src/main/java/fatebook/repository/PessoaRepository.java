package fatebook.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import fatebook.model.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
	
	public Pessoa findByNome(String nome);
	
	public Pessoa findByEmail(String email);
	
	public Pessoa findTop1ByNomeContains(String nome);
	
	public Pessoa findById(Long id);
	
	@Query("select p from Pessoa p where p.nome like %?1%")
	public List<Pessoa> buscaPessoa(String nome);
}
