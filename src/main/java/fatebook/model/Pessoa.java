package fatebook.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TB_PESSOA")
public class Pessoa {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="PES_ID", nullable=false)
	private Long id;
    @Column(name="PES_NOME", unique=false, length=50, nullable=false)
    private String nome;
    @Column(name="PES_SEXO", unique=false, length=1, nullable=false)
    private String sexo;
    @Column(name="PES_EMAIL", unique=true, length=50, nullable=false)
    private String email;
    @Column(name="PES_TELEFONE", unique=false, length=15, nullable=true)
    private String telefone;
    @Column(name="PES_SENHA", unique=false, length=50, nullable=false)
    private String senha;
    @Column(name="PES_NASC", unique=false, nullable=false)
    private Date nascimento;
    
    //PEGAR AMIGOS
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_AMIZADE", joinColumns = @JoinColumn(name = "ID_PES1", referencedColumnName = "PES_ID"), inverseJoinColumns = @JoinColumn(name = "ID_PES2", referencedColumnName = "PES_ID"))
    //LISTA DE AMIGOS
    private Set<Pessoa> amigos;
    
    public Set<Pessoa> getAmigos() {
        return amigos;
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getNasc() {
		return nascimento;
	}

	public void setNasc(Date nascimento) {
		this.nascimento = nascimento;
	}
	

}
