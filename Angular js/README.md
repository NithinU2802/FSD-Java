# Angular JS 

       Topics:
           - Why Angular js..?
           - What is Angular..?
           - Features of Angular
           - Angular Architecture
           - Advantages 
           - Limitations
           - Angular Learning Curve


# Why Angular...?
        Normally JavaScript used for developing web pages towards side of intraction. As people looking for
the website which is reliable and easy to use also suited for developing modern web applications.
        Here is the question Arise...! is the javascript used to develop single page application..? 
Definitely not. As move to the frameworks of javascript design to helps as such things.
        "Angular and JavaScript bring structure and consistency to web application development, and provides 
scalability and maintainability.


# What is Angular..?
        - Angular is an Open Source, JavaScript framework.
        - It is completely written in TypeScript.
        - Primarily aimed to develop single page applications.
        - It uses HTML's syntax to express yout applications's components clearly.
        - Maintained by Google.
        - It is designed for web, desktop and mobile platform.
" Single page application means develop an webpage that continously develop and deliver the content of the 
page instead of loading whole page as a part."


# Features of Angular..?

        Document Object Model(DOM) - treats an XML or HTML document as a tree structure in which each node is 
an object representing a part of the document.
        "Angular uses regular DOM. This will update the entire tree structure of HTML tags until it reaches the 
data to be updated. Consider about 100s of updates on the same HTML pages and the HTML block is replaced for 
each request...!"

        TypeScript - Angular is written in TypeScript. It is superset of JavaScript and offers excelent consistency.
        "TypeScript is installed as an NPM package, and thus can be installed with the following commands
        --- npm install -g typescript --- "
        
        Data Binding - Data Binding allows an internet user to manipulate web page elements using web browser.
It is used for webpages that contain interactive componets such as form calculators, tutorials and games.
        " WebPage <--> Server  -  Two way DataBinding in order to deliver contigious update on webpage"

        Testing - Angular uses Jasmine to run various tests. The Jasmine framework allows various 
functionalities to write different kinds of tests cases. Karma is the task-runner for the tests.


# Architecture of Angular

        Angular is a full-fledged MVC framework 
    MVC is an architectural pattern that separates the applications layer into Model, View and Controller.

         VIEW <---> CONTROLLLER <---> MODEL


# Advantages of Angular 

        - Custom Components.
        - Data Binding ( move data to js to view and react the code).
        - Dependency Injection.
        - Testing.
        - Comprehensive.
        - Browser Compatibility.


# Versions of Angular JS 

    Angular 1 -> Built  on JavaScript and completely based on controllers.
    Angular 2 -> Incorporated the component based Approach.
    " Angular 3 was distributed Miss-Aligned packages so skipped and release faster V4"
    Angular 4 -> Included router Updation, Angular CLI 1.0 was introduced.
    Angular 5,6 -> Angular CLI was optimized and the commands ng-update and ng-add were added.
    Angular 7   -> Promts were introduced which provides tips in CLI about the functions.
    Angular 8   -> Ivy renderer and Bazel were introduced.
    Angular 9   -> Come with better framework and angular material included full switch to the Ivy render(default Compiler).


# Limitations of Angular
    
    - Steep learning curve.
    - Limited SEO options.
    - Verbose and complex.
    - Migration.


# Angular Learning Curve

    Basic topics in Angular to be learnt are 
        - Directives.
        - Modules.
        - Decorators.
        - Components.
        - Services.
        - Dependency injection.
        - Pipes and Templates.

    Advanced topics include:
        - Change detection.
        - Zones.
        - AoT Compilation.
        - Rx.js

    However, the learning curve is clear-cut with Angular development.

Companies Used as referred - Nike, Google, Forbes, UpWork, HBO, Sony, General Motors..Etc..


# Angular Prerequisites

    Node js - Angular uses Node.js as it base for a large part of its build environment. As we need node js to execute 
the Application of Angular JS.
    Angular CLI - Angular team has created a command-line interface tool to make it easier to bootstrap and 
develop Angular applications.

            In the Command prompt
                Installation:
                    npm install -g @angular/cli
                Conformation
                    ng --version

    Test Editor - Recommanded to use Visual Studio for working with Angular Projects...!

" After learning the components and further prcess now move to futher topics "


# Further Learnings.

    - What is Dependency Injection..?
    - Demerit of Not Using DI..?
    - DI as Design Pattern.
    - Demo working.


# What is Dependency Injection...?

    Consider a webpage, which was created by number of components. All these components performing common tasks 
like accessing the database, rendering images on the view, etc...!
    which was an amazing concept as mention below some this good to see..!
        - To avoid rewriting of code, Angular Services can be used.
        - These Services can then be injected into the components that requires that services.

    Dependency Injection or DI keeps the code flexible, testable and mutable.
    Classes can inherit external logic without knowing how to create it.
    DI is benefits directives, pipes and components.


# Demerit of Not Using DI 

    Consider a PostalDetails class that is depenent on the Number and the Address class.
    
    Where Number and the Address has constuctor and PostalDetails to access the constructor.
    - Now if the constuctor Number and the Address gets parameterized then we meet an problem to access the 
Number and Address class.
    - Also the code is not suitable for testing..!
    

# DI as a Design Pattern

    As the same example instead of creating two different class make a design to access the elements of the 
classes by the PostalDetails itself.


    Normally, Components are used to ensure a good user experience.
    - Inorder to execute task, using Services is ideal.
    - A Component can delegate task like fetching data from the server, validating user input, or logging 
directly to the console to the service.
    - These task cab be made avaukabke to any component in the app.
