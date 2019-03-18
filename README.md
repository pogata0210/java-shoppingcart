# java-shoppingcart

# A Shopping Cart

This project is a shopping cart, ordering system. No actual payments need to be implemented. You are to fully implement a REST API Web service system to support the shopping cart features. The REST API should be fully documented using Swagger. You should also develop a front-end client to use this REST API Web service. The idea for this project comes from the Depot Shopping Cart popular in the Ruby on Rails community and described in the book Agile Web Development with Rails (a free beta version can be found at http://peterhurford.com/tilde/files/ruby-textbook.pdf).

Below are the minimum requirements for a success project. This is not meant to be a fully designed system. You are required to fill in some missing details, ask for clarification, make the project your own, go wild with requirements! 

## Database design:
* Security – anyone can create and edit their carts. Shopkeepers can update products and suppliers and change order status.
* Product List with name, description, price, quantity on hand.
* Suppliers of the products (multiple suppliers may supply the same part).
* Shoppers with billing and shipping addresses, phone numbers, payment method.
* Cart with cart items that include products and quantity orders.
* Orders with product and quantity orders, plus shipping addresses, payment details, and shipped status.

## Front end needed:
* Shopper interface for setting up a cart – shopper name, address, etc.
* Shopper interface for adding, removing products to their cart. This should not allow ordering more than is in stock.
* A way to place the order.

* Shopkeeper interface for shopkeeper to add, edit, remove products from the list, view orders from customers, update suppliers

* Admin interface to update user accounts for the shopkeepers. This system does not need to work with individual user accounts (although that would a great stretch goal).

## Notes
* the system must implement full unit testing
* the system must include swagger documentation
* the system must use Java, Spring, Maven for the back end - for the front end, your choice
* the system must include some form of authentication
* the system must include at least 5 tables, at least 1 many to many relationship, at least 1 many to one relationship, and at least 4 front end screens.

Project week

