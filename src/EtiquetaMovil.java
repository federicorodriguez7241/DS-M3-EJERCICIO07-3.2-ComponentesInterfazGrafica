public class EtiquetaMovil implements Etiqueta {
    private String texto;

    public EtiquetaMovil(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar() {
        System.out.println("[Movil - Etiqueta] '" + texto + "' | Alto: 40px | Margen: 12px | Fuente: 16pt");
    }

    @Override
    public void interactuar() {
        System.out.println("[Movil - Etiqueta] Toque mantenido en pantalla: texto copiado al portapapeles.");
    }
}