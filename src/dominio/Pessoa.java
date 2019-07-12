package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//essa anotação diz que a classe ccorresponde a uma tabela no banco de dados
@Entity
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nome;
	private String email;
	/* o @id indica que essa variavel corresponde a chave primaria databela
	 * e que o @generatedvalue diz que a chava vai gerar automaticamente */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	public Pessoa() {

	}

	public Pessoa(String nome, String email, Integer id) {
		super();
		this.nome = nome;
		this.email = email;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", id=" + id + "]";
	}

	
}
