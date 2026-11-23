public class FabricaMovil extends FabricaInterfaz {
    @Override
    public Boton crearBoton(String texto) {
        return new BotonMovil(texto);
    }

    @Override
    public Etiqueta crearEtiqueta(String texto) {
        return new EtiquetaMovil(texto);
    }
}
