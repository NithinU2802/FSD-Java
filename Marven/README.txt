                    Maven is used to develope java-based project which is implemented by various dependencies in order to
    regulate the functionality of the project. This is nothing but a class of files developed by developers who need to know that some 
    sort of methods or class need to be used by every developers. Inorder to make work or every developer easier Maven was
    introduced...

    #simplify the work of day to day life of the developers..

    Maven helps in getting the right JAR files for each project as there may have different versions of 
    seperate packages..!

    To download dependencies it is no more need to visit the official website of each software. It could now be easily
    done now be visiting "mvnrepository.com".

    - Maven is an popular open-source build tool developed by Apache Group to build and publish and deploy several projects at one.
    - Maven is written java and is used to build project written in c#, Scala, Ruby... Etc..!

    # Maven is based on Project Object Model and focuses of simplification and standardization of the building process.

    Operations of Maven:
              - Builds
              - dependencies
              - Reports
              - Distribution
              - Release
              - Mailing list

    Maven Repository:
              Maven Repository refers to jar files contains directories of packaged that contain metadata. The metadata 
    refers to the POM files relevant to each project. This metadata is what allows Maven to download dependencies.

    There are three types of repositories:
              - Local Repository  (Developer local machine)
              - Remote Repository (local web server machine)
              - Central Repository (central or global refers maven community repoes)

    Basic Concepts of Maven:
              - POM Project Object Model refers to XML files that have all the information regarding project and configuration details.
              - It has the description of the project regarding the versioning and configuration management of the project.
              - The XML files is the project home director Maven Searches for the POM in the current directory when any task is to executed.
    
    dependencies and repositories:
              - dependencies refer to the java libraries that are need fir the project. 
              - Repositories refers to the directories of packaged JAR files.
              - If the dependencies are not present in your local repository, then Maven downloads them from a central repository
              and stores them in the local repository.
              - Build profiles used to proceed the operation of the project used different configuration.
              - Build Plugins - make developer to reach their goal as per the given project dependencies available in the machine..


    Architecture:

    Marven -----> POM files ----> Maven Repository
                  dependencies
                  Plugins
                  lifecycle and goal
                  Build Profile 

    How to work..?
                  - Read pom.xml file.
                  - Download dependencies defined in pom.xml into local repository from central repository.
                  - Create and generate a report according to the requirements, and execute lifecycles, phases, goals, Plugins.. Etc..

    LifeCycle of Maven:
                  Maven life cycle is a collections of steos that are to be followed to build a project.
                  There are three built in build life cycles:
                            - Default: handles project deployment.
                            - clean: handles project cleaning.
                            - Site: handles the creation of project sites's documentation.

    Phases or stages:
                 Compiler -> Test-Compile -> Test -> Package -> Integration-test -> Verify -> Install -> Deploy

    Advantages:
           - Apache Maven helps manage all the processes such as building documentation, releasing and distribution in project 
           mangement.
           - The tool simplifies the process of project building. It increases the performance of project and the building process.
           - The task of downloading JAR files and other dependencies is done automatically..
           - Easy to access and make developer to not to worried about enviroment..
           - In Maven, it is easy to add new dependencies, you must write the dependencies code in the pom file.