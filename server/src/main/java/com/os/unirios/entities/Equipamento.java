
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
@Table(name = "EQUIPAMENTO")
@NoArgsConstructor  @Getter @Setter
public class Equipamento  implements Serializable{
            
            
private static final long serialVersionUID = 1L;
            
    
            
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                @Column(name="EQUIPAMENTO_ID")
                
            private  Long id;
            @Column(name="EQUIPAMENTO_NOME")
            private  String nome;
            @Column(name="EQUIPAMENTO_MODELO")
            private  String modelo;
            @Column(name="EQUIPAMENTO_DETALHES")
            private  String detalhes;
    

    public Equipamento  ( Long id ,String nome ,String modelo ,String detalhes ){
        
            this.id = id;
            
            this.nome = nome;
            
            this.modelo = modelo;
            
            this.detalhes = detalhes;
            
    }

    }
