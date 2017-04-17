package Callback;

import Entity.Error;
import Entity.Result;

/**
 * Callback for neural network
 */

public interface INeuralNetworkCallback {
    
    
    /**
     * This method is called when neural network finish his work and all is good
     * @param result Entity to save obtained values
     */
    float success(Result result);
    
    

    /**
     * This method is called when neural network finish his work and something is not good
     * @param error Entity to save obtained error
     */
    void failure(Error error);
}
