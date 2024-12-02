package prototype1;

import java.util.HashMap;
import java.util.Map;

public class FiguraCache {
    private static Map<String, Figura> mapaFiguras = new HashMap<>();

    public static void cargarFiguras() {
        Circulo circulo = new Circulo();
        circulo.setId("1");
        mapaFiguras.put(circulo.getId(), circulo);

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setId("2");
        mapaFiguras.put(cuadrado.getId(), cuadrado);
    }

    public static Figura obtenerFigura(String id) {
        Figura figuraGuardada = mapaFiguras.get(id);
        return figuraGuardada != null ? figuraGuardada.clonar() : null;
    }
}
