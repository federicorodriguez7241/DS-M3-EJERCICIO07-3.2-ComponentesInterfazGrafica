public class EtiquetaEscritorio implements Etiqueta {
    private String texto;

    public EtiquetaEscritorio(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar() {
        System.out.println("[Escritorio - Etiqueta] '" + texto + "' | Alto: 24px | Margen: 4px | Fuente: 12pt");
    }

    @Override
    public void interactuar() {
        System.out.println("[Escritorio - Etiqueta] Puntero encima (hover): mostrando informacion extra.");
    }
}