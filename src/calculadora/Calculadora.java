package calculadora;

public class Calculadora {

    public String cadena = "";
    double operador1 = 0;
    double operador2 = 0;
    double total = 0;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;

    boolean division = false;

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

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String resta(String cadena) {
        this.suma = false;
        this.resta = true;
        this.multiplicacion = false;
        this.division = false;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String multiplicacion(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = true;
        this.division = false;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String division(String cadena) {
        this.suma = false;
        this.resta = false;
        this.multiplicacion = false;
        this.division = true;

        this.operador1 = Double.parseDouble(cadena);
        this.cadena = "";
        return String.valueOf(this.operador1);
    }

    public String total(String cadena) {
        this.operador2 = Double.parseDouble(cadena);
        if (this.suma) {
            this.total = this.operador1 + this.operador2;
        } else if (this.resta) {
            this.total = this.operador1 - this.operador2;
        } else if (this.multiplicacion) {
            this.total = this.operador1 * this.operador2;
        } else {
            this.total = this.operador1 / this.operador2;
        }
        this.cadena = String.valueOf(this.total);
        return String.valueOf(this.operador2);
    }
}