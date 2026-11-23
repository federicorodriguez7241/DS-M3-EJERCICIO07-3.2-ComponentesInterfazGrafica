public class BotonMovil implements Boton {
    private String texto;

    public BotonMovil(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar() {
        System.out.println("[Movil - Boton] '" + texto + "' | Tamaño: 320x50px (Ancho completo) | Borde redondeado | Fuente: 16pt");
    }

    @Override
    public void hacerClic() {
        System.out.println("[Movil - Boton] Toque tactil detectado en '" + texto + "'.");
    }
}