![image](https://github.com/Ednesor/peluqueria-canina/assets/77041457/0f0548ca-a727-493d-8e8d-3fb2ca38c92a)# Peluqueria canina
## Descripción
Proyecto realizada con Java que consiste en una aplicación de escritorio que guarda datos de mascotas en una base de datos MySQL y permite verlos en cualquier momento. </br>
Se Utilizó Maven para poder administrar las dependencias necesarias y Swing para realizar la interfaz de usuario.</br>
Se aplicó un modelo por capas, donde cada una se encarga de realizar una función distinta con el objetivo de separar el trabajo y lograr que la aplicación sea escalable.</br>
En esta ocasión se optó por crear la base de datos de forma local.

## Panel principal
![image](https://github.com/Ednesor/peluqueria-canina/assets/77041457/d736e7fc-89ef-4ae3-9e77-08055bcceb15) </br>
Como se puede observar es una interfaz sencilla con 3 opciones, dos del CRUD y una para cerrar la app.

## Cargar datos
![image](https://github.com/Ednesor/peluqueria-canina/assets/77041457/6d240472-2f63-4120-9ca9-2a7d188c0436) </br>
En esta primer ventana podemos cargar los datos de las mascotas. Al momento de darle al boton de **Guardar** se limpia el formulario y se manda a la base de datos. </br>
Se incluyeron opciones para limpiar el formulario y salir de la ventana de creación.</br>

## Ver datos
![image](https://github.com/Ednesor/peluqueria-canina/assets/77041457/09a80ae7-7a96-427d-96ad-c6fb61bd9c50) </br>
En la segunda opción podremos listar los datos automáticamente al momento de abrir la ventana.</br>
Del lado izquierdo tenemos el menú de opciones. Comenzando con **Editar** (próxima imagen), copia los datos en una ventana similar a la que nos permitia cargar los datos para poder editarlos. De no querer hacerlo se le puede dar al botón de cancelar y volverá a la pestaña anterior.</br>
![image](https://github.com/Ednesor/peluqueria-canina/assets/77041457/c3426664-bb1d-4752-9fc0-ae78a8e2605f)</br>
Tambien se encuentran las opciones de **Eliminar** que borra los datos de la fila seleccionada, de no haber ninguna marcada arrojará una advertencia indicando al usuario el error. Caso contrario, se elimina y se actualiza el listado de datos.</br>
Se incorporó el botón de **Agregar** para facilitar el uso de la aplicación y evitar volver al **Menú principal**.
Como ultima opción esta el botón de **Salir** que nos devuleve al **Menú principal**.
