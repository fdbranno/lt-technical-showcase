# Photo Album
Simple console application that displays photo ids and titles in an album. The photos are pulled from an online web servive (https://jsonplaceholder.typicode.com/photos).

## Prerequisites
- Maven 3+
- Java 1.8+

## Building
The application and its dependencies are managed by Maven. Maven is required to build and package the application as a jar.
    
    mvn package

## Running
Once packaged as an executable jar, the application can be run. The jar will be stored in the target folder.
The application accepts an integer for the Id of the album to view.

    cd target
    java -jar photo-album-1.0-SNAPSHOT.jar [albumId]
    
## Example
    > mvn package
    [INFO] Scanning for projects...
    [INFO]
    [INFO] -------------------------< com.lt:photo-album >-------------------------
    [INFO] Building photo-album 1.0-SNAPSHOT
    [INFO] --------------------------------[ jar ]---------------------------------
    ...
    > cd target
    > java -jar photo-album-1.0-SNAPSHOT.jar 1
    [1] accusamus beatae ad facilis cum similique qui sunt
    [2] reprehenderit est deserunt velit ipsam
    [3] officia porro iure quia iusto qui ipsa ut modi
    ...
    > java -jar photo-album-1.0-SNAPSHOT.jar 27
    [1301] natus maxime neque explicabo
    [1302] sit iste expedita quae ut sapiente
    [1303] officiis voluptates nihil illo aut rerum blanditiis est
    ...