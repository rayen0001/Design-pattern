# Design Patterns Exercises

This repository contains four exercises that implement various design patterns. Each exercise focuses on a specific pattern, and the goal is to understand and apply these patterns by implementing them in Java.

## Exercice 1: Singleton Pattern
### Objective:
Implement the Singleton Pattern and represent it with a class diagram.

### Instructions:
1. Create a `Logger` class that uses the Singleton pattern to ensure there is only one instance of this class.
2. Ensure that the class is **thread-safe** to avoid issues in multi-threaded environments.

---

## Exercice 2: Factory Method Pattern
### Objective:
Implement the Factory Method Pattern and represent it with a class diagram.

### Instructions:
1. Create an interface `Product` with a method `use()`.
2. Create two concrete implementations of `Product`:
   - `ConcreteProductA`
   - `ConcreteProductB`
3. Create a class `Creator` with a method `createProduct()` that returns a `Product` object.

---

## Exercice 3: Abstract Factory Pattern
### Objective:
Implement the Abstract Factory Pattern and represent it with a class diagram.

### Instructions:
1. Create interfaces `AbstractFactory`, `AbstractProductA`, and `AbstractProductB`.
2. Create two concrete implementations for each interface:
   - Factories: `ConcreteFactory1`, `ConcreteFactory2`
   - Products:
     - `ConcreteProductA1`, `ConcreteProductA2`
     - `ConcreteProductB1`, `ConcreteProductB2`

---

## Exercice 4: Builder Pattern
### Objective:
Implement the Builder Pattern and represent it with a class diagram.

### Instructions:
1. Create a class `Product` with attributes representing different components.
2. Create an interface `Builder` with methods to build each part of the product.
3. Create a class `ConcreteBuilder` that implements `Builder` and constructs the product.
4. Create a class `Director` that uses a `Builder` to construct a product.

---

## How to Use
- Each exercise is located in its own package.
- You can run the individual exercises by running the `Main` class located in each package.
- You can run them all in the global Main file

---

## Design Patterns Implemented
1. **Singleton Pattern** (Exercise 1)
2. **Factory Method Pattern** (Exercise 2)
3. **Abstract Factory Pattern** (Exercise 3)
4. **Builder Pattern** (Exercise 4)
