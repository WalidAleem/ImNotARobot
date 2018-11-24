# ImNotARobot
I’m Not A robot is a character recognition Quiz App that has been built for Udacity Google Android Basics Scholarship
during the period of Nov. 2017 – Feb. 2018. The project was one of three required projects to finish the scholarship
## Quick Overview 
The goal is to create an educational app that quizzes the users about any certain topics.
This App is indented to measure the user’s ability to memorize and recognize characters.
The user will be asked to click where “please click here to reveal who I’m” is shown in the big squared button.
By clicking, the big button will be gone and distorted letter will be revealed then, the user should focus to recognize the letter
and choose the correct answer from four radio buttons beneath the letter.
As the users is going further to next pages, a hint message will be shown in a rounded corners rectangle 
at the upper section of the page to help the user figuring out the correct answer.
## Structure of the App
-	At this stage of the scholarship , a multi screen app wasn’t included. All the required projects were a single screen app. 
- A solution to display multi screen pages is to use ScrollView. 
- I have built this App as a multi screen app using “Visibility” Attribute to enable the user easily move between pages and resume the quiz if needed
- The quiz consists of 6 pages distributed as follows:
  - From page 1 to page 5 there are 5 distorted character needed to be recognized and a word image that is a background of 
  the big button in each page.
  - Page no. 6, question no. 6 is to measure memorization ability as it asks the user to check the correct pages'
  number that shows words (partially shown in background of the big button) 
  that is synonym to the correct word that the user composed from selecting letters from previous pages.
  - Page no. 6, Question no.7 has an EditText View, asking the user to input the correct word and to submit the result to user’s email
  , a toast message will appear to display the final score.
  
## How it works?
I have used a nested view to reduce complexity of the layout with a RelativeLayout as root view and nested both RelativeLayout
and LineraLayout. An xml comments have been made to separate each page started the xml order from page 6 to end up with page 1.
clicking next button on each page will hide the current page and will reveal the next one. 
Clicking resume button on last page will hide the last page and reveal the first one.

## The App Users
The app is intended to be used by kids to train them to develop their memory and recognition ability.
The project is in an initial phase, it could be developed to contains thousands of characters, figures, images …etc. to be used in
schools, colleges, work ..etc for purpose of developing the human ability to memorize , observe and recognize.

## Contribution
Everyone is welcomed to contribute. pls. feel free to Fork the project and ask for pull request.

