Feature: Website testing

Scenario: A to Z Testing the website
    Given User launch "<Browsers>"
    When Launch The Url 
    When User "<User>"
    When user2 "<Password>"
    When Scroll
    When ComparetoList
    When ComparetowidList
    When AddCompafreList
    When scrollComapareProducts
    When AddToCart
    When AddtoWidlist
    When ShoppingCart
    When Edite
    When Update
    When CheckOut
    When User3 "<AssertSubTotal>"
    Then Remove from Cart
   
    
    Examples: 
     | Browsers    |            User              |  Password    |
     | Chrome      | gayathridharaka@gmail.com    |Gayathri123456|
     |  edge       | gayathridharaka@gmail.com    |Gayathri123456|
               	
     
