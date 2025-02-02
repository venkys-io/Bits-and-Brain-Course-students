Access modifiers in Java determine the visibility or accessibility of classes, methods, and variables. They help control where these elements can be accessed from in a program. Java has four main access modifiers:

1. **`public`**
2. **`protected`**
3. **`default`** (also known as package-private)
4. **`private`**

### 1. `public`

- **Definition**: The `public` access modifier allows the member (class, method, or variable) to be accessible from any other class or package.

- **Example**:
  
  ```java
  // File: PublicExample.java
  public class PublicExample {
      public int number; // Public variable

      public void display() { // Public method
          System.out.println("Public method");
      }
  }

  // File: Main.java
  public class Main {
      public static void main(String[] args) {
          PublicExample obj = new PublicExample();
          obj.number = 10; // Accessible because 'number' is public
          obj.display(); // Accessible because 'display' is public
      }
  }
  ```

  In this example, `PublicExample` is a public class with a public variable and method. These can be accessed from any other class, including `Main`.

### 2. `protected`

- **Definition**: The `protected` access modifier allows access within the same package and also by subclasses, even if they are in different packages.

- **Example**:
  
  ```java
  // File: ProtectedExample.java
  package com.example;

  public class ProtectedExample {
      protected int number; // Protected variable

      protected void display() { // Protected method
          System.out.println("Protected method");
      }
  }
  
  // File: SubClassExample.java
  package com.example;

  public class SubClassExample extends ProtectedExample {
      public void show() {
          number = 20; // Accessible because 'number' is protected
          display(); // Accessible because 'display' is protected
      }
  }

  // File: Main.java
  package com.example;

  public class Main {
      public static void main(String[] args) {
          SubClassExample obj = new SubClassExample();
          obj.show(); // Accessible
      }
  }
  ```

  Here, `ProtectedExample` has protected members. `SubClassExample` inherits from `ProtectedExample` and can access the protected members.

### 3. `default` (Package-Private)

- **Definition**: When no access modifier is specified, the default access level is used. Members are accessible only within the same package.

- **Example**:
  
  ```java
  // File: DefaultExample.java
  package com.example;

  class DefaultExample {
      int number; // Default (package-private) variable

      void display() { // Default (package-private) method
          System.out.println("Default method");
      }
  }

  // File: Main.java
  package com.example;

  public class Main {
      public static void main(String[] args) {
          DefaultExample obj = new DefaultExample();
          obj.number = 30; // Accessible because both classes are in the same package
          obj.display(); // Accessible because both classes are in the same package
      }
  }
  ```

  The `DefaultExample` class and its members are accessible only within the `com.example` package. They cannot be accessed from outside this package.

### 4. `private`

- **Definition**: The `private` access modifier restricts access to the member only within the same class. No other class can access private members.

- **Example**:
  
  ```java
  // File: PrivateExample.java
  public class PrivateExample {
      private int number; // Private variable

      private void display() { // Private method
          System.out.println("Private method");
      }

      public void accessPrivate() {
          number = 40; // Accessible within the same class
          display(); // Accessible within the same class
      }
  }

  // File: Main.java
  public class Main {
      public static void main(String[] args) {
          PrivateExample obj = new PrivateExample();
          obj.accessPrivate(); // Public method to access private members
          // obj.number = 50; // Error: 'number' has private access in 'PrivateExample'
          // obj.display(); // Error: 'display' has private access in 'PrivateExample'
      }
  }
  ```

  In this case, the `number` and `display` members are private and can only be accessed within the `PrivateExample` class. The `accessPrivate` method is a public method that provides controlled access to the private members.

### Summary:

- **`public`**: Accessible from any class.
- **`protected`**: Accessible within the same package and by subclasses.
- **default**: Accessible only within the same package (no modifier needed).
- **`private`**: Accessible only within the same class.
