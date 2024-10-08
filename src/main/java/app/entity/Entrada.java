
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
* Classe que representa a tabela ENTRADA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ENTRADA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Entrada")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Entrada implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private User user;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="product", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Produto product;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Qtd Entrada")
    @Column(name = "qtdEntrada", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdEntrada;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Date")
    @Column(name = "date", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date date;


    /**
    * Construtor
    * @generated
    */
    public Entrada(){
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
    public Entrada setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém user
    * return user
    * @generated
    */
    public User getUser() {
        return this.user;
    }

    /**
    * Define user
    * @param user user
    * @generated
    */
    public Entrada setUser(User user) {
        this.user = user;
        return this;
    }
    /**
    * Obtém product
    * return product
    * @generated
    */
    public Produto getProduct() {
        return this.product;
    }

    /**
    * Define product
    * @param product product
    * @generated
    */
    public Entrada setProduct(Produto product) {
        this.product = product;
        return this;
    }
    /**
    * Obtém qtdEntrada
    * return qtdEntrada
    * @generated
    */
    public java.lang.Integer getQtdEntrada() {
        return this.qtdEntrada;
    }

    /**
    * Define qtdEntrada
    * @param qtdEntrada qtdEntrada
    * @generated
    */
    public Entrada setQtdEntrada(java.lang.Integer qtdEntrada) {
        this.qtdEntrada = qtdEntrada;
        return this;
    }
    /**
    * Obtém date
    * return date
    * @generated
    */
    public java.util.Date getDate() {
        return this.date;
    }

    /**
    * Define date
    * @param date date
    * @generated
    */
    public Entrada setDate(java.util.Date date) {
        this.date = date;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Entrada object = (Entrada)obj;
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