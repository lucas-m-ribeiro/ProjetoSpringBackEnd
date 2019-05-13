package br.gov.sp.fatec.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.gov.sp.fatec.view.View;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements UserDetails{

	private static final long serialVersionUID = 1507218635788384719L;

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "USR_ID")
	@JsonView({View.UsuarioCompleto.class, View.UsuarioResumoAlternativo.class, View.Anotacao.class})
	private Long id;
    
    @Column(name = "USR_NOME", unique=true, length = 20, nullable = false)
    @JsonView({View.UsuarioResumo.class, View.UsuarioResumoAlternativo.class, View.Anotacao.class})
    private String nome;
    
    @Column(name = "USR_SENHA", length = 50, nullable = false)
    @JsonView(View.UsuarioCompleto.class)
    private String senha;
    
    @Column(name = "USR_CPF", length = 25, nullable = false)
    @JsonView(View.UsuarioCompleto.class)
    private String tel;
    
    @Column(name = "USR_TELEFONE", length = 50, nullable = true)
    @JsonView(View.UsuarioCompleto.class)
    private String cpf;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_USUARIO_AUTORIZACAO", 
    	joinColumns = { @JoinColumn(name = "USR_ID") }, 
    	inverseJoinColumns = { @JoinColumn(name = "AUT_ID") })
    @JsonView({View.UsuarioResumo.class, View.UsuarioResumoAlternativo.class})
    @XmlElement(name = "autorizacao")
    private List<Autorizacao> autorizacoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setTelefone(String tel) {
		this.tel = tel;
	}

	public String getTelefone() {
		return tel;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Autorizacao> getAutorizacoes() {
		return autorizacoes;
	}

	public void setAutorizacoes(List<Autorizacao> autorizacoes) {
		this.autorizacoes = autorizacoes;
	}
	
	@Override
	@JsonIgnore
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.autorizacoes;
	}

	@Override
	@JsonIgnore
	public String getPassword() {
		return senha;
	}

	@Override
	@JsonIgnore
	public String getUsername() {
		return nome;
	}

	@Override
	@JsonIgnore
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	@JsonIgnore
	public boolean isEnabled() {
		return true;
	}

}
