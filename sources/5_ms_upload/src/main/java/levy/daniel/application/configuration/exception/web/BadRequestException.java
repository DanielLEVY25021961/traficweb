package levy.daniel.application.configuration.exception.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * CLASSE BadRequestException :<br/>
 * Exception jetée en cas d'erreur 400 - HttpStatus.BAD_REQUEST (Web).<br/>
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
 * @since 9 oct. 2020
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

	// ************************ATTRIBUTS************************************/

	/**
	 * serialVersionUID : long :<br/>
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * LOG : Log : 
	 * Logger pour Log4j (utilisant commons-logging).
	 */
	@SuppressWarnings("unused")
	private static final Log LOG = LogFactory
			.getLog(BadRequestException.class);
	

	// *************************METHODES************************************/
	

	/**
	 * CONSTRUCTEUR D'ARITE NULLE.<br/>
	 * Permet de construire une BadRequestException
	 * sans message ni propagation d'exception cause.<br/>
	 */
	public BadRequestException() {
		super();
	} // Fin de CONSTRUCTEUR D'ARITE NULLE.________________________________

	
	
	/**
	 * CONSTRUCTEUR D'ARITE 1.<br/>
	 * Permet de construire une BadRequestException
	 * qui propage un message.<br/>
	 * <br/>
	 *
	 * @param pMessage : String : le message à propager.<br/>
	 */
	public BadRequestException(final String pMessage) {
		super(pMessage);
	} // Fin de CONSTRUCTEUR D'ARITE 1.____________________________________
	
	
	
	/**
	 * CONSTRUCTEUR D'ARITE 1.<br/>
	 * Permet de construire une BadRequestException
	 * qui propage un Throwable qui a causé la présente
	 * exception.<br/>
	 * <br/>
	 *
	 * @param pCause : Throwable : l'exception qui a
	 * causé la présente et que l'on veut propager.<br/>
	 */
	public BadRequestException(final Throwable pCause) {
		super(pCause);
	} // Fin de CONSTRUCTEUR D'ARITE 1.____________________________________
	
	
	
	/**
	 * CONSTRUCTEUR D'ARITE 2.<br/>
	 * Permet de construire une BadRequestException
	 * qui propage :
	 * <ul>
	 * <li>un message,</li<
	 * <li>un Throwable qui a causé la présente exception.</li>
	 * </ul>
	 *
	 * @param pMessage : String : le message à propager.<br/>
	 * @param pCause : Throwable : l'exception qui a
	 * causé la présente et que l'on veut propager.<br/>
	 */
	public BadRequestException(
			final String pMessage, final Throwable pCause) {
		super(pMessage, pCause);
	} // Fin de CONSTRUCTEUR D'ARITE 2.____________________________________

	
	
} // FIN DE LA CLASSE BadRequestException.-----------------------------------
