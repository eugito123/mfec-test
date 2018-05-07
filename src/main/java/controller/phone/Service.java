
package controller.phone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service{
    @RequestMapping("/json")

    String[] test() throws IOException{
      
BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Older\\Desktop\\demok\\log\\promotion1.log"));
String str;

List<String> list = new ArrayList();
while((str = in.readLine()) != null){

  for (String x : str.split("\\|")) {        
          list.add(x);          
        }
   
}
String[] stringArr = list.toArray(new String[0]);

       
return stringArr ;
}



}

