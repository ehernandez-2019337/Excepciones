package org.example;

public class FileManager {
    class ArchivoNoEncontradoException extends Exception {
        public ArchivoNoEncontradoException(String message) {
            super(message);
        }
    }

    class ArchivoYaExisteException extends Exception {
        public ArchivoYaExisteException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            // Verificar si el archivo existe
            verificarArchivo(fileName);

            // Crear un archivo (esto lanzará ArchivoYaExisteException si ya existe)
            crearArchivo(fileName);

            // Agregar una línea de texto al archivo
            agregarLineaAlArchivo(fileName, "Esta es una nueva línea de texto.");

            // Leer y mostrar todo el contenido del archivo
            mostrarContenidoArchivo(fileName);

            // Leer y mostrar una línea específica del archivo
            mostrarLineaEspecifica(fileName, 1);

        } catch (ArchivoNoEncontradoException | ArchivoYaExisteException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
