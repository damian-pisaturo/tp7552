package laboratorio.dominio.excepciones;

import general.dominio.excepciones.ExcepcionNegocio;

public class ExcepcionTareaYaAsignada extends ExcepcionNegocio {

	private static final long serialVersionUID = 8731040841427190881L; 
	
	public ExcepcionTareaYaAsignada() {
		this.clave="ExcepcionTareaYaAsignada";
	}	
}
