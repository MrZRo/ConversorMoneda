# Conversor de Monedas

Este proyecto es una aplicación de consola en Java que permite consultar conversiones entre diferentes monedas mediante una API externa. También guarda las conversiones realizadas en un archivo `.json`.

## Funcionalidades

- Consulta de tasa de conversión entre diferentes monedas.
- Interfaz de usuario por consola.
- Manejo de errores y validación de entrada.

## Monedas disponibles

1. USD a ARS (Dólar a Peso Argentino)
2. ARS a USD (Peso Argentino a Dólar)
3. USD a BRL (Dólar a Real Brasileño)
4. BRL a USD (Real Brasileño a Dólar)
5. USD a COP (Dólar a Peso Colombiano)
6. COP a USD (Peso Colombiano a Dólar)
7. Salir

## Estructura del proyecto

### `Main.java`

Contiene el ciclo principal del programa. Se encarga de:

- Mostrar el menú
- Recibir la opción del usuario
- Realizar la consulta correspondiente
- Mostrar el resultado en consola

### `ConsultaMoneda.java`

Clase encargada de realizar la consulta de tasas de cambio a través de una API externa.

### `Moneda.java`

Clase (posiblemente un `record`) que modela la información de una conversión monetaria. Incluye métodos como `conversion_rate()` y posiblemente `toJson()` para serialización.

### `GeneradorDeArchivo.java`

Guarda cada conversión en un archivo `conversaciones.json`. Se asegura de que cada entrada esté registrada sin sobrescribir las anteriores.

## Cómo ejecutar el programa

1. Clona el repositorio o copia los archivos fuente a tu entorno de desarrollo.
2. Asegúrate de tener Java 17 o superior instalado.
3. Compila el programa:

```bash
javac Main.java
