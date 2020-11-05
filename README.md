# Arep taller de disponibilidad y rendimiento
1. Idee un problema interesante que necesite una solución distribida y que necesite alto consumo de procesamiento, por ejemplo, ordenamiento de cadenas, indexación de grandes cantidades de texto, etc.. Genere los requerimientos mínimos.

La aplicacion consiste en el calculo de la secuencia de fibonacci al que corresponde un numero, los numeros pequeños consumen poco procesamiento, pero los numero mas grandes consumens bastente cpu por como esta construida la aplicación

* Una vez creada la maquina ec2, configuramos el crontab para ejecute la aplicación cada vez que se reinicia la maquina

![img](img/crontab.png)

* se comprueba que reiniciando la maquina la aplicación este corriendo

![img](img/exec.png)

![img](img/fibo.png)

* creamos una imagen de la instancia

![img](img/img.png)

![img](img/img-conf.png)

![img](img/ami.png)

* luego creamos y configuramos una plantilla de lanzamiento

![img](img/plantilla.png)

![img](img/plantilla1.png)

* por ultimo cremos un grupo de autoscaling con una politica por uso de cpu y las maximas instancias que se pueden generar

![img](img/plantilla2.png)

![img](img/size.png)

![img](img/politica.png)

## Pruebas

* A continuación se puede ver que el consumo de la cpu es alto por lo que se crean las demas instancias que se pueden ver en el video.

![img](img/politica.png)

[video de prueba](https://youtu.be/dUHzC8C6Apw)

## Autor

Edwin Yesid Rodriguez Maldonado

## Licencia

Este proyecto esta bajo la licencia Gnu