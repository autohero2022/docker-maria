package com.example.autoheroback.achat;


import com.example.autoheroback.mail.EmailSender;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AchatService {
    private final AchatRepository achatRepository;
    private final EmailSender emailSender;

    public Achat create(Achat achat){
        return achatRepository.save(achat);
    }

    public List<Achat> getAllAchat(){
        return achatRepository.findAll();
    }

    public String SaveAndSendMail(Achat achat){
        this.create(achat);
        emailSender.send(
                achat.getEmail1(),
                buildEmail(achat.getPrenom(), achat.getNom(), achat.getMarque(),
                        achat.getMotorisation(), achat.getPrix(),
                        achat.getVille(), achat.getNomvoie(), achat.getNumerovoie(),
                        achat.getTelephone() )
        );
        emailSender.send(
                achat.getEmail2(),
                buildEmail(achat.getPrenom(), achat.getNom(), achat.getMarque(),
                        achat.getMotorisation(), achat.getPrix(),
                        achat.getVille(), achat.getNomvoie(), achat.getNumerovoie(),
                        achat.getTelephone() )
        );
        return "OK";
    }

  private String buildEmail(String prenom, String nom, String marque, String motorisation, String prix, String ville, String nomvoie, String numerovoie ,String telephone ) {
        return "<div style=\"font-family:Helvetica,Arial,sans-serif;font-size:16px;margin:0;color:#f37121\">\n" +
                "\n" +
                "<span style=\"display:none;font-size:1px;color:#fff;max-height:0\"></span>\n" +
                "\n" +
                "  <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;min-width:100%;width:100%!important\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n" +
                "    <tbody><tr>\n" +
                "      <td width=\"100%\" height=\"53\" bgcolor=\"#f37121\">\n" +
                "        \n" +
                "        <table role=\"presentation\" width=\"100%\" style=\"border-collapse:collapse;max-width:580px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\">\n" +
                "          <tbody><tr>\n" +
                "            <td width=\"70\" bgcolor=\"#f37121\" valign=\"middle\">\n" +
                "                <table role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n" +
                "                  <tbody><tr>\n" +
                "                    <td style=\"padding-left:10px\">\n" +
                "                  \n" +
                "                    </td>\n" +
                "                    <td style=\"font-size:28px;line-height:1.315789474;Margin-top:4px;padding-left:10px\">\n" +
                "                      <span style=\"font-family:Helvetica,Arial,sans-serif;font-weight:700;color:#ffffff;text-decoration:none;vertical-align:top;display:inline-block\">AUTOHERO - FACTURE PROVISOIRE</span>\n" +
                "                    </td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "              </a>\n" +
                "            </td>\n" +
                "          </tr>\n" +
                "        </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n" +
                "    <tbody><tr>\n" +
                "      <td width=\"10\" height=\"10\" valign=\"middle\"></td>\n" +
                "      <td>\n" +
                "        \n" +
                "                <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse\">\n" +
                "                  <tbody><tr>\n" +
                "                    <td bgcolor=\"#1D70B8\" width=\"100%\" height=\"10\"></td>\n" +
                "                  </tr>\n" +
                "                </tbody></table>\n" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\" height=\"10\"></td>\n" +
                "    </tr>\n" +
                "  </tbody></table>\n" +
                "\n" +
                "\n" +
                "\n" +
                "  <table role=\"presentation\" class=\"m_-6186904992287805515content\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse;max-width:580px;width:100%!important\" width=\"100%\">\n" +
                "    <tbody><tr>\n" +
                "      <td height=\"10\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "      <td style=\"font-family:Helvetica,Arial,sans-serif;font-size:19px;line-height:1.315789474;max-width:560px\">\n" +
                "        \n" +
                "            <p style=\"Margin:0 0 20px 0;font-size:16px;line-height:25px;color:#0b0c0c\">Bonjour " + prenom + " ,</p><p style=\"Margin:0 0 20px 0;font-size:16px;line-height:23px;color:#0b0c0c\"> Vous avez fait un choix magnifique. Maintenant, veuillez confirmez votre achat en validant un acompte de 50% du prix initial de votre véhicule aux coordonnées bancaires AUTOHERO SAS (IBAN: FR76 16598 00001 22994100001 74)  </p><blockquote style=\"Margin:0 0 20px 0;border-left:10px solid #b1b4b6;padding:15px 0 0.1px 5px;font-size:16px;line-height:20px\"><p style=\"Margin:0 0 20px 0;font-size:16px;line-height:25px;color:#0b0c0c\">Adressé à : "+nom+" "+prenom+"</p></blockquote>\n" +
                "</blockquote>\n  <p style=\"font-size:16px;color:#0b0c0c;\">Véhicule : "+ marque +" "+ motorisation +" </p>" +
                "</blockquote>\n  <p style=\"font-size:16px;color:#0b0c0c;\">Prix : "+ prix +" €</p>" +
                "</blockquote>\n  <p style=\"font-size:16px;color:#0b0c0c;\">Adresse : "+ numerovoie +" "+ nomvoie +" "+ ville +"</p>" +
                "</blockquote>\n  <p style=\"font-size:16px;color:#0b0c0c;\">Téléphone : "+ telephone +"</p>" +
                "</blockquote>\n  <p style=\"font-size:16px;\">NB: Pour des raisons administratives, n’oubliez pas  de nous envoyer une preuve de virement (attestation de virement ou capture d’écran). Un conseiller client vous contactera par la suite pour vérification.</p>" +
                "</blockquote>\n  <p style=\"font-size:16px;\">AUTOHERO vous remercie !</p>" +
                "</blockquote>\n  <p style=\"font-size:12px;text-align:center;color:#0b0c0c;\">AUTOHERO FRANCE SAS\n" +
                "Société immatriculée au registre du commerce de Nanterre sous le numéro 851 691 865\n" +
                "21 boulevard Gambetta - 92130 Issy-les-Moulineaux</p>" +
                "        \n" +
                "      </td>\n" +
                "      <td width=\"10\" valign=\"middle\"><br></td>\n" +
                "    </tr>\n" +
                "    <tr>\n" +
                "      <td height=\"10\"><br></td>\n" +
                "    </tr>\n" +
                "  </tbody></table><div class=\"yj6qo\"></div><div class=\"adL\">\n" +
                "\n" +
                "</div></div>";
    }

}
