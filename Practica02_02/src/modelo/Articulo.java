
package modelo;

/**
 *
 * @author Tatiana Cárdenas
 */
public class Articulo {
    
    private String codigoArticulo;
    private Autor autorArticulo;
    private String tituloArticulo;

    public Articulo(String codigoArticulo, Autor autorArticulo, String tituloArticulo) {
        this.codigoArticulo = codigoArticulo;
        this.autorArticulo = autorArticulo;
        this.tituloArticulo = tituloArticulo;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Autor getAutorArticulo() {
        return autorArticulo;
    }

    public void setAutorArticulo(Autor autorArticulo) {
        this.autorArticulo = autorArticulo;
    }

    public String getTituloArticulo() {
        return tituloArticulo;
    }

    public void setTituloArticulo(String tituloArticulo) {
        this.tituloArticulo = tituloArticulo;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigoArticulo=" + codigoArticulo + ", autorArticulo=" + autorArticulo + ", tituloArticulo=" + tituloArticulo + '}';
    }
    
    
    
    
}
