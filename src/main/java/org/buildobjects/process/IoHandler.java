package org.buildobjects.process;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class IoHandler {

    private final OutputConsumptionThread stdout;

    private final OutputConsumptionThread stderr;

    Thread inFeeder;

    IoHandler(InputStream stdin, OutputConsumptionThread stdout, OutputConsumptionThread stderr, Process process) {
        this.stdout = stdout;
        this.stderr = stderr;
        InputStream out = process.getInputStream();
        InputStream err = process.getErrorStream();
        OutputStream in = process.getOutputStream();
        stdout.startConsumption(out);
        stderr.startConsumption(err);
        inFeeder = startConsumption(in, stdin, true);
    }

    List<Throwable> joinConsumption() throws InterruptedException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    void cancelConsumption() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    Thread startConsumption(OutputStream stdout, InputStream out, boolean closeAfterWriting) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
