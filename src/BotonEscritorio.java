public class BotonEscritorio implements Boton {
    private String texto;

    public BotonEscritorio(String texto) {
        this.texto = texto;
    }

    @Override
    public void renderizar() {
        System.out.println("[Escritorio - Boton] '" + texto + "' | Tamaño: 120x32px | Borde recto | Fuente: 12pt");
    }

    @Override
    public void hacerClic() {
        System.out.println("[Escritorio - Boton] Clic izquierdo del mouse sobre '" + texto + "'.");
    }
}
