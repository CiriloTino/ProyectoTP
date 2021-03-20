
package clases;

public  class empleado implements impuestos{
    
    //Variables miembro    
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected int diasLaborados;
    protected double sueldo;
    protected double sueldoDiario;
    protected double prestaciones;
    protected final double impuestos = 0.10;
    protected final double seguroSocial = 0.05;
    
    //Constructor por defecto
    public empleado() {
    }
    
    //Constructor sobrecargado
    public empleado(String nombre, String apellidoPaterno, String apellidoMaterno,
            int diasLaborados, double sueldo, double sueldoDiario, double prestaciones) {
        
        setNombre(nombre);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
        setDiasLaborados(diasLaborados);
        setSueldo(sueldo);
        setSueldoDiario(sueldoDiario);
        setPrestaciones(prestaciones);
    }
    
    //Getters y Setters protegidos para acceder a las variables miembro

    protected double getImpuestos() {
        
                
        return impuestos;
    }

    protected double getSeguroSocial() {
        return seguroSocial;
    }

    protected double getPrestaciones() {
        return prestaciones;
    }

    protected void setPrestaciones(double prestaciones) {
        this.prestaciones = prestaciones;
    }
    
    
    protected String getApellidoPaterno() {
        return apellidoPaterno;
    }

    protected void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    protected String getApellidoMaterno() {
        return apellidoMaterno;
    }

    protected void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected int getDiasLaborados() {
        return diasLaborados;
    }

    protected void setDiasLaborados(int diasLaborados) {
        if(diasLaborados > 10 && diasLaborados < 15)
            this.diasLaborados = diasLaborados;
        else
            System.out.println("Los días laborados estan fuera de rango, ingrese nuevamente, "
                    + "deben ser mayor a 10 y menor que 15 días trabajados ");
    }

    protected double getSueldo() {
        return sueldo;
    }

    protected void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    protected double getSueldoDiario() {
        return sueldoDiario;
    }

    protected void setSueldoDiario(double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }
    
    //Métodos propios

    @Override
    public String toString() {
        return "empleado{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", diasLaborados=" + diasLaborados + ", sueldo=" + sueldo + ", sueldoDiario=" + sueldoDiario + '}';
    }
    
    //Métodos heredados
    
    //Implementamos el metodo sueldoNeto de la interface
    @Override
    public void sueldoNeto(double sueldo, double prestaciones, double deducciones) {
        /*sueldo = getDiasLaborados() * getSueldoDiario();
        prestaciones = getPrestaciones();
        deducciones = ;
        System.out.println();*/
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
    //Implementamos el metodo sueldoBruto de la interface
    @Override
    public void sueldoBruto(int diasTrabajados, double sueldoDiario) {
        diasTrabajados = getDiasLaborados();
        sueldoDiario = getSueldoDiario();
        System.out.println(diasTrabajados * sueldoDiario);
    }
    
    //Implementamos el metodo descuentos de la interface
    @Override
    public void descuentos(double impuestos, double seguroSocial) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
