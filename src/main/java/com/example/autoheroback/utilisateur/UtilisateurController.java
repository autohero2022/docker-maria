package com.example.autoheroback.utilisateur;


import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
@RequestMapping(path ="api/v1/utilisateur")
@CrossOrigin(origins = "*")
@AllArgsConstructor

public class UtilisateurController {

    private final UtilisateurService utilisateurService;
    private final Logger log = LoggerFactory.getLogger(UtilisateurController.class);



    @PostMapping(path = "/register",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> register(@RequestBody UtilisateurRequest request)
    {

        Optional<Utilisateur> user = utilisateurService.getUtilisateur(request.getEmail());

        if(user.equals(request.getEmail())){

            return new ResponseEntity(HttpStatus.FORBIDDEN);
         //   return new ResponseEntity<Object>(request, HttpStatus.BAD_REQUEST);
        }
        String token = utilisateurService.register(request);

        return new ResponseEntity(HttpStatus.CREATED);

     //   return new ResponseEntity<Object>(token, HttpStatus.CREATED);
    }



    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return utilisateurService.confirmToken(token);
    }


    @PostMapping(path = "connexion")
    public int connexion(@RequestBody UtilisateurRequest request) {
        return utilisateurService.connectUtilisateur(request);
    }

    @PostMapping(path = "disconnexion")
    public int disconnexion(@RequestBody UtilisateurRequest request) {
        return utilisateurService.disconnectUtilisateur(request);
    }

    @PostMapping(path = "login")
    public ResponseEntity<?> login(@RequestParam("email") String email) {

        log.info("Email : {}", email);

        Optional<Utilisateur> optionalUtilisateur = utilisateurService.login(email);

        if(optionalUtilisateur.isPresent()){
            Utilisateur utilisateur = optionalUtilisateur.get();

            if (utilisateur.getActif()) {

                utilisateur.setConnected(true);
                utilisateurService.save(utilisateur);

                log.info("Utilisateur modifié : {}", utilisateur);


                return ResponseEntity.ok().body(utilisateur);
            }

            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}
