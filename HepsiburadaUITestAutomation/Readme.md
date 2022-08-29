# Hepsiburada UI Test Automation 

> libraries Selenium, Cucumber, JUnit, WebDriverManager

  **Background:**</br>
    Given verify that homepage is open</br>
</br>
  **Scenario Outline: give plus point to the review**</br>
    - *When* I search for "searchKey" </br>
    - *And* I click on product number "productNumber" in the search result page</br>
    - *And* I navigate to the comments tab</br>
    - *Then* I give plus point to the comment number "commentNumber" and assert if a comment exist</br>
    </br>
    **Examples:**</br>
      | searchKey | productNumber | commentNumber | </br>
      | samsung &ensp;| 2 &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&ensp;| 1 &emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;| </br>
      
</br></br>

**You can run the program from TestRunner**</br>

![hb](https://user-images.githubusercontent.com/88919177/187027048-eaa4d9d3-a5fb-412d-954d-5b0974f14721.gif)

</br></br>

**Generates a html report after the case**</br>

![report](https://user-images.githubusercontent.com/88919177/187027190-25d35a20-ac82-48af-8e09-a0cd1f4be566.gif)
