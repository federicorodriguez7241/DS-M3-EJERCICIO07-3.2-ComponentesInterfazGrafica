public class FabricaEscritorio extends FabricaInterfaz {
    @Override
    public Boton crearBoton(String texto) {
        return new BotonEscritorio(texto);
    }

    @Override
    public Etiqueta crearEtiqueta(String texto) {
        return new EtiquetaEscritorio(texto);
    }
}
