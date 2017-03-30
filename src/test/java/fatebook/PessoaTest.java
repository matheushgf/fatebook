package fatebook;

import static org.junit.Assert.assertTrue;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fatebook.model.Pessoa;
import fatebook.repository.PessoaRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Transactional
public class PessoaTest {

	private static final String NOME = "Teste";
	private static final String SENHA = "123456";
	
	@Autowired
	private PessoaRepository pessoaRepo;
	
	public void setPessoaRepo(PessoaRepository pessoaRepo) {
		this.pessoaRepo = pessoaRepo;
	}

	@Test
	public void testeInsercaoOk() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(NOME);
		pessoa.setEmail(NOME+"@gmail.com");
		pessoa.setSexo("M");
		pessoa.setNasc(new Date(45455));
		pessoa.setSenha(SENHA);
		pessoaRepo.save(pessoa);
		System.out.println(pessoa.getId());
		assertTrue(pessoa.getId() != null);
	}

}
