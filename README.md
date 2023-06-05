# Project Title: Discount & Payment Strategy Application

## Description

This project is a Java application implementing the Strategy and Factory design patterns. It includes discount strategies and payment options for a shopping cart system. The application chooses the appropriate discount type and payment method based on the user's shopping cart content and total value.

## Design Patterns Implemented

### Strategy Pattern

The Strategy Pattern is implemented in this application to dynamically choose a discount strategy based on the user's cart contents. The two implemented discount strategies are:

1. **Percentage Discount:** A percentage-based discount applied to the total value of the user's cart.
2. **3-Buy-2-Pay Discount:** A special discount where users buying three items pay for only two.

The application selects the most appropriate discount strategy based on a set of predefined rules and applies it to the user's cart.

### Factory Pattern

The Factory Pattern is implemented to select the payment method based on the total value of the user's cart. Two payment methods have been implemented:

1. **Credit Card Payment:** For carts with a total value above a specific threshold, the application only allows credit card payments.
2. **Cash Payment:** If the cart value is below the threshold, the application allows cash payments.

The application utilizes the Factory Pattern to create the payment method object based on the aforementioned conditions.


## Usage

The application simulates a shopping cart system where users can add items to their cart. When the user is ready to checkout, the application calculates the total value of the cart, applies the appropriate discount strategy, and suggests the available payment methods.

To test different scenarios, adjust the items in the user's cart and observe the application's responses in selecting the discount strategy and payment method.
