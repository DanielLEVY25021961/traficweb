package levy.daniel.application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * CLASSE Application :<br/>
 * Point d'entrée de l'application SPRING BOOT.<br/>
 * L'annotation <code>SpringBootApplication</code> déclare à SPRING 
 * qu'il s'agit de la classe APPLICATIVE.<br/>
 * L'annotation <code>EnableConfigServer</code> déclare à SPRING 
 * qu'il s'agit d'un MICRO-SERVICE TECHNIQUE de CENTRALISATION 
 * de la CONFIGURATION.<br/>
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
 * @since 20 oct. 2020
 */
@EnableConfigServer
@SpringBootApplication
public class Application {  // NOPMD by dan on 20/10/2020 12:44

	// ************************ATTRIBUTS************************************/

	/**
	 * LOG : Log : Logger pour Log4j (utilisant commons-logging).
	 */
	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(Application.class);

	// *************************METHODES************************************/

	
	
	/**
	 * CONSTRUCTEUR D'ARITE NULLE.
	 */
	public Application() {
		super();
	} // Fin du CONSTRUCTEUR D'ARITE NULLE.________________________________

	
	
	/**
	 * Point d'entrée de l'application.
	 * @param pArgs : String[].
	 */
	public static void main(final String... pArgs) {
		SpringApplication.run(Application.class, pArgs);
	} // Fin de main(...)._________________________________________________

	
	
} // FIN DE LA CLASSE Application.-------------------------------------------
