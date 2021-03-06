package com.robertsoultanaev.javasphinx;

/**
 * Type to combine the header and body length parameters
 */
public class ParamLengths {
    public final int headerLength;
    public final int bodyLength;

    public ParamLengths(int headerLength, int bodyLength) {
        this.headerLength = headerLength;
        this.bodyLength = bodyLength;
    }
}
