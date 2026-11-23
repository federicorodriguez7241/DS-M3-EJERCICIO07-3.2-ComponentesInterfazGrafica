public class Main {
    public static void main(String[] args) {

        System.out.println("--- MODO RESOLUCION ESCRITORIO ---");
        FabricaInterfaz uiEscritorio = new FabricaEscritorio();
        uiEscritorio.renderizarPantalla("Bienvenido al panel", "Guardar Cambios");

        System.out.println("\n--- MODO RESOLUCION DISPOSITIVO MOVIL ---");
        FabricaInterfaz uiMovil = new FabricaMovil();
        uiMovil.renderizarPantalla("Bienvenido al panel", "Guardar Cambios");
    }
}