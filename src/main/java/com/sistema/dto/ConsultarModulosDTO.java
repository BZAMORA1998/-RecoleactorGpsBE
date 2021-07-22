package com.sistema.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ConsultarModulosDTO {
	private Integer secuenciaModulo;
	private String nombre;
	private String url;
	private String img;
	
}
