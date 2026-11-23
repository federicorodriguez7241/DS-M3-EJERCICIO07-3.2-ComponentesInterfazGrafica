public abstract class FabricaInterfaz {

    public abstract Boton crearBoton(String texto);
    public abstract Etiqueta crearEtiqueta(String texto);

    // arma y prueba los componentes juntos asegurando que pertenezcan al mismo entorno
    public void renderizarPantalla(String textoEtiqueta, String textoBoton) {
        Etiqueta etiqueta = crearEtiqueta(textoEtiqueta);
        Boton boton = crearBoton(textoBoton);

        etiqueta.renderizar();
        boton.renderizar();
        etiqueta.interactuar();
        boton.hacerClic();
        System.out.println("----------------------------------------------------------------------");
    }
}