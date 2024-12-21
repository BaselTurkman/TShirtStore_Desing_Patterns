**Design Patterns Project Description**

### Overview
This project demonstrates the application of four fundamental design patterns: **Factory**, **Observer**, **Singleton**, and **Decorator**. The context revolves around a T-Shirt store offering customizable T-Shirts across different regions (Middle East, Asia, and China) and sizes (Small, Medium, and Large). The project highlights a modular and extensible architecture while maintaining design principles.

---

### Key Components

#### 1. **T-Shirt Class Hierarchy**
- **Abstract Class**: `TShirt` serves as the base class, containing common attributes like `name` and `description`.
- **Concrete Classes**: There are nine specific classes extending `TShirt`, each representing a combination of size and region, e.g., `AsiaSmallTShirt`.

---

#### 2. **Abstract Factory Pattern**
- **Abstract Factory**: `TShirtStore` acts as the abstract factory, enforcing the implementation of three methods: `createSmallTShirt`, `createMediumTShirt`, and `createLargeTShirt`.
- **Concrete Factories**:
  - `MiddleEastTShirtStore`
  - `ChinaTShirtStore`
  - `AsiaTShirtStore`
- **Factory Method**: The `orderTShirt` method takes the size as input and ensures the appropriate T-Shirt is returned, tailored to the specified region.

---

#### 3. **Decorator Pattern**
- **Abstract Decorator**: `Features` class extends `TShirt`, enabling additional customizations.
- **Concrete Decorators**:
  - `Logo`
  - `Text`
  - `RedColor`
  - `BlueColor`
- **Composition**: The `Features` class uses composition to wrap around a `TShirt` object, allowing dynamic addition of features like colors and text.

---

#### 4. **Singleton Pattern**
- **Implementation**: The `ShopOwner` class ensures only a single instance exists by:
  - Making the constructor private.
  - Using a double-checked locking mechanism to manage instance creation.
- **Purpose**: Centralized control for monitoring sales data and interacting with stores.

---

#### 5. **Observer Pattern**
- **Concrete Subject**: `TShirtStore` keeps track of T-Shirt sales.
- **Concrete Observer**: `ShopOwner` subscribes to receive updates on the quantity of T-Shirts sold by size and region.
- **Interaction**: The `ShopOwner` is notified whenever a T-Shirt is sold, enabling real-time monitoring.

---

#### 6. **Customer Class**
- Customers can place a single T-Shirt order at a time. Subsequent orders are rejected unless the previous transaction is completed.

---

### How to Run the Project
1. **Initialize ShopOwner**: Access the single instance of `ShopOwner`.
2. **Create a T-Shirt Store**: Instantiate a store for the desired region (Middle East, Asia, or China).
3. **Create a Customer**: Instantiate a customer and allow them to place an order.
4. **Place an Order**:
   - Specify the region, size, and additional customizations (color, logo, text).
   - The system processes the order and notifies the `ShopOwner` of the sale.

---

### Summary
This project demonstrates a robust implementation of design patterns to achieve a flexible, reusable, and scalable architecture. It provides a practical showcase of real-world use cases for these patterns in a domain-specific context.

