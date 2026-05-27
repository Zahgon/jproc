package org.buildobjects.process;

import java.io.ByteArrayOutputStream;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Signals the failure of an external process that returned a non zero exit code. It captures additional information
 * such as the output on stderr.
 */
public class ExternalProcessFailureException extends RuntimeException {

    private final String command;

    final private String commandLine;

    final private int exitValue;

    final private String stderr;

    private final ByteArrayOutputStream stdout;

    final private long time;

    ExternalProcessFailureException(String command, String commandLine, int exitValue, String stderr, ByteArrayOutputStream stdOut, long time) {
        this.command = command;
        this.commandLine = commandLine;
        this.exitValue = exitValue;
        this.stderr = stderr;
        this.stdout = stdOut;
        this.time = time;
    }

    private String formatOutput(String string, String prefix) {
        if (string == null) {
            return prefix + "<Has already been consumed.>\n";
        }
        if (string.isEmpty()) {
            return "";
        }
        return prefixLines(string, prefix);
    }

    private String prefixLines(String string, String prefix) {
        StringBuilder builder = new StringBuilder();
        String[] lines = string.split("\n");
        for (String line : lines) {
            builder.append(prefix + line + "\n");
        }
        return builder.toString();
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the command that was executed
     * @deprecated Use getCommandLine
     */
    @Deprecated
    public String getCommand() {
        return commandLine;
    }

    /**
     * @return a command line to invoke this process including args and using basic shell escaping.
     */
    public String getCommandLine() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the actual exit value
     */
    public int getExitValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the output on stderr
     */
    public String getStderr() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the execution time until the process failed
     */
    public long getTime() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
