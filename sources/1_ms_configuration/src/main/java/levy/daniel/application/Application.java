package levy.daniel.application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * CLASSE Application :<br/>
 * <ul>
 * <li>Point d'entrée de l'application SPRING BOOT.</li>
 * <li>L'annotation <code>SpringBootApplication</code> déclare à SPRING 
 * qu'il s'agit de la classe APPLICATIVE.</li>
 * <li>L'annotation <code>EnableConfigServer</code> déclare à SPRING 
 * qu'il s'agit d'un MICRO-SERVICE TECHNIQUE de CENTRALISATION 
 * de la CONFIGURATION.</li>
 * <li>L'annotation <code>EnableConfigurationProperties</code> déclare à SPRING 
 * que l'on peut écrire un Bean qui récupère les valeurs 
 * dans les applications.properties.</li>
 * <li>L'annotation <code>EnableDiscoveryClient</code> déclare à SPRING 
 * que ce Micro-Service s'enregistre auprès du serveur annuaire EUREKA.</li>
 * <li>L'annotation <code>EnableSwagger2</code> déclare à SPRING 
 * que l'on va générer la documentation du MICRO-SERVICE avec Swagger2.</li>
 * </ul>
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
@EnableConfigurationProperties
@EnableDiscoveryClient
@EnableConfigServer
@EnableSwagger2
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
