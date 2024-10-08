
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
* Classe que representa a tabela SAIDA
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"SAIDA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Saida")
@CronappTable(role=CronappTableRole.ASSOCIATION_CLASS)
public class Saida implements Serializable {
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
    @CronappColumn(attributeType="INTEGER", label="Qtd Saida")
    @Column(name = "qtdSaida", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer qtdSaida;


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
    public Saida(){
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
    public Saida setId(java.lang.String id) {
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
    public Saida setUser(User user) {
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
    public Saida setProduct(Produto product) {
        this.product = product;
        return this;
    }
    /**
    * Obtém qtdSaida
    * return qtdSaida
    * @generated
    */
    public java.lang.Integer getQtdSaida() {
        return this.qtdSaida;
    }

    /**
    * Define qtdSaida
    * @param qtdSaida qtdSaida
    * @generated
    */
    public Saida setQtdSaida(java.lang.Integer qtdSaida) {
        this.qtdSaida = qtdSaida;
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
    public Saida setDate(java.util.Date date) {
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
Saida object = (Saida)obj;
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