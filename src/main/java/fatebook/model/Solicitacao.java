package fatebook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SOLICITACAO")
public class Solicitacao {
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="SOL_ID", nullable=false)
	private Long id;
    @Column(name="ID_PIDAO", nullable=false)
    private Long pidao;
    @Column(name="ID_CRUSH", nullable=false)
    private Long crush;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPidao() {
		return pidao;
	}
	public void setPidao(Long pidao) {
		this.pidao = pidao;
	}
	public Long getCrush() {
		return crush;
	}
	public void setCrush(Long crush) {
		this.crush = crush;
	}
	
	public void aceitar(){
		//oioioi
	}
	
	public void rejeitar(){
		//tchautchautchau
	}
}
