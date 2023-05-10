
// import java.io.IOException;
// import java.nio.file.FileAlreadyExistsException;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;

// public class Crud { //create file

//     public static void main(String[] args) throws IOException {

//         Path path = Paths.get("src/main/resources/myfile.txt");

//         try {
//             Files.createFile(path);
            
//         } catch (FileAlreadyExistsException ex) {
            
//             System.err.println("File is already existing");
//         }
//     }
// }

// import java.io.IOException;
// import java.nio.charset.StandardCharsets;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.List;

// public class Crud {//read

//     public static void main(String[] args) throws IOException {
        
//         Path myPath = Paths.get("src/resources/sample.txt");
        
//         List<String> lines = Files.readAllLines(myPath, StandardCharsets.UTF_8);
        
//         lines.forEach(line -> System.out.println(line));
//     }
// }

// import java.io.IOException;
// import java.nio.charset.StandardCharsets;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.nio.file.StandardOpenOption;
// import java.util.ArrayList;
// import java.util.List;

// public class Crud { //write

//     public static void main(String[] args) throws IOException {
        
//         Path myPath = Paths.get("src/resources/sample.txt");
        
//         List<String> lines = new ArrayList<>();
//         lines.add("mango");
//         lines.add("apple");
//         lines.add("banana");
//         lines.add("watermelon");
//         lines.add("orange");
        
//         Files.write(myPath, lines, StandardCharsets.UTF_8, 
//                 StandardOpenOption.CREATE);
        
//         System.out.println("Data written to a file");
//     }
// }

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Crud {

    public static void main(String[] args) throws IOException {
        
        Path myPath = Paths.get("src/resources/sample.txt");
        
        boolean fileDeleted = Files.deleteIfExists(myPath);
        
        if (fileDeleted) {
            
            System.out.println("File has been deleted");
        } else {
            
            System.out.println("File is not existing");
        }
    }
}