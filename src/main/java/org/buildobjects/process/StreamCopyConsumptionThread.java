package org.buildobjects.process;

import java.io.InputStream;
import java.io.OutputStream;
import static org.buildobjects.process.ExecutionEvent.EXCEPTION_IN_STREAM_HANDLING;

/**
 */
class StreamCopyConsumptionThread implements OutputConsumptionThread {

    private final OutputStream stdout;

    private Thread thread;

    private Throwable throwable;

    private final EventSink eventSink;

    public StreamCopyConsumptionThread(OutputStream stdout, EventSink eventSink) {
        this.stdout = stdout;
        this.eventSink = eventSink;
    }

    public void startConsumption(final InputStream inputStream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void join() throws InterruptedException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void interrupt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Throwable getThrowable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
