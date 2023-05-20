# Content 
       -> Basic Web Architecture
       -> What is HTML?
       -> What is CSS?
       -> What is JavaScript?
       -> Mini Website 

# Web Architecture is made up of three essential elements:
       -> Website
       -> Server 
       -> IP Address 

# Website
        -> The Flow of website starts loading HTML=>CSS=>JavaScript.
        -> User intract with website and is not concerned with the backend of a web application..!

# Server
        -> Once Website was developed then need to host on a server to make it accessable on the internet..!
        -> Server, along with the database contains data of a website and facilities user interaction.

# IP Address
        -> Website is hosted on an IP address.
        -> We put a domain name over that IP address, the same way we put names over people's phone numbers...!

# HTML
        -> HTML is the most widely used language for developing web pages.
        -> It defines the structure of websites and fromats web pages.

# CSS
        -> CSS is a simple design language used to design an webpage and make it look good and presentable.
        -> It can be attached to any HTML elements and style it of even position it according to developer's Choice.
    
# JavaScript 
        -> It is a powerful interpreted language targeted for web development.
        -> It is used for making web pages interactive and bring the web application to the life.

# HTML - HyperText MarkUp Language 
        -> Uses defined tags which are used to develop webpages or a document that can be developed in order to design a website.
        -> It can be development as a structured format that can be initiated inorder to make an documentation process that can be used to deliver an content.
        -> Provide details by an webpages is an job done by html in a structural format.
        -> An skeleton of an webpage for the given design.

# CSS - Cascading Style Sheets
        -> Here the webpage has been developed that uses css to deliver an web content in a great way of representations.

        1. Develop and deliver the content in a best format.
        2. Provides layout and Positioning the representation of content.
        3. Colors and Background for the webpage.
        4. Responsive Design to provide inbuild repsonse.
        5. Animations and Transitions.
        6. Selectors and Specificity.
        7. Responsive Typography.
        8. Flexbox and GridLayout.
        9. Transformation.
        10. Print Style.

# CSS Selectors
        CSS Selectors is used to select individual elements in HTML. They are part of the CSS rule set. CSS selectors select HTML elements according to its id, class, type, attribute ...etc..!
        Types of Selectors:
              -> CSS Elements Selector (Based on the element name select elements of HTML by name or tag name).
              -> CSS ID Selector (Based on the ID select elements of HTML tags uses #name).
              -> CSS Class Selector (Providing class with a name represent as .ClassName).
              -> CSS Universal Selector (Used to Select all the elements of the elements of style sheet uses * operator).
              -> CSS Group Selector (Multiple element usage uses comma(',') as an operator).
        As these operations are done in above Selector.html file.

# CSS Box Model 
        -> CSS box model is a container which contains multiple properties including border, margin, padding and the content itself.
        -> In HTML all the elements can be consider as a box.
        -> Which make height width of an element correctly.

        top margin 
            top border
                top padding 
                    content
        
        Each has consist of 4 based on side which are right, left, top and bottom...!

        As it represent form crust to core order of making pattern of Whole Webpage....!

        -> The content area consist of images,text or someother content.
        -> Border area is an area between boxes the padding and margin.
        -> Margin area consist of the space between margin and border.
        -> The padding area is the space around the content area and within the border box.

        Above file BoxModel.html is provide an practical example of BoxModel...!

# Grid Layout 
        -> A grid is a set of intersecting horizontal and vertical lines defining rows and columns placed onto a layout said to be grid layout...!
        -> CSS Grid Layout is most popular two dimensional grid system to CSS, Grids can be used to layout major page areas or small user interface elements...!
        
        Simply it is like a table structure that can used to track and guide areas to manage items as grid items..!
        Items places in the grid area which is regulated properly....!

        Features:
            -> Fixed and Flexible track size.
            -> Item placement.
            -> Creation of additional tracks to hold content.
            -> Control of overlapping content.
        
        Basic Terms:
            -> Dividing line to make a structure.
            -> Either vertical or horizontal.
            -> Grid row is the horizontal.
            -> Grid cell a single unit of CSS grid.
            -> Gutter is the space between rows and columns in a grid.
        
        Above GridLayout.html is an example for grid layout...!

# CSS FlexBox 
        -> Allow us to easily format HTML that can create flexible responsive strcture without using float or positioning...!
        -> We can easily create layouts for complex application and web pages using flexbox.

        -> The ability ti akter item width and height to best fit in its containers available in free space.
        -> Flexbox is direction-agnostic(depends on model).
        -> most effective small scale layout.

        Above FlexBox.html is an example for it...!

# CSS Display
        -> Display is an property to change or switch the container property of the webpage towards the different types as we learn some in above.
        -> As default display is in block.
        Lets Move to example display.html file...!

# CSS Positioning
  Some properties of CSS Positioning
        -> CSS Position Property.
        -> CSS Static Position.
        -> CSS Fixed Position.
        -> CSS Relative Position.
        -> CSS Absolute Position.

        CSS Position property is used to determine how an element positioned on a webpage. The top, right, bottom and left properties determine the final location oppositioned elements.

    CSS Static Position:
            The Position of the HTML elements is static by default. The position is set according to normal flow of the page. It is not affected by top, bottom, left and right properties.
    CSS Fixed Position:
            The Fixed positioning property positions the element relative to the screen's viewport and stays fixed on the screen when scrolling.
    CSS Relative Position:
            The relative positioning position the element relative to where its normal position would have been.
    CSS Absolute Position:
            The absolute value position the element absolutely relative to its container. With absolute positioning, you can place an element anywhere on a page.
    Above file Positioning.html explain the properties...!

# CSS Grid vs CSS Flexbox

CSS Grid Layout    -> is a 2D grid based layout system with rows and columns.
CSS FlexBox Layout -> is 1D layout is useful in allocating and aligning the space among items in a grid container.

CSS Grid Layout    -> More Complex and organized layouts.
CSS FlexBox Layout -> Easier design and build responsive web pages without using a lot of float and position properites..!

CSS Grid Layout    -> display grid;
CSS FlexBox Layout    -> display flex;

Grid Layout Consist of    -> Header, Menu, Main, Right, Footer (rows and columns).
Flexbox Layout Consist of -> 1, 2, 3, 4....n!

An example comparision in file GridVSFlexBox.html file.