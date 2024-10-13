
package com.os.unirios.entities;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

            
            
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
            
@Entity
@Table(name = "CLIENTE")
@NoArgsConstructor  @Getter @Setter
public class Cliente  implements Serializable{
            
            
private static final long serialVersionUID = 1L;
            
    
            
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(name="CLIENTE_ID")
                
            private  Long id;
            @Column(name="CLIENTE_NOME")
            private  String nome;
            @Column(name="CLIENTE_ENDERECO")
            private  String endereco;
            @Column(name="CLIENTE_CONTATOS")
            private  String contatos;
            @Column(name="CLIENTE_DOCUMENTOID")
            private  String documentoID;
    

    public Cliente  ( Long id ,String nome ,String endereco ,String contatos ,String documentoID ){
        
            this.id = id;
            
            this.nome = nome;
            
            this.endereco = endereco;
            
            this.contatos = contatos;
            
            this.documentoID = documentoID;
            
    }

    }
