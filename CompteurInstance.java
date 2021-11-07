public class CompteurInstance
{
	// variables d'instance 
	private static int nbInstances=0;

	/**
	 * Constructeur d'objets de classe CompteurInstance
	 */
	public CompteurInstance()
	{
		// initialisation des variables d'instance
		nbInstances += 1;
	}

	
	public int voirNbInstances()
	{
		return nbInstances;
	}

	public static int statVoirNbInstances()
	{
		// Ins&eacute;rez votre code ici
		return nbInstances;
	}
}