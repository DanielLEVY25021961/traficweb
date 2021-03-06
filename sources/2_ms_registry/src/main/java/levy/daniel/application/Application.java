package levy.daniel.application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * CLASSE Application :<br/>
 * <ul>
 * <li>Point d'entrée de l'application SPRING BOOT.</li>
 * <li>L'annotation <code>SpringBootApplication</code> déclare à SPRING 
 * qu'il s'agit de la classe APPLICATIVE.</li>
 * <li>L'annotation <code>EnableEurekaServer</code> déclare à SPRING 
 * qu'il s'agit d'un <strong>MICRO-SERVICE TECHNIQUE de 
 * REGISTRY EUREKA SERVER</strong> (annuaire des micro-services 
 * utilisés dans l'application).</li>
 * <li>L'annotation <code>EnableConfigurationProperties</code> déclare à SPRING 
 * que l'on peut écrire un Bean qui récupère les valeurs 
 * dans les applications.properties.</li>
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
 * @since 4 oct. 2020
 */
@SpringBootApplication
@EnableEurekaServer
@EnableConfigurationProperties
@EnableSwagger2
public class Application {  // NOPMD by dan on 04/11/2020 18:41

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
	 * Point d'entrée de l'application (Micro-Service).
	 * 
	 * @param pArgs : String[] : paramètres de lancement du Micro-Service.
	 */
	public static void main(final String... pArgs) {
		SpringApplication
			.run(Application.class, pArgs);
	} // Fin de main(...)._________________________________________________
	
	
	
} // FIN DE LA CLASSE Application.-------------------------------------------
