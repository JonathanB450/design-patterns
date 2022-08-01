## Sistema de compra de dispositivos

Este sistema de compra de dispositivos, permite al usuario ingresar un presupuesto, de acuerdo al presupuesto se le dira que tipo(celulares y computadoras) y gama(gama baja o gama alta) de productos puede comprar, este sistema funciona por medio de Abstract Factory.
Tenemos como abstract factory el archivo _IDeviceFactory_, el cual es una interfaz que implementaremos tanto en _HighEndFactory_ y _LowEndFactory_ estos factories permitiran generar tanto computadores como celulares de gama alta o baja, cada dispositivo tiene su propia interfaz y su concrete factory
