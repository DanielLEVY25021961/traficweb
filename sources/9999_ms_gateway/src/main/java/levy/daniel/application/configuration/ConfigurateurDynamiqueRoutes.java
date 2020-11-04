package levy.daniel.application.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CLASSE ConfigurateurDynamiqueRoutes :<br/>
 * <ul>
 * <li>Classe de Configuration PROGRAMMATIQUE <strong>DYNAMIQUE</strong> 
 * des <strong>routes</strong> des divers 
 * Micro-Services metier utilisés dans l'application et 
 * <strong>enregistrés dans le Serveur EUREKA</strong> 
 * dans le PROXY GATEWAY.</li>
 * <li>l'annotation <strong>Configuration</strong> sur la classe 
 * oblige SPRING à lire cette classe de configuration 
 * au démarrage de l'application et à instancier les BEANS.</li>
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
 * @since 4 nov. 2020
 */
@Configuration
public class ConfigurateurDynamiqueRoutes {

	// ************************ATTRIBUTS************************************/

	/**
	 * LOG : Log : Logger pour Log4j (utilisant commons-logging).
	 */
	@SuppressWarnings("unused")
	private static final Log LOG 
		= LogFactory.getLog(ConfigurateurDynamiqueRoutes.class);

	// *************************METHODES************************************/

	
	
	/**
	 * CONSTRUCTEUR D'ARITE NULLE.
	 */
	public ConfigurateurDynamiqueRoutes() {
		super();
	} // Fin du CONSTRUCTEUR D'ARITE NULLE.________________________________
	

	
	/**
	 * Configuration PROGRAMMATIQUE <strong>DYNAMIQUE</strong> 
	 * des <strong>routes</strong> des divers 
	 * Micro-Services metier utilisés dans l'application et 
	 * <strong>enregistrés dans le Serveur EUREKA</strong> 
	 * dans le PROXY GATEWAY.<br/>
	 * L'annotation Bean permettra d'informer SPRING que cette méthode 
	 * fait partie de la configuration et doit être exécutée 
	 * dès le démarrage des Micro-Services.<br/>
	 * <br/>
	 * Démarrer dans l'ordre :
	 * <ol>
	 * <li>le Micro-Service de Configuration Config Server.</li>
	 * <li>l'annuaire EUREKA REGISTRY.</li>
	 * <li>le premier service métier.</li>
	 * <li>le deuxième service métier.</li>
	 * <li>...</li>
	 * <li>le PROXY (GATEWAY).</li>
	 * </ol>
	 * 
	 * @param pReactiveDiscoveryClient : ReactiveDiscoveryClient.
	 * @param pDiscoveryLocatorProperties : DiscoveryLocatorProperties.
	 * 
	 * @return DiscoveryClientRouteDefinitionLocator
	 */
	@Bean
	public DiscoveryClientRouteDefinitionLocator getDynamicRoutes(
			final ReactiveDiscoveryClient pReactiveDiscoveryClient
				, final DiscoveryLocatorProperties pDiscoveryLocatorProperties) {
		
		return new DiscoveryClientRouteDefinitionLocator(
				pReactiveDiscoveryClient
					, pDiscoveryLocatorProperties);
		
	} // Fin de getDynamicRoutes(...)._____________________________________
	
	
	
} // FIN DE LA CLASSE ConfigurateurDynamiqueRoutes.--------------------------
