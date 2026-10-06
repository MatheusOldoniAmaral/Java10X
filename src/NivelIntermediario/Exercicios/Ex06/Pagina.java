package NivelIntermediario.Exercicios.Ex06;

public class Pagina {
    private String titulo;
    private String url;

    public Pagina(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "titulo='" + titulo + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
