package br.com.lis2b.igorviagens.hospedagem.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@ToString
@Builder
public class Hospedagem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idHospedagem", updatable = false, unique = true, nullable = false)
	private UUID id;
	private String localizacao;
	private LocalDateTime checkin;
	private LocalDateTime checkout;
	private String hotel;
	private BigDecimal precoTotal;
}
