Sistema de Entregas con Drones Autónomos

Este proyecto en Java simula un sistema de entregas con drones de distintos tipos:  
Dron Liviano (entregas rápidas, límite 5 kg / 2 horas)  
Dron Carga (cargas pesadas, límite 30 kg / 5 horas, costo adicional por kg)  
Dron Emergencia (prioridad máxima, límite 10 kg / 3 horas, recargo por urgencia y nivel de prioridad)

Se aplican conceptos de **POO**: herencia, encapsulamiento, métodos abstractos, polimorfismo, validaciones y entrada de datos con `Scanner`.


Archivos

`Dron.java` (clase abstracta)
`DronLiviano.java`
`DronCarga.java`
`DronEmergencia.java`
`Main.java` (punto de entrada)



Requisitos

- Java JDK 8 o superior
- Consola/terminal para compilar y ejecutar



Compilación y Ejecución

1. Guarda cada clase en su archivo `.java` correspondiente.
2. Compila todos los archivos:


Datos por defecto:


--- Dron Liviano ---


Código: DL-000 | Modelo: LivianoDefault

Distancia: 5.00 km | Peso: 2.00 kg | Horas: 1.00

Costo base: $3.00

Costo de entrega: $5.10

...

Ingrese el codigo del Dron: DR001

Ingrese el modelo del Dron: Falcon X

Ingrese la Distancia en KM del Dron: 12

Ingrese el costo Base del Dron: 3.0

Ingrese una opcion de Dron (1=Dron Liviano, 2=Dron Carga, 3=Dron Emergencia): 1


--- Dron Liviano ---


Ingrese las Horas limite del Dron (de 0 a 2): 1.5

Ingrese el limite Peso del Dron (de 0 a 5): 4.0


--- Información general ---


Código: DR001 | Modelo: Falcon X

Distancia: 12.00 km | Peso: 4.00 kg | Horas: 1.50

Costo base: $3.00

Costo de entrega: $12.20

Límite de peso: 5.00 kg

Límite de horas: 2.00 h


