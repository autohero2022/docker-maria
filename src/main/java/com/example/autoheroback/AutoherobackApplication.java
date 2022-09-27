package com.example.autoheroback;

import com.example.autoheroback.autres.Autres;
import com.example.autoheroback.autres.AutresRepository;
import com.example.autoheroback.confort.Confort;
import com.example.autoheroback.confort.ConfortRepository;
import com.example.autoheroback.diaporama.Diaporama;
import com.example.autoheroback.diaporama.DiaporamaRepository;
import com.example.autoheroback.eclairage.Eclairage;
import com.example.autoheroback.eclairage.EclairageRepository;
import com.example.autoheroback.multimedia.Multimedia;
import com.example.autoheroback.multimedia.MultimediaRepository;
import com.example.autoheroback.pointsforts.Pointsforts;
import com.example.autoheroback.pointsforts.pointsfortsRepository;
import com.example.autoheroback.secu.Secu;
import com.example.autoheroback.secu.SecuRepository;
import com.example.autoheroback.voiture.Voiture;
import com.example.autoheroback.voiture.VoitureRepository;
import com.example.autoheroback.voiture.Voituredescription;
import com.example.autoheroback.voiture.VoituredescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoherobackApplication implements CommandLineRunner {

	@Autowired
	VoitureRepository ob;
	@Autowired
	VoituredescriptionRepository voituredescriptionRepository;
	@Autowired
	AutresRepository autresRepository;
	@Autowired
	ConfortRepository confortRepository;
	@Autowired
	DiaporamaRepository diaporamaRepository;
	@Autowired
	EclairageRepository eclairageRepository;
	@Autowired
	MultimediaRepository multimediaRepository;
	@Autowired
	pointsfortsRepository pointsfortsRepository;
	@Autowired
	SecuRepository secuRepository;


	public static void main(String[] args) {
		SpringApplication.run(AutoherobackApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception
	{
		// Inserting the data in the mysql table.
		Voiture un = new Voiture("Peugeot 208","1.2 PureTech GT Line","Essence",
				"2016", "15200 km", "12800", "Manuelle",
				"/assets/img/voitures/peugeot208/peugeot208face.jpg");

		Voiture deux = new Voiture("Peugeot 208","1.2 PureTech GT Line EAT6","Essence",
				"2017", "9500 km", "15500", "Automatique",
				"/assets/img/voitures/peugeot208-2/peugeot208-2face.jpg");

		Voiture trois = new Voiture("Renault Clio","1.3 TCe Initiale Paris","Essence",
				"2020", "20000 km", "16700", "Duplex",
				"/assets/img/voitures/renaultclio/renaultclioface.jpg");

		Voiture quatre = new Voiture("Renault Captur","1.6 E-Tech Plug-in Intens EDC","Hybride",
				"2020", "5964 km", "21900", "Automatique",
				"/assets/img/voitures/renaultcapture/renaultcaptureface.jpg");

		Voiture cinq = new Voiture("Toyota Yaris","1.5 Hybrid Dynamic","Hybride",
				"2019", "17322 km", "15090", "Automatique",
				"/assets/img/voitures/toyotayaris/toyotayarisface.jpg");

		Voiture six = new Voiture("Renault Mégane","1.3 TCe Intens","Essence",
				"2019", "35000 km", "16200", "Double embrayage/DCT",
				"/assets/img/voitures/renaultmegane/renaultmeganeface.jpg");

		Voiture sept = new Voiture("Peugeot 3008","1.5 Blue-HDi Allure EAT8","Diesel",
				"2019", "31111 km", "22000", "Automatique",
				"/assets/img/voitures/peugeot3008/peugeot3008face.jpg");

		Voiture huit = new Voiture("Dacia Duster II","1.5 dCi Prestige 4x2","Diesel",
				"2018", "52008 km", "13450", "Manuelle",
				"/assets/img/voitures/daciadusterII/daciadusterIIface.jpg");

		Voiture neuf = new Voiture("Fiat 500","1.2 Lounge","Essence",
				"2016", "64600 km", "7700", "Manuelle",
				"/assets/img/voitures/fiat500/fiat500face.jpg");

		Voiture dix = new Voiture("Mercedes CLA","200 d Sensation 7G-DCT","Diesel",
				"2016", "75654 km", "21300", "Duplex",
				"/assets/img/voitures/mercedescla/mercedesclaface.jpg");



		// ob.save() method
		ob.save(un);
		ob.save(deux);
		ob.save(trois);
		ob.save(quatre);
		ob.save(cinq);
		ob.save(six);
		ob.save(sept);
		ob.save(huit);
		ob.save(neuf);
		ob.save(dix);

		/* 1 */

		Voituredescription desc1 = new Voituredescription(1,"Peugeot 208","1.2 PureTech GT Line", "12800","15200km","Essence","Manuelle", "04.2016", "110 CV / 81 kW",
				"1", "Berline", "3",
				"5", "Gris", "Mi-cuir (Sellerie d'origine)", "Eté",
				true, "1199", "EURO 6",
				"99 g/km", "FRANCE", "2", "Non",
				"15.03.2022", "TVA non récupérable", "08.2024", "SX14513");

		Pointsforts pf1 = new Pointsforts(1, "Jantes 17 pouces", "Radars de stationnement arrière", "Toit vitré/panoramique",
				"Jantes Alu bi-ton", "Limiteur de vitesse");

		Confort confort1 =   new Confort(1, "Accoudoir central", "Sièges arrière rabattables", "Vitres électriques avant", "", "");

		Multimedia multimedia1 = new Multimedia(1, "Ecran tactile", "Interface MP3 / USB / Ipod", "Système Audio/Radio", "Volant multifonction","Lecteur CD");

		Eclairage eclairage1 = new Eclairage(1, "Allumage automatique des phares", "Essuie-glaces automatiques", "Feux anti-brouillard avant", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu1 = new Secu(1, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres1 =new Autres(1, "Boîte manuelle 5 vitesses", "Mode éco", "", "", "");

		Diaporama d1 = new Diaporama(1, "/assets/img/voituresdescriptions/peugeot208/1.jpg", "/assets/img/voituresdescriptions/peugeot208/2.jpg",
				 "/assets/img/voituresdescriptions/peugeot208/3.jpg", "/assets/img/voituresdescriptions/peugeot208/4.jpg", "/assets/img/voituresdescriptions/peugeot208/5.jpg"
						 , "/assets/img/voituresdescriptions/peugeot208/6.jpg", "/assets/img/voituresdescriptions/peugeot208/7.jpg", "/assets/img/voituresdescriptions/peugeot208/8.jpg"
						 , "/assets/img/voituresdescriptions/peugeot208/9.jpg", "/assets/img/voituresdescriptions/peugeot208/10.jpg", "/assets/img/voituresdescriptions/peugeot208/11.jpg"
						 , "/assets/img/voituresdescriptions/peugeot208/12.jpg", "/assets/img/voituresdescriptions/peugeot208/13.jpg", "/assets/img/voituresdescriptions/peugeot208/14.jpg");


		voituredescriptionRepository.save(desc1);
		autresRepository.save(autres1);
		confortRepository.save(confort1);
		diaporamaRepository.save(d1);
		eclairageRepository.save(eclairage1);
		multimediaRepository.save(multimedia1);
		pointsfortsRepository.save(pf1);
		secuRepository.save(secu1);



		/* 2 */


		Voituredescription desc2 = new Voituredescription(2,"Peugeot 208","1.2 PureTech GT Line EAT6","15500","9500km","Essence","Automatique", "11.2017", "110 CV / 81 kW",
				"1", "Berline", "5",
				"5", "Gris", "Mi-cuir (Sellerie d'origine)", "Eté",
				true, "1199", "EURO 6",
				"104 g/km", "FRANCE", "2", "Non",
				"15.03.2022", "TVA non récupérable", "08.2024", "KM67931");

		Pointsforts pf2 = new Pointsforts(2, "GPS intégré", "Jantes 17 pouces", "Jantes Alu bi-ton",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort2 =   new Confort(2, "Vitres électriques arrière", "Vitres électriques avant", "", "", "");

		Multimedia multimedia2 = new Multimedia(2, "Ecran tactile", "Interface MP3 / USB / Ipod", "Système Audio/Radio", "Volant multifonction","");

		Eclairage eclairage2 = new Eclairage(2, "Allumage automatique des phares", "Essuie-glaces automatiques", "Vitres surteintées arrière", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu2 = new Secu(2, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres2 =new Autres(2, "Volant réglable en profondeur", "Roue de secours taille standard", "", "", "");

		Diaporama d2 = new Diaporama(2, "/assets/img/voituresdescriptions/peugeot208-2/1.jpg", "/assets/img/voituresdescriptions/peugeot208-2/2.jpg",
				"/assets/img/voituresdescriptions/peugeot208-2/3.jpg", "/assets/img/voituresdescriptions/peugeot208-2/4.jpg", "/assets/img/voituresdescriptions/peugeot208-2/5.jpg"
				, "/assets/img/voituresdescriptions/peugeot208-2/6.jpg", "/assets/img/voituresdescriptions/peugeot208-2/7.jpg", "/assets/img/voituresdescriptions/peugeot208-2/8.jpg"
				, "/assets/img/voituresdescriptions/peugeot208-2/9.jpg", "/assets/img/voituresdescriptions/peugeot208-2/10.jpg", "/assets/img/voituresdescriptions/peugeot208-2/11.jpg"
				, "/assets/img/voituresdescriptions/peugeot208-2/12.jpg", "/assets/img/voituresdescriptions/peugeot208-2/13.jpg", "/assets/img/voituresdescriptions/peugeot208-2/14.jpg");


		voituredescriptionRepository.save(desc2);
		autresRepository.save(autres2);
		confortRepository.save(confort2);
		diaporamaRepository.save(d2);
		eclairageRepository.save(eclairage2);
		multimediaRepository.save(multimedia2);
		pointsfortsRepository.save(pf2);
		secuRepository.save(secu2);

		/* 3 */

		Voituredescription desc3 = new Voituredescription(3, "Renault Clio","1.3 TCe Initiale Paris", "16700","20000km","Essence","Duplex", "01.2020", "131 CV / 96 kW",
				"1", "Berline", "5",
				"5", "Gris", "Cuir (Sellerie d'origine)", "Eté",
				true, "1332", "EURO 6",
				"119 g/km", "FRANCE", "2", "Non",
				"15.03.2022", "TVA non récupérable", "01.2024", "SF74251");

		Pointsforts pf3 = new Pointsforts(3, "GPS intégré", "Jantes 17 pouces", "Jantes Alu bi-ton",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort3 =   new Confort(3, "Vitres électriques arrière", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia3 = new Multimedia(3, "Apple CarPlay", "Interface MP3 / USB / Ipod", "Système Audio/Radio", "Volant multifonction","");

		Eclairage eclairage3 = new Eclairage(3, "Allumage automatique des phares", "Essuie-glaces automatiques", "Vitres surteintées arrière", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu3 = new Secu(3, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres3 =new Autres(3, "Volant réglable en profondeur", "Frein de stationnement électrique", "", "", "");

		Diaporama d3 = new Diaporama(3, "/assets/img/voituresdescriptions/renaultclio/1.jpg", "/assets/img/voituresdescriptions/renaultclio/2.jpg",
				"/assets/img/voituresdescriptions/renaultclio/3.jpg", "/assets/img/voituresdescriptions/renaultclio/4.jpg", "/assets/img/voituresdescriptions/renaultclio/5.jpg"
				, "/assets/img/voituresdescriptions/renaultclio/6.jpg", "/assets/img/voituresdescriptions/renaultclio/7.jpg", "/assets/img/voituresdescriptions/renaultclio/8.jpg"
				, "/assets/img/voituresdescriptions/renaultclio/9.jpg", "/assets/img/voituresdescriptions/renaultclio/10.jpg", "/assets/img/voituresdescriptions/renaultclio/11.jpg"
				, "/assets/img/voituresdescriptions/renaultclio/12.jpg", "/assets/img/voituresdescriptions/renaultclio/13.jpg", "/assets/img/voituresdescriptions/renaultclio/14.jpg");


		voituredescriptionRepository.save(desc3);
		autresRepository.save(autres3);
		confortRepository.save(confort3);
		diaporamaRepository.save(d3);
		eclairageRepository.save(eclairage3);
		multimediaRepository.save(multimedia3);
		pointsfortsRepository.save(pf3);
		secuRepository.save(secu3);

		/* 4 */

		Voituredescription desc4 = new Voituredescription(4,"Renault Captur","1.6 E-Tech Plug-in Intens EDC","21900","5964km","Essence","Automatique", "12.2020", "158 CV / 116 kW",
				"1", "SUV", "5",
				"5", "Orange", "Tissu (Sellerie d'origine)", "Eté",
				true, "1598", "EURO 6",
				"34 g/km", "FRANCE", "2", "Non",
				"15.03.2022", "TVA non récupérable", "12.2024", "DF38847");

		Pointsforts pf4 = new Pointsforts(4, "GPS intégré", "Jantes 17 pouces", "Jantes Alu bi-ton",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort4 =   new Confort(4, "Vitres électriques arrière", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia4 = new Multimedia(4, "Apple CarPlay", "Interface MP3 / USB / Ipod", "Système Audio/Radio", "Volant multifonction","");

		Eclairage eclairage4 = new Eclairage(4, "Allumage automatique des phares", "Essuie-glaces automatiques", "Automatic headlight activation", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu4 = new Secu(4, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres4 =new Autres(4, "Cockpit virtuel", "Frein de stationnement électrique", "", "", "");

		Diaporama d4 = new Diaporama(4, "/assets/img/voituresdescriptions/renaultcaptur/1.jpg", "/assets/img/voituresdescriptions/renaultcaptur/2.jpg",
				"/assets/img/voituresdescriptions/renaultcaptur/3.jpg", "/assets/img/voituresdescriptions/renaultcaptur/4.jpg", "/assets/img/voituresdescriptions/renaultcaptur/5.jpg"
				, "/assets/img/voituresdescriptions/renaultcaptur/6.jpg", "/assets/img/voituresdescriptions/renaultcaptur/7.jpg", "/assets/img/voituresdescriptions/renaultcaptur/8.jpg"
				, "/assets/img/voituresdescriptions/renaultcaptur/9.jpg", "/assets/img/voituresdescriptions/renaultcaptur/10.jpg", "/assets/img/voituresdescriptions/renaultcaptur/11.jpg"
				, "/assets/img/voituresdescriptions/renaultcaptur/12.jpg", "/assets/img/voituresdescriptions/renaultcaptur/13.jpg", "/assets/img/voituresdescriptions/renaultcaptur/14.jpg");


		voituredescriptionRepository.save(desc4);
		autresRepository.save(autres4);
		confortRepository.save(confort4);
		diaporamaRepository.save(d4);
		eclairageRepository.save(eclairage4);
		multimediaRepository.save(multimedia4);
		pointsfortsRepository.save(pf4);
		secuRepository.save(secu4);

		/* 5 */

		Voituredescription desc5 = new Voituredescription(5,"Toyota Yaris","1.5 Hybrid Dynamic", "15090","17322km","Hybride","Automatique", "02.2019", "75 CV / 55 kW",
				"1", "Berline", "5",
				"5", "Blanc", "Tissu (Sellerie d'origine)", "Eté",
				true, "1497", "EURO 6",
				"84 g/km", "FRANCE", "2", "Non",
				"09.06.2022", "TVA non récupérable", "02.2023", "PE93517");

		Pointsforts pf5 = new Pointsforts(5, "GPS intégré", "Caméra de recul", "Jantes Alu",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort5 =   new Confort(5, "Démarrage sans clé", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia5 = new Multimedia(5, "Commandes vocales", "Interface MP3 / USB / Ipod", "Système mains libres/Bluetooth", "","");

		Eclairage eclairage5 = new Eclairage(5, "Allumage automatique des phares", "Essuie-glaces automatiques", "Feux anti-brouillard avant", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu5 = new Secu(5, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres5 =new Autres(5, "Roue de secours galette", "Rétroviseurs rabattables automatiquement", "", "", "");

		Diaporama d5 = new Diaporama(5, "/assets/img/voituresdescriptions/toyotayaris/1.jpg", "/assets/img/voituresdescriptions/toyotayaris/2.jpg",
				"/assets/img/voituresdescriptions/toyotayaris/3.jpg", "/assets/img/voituresdescriptions/toyotayaris/4.jpg", "/assets/img/voituresdescriptions/toyotayaris/5.jpg"
				, "/assets/img/voituresdescriptions/toyotayaris/6.jpg", "/assets/img/voituresdescriptions/toyotayaris/7.jpg", "/assets/img/voituresdescriptions/toyotayaris/8.jpg"
				, "/assets/img/voituresdescriptions/toyotayaris/9.jpg", "/assets/img/voituresdescriptions/toyotayaris/10.jpg", "/assets/img/voituresdescriptions/toyotayaris/11.jpg"
				, "/assets/img/voituresdescriptions/toyotayaris/12.jpg", "/assets/img/voituresdescriptions/toyotayaris/13.jpg", "/assets/img/voituresdescriptions/toyotayaris/14.jpg");


		voituredescriptionRepository.save(desc5);
		autresRepository.save(autres5);
		confortRepository.save(confort5);
		diaporamaRepository.save(d5);
		eclairageRepository.save(eclairage5);
		multimediaRepository.save(multimedia5);
		pointsfortsRepository.save(pf5);
		secuRepository.save(secu5);

		/* 6 */

		Voituredescription desc6 = new Voituredescription(6,"Renault Mégane","1.3 TCe Intens","16200","35000km","Essence","Double embrayage/DCT", "02.2019", "159 CV / 117 kW",
				"1", "Berline", "5",
				"5", "Gris", "Mi-cuir (Sellerie d'origine)", "Eté",
				true, "1332", "EURO 6",
				"127 g/km", "FRANCE", "2", "Non",
				"09.07.2022", "TVA non récupérable", "02.2023", "KD44237");

		Pointsforts pf6 = new Pointsforts(6, "GPS intégré", "Caméra de recul", "Jantes Alu 17 pouces",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort6 =   new Confort(6, "Démarrage sans clé", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia6 = new Multimedia(6, "Commandes vocales", "Interface MP3 / USB / Ipod", "Système mains libres/Bluetooth", "","");

		Eclairage eclairage6 = new Eclairage(6, "Allumage automatique des phares", "Essuie-glaces automatiques", "Feux anti-brouillard avant", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu6 = new Secu(6, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres6 =new Autres(6, "Frein de stationnement électrique", "Rétroviseurs rabattables automatiquement", "Start & Stop", "", "");

		Diaporama d6 = new Diaporama(6, "/assets/img/voituresdescriptions/renaultmegane/1.jpg", "/assets/img/voituresdescriptions/renaultmegane/2.jpg",
				"/assets/img/voituresdescriptions/renaultmegane/3.jpg", "/assets/img/voituresdescriptions/renaultmegane/4.jpg", "/assets/img/voituresdescriptions/renaultmegane/5.jpg"
				, "/assets/img/voituresdescriptions/renaultmegane/6.jpg", "/assets/img/voituresdescriptions/renaultmegane/7.jpg", "/assets/img/voituresdescriptions/renaultmegane/8.jpg"
				, "/assets/img/voituresdescriptions/renaultmegane/9.jpg", "/assets/img/voituresdescriptions/renaultmegane/10.jpg", "/assets/img/voituresdescriptions/renaultmegane/11.jpg"
				, "/assets/img/voituresdescriptions/renaultmegane/12.jpg", "/assets/img/voituresdescriptions/renaultmegane/13.jpg", "/assets/img/voituresdescriptions/renaultmegane/14.jpg");


		voituredescriptionRepository.save(desc6);
		autresRepository.save(autres6);
		confortRepository.save(confort6);
		diaporamaRepository.save(d6);
		eclairageRepository.save(eclairage6);
		multimediaRepository.save(multimedia6);
		pointsfortsRepository.save(pf6);
		secuRepository.save(secu6);

		/* 7 */

		Voituredescription desc7 = new Voituredescription(7,"Peugeot 3008","1.5 Blue-HDi Allure EAT8","22000","31111km","Diesel","Automatique", "06.2019", "130 CV / 96 kW",
				"1", "SUV", "5",
				"5", "Gris", "Mi-cuir (Sellerie d'origine)", "Toute saison",
				true, "1499", "EURO 6",
				"102 g/km", "FRANCE", "2", "Non",
				"25.08.2022", "TVA non récupérable", "06.2023", "MB69428");

		Pointsforts pf7 = new Pointsforts(7, "Volant avec palettes", "Trappe à ski", "Jantes Alu 18 pouces",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort7 =   new Confort(7, "Démarrage sans clé", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia7 = new Multimedia(7, "Apple CarPlay", "Interface MP3 / USB / Ipod", "Système mains libres/Bluetooth", "","");

		Eclairage eclairage7 = new Eclairage(7, "Allumage automatique des phares", "Essuie-glaces automatiques", "Feux anti-brouillard avant", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu7 = new Secu(7, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres7 =new Autres(7, "Frein de stationnement électrique", "Rétroviseurs rabattables automatiquement", "Start & Stop", "", "");

		Diaporama d7 = new Diaporama(7, "/assets/img/voituresdescriptions/peugeot3008/1.jpg", "/assets/img/voituresdescriptions/peugeot3008/2.jpg",
				"/assets/img/voituresdescriptions/peugeot3008/3.jpg", "/assets/img/voituresdescriptions/peugeot3008/4.jpg", "/assets/img/voituresdescriptions/peugeot3008/5.jpg"
				, "/assets/img/voituresdescriptions/peugeot3008/6.jpg", "/assets/img/voituresdescriptions/peugeot3008/7.jpg", "/assets/img/voituresdescriptions/peugeot3008/8.jpg"
				, "/assets/img/voituresdescriptions/peugeot3008/9.jpg", "/assets/img/voituresdescriptions/peugeot3008/10.jpg", "/assets/img/voituresdescriptions/peugeot3008/11.jpg"
				, "/assets/img/voituresdescriptions/peugeot3008/12.jpg", "/assets/img/voituresdescriptions/peugeot3008/13.jpg", "/assets/img/voituresdescriptions/peugeot3008/14.jpg");


		voituredescriptionRepository.save(desc7);
		autresRepository.save(autres7);
		confortRepository.save(confort7);
		diaporamaRepository.save(d7);
		eclairageRepository.save(eclairage7);
		multimediaRepository.save(multimedia7);
		pointsfortsRepository.save(pf7);
		secuRepository.save(secu7);

		/* 8 */

		Voituredescription desc8 = new Voituredescription(8,"Dacia Duster II","1.5 dCi Prestige 4x2", "13450","52008km","Diesel","Manuelle", "01.2018", "109 CV / 80 kW",
				"1", "SUV", "5",
				"5", "Marron", "Tissu (Sellerie d'origine)", "Eté",
				true, "1461", "EURO 6",
				"115 g/km", "FRANCE", "2", "Non",
				"27.07.2022", "TVA non récupérable", "07.2024", "HK64573");

		Pointsforts pf8 = new Pointsforts(8, "Radars de stationnement arrière", "Climatisation automatique", "Jantes 17 pouces",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort8 =   new Confort(8, "Volant multifonction", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia8 = new Multimedia(8, "Commandes vocales", "Interface MP3 / USB / Ipod", "Système mains libres/Bluetooth", "","");

		Eclairage eclairage8 = new Eclairage(8, "Allumage automatique des phares", "Essuie-glaces automatiques", "Feux anti-brouillard avant", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu8 = new Secu(8, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres8 =new Autres(8, "Boîte manuelle 6 vitesses", "Roue de secours galette", "Start & Stop", "", "");

		Diaporama d8 = new Diaporama(8, "/assets/img/voituresdescriptions/daciadusterII/1.jpg", "/assets/img/voituresdescriptions/daciadusterII/2.jpg",
				"/assets/img/voituresdescriptions/daciadusterII/3.jpg", "/assets/img/voituresdescriptions/daciadusterII/4.jpg", "/assets/img/voituresdescriptions/daciadusterII/5.jpg"
				, "/assets/img/voituresdescriptions/daciadusterII/6.jpg", "/assets/img/voituresdescriptions/daciadusterII/7.jpg", "/assets/img/voituresdescriptions/daciadusterII/8.jpg"
				, "/assets/img/voituresdescriptions/daciadusterII/9.jpg", "/assets/img/voituresdescriptions/daciadusterII/10.jpg", "/assets/img/voituresdescriptions/daciadusterII/11.jpg"
				, "/assets/img/voituresdescriptions/daciadusterII/12.jpg", "/assets/img/voituresdescriptions/daciadusterII/13.jpg", "/assets/img/voituresdescriptions/daciadusterII/14.jpg");


		voituredescriptionRepository.save(desc8);
		autresRepository.save(autres8);
		confortRepository.save(confort8);
		diaporamaRepository.save(d8);
		eclairageRepository.save(eclairage8);
		multimediaRepository.save(multimedia8);
		pointsfortsRepository.save(pf8);
		secuRepository.save(secu8);

		/* 9 */

		Voituredescription desc9 = new Voituredescription(9,"Fiat 500","1.2 Lounge", "7700","64600km","Essence","Manuelle", "03.2016", "69 CV / 51 kW",
				"1", "Berline", "3",
				"4", "Gris", "Tissu (Sellerie d'origine)", "Eté",
				true, "1242", "EURO 6",
				"115 g/km", "FRANCE", "2", "Non",
				"21.07.2022", "TVA non récupérable", "07.2024", "TH44296");

		Pointsforts pf9 = new Pointsforts(9, "Jantes 15 pouces", "Radars de stationnement arrière", "Toit vitré/panoramique",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort9 =   new Confort(9, "Climatisation manuelle", "Vitres électriques avant", "", "", "");

		Multimedia multimedia9 = new Multimedia(9, "Commandes vocales", "Interface MP3 / USB / Ipod", "Système mains libres/Bluetooth", "","");

		Eclairage eclairage9 = new Eclairage(9, "Feux anti-brouillard avant", "Feux arrière LED", "Feux de jour", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu9 = new Secu(9, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres9 =new Autres(9, "Boîte manuelle 5 vitesses", "Roue de secours galette", "", "", "");

		Diaporama d9 = new Diaporama(9, "/assets/img/voituresdescriptions/fiat500/1.jpg", "/assets/img/voituresdescriptions/fiat500/2.jpg",
				"/assets/img/voituresdescriptions/fiat500/3.jpg", "/assets/img/voituresdescriptions/fiat500/4.jpg", "/assets/img/voituresdescriptions/fiat500/5.jpg"
				, "/assets/img/voituresdescriptions/fiat500/6.jpg", "/assets/img/voituresdescriptions/fiat500/7.jpg", "/assets/img/voituresdescriptions/fiat500/8.jpg"
				, "/assets/img/voituresdescriptions/fiat500/9.jpg", "/assets/img/voituresdescriptions/fiat500/10.jpg", "/assets/img/voituresdescriptions/fiat500/11.jpg"
				, "/assets/img/voituresdescriptions/fiat500/12.jpg", "/assets/img/voituresdescriptions/fiat500/13.jpg", "/assets/img/voituresdescriptions/fiat500/14.jpg");


		voituredescriptionRepository.save(desc9);
		autresRepository.save(autres9);
		confortRepository.save(confort9);
		diaporamaRepository.save(d9);
		eclairageRepository.save(eclairage9);
		multimediaRepository.save(multimedia9);
		pointsfortsRepository.save(pf9);
		secuRepository.save(secu9);

		/* 10 */

		Voituredescription desc10 = new Voituredescription(10,"Mercedes CLA","200 d Sensation 7G-DCT", "21300","75054km","Diesel", "Duplex", "12.2016", "136 CV / 100 kW",
				"1", "Berline", "4",
				"5", "Noir",
				"Mi-cuir (Sellerie d'origine)", "Eté",
				true, "2143", "EURO 6",
				"105 g/km", "FRANCE", "2", "Non",
				"07.07.2022", "TVA non récupérable", "07.2024", "LV59395");

		Pointsforts pf10 = new Pointsforts(10, "Caméra de recul", "Jantes 18 pouces", "GPS intégré",
				"Radars de stationnement arrière", "Limiteur de vitesse");

		Confort confort10 =   new Confort(10, "Démarrage sans clé", "Vitres électriques avant", "Accoudoir central", "", "");

		Multimedia multimedia10 = new Multimedia(10, "Commandes vocales", "Interface MP3 / USB / Ipod", "Volant multifonction", "","");

		Eclairage eclairage10 = new Eclairage(10, "Feux anti-brouillard avant", "Feux arrière LED", "Feux de jour", "Rétroviseurs rabattables électriquement", "Feux de jour");

		Secu secu10 = new Secu(10, "Désactivation airbag passager avant", "Verrouillage électrique des portes", "Isofix", "", "");

		Autres autres10 =new Autres(10, "Volant réglable en profondeur", "Start & Stop", "Frein de stationnement électrique", "", "");

		Diaporama d10 = new Diaporama(10, "/assets/img/voituresdescriptions/mercedescla/1.jpg", "/assets/img/voituresdescriptions/mercedescla/2.jpg",
				"/assets/img/voituresdescriptions/mercedescla/3.jpg", "/assets/img/voituresdescriptions/mercedescla/4.jpg", "/assets/img/voituresdescriptions/mercedescla/5.jpg"
				, "/assets/img/voituresdescriptions/mercedescla/6.jpg", "/assets/img/voituresdescriptions/mercedescla/7.jpg", "/assets/img/voituresdescriptions/mercedescla/8.jpg"
				, "/assets/img/voituresdescriptions/mercedescla/9.jpg", "/assets/img/voituresdescriptions/mercedescla/10.jpg", "/assets/img/voituresdescriptions/mercedescla/11.jpg"
				, "/assets/img/voituresdescriptions/mercedescla/12.jpg", "/assets/img/voituresdescriptions/mercedescla/13.jpg", "/assets/img/voituresdescriptions/mercedescla/14.jpg");


		voituredescriptionRepository.save(desc10);
		autresRepository.save(autres10);
		confortRepository.save(confort10);
		diaporamaRepository.save(d10);
		eclairageRepository.save(eclairage10);
		multimediaRepository.save(multimedia10);
		pointsfortsRepository.save(pf10);
		secuRepository.save(secu10);




	}



}
