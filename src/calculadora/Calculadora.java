package calculadora;
import java.util.*;

public class Calculadora {

    public String cadena = "";
    double operador1 = 0;
    double operador2 = 0;
    double total = 0;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    boolean raiz = false;
    boolean unoEquis = false;
    boolean exponente = false;

    public String concatenamiento(String cadena) {

        this.cadena = this.cadena + cadena;
        return this.cadena;
    }

    public void clear() {
        cadena = "";
    }

    public String suma(String cadena) {
        this.suma = true;
        this.resta = false;
        this.multiplicacion = false;
        this.division = false;
        this.raiz = false;
        this.unoEquis = false;
        this.exponente = false;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String resta(String cadena) {
        this.suma = false;
        this.resta = true;
        this.multiplicacion = false;
        this.division = false;
        this.raiz = false;
        this.unoEquis = false;
        this.exponente = false;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String multiplicacion(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = true;
        this.division = false;
        this.raiz = false;
        this.unoEquis = false;
        this.exponente = false;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String division(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = false;
        this.division = true;
        this.raiz = false;
        this.unoEquis = false;
        this.exponente = false;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String raiz(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = false;
        this.division = false;
        this.raiz = true;
        this.unoEquis = false;
        this.exponente = false;
        
        this.operador1 = Double.parseDouble(cadena);   
        this.operador2 = 0;

        return String.valueOf(this.operador1);
    }

    public String unoEquis(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = false;
        this.division = false;
        this.raiz = false;
        this.unoEquis = true;
        this.exponente = false;

         this.operador1 = Double.parseDouble(cadena);   
        this.operador2 = 0;

        return String.valueOf(this.operador1);
    }
    
     public String exponente(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = false;
        this.division = false;
        this.raiz = false;
        this.unoEquis = false;
        this.exponente = true;

         this.operador1 = Double.parseDouble(cadena);   
        this.operador2 = 0;

        return String.valueOf(this.operador1);
    }

    public String total(String cadena) {
        if (this.suma) {
            this.operador2 = Double.parseDouble(cadena);

            this.total = this.operador1 + this.operador2;
        } else if (this.resta) {
            this.operador2 = Double.parseDouble(cadena);

            this.total = this.operador1 - this.operador2;
        } else if (this.multiplicacion) {
            this.operador2 = Double.parseDouble(cadena);

            this.total = this.operador1 * this.operador2;
        } else if (this.division) {
            this.operador2 = Double.parseDouble(cadena);

            this.total = this.operador1 / this.operador2;
        } else if (this.raiz) {


            this.total = Math.sqrt(this.operador1);
        } else if (this.unoEquis) {

            this.total = 1 / this.operador1;
        } else if(this.exponente){
        this.total = Math.pow(2.718281828, this.operador1);
        }
        this.cadena = String.valueOf(this.total);
        return String.valueOf(this.total);
    }
}
