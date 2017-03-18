package giraffedatadinosaur.commuterpal.helpers.resolve;

/**
 * Created by Daniel on 18/03/2017.
 */

public interface Resolver<I, O> {
    /**
     * Resolve an output from an input or throw ResolveException
     * @param input
     * @return
     */
    O resolve(I input) throws ResolveException;
}
