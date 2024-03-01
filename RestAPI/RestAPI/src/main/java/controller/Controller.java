package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Service;

@RestController
public class Controller {
    Service service = new Service();
    //Exemplo de endpoint usando Spring Boot
    @GetMapping("/clima")
    public String preverTempo(){
        return service.preverTempo();
    }
}
