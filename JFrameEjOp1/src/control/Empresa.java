package control;

import java.util.ArrayList;
import java.util.HashMap;
import model.Alumno;
import model.Asignatura;
import model.Curso;
import model.Usuario;

/**
 *
 * @author satan
 */
public class Empresa {

    HashMap<String, Usuario> usuarios;
    HashMap<String, Curso> cursos;
    HashMap<String, Alumno> alumno;

    public Empresa() {
        usuarios = new HashMap();  
        cursos = new HashMap();
    }

    public void cargarUsuarios() {
        usuarios.put("0", new Usuario("0", UserCode.ADMINISTRADOR));
        usuarios.put("1", new Usuario("1", UserCode.PROFESOR));
        usuarios.put("2", new Usuario("2", UserCode.PROFESOR));
    }

    public boolean verificarUsuario(String login, String pass) {
        boolean verificado = false;

        if (usuarios.containsKey(login)) {
            if (usuarios.get(login).comprobarPass(pass)) {
                verificado = true;
            }
        }

        return verificado;
    }

    public Usuario getUsuario(String key) {
        return usuarios.get(key);
    }

    public void nuevoCurso(String code, String denominacion, int numPlazas, ArrayList<Asignatura> asignaturas) {
        cursos.put(code, new Curso(denominacion, numPlazas, asignaturas));
    }

    public void nuevoAlumno(String dni, String nombre, Curso curso) {
        alumno.put(dni, new Alumno(nombre, curso));
    }
    
    public boolean existeCurso(String key){
        return cursos.containsKey(key);
    }
    
    
}
