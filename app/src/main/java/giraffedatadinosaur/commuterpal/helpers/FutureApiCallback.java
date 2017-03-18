package giraffedatadinosaur.commuterpal.helpers;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import giraffedatadinosaur.commuterpal.helpers.resolve.ResolveException;
import io.urbanthings.api.ApiCallback;

/**
 * Created by Daniel on 18/03/2017.
 */

public class FutureApiCallback<T> implements ApiCallback<T> {

    private T result = null;

    private ResolveException exception;

    private boolean waitLock = true;

    private boolean errored = false;

    public void onSuccess(T result){
        this.result = result;
        waitLock = false;
    }

    public void onError(Throwable t){
        result = null;
        errored = true;
        exception = new ResolveException("Found no stops", t);
        waitLock = false;
    }

    public T getResult() throws ResolveException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            service.submit(new Callable<Void>() {
                public Void call() {
                    while (waitLock) {
                        Thread.yield();
                    }
                    return null;
                }
            }).get();
        }
    catch(Exception e)

    {
    }

        if(errored){
            throw exception;
        }

        return result;
    }


}
