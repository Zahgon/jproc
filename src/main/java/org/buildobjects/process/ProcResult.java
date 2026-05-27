package org.buildobjects.process;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * Represents the result of a successful process execution.
 */
public class ProcResult {

    private final String procString;

    private final ByteArrayOutputStream output;

    private final int exitValue;

    private final long executionTime;

    private final byte[] err;

    ProcResult(String procString, ByteArrayOutputStream output, int exitValue, long executionTime, byte[] err) {
        this.procString = procString;
        this.output = output;
        this.exitValue = exitValue;
        this.executionTime = executionTime;
        this.err = err != null ? Arrays.copyOf(err, err.length) : null;
    }

    /**
     * @return  a string representation of the process invocation.
     *
     *           This approximates the representation of this invocation
     *           in a shell. Note that the escaping of arguments is incomplete,
     *           it works only for whitespace. Fancy control characters are
     *           not replaced.
     *
     *           @deprecated Use #getCommandLine() instead.
     */
    @Deprecated
    public String getProcString() {
        return procString;
    }

    /**
     * @return  a string representation of the process invocation.
     *
     *           This approximates the representation of this invocation
     *           in a shell. Note that the escaping of arguments is incomplete,
     *           it works only for whitespace. Fancy control characters are
     *           not replaced.
     */
    public String getCommandLine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private ByteArrayOutputStream getOutputStream() throws IllegalStateException {
        if (output == null) {
            throw new IllegalStateException("Output has been consumed by client provided OutputStream");
        }
        return output;
    }

    /**
     * @return the standard output as string
     *  @throws IllegalStateException if an OutputStream has been provided to captured the output
     */
    public String getOutputString() throws IllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the standard output as byte[]
     *  @throws IllegalStateException if an OutputStream has been provided to captured the output
     */
    public byte[] getOutputBytes() throws IllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the standard error as string
     *  @throws IllegalStateException if an OutputStream has been provided to capture the error output
     */
    public String getErrorString() throws IllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the standard error as byte[]
     *  @throws IllegalStateException if an OutputStream has been provided to capture the error output
     */
    public byte[] getErrorBytes() throws IllegalStateException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the exit value of the process
     */
    public int getExitValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the time the execution took in milliseconds.
     */
    public long getExecutionTime() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
