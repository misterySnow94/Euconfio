package remington.euconfio.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logs")
@Slf4j
public class LogRestController {

    @GetMapping("/saludo")
    public ResponseEntity<String> hello(){
        log.info("Ingreso en la funcion hello() de restController logRestcontroller");
        log.debug("esto es un log de debug");
        log.warn("esto es un log de warn");
        log.error("esto es un log de error");
        return new ResponseEntity<String>("hola",HttpStatus.OK);
    }

}
