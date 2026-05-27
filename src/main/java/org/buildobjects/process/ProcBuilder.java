package org.buildobjects.process;

import java.io.*;
import java.util.*;
import static java.util.Arrays.asList;
import static org.buildobjects.process.Helper.asSet;

/**
 * A builder to construct a new process. The process gets configured by the withXXX-methods and
 * spawned by the run() method
 */
public class ProcBuilder {

    private ByteArrayOutputStream defaultStdout = new ByteArrayOutputStream();

    private final String command;

    private final List<String> args = new ArrayList<String>();

    private final Map<String, String> env = new HashMap<>();

    private OutputStream stdout = defaultStdout;

    private InputStream stdin;

    private OutputStream stderr;

    private Long timoutMillis = 5000L;

    private Set<Integer> expectedExitStatuses = new HashSet<Integer>() {

        {
            add(0);
        }
    };

    private File directory;

    private StreamConsumer outputConsumer;

    private StreamConsumer errorConsumer;

    private boolean clearEnvironment;

    /**
     * Creates a new ProcBuilder
     * @param command The command to run
     * @param args The command line arguments
     */
    public ProcBuilder(String command, String... args) {
        this.command = command;
        withArgs(args);
    }

    /**
     * Adds another argument
     * @param arg to add
     * @return this, for chaining
     */
    public ProcBuilder withArg(String arg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Redirecting the standard output. If it is not redirected the output gets captured in memory and
     * is available on the @see ProcResult
     *
     * @param stdout stream to redirect the output to. \
     * @return this, for chaining
     */
    public ProcBuilder withOutputStream(OutputStream stdout) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Redirecting the error output. If it is not redirected the output gets captured in memory and
     * is available on the @see ProcResult
     *
     * @param stderr stream to redirect the output to. \
     * @return this, for chaining
     */
    public ProcBuilder withErrorStream(OutputStream stderr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Specify a timeout for the operation. If not specified the default is 5 seconds.
     * @param timeoutMillis time that the process gets to run
     * @return this, for chaining
     */
    public ProcBuilder withTimeoutMillis(long timeoutMillis) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Disable timeout for the operation.
     *
     * @return this, for chaining
     */
    public ProcBuilder withNoTimeout() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Take the input for the program from a given InputStream
     * @param stdin stream to read the input from
     * @return this, for chaining
     */
    public ProcBuilder withInputStream(InputStream stdin) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Supply the input as string
     * @param input the actual input
     * @return this, for chaining
     */
    public ProcBuilder withInput(String input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Supply the input as byte[]
     * @param input the actual input
     * @return this, for chaining
     */
    public ProcBuilder withInput(byte[] input) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Override the wokring directory
     * @param directory the working directory for the process
     * @return this, for chaining
     */
    public ProcBuilder withWorkingDirectory(File directory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Add multiple args
     *   @param args the arguments add
     *   @return this, for chaining
     */
    public ProcBuilder withArgs(String... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Define the valid exit status codes for the command
     *
     * @param exitstatuses array containing the exit codes that are valid
     * @return the ProcBuilder object; permits chaining.
     * @author Mark Galbraith (mark.galbraith@citrix.com)
     *
     * @deprecated Please use the variants with a set or vargs parameters
     */
    public ProcBuilder withExitStatuses(int[] exitstatuses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Define the valid exit status codes for the command
     *
     * @param expectedExitStatuses array containing the exit codes that are valid
     * @return the ProcBuilder object; permits chaining.
     * @author Mark Galbraith (mark.galbraith@citrix.com)
     */
    public ProcBuilder withExpectedExitStatuses(Set<Integer> expectedExitStatuses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Define the valid exit status codes for the command
     *  Convenience method taking varargs.
     *
     * @param expectedExitStatuses varargs parameter containing the exit codes that are valid
     * @return the ProcBuilder object; permits chaining.
     * @author Mark Galbraith (mark.galbraith@citrix.com)
     */
    public ProcBuilder withExpectedExitStatuses(int... expectedExitStatuses) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Ignore the error status returned from this command
     *
     * @return the ProcBuilder object; permits chaining.
     */
    public ProcBuilder ignoreExitStatus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Spawn the actual execution.
     *  This will block until the process terminates.
     * @return the result of the successful execution
     *
     * @throws StartupException if the process can't be started
     * @throws TimeoutException if the timeout kicked in
     * @throws ExternalProcessFailureException if the external process returned a non-null exit value
     */
    public ProcResult run() throws StartupException, TimeoutException, ExternalProcessFailureException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Static helper to run a process
     * @param cmd the command
     * @param args the arguments
     * @return the standard output
     * @throws StartupException if the process can't be started
     * @throws TimeoutException if the timeout kicked in
     * @throws ExternalProcessFailureException if the external process returned a non-null exit value
     */
    public static String run(String cmd, String... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Static helper to filter a string through a process
     * @param input the input to be fed into the process
     * @param cmd the command
     * @param args the arguments
     * @return the standard output
     * @throws StartupException if the process can't be started
     * @throws TimeoutException if the timeout kicked in
     * @throws ExternalProcessFailureException if the external process returned a non-null exit value
     */
    public static String filter(String input, String cmd, String... args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Clears the environment before setting new variables.
     */
    public ProcBuilder clearEnvironment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Add a variable to the process's environment
     *
     * @param var variable name
     * @param value the value to be passed in
     * @return this, for chaining
     */
    public ProcBuilder withVar(String var, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Add multiple variables to the process's environment
     *
     * @param vars Map of variables to their respective values
     * @return this, for chaining
     */
    public ProcBuilder withVars(Map<String, String> vars) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Process the standard output with the given consumer object
     *
     * @param outputConsumer an object that defines how to process the standard output stream
     * @return this, for chaining
     */
    public ProcBuilder withOutputConsumer(StreamConsumer outputConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Process the error output with given consumer object
     * @param errorConsumer an object that defines how to process the error output stream
     * @return this, for chaining
     */
    public ProcBuilder withErrorConsumer(StreamConsumer errorConsumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return  a string representation of the process invocation.
     *
     *           This approximates the representation of this invocation
     *           in a shell. Note that the escaping of arguments is incomplete,
     *           it works only for whitespace. Fancy control characters are
     *           not replaced.
     *
     *           Also, this returns a representation of the current state of
     *           the builder. If more arguments are added the process this
     *           representation will not represent the process that gets launched.
     *
     * @deprecated Use getCommandLine instead.
     */
    @Deprecated
    public String getProcString() {
        return Proc.formatCommandLine(command, args);
    }

    /**
     * @return  a string representation of the process invocation.
     *
     *           This approximates the representation of this invocation
     *           in a shell. Note that the escaping of arguments is incomplete,
     *           it works only for whitespace. Fancy control characters are
     *           not replaced.
     *
     *           Also, this returns a representation of the current state of
     *           the builder. If more arguments are added the process this
     *           representation will not represent the process that gets launched.
     */
    public String getCommandLine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
