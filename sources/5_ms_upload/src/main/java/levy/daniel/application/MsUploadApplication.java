package levy.daniel.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CLASSE MsUploadApplication :<br/>
 * POINT D'ENTREE DE L'APPLICATION SPRING.<br/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author Daniel Lévy
 * @version 1.0
 * @since 11 oct. 2020
 */
@SpringBootApplication
public class MsUploadApplication { // NOPMD by dan on 11/10/2020 20:49
	
	
	
	/**
	 * CONSTRUCTEUR D'ARITE NULLE.
	 */
	public MsUploadApplication() {
		super();
	} // Fin du CONSTRUCTEUR D'ARITE NULLE.________________________________
	
	

	/**
	 * POINT D'ENTREE DE L'APPLICATION SPRING. 
	 * 
	 * @param pArgs : String[] : tableau des arguments 
	 * à passer à la méthode de lancement.
	 */
	public static void main(
			final String... pArgs) {
		SpringApplication.run(MsUploadApplication.class, pArgs);
	} // Fin de main(...)._________________________________________________

	
	
} // FIN DE LA CLASSE MsUploadApplication.-----------------------------------
