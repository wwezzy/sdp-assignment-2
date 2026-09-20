# SDP Assignment 2 — Factory Method & Abstract Factory

## Overview

This project demonstrates two creational design patterns in Java:

- Factory Method
- Abstract Factory

The project is divided into two parts and uses a vehicle-related domain.

Java version: JDK 17

---

## Part A — Factory Method

The Factory Method implementation is used to create different types of vehicles.

### Structure

- `Vehicle` — Product interface
- `TwoWheeler` — Concrete Product
- `FourWheeler` — Concrete Product
- `VehicleFactory` — Creator interface
- `TwoWheelerFactory` — Concrete Creator
- `FourWheelerFactory` — Concrete Creator
- `FactoryMethodDemo` — Client / demonstration

### How it works

The client works with the `VehicleFactory` interface.

Each concrete factory decides which concrete `Vehicle` object should be created.

Example:

```java
VehicleFactory factory = new TwoWheelerFactory();
Vehicle vehicle = factory.createVehicle();

vehicle.printVehicle();

TwoWheelerFactory creates a TwoWheeler, while FourWheelerFactory creates a FourWheeler.

This separates object creation from the client code.

Part B — Abstract Factory

The Abstract Factory implementation creates families of related vehicle parts.

The project contains two product families:

Electric family
ElectricEngine
ElectricTire
Gasoline family
GasolineEngine
GasolineTire
Structure
Engine — Abstract Product
Tire — Abstract Product
ElectricEngine — Concrete Product
GasolineEngine — Concrete Product
ElectricTire — Concrete Product
GasolineTire — Concrete Product
VehiclePartsFactory — Abstract Factory
ElectricVehiclePartsFactory — Concrete Factory
GasolineVehiclePartsFactory — Concrete Factory
VehicleAssembler — Client
AbstractFactoryDemo — Demonstration
How it works

VehiclePartsFactory defines methods for creating related products:

Engine createEngine();
Tire createTire();

Each concrete factory creates a consistent family of products.

For example:

VehiclePartsFactory factory =
        new ElectricVehiclePartsFactory();

VehicleAssembler vehicle =
        new VehicleAssembler(factory);

vehicle.assemble();

The electric factory creates:

ElectricEngine
ElectricTire

The gasoline factory creates:

GasolineEngine
GasolineTire

The client works only with the abstract interfaces and does not depend directly on concrete product classes.

Factory Method vs Abstract Factory

Factory Method focuses on creating one type of product.

In this project:

VehicleFactory
    -> Vehicle

Abstract Factory focuses on creating a family of related products.

In this project:

VehiclePartsFactory
    -> Engine
    -> Tire
Project Structure
src/
└── kz/
    └── aitu/
        └── sdp/
            ├── factorymethod/
            │   ├── Vehicle.java
            │   ├── TwoWheeler.java
            │   ├── FourWheeler.java
            │   ├── VehicleFactory.java
            │   ├── TwoWheelerFactory.java
            │   ├── FourWheelerFactory.java
            │   └── FactoryMethodDemo.java
            │
            └── abstractfactory/
                ├── Engine.java
                ├── Tire.java
                ├── ElectricEngine.java
                ├── GasolineEngine.java
                ├── ElectricTire.java
                ├── GasolineTire.java
                ├── VehiclePartsFactory.java
                ├── ElectricVehiclePartsFactory.java
                ├── GasolineVehiclePartsFactory.java
                ├── VehicleAssembler.java
                └── AbstractFactoryDemo.java
How to Run
Open the project in IntelliJ IDEA.
Make sure JDK 17 is selected.
Run FactoryMethodDemo to demonstrate Factory Method.
Run AbstractFactoryDemo to demonstrate Abstract Factory.
Factory Method output
I am two-wheeler vehicle
I am four-wheeler vehicle
Abstract Factory output
Electric vehicle:
Electric engine started
Electric tire is rotating

Gasoline vehicle:
Gasoline engine started
Gasoline tire is rotating
Technologies
Java 17
IntelliJ IDEA
Git
GitHub
Author

Kuat Allazhar Talgatuly
Astana IT University
