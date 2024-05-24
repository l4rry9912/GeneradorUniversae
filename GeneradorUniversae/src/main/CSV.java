/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Gonzalo Valls
 */
public class CSV {
    private String pregunta;
    private String respuestaCorrecta;
    private String respuestaIncorrecta1;
    private String respuestaIncorrecta2;
    private String respuestaIncorrecta3;
    
    

    // Constructor, getters y setters

    public CSV (String pregunta, String respuestaCorrecta, String respuestaIncorrecta1, String respuestaIncorrecta2, String respuestaIncorrecta3) {        
        this.pregunta = pregunta;
        this.respuestaCorrecta = respuestaCorrecta;
        this.respuestaIncorrecta1 = respuestaIncorrecta1;
        this.respuestaIncorrecta2 = respuestaIncorrecta2;
        this.respuestaIncorrecta3 = respuestaIncorrecta3;
    }

    @Override
    public String toString() {
        return "CSV{" + "pregunta=" + pregunta + ", respuestaCorrecta=" + respuestaCorrecta + ", respuestaIncorrecta1=" + respuestaIncorrecta1 + ", respuestaIncorrecta2=" + respuestaIncorrecta2 + ", respuestaIncorrecta3=" + respuestaIncorrecta3 + '}';
    }
    
    

    public String getPregunta() {    
             
            return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
        
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRespuestaIncorrecta1() {
        return respuestaIncorrecta1;
    }

    public void setRespuestaIncorrecta1(String respuestaIncorrecta1) {
        this.respuestaIncorrecta1 = respuestaIncorrecta1;
    }

    public String getRespuestaIncorrecta2() {
        return respuestaIncorrecta2;
    }

    public void setRespuestaIncorrecta2(String respuestaIncorrecta2) {
        this.respuestaIncorrecta2 = respuestaIncorrecta2;
    }

    public String getRespuestaIncorrecta3() {
        return respuestaIncorrecta3;
    }

    public void setRespuestaIncorrecta3(String respuestaIncorrecta3) {
        this.respuestaIncorrecta3 = respuestaIncorrecta3;
    }
    
}
