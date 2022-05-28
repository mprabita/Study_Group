Feature: Costco Sign In


@Negetive_Scenario


 Scenario Outline:
 Given user visit Costco homepage 
 When user click on Sign In option
 When user type invalid "<email>", invalid "<password>"
 When user click on Sign In option
 Then user will be able to Sign In succesfully.
  

    Examples: 
      | email | password|
      |mona123@gmail.com |xyz123|
    
      
