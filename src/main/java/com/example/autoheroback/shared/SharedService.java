package com.example.autoheroback.shared;


import com.example.autoheroback.shared.token.ConfirmationToken;
import com.example.autoheroback.shared.token.ConfirmationTokenService;
import com.example.autoheroback.utilisateur.UtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class SharedService {

    private final UtilisateurService utilisateurService;
    private final ConfirmationTokenService confirmationTokenService;


    @Transactional
    public String confirmToken(String token) {
        ConfirmationToken confirmationToken = confirmationTokenService
                .getToken(token)
                .orElseThrow(() ->
                        new IllegalStateException("token not found"));

        if (confirmationToken.getConfirmedAt() != null) {
            throw new IllegalStateException("email already confirmed");
        }

        LocalDateTime expiredAt = confirmationToken.getExpiresAt();

        if (expiredAt.isBefore(LocalDateTime.now())) {
            throw new IllegalStateException("token expired");
        }

        confirmationTokenService.setConfirmedAt(token);

       utilisateurService.activeUtilisateur(
                confirmationToken.getUtilisateur().getEmail());

        return "confirmed";
    }
}
