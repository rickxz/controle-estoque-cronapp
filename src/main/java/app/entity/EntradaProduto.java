
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ENTRADAPRODUTO
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ENTRADAPRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.EntradaProduto")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class EntradaProduto implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_entrada", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Entrada entrada;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Produto produto;


    /**
    * Construtor
    * @generated
    */
    public EntradaProduto(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public EntradaProduto setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém entrada
    * return entrada
    * @generated
    */
    public Entrada getEntrada() {
        return this.entrada;
    }

    /**
    * Define entrada
    * @param entrada entrada
    * @generated
    */
    public EntradaProduto setEntrada(Entrada entrada) {
        this.entrada = entrada;
        return this;
    }
    /**
    * Obtém produto
    * return produto
    * @generated
    */
    public Produto getProduto() {
        return this.produto;
    }

    /**
    * Define produto
    * @param produto produto
    * @generated
    */
    public EntradaProduto setProduto(Produto produto) {
        this.produto = produto;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
EntradaProduto object = (EntradaProduto)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}