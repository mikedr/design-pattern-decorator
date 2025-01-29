# Problema
Estás desarrollando un sistema de generación de reportes dinámicos para una empresa. Los reportes básicos pueden ser en formato texto plano o HTML, pero los usuarios necesitan la capacidad de agregar funcionalidades adicionales como:

1 - Encabezados: Agregar un título con información relevante al inicio del reporte.

2 -  Pie de página: Agregar un mensaje o firma al final del reporte.

3 - Cifrado simple: Encriptar el contenido del reporte para proteger información sensible (usa una conversión simple, como cambiar cada carácter por su valor ASCII + 1).

El diseño debe permitir:

- Generar reportes base en diferentes formatos (Texto, HTML).
- Agregar múltiples decoradores al reporte base en cualquier combinación (por ejemplo, encabezado + cifrado).
- Extender el sistema fácilmente para agregar nuevos formatos o decoradores en el futuro.

Requisitos funcionales
- Crea una clase base o interfaz Report con el método String generateContent().
- Implementa al menos dos clases de reportes base (PlainTextReport y HTMLReport).
- Implementa al menos tres decoradores (HeaderDecorator, FooterDecorator, EncryptionDecorator).
- Simula la creación de un reporte con varios decoradores y muestra el contenido final.
  
Ejemplo de uso
Si un usuario genera:

Un reporte HTML con un encabezado y cifrado, el sistema debe imprimir algo como: 

Contenido: (Cifrado) <h1>Report Title</h1> This is the report content.