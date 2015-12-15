package modelo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
public class Cliente {

	


	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="tbl_nome", length=45)
	 @NotNull
	 @Size(min=3, message="O nome não pode ter menos que 3 caracteres!")
	private String nome;
	@Column(name="tbl_email", length=30)
	private String email;
	@Column(name="tbl_telefone", length=30)
	private String telefone;
	@OneToMany(mappedBy="cliente", fetch=FetchType.LAZY)
	@Cascade(value=CascadeType.ALL)
	private Collection<Conta> conta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Collection<Conta> getConta() {
		return conta;
	}

	public void setConta(Collection<Conta> conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email
				+ ", telefone=" + telefone + ", conta=" + conta + "]";
	}

	
	


	

	
	

	
	
	
	
	
	
	
	
}
