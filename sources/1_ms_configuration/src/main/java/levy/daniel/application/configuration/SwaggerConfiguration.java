package levy.daniel.application.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * CLASSE SwaggerConfiguration :<br/>
 * Classe de configuration pour la documentation 
 * des MICRO-SERVICES avec Swagger2.<br/>
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
 * @since 21 oct. 2020
 */
@Configuration
public class SwaggerConfiguration {

	// ************************ATTRIBUTS************************************/

	/**
	 * LOG : Log : Logger pour Log4j (utilisant commons-logging).
	 */
	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory.getLog(SwaggerConfiguration.class);

	// *************************METHODES************************************/

	
	
	/**
	 * CONSTRUCTEUR D'ARITE NULLE.
	 */
	public SwaggerConfiguration() {
		super();
	} // Fin du CONSTRUCTEUR D'ARITE NULLE.________________________________


	
	/**
	 * @return Docket
	 */
	@Bean
    public Docket api() {
		
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();
        
    } // Fin de api()._____________________________________________________
	
	
	
} // FIN DE LA CLASSE SwaggerConfiguration.----------------------------------
