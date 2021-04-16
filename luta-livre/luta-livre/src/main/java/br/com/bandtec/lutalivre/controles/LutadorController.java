package br.com.bandtec.lutalivre.controles;

import br.com.bandtec.lutalivre.classe.Lutador;
import br.com.bandtec.lutalivre.repositorios.LutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;


    @GetMapping
    public ResponseEntity getLutador(){
        List<Lutador> lutador=repository.findAll();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(lutador);
    }

    @PostMapping
    public ResponseEntity postLutador(@RequestBody @Valid Lutador novoLutador){
        repository.save(novoLutador);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


    @GetMapping("/contagem-vivos")
    public ResponseEntity getVivo(){
        List<Lutador> lutador=repository.findByVivoTrue();
        Integer cont=0;
        for (Lutador luts : lutador){
            cont++;
        }
        return ResponseEntity.status(201).body(cont);
    }


    @GetMapping("/mortos")
    public ResponseEntity postConcentrar(@PathVariable int id){
        List<Lutador> lutador=repository.findByVivoTrue();
        Integer cont=0;
        for (Lutador luts : lutador){
            cont++;
        }
        return ResponseEntity.status(201).body(cont);

    }

    
}
