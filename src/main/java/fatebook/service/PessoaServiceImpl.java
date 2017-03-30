package fatebook.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fatebook.model.Pessoa;
import fatebook.repository.PessoaRepository;

@Service("pessoaService")
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pessoaRep;

	@Transactional
	public void Transacao() {
		// Cria usuario
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Pedro");
		pessoa1.setSenha("senha");
		pessoaRep.save(pessoa1);
		// Gera erro, pois nome e senha sao obrigatorios
	}

	
}
