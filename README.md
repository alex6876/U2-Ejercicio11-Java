# 🚨 Simulación de Central de Monitoreo de Seguridad (POO en Java)

Este proyecto es una aplicación en Java que modela un sistema de seguridad perimetral. Demuestra cómo los sensores detectan eventos en tiempo real, instancian objetos de alerta con marcas temporales y los envían a una central para su registro y reporte en memoria.

---

## 🧩 Clases y Estructura del Sistema

El sistema está organizado en 4 clases principales:

*   **`Alerta`**: Representa un evento de seguridad generado.
    *   **Atributos encapsulados (`private`):** `idZona`, `tipoSensor` y `marcaTemporal`.
    *   **Métodos:** `mostrarAlerta()`, imprime los detalles del evento detectado.
*   **`SensorPerimetral`**: Modela un dispositivo físico de detección.
    *   **Atributos:** `idZona`, `tipoSensor` y una referencia a la `CentralMonitoreo`.
    *   **Métodos:** `detectarMovimiento()`, genera una instancia de `Alerta` con la fecha/hora actual y la transfiere a la central.
*   **`CentralMonitoreo`**: Actúa como el receptor y registro central.
    *   **Atributos:** Referencias en memoria para hasta 3 alertas (`alerta1`, `alerta2`, `alerta3`).
    *   **Métodos:** `procesarAlerta()` asigna la alerta al primer espacio disponible en memoria y `mostrarReporte()` imprime el resumen de las alertas registradas.
*   **`Main`**: Instancia la central, crea dos sensores perimetrales asociados a zonas específicas y simula detecciones de movimiento.

---

## ⚙️ Flujo de Operación y Control de Registros

1. **Inyección de la Central:** Los sensores se crean recibiendo la instancia de `CentralMonitoreo` en su constructor.
2. **Generación del Evento:** Al ejecutarse `detectarMovimiento()`, el sensor crea un nuevo objeto `Alerta` cargando la marca temporal (`05/10/2026 20:50`).
3. **Asignación Dinámica:** La central recibe el objeto e inspecciona secuencialmente sus ranuras de almacenamiento (`alerta1`, `alerta2`, `alerta3`) asignándolo en la primera que esté libre (`null`).
4. **Verificación de Seguridad (`null` Check):** Durante el reporte, la central valida que las referencias no sean nulas (`if (alerta != null)`) antes de llamar a `mostrarAlerta()`.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera la siguiente salida:

```text
Movimiento detectado.
Alerta registrada en la central
Movimiento detectado.
Alerta registrada en la central
========== Reporte en la central ==========
Id de Zona: 1
Tipo de Sensor: Barrera infrarroja
Marca de Temporal: 05/10/2026 20:50
Id de Zona: 2
Tipo de Sensor: Camara de movimiento
Marca de Temporal: 05/10/2026 20:50
