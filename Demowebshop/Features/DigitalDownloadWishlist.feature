	Feature: Wishlist Management

  Scenario: Add and Remove Products from Wishlist
    Given User is on the homepage of the demo webshop
    When User click on "Digital Downloads"
    And User add all products to the wishlist
    And User go to the wishlist and remove all products
    Then User should see the message "The wishlist is empty!"
	