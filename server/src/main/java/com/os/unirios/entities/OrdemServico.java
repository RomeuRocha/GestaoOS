
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
@Table(name = "ORDEMSERVICO")
@NoArgsConstructor
@Getter
@Setter
public class OrdemServico implements Serializable {

        private static final long serialVersionUID = 1L;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ORDEMSERVICO_ID")

        private Long id;

        @Column(name = "ORDEMSERVICO_DATA")
        private Date data;

        @Column(name = "ORDEMSERVICO_RESPONSAVEL")
        private String responsavel;

        @Column(name = "ORDEMSERVICO_VALORTOTAL")
        private Float valorTotal;

        @Column(name = "ORDEMSERVICO_EQUIPAMENTOID")
        private String equipamentoID;

        @Column(name = "ORDEMSERVICO_DIAGNOSTICO")
        private String diagnostico;

        @Column(name = "ORDEMSERVICO_SERVICOS")
        private String servicos;

        @Column(name = "ORDEMSERVICO_PECAS")
        private String pecas;

        @ManyToOne
        @JoinColumn(name = "CLIENTE_ID")
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "EQUIPAMENTO_ID")
        private Equipamento equipamento;
        
        @Column(name = "ORDEMSERVICO_SITUACAO")
        private String situacao;

        public OrdemServico(Long id, Date data, String responsavel, Float valorTotal, String equipamentoID,
                        String diagnostico, String servicos, String pecas) {

                this.id = id;

                this.data = data;

                this.responsavel = responsavel;

                this.valorTotal = valorTotal;

                this.equipamentoID = equipamentoID;

                this.diagnostico = diagnostico;

                this.servicos = servicos;

                this.pecas = pecas;

        }

}
