package Universidad;

public class Universidades {

	// Clase Estudiante
    static class Estudiante {
        private String nombre;
        private int matricula;
        private String correo;

        
        public Estudiante(String nombre, int matricula, String correo) {
            this.nombre = nombre;
            this.matricula = matricula;
            this.correo = correo;
        }

        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getMatricula() {
            return matricula;
        }

        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        @Override
        public String toString() {
            return "Estudiante: " + nombre + ", Matrícula: " + matricula + ", Correo: " + correo;
        }
    }

    // Clase Curso
    static class Curso {
        private String nombre;
        private String codigo;
        private int creditos;

        
        public Curso(String nombre, String codigo, int creditos) {
            this.nombre = nombre;
            this.codigo = codigo;
            this.creditos = creditos;
        }

        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public int getCreditos() {
            return creditos;
        }

        public void setCreditos(int creditos) {
            this.creditos = creditos;
        }

        @Override
        public String toString() {
            return "Curso: " + nombre + ", Código: " + codigo + ", Créditos: " + creditos;
        }
    }

    // Clase Profesor
    static class Profesor {
        private String nombre;
        private int numeroEmpleado;
        private String especializacion;

        
        public Profesor(String nombre, int numeroEmpleado, String especializacion) {
            this.nombre = nombre;
            this.numeroEmpleado = numeroEmpleado;
            this.especializacion = especializacion;
        }

        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNumeroEmpleado() {
            return numeroEmpleado;
        }

        public void setNumeroEmpleado(int numeroEmpleado) {
            this.numeroEmpleado = numeroEmpleado;
        }

        public String getEspecializacion() {
            return especializacion;
        }

        public void setEspecializacion(String especializacion) {
            this.especializacion = especializacion;
        }

        @Override
        public String toString() {
            return "Profesor: " + nombre + ", Número de Empleado: " + numeroEmpleado + ", Especialización: " + especializacion;
        }
    }

    // Clase Inscripcion
    static class Inscripcion {
        private String fecha;
        private Estudiante estudiante;
        private Curso curso;

        
        public Inscripcion(String fecha, Estudiante estudiante, Curso curso) {
            this.fecha = fecha;
            this.estudiante = estudiante;
            this.curso = curso;
        }

        
        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public Estudiante getEstudiante() {
            return estudiante;
        }

        public void setEstudiante(Estudiante estudiante) {
            this.estudiante = estudiante;
        }

        public Curso getCurso() {
            return curso;
        }

        public void setCurso(Curso curso) {
            this.curso = curso;
        }

        @Override
        public String toString() {
            return "Inscripción: " + estudiante.getNombre() + " se ha inscrito en " + curso.getNombre() + " el " + fecha;
        }
    }
}
