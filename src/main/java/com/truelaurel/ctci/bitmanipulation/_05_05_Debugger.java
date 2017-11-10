package com.truelaurel.ctci.bitmanipulation;

/**
 * Explain what the following code does
 */
public class _05_05_Debugger {

    // n & (n - 1) clears the last bit 1, if nothing remains. it means there is only is one 1.
    // therefore it's a power of 2
    boolean debug(int n) {
        return (n & (n - 1)) == 0;
    }
}
