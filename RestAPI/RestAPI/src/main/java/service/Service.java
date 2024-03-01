package service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
public class Service {
    public String preverTempo() {
        String dadosMeteoologicos = "";
        //podemos colocar a api só do brasil
        String apiUrl = "http://apiadvisor.climatempo.com.br/api/v1/anl/synoptic/locale/BR?token=938022de60b2ebfbb0e6823ee7143751";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if(responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println("Codigo de status: " + responseEntity.getStatusCode());
            dadosMeteoologicos = responseEntity.getBody();
        } else {
            dadosMeteoologicos = "Falhas ao obter dados meteorologicos. Codigo de status: " + responseEntity.getStatusCode();
        }
        return dadosMeteoologicos;

        }

    }


