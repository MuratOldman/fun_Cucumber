Feature: Library User activities

  Scenario:As a library user able to login on SysLibrary
    Given Library user on the SysLibrary login page
    Then Library user able to enter username and password
    And Library user able to click sign-in button
    When Library user able to login

  Scenario Outline:
    Given Library user on the SysLibrary login page
    Then Library user able to enter "<username>" and "<password>"
    And Library user able to click sign-in button
    When Library user able to login
    Examples:
      |username  |password|
      |student14@library|6SW236ia |
      |student15@library|Tt6UFxnY |
      |student16@library|VNKw282v |
      |student17@library|0UID4kr8 |
      |student18@library|nK83Q8Be |
      |student19@library|Zxzbt6nX |
      |student20@library|KH8sN9WC |




