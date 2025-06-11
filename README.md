# deberAspectos

Este proyecto implementa el patrón Observer utilizando AspectJ, como parte de la tarea 01 del curso de Diseño de Software.

# Cambiador de Colores con AspectJ

# Integrantes
- Diego Fierro
- Daniela Espinoza
- Victor Villaroel
- Ermel Sanchez

## Funcionalidades principales
- Ventana con 3 botones para cambiar color de fondo (rojo, verde o azul)
- Logging automático de cambios de color mediante AspectJ

## Funcionalidad adicional (separación de preocupaciones)
- *Validación de colores*: Implementada en aspecto separado (ColorValidationAspect)
  - Ejemplo: Detecta específicamente cuando se selecciona el color rojo
  - Demuestra cómo añadir reglas de negocio sin modificar la clase principal
- *Sistema extensible*: Nuevas funcionalidades pueden añadirse mediante aspectos sin tocar el código existente

## Cómo ejecutar
1. Importar proyecto en Eclipse con AJDT instalado
2. Ejecutar la clase VentanaColores
