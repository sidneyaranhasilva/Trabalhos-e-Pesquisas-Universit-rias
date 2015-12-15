package modelo;

import java.text.NumberFormat;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;




@Entity
@Table(name="Conta")
public class Conta {

	@Id 
	@GeneratedValue 
	private Integer id;
	@Column(name="tbl_agencia")
	private Integer agencia;
	@Column(name="tbl_codConta")
	private Integer codConta;
	@Column(name="tbl_Saldo")
	private Double saldo;
	
	private Double saldoImprimir;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	

	
	

	public Integer getId() {
		return id;
	}






	public void setId(Integer id) {
		this.id = id;
	}






	public Integer getAgencia() {
		return agencia;
	}






	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}






	public Integer getCodConta() {
		return codConta;
	}






	public void setCodConta(Integer codConta) {
		this.codConta = codConta;
	}






	public Double getSaldo() {

		
		return saldo;
	}






	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}






	public Cliente getCliente() {
		return cliente;
	}






	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}






	@Override
	public String toString() {
		return "Conta [id=" + id + ", agencia=" + agencia + ", codConta="
				+ codConta + ", saldo=" + saldo ;
	}








	
	
	
	
	
	
}
