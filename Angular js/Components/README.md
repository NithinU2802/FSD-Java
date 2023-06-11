# Creating Angular Components
    
    Command used to create component - " ng g c component-name "
        Once the above command is executed a folder with component name 4 different files are created.
            - Component-name.component.css
            - Component-name.component.html
            - Component-name.component.ts
            - Component-name.component.spec.ts
        Here it will create three file also update the src/app/app.module.ts indicate that new component 
    has been created.

    - html file to load the code that what action need to be perform.
    - css for styling the component.
    - .ts file to component decorator.
    - spec.ts for unit testing file.
    
    Further move th app.module.ts we can see that our component has been imported.

    Let Me Explain that what the magic I saw...! It describe really well and good that how we can create an 
component that act as our html tag. Everything here is created integrated one.. We need to know how to handle 
and ready to provide commands for the suitable application.


# Task 1 

    Here I created an component using the command and make changes on component's html and css file the copy 
the name which was in commponent's spec.ts file that holds selectors by the name I have learn that how to 
access the component easily...!


# Task 2 

    HereBy, Now creating a component to add image on the project..! that has been implemented in the same way
and make changes in html css and futher copy selector and use in the app main component. Which work as the 
html tag that represent the actual working of the component available in the code...!


# Component MetaData 

    As Component MetaData accept some metadata objects that provides information about the component.
        - Selector (css selector to find the component available in the template).
        - We can Also change the name of the component as per or understanding that can be used in our code.