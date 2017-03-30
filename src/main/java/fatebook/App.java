package fatebook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import fatebook.repository.PessoaRepository;
import fatebook.model.Pessoa;
import java.util.Date;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
        
        PessoaRepository pessoaRepo = (PessoaRepository) context.getBean("pessoaRepository");
    /*
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = in.nextLine();
        
        Pessoa maria = new Pessoa();
        maria.setNome(nome);
        maria.setEmail(nome+"@gmail.com");
        Date nasc = new Date();
        nasc.setYear(1996);
        nasc.setMonth(8);
        nasc.setDate(12);
        System.out.println(String.valueOf(nasc));
        maria.setNasc(nasc);
        maria.setSenha(nome+"123456");
        maria.setSexo("P");
        
        pessoaRepo.save(maria);
        Long quem = maria.getId();
        */
        Pessoa a = pessoaRepo.findById(new Long(9));
        for(Pessoa p:a.getAmigos())
        System.out.println(p.getId());
        //pessoaRepo.delete(maria);
        
        //Fecha contexto
        ((AbstractApplicationContext) context).close();
    }
}
