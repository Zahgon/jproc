package org.buildobjects.process;

import java.io.IOException;
import java.io.InputStream;
import static org.buildobjects.process.ExecutionEvent.EXCEPTION_IN_STREAM_HANDLING;

/**
 * This class ${end}
 */
class StreamConsumerConsumptionThread implements OutputConsumptionThread {

    private final EventSink eventSink;

    private final StreamConsumer stdout;

    private Thread thread;

    private Throwable throwable;

    public StreamConsumerConsumptionThread(EventSink eventSink, StreamConsumer stdout) {
        this.eventSink = eventSink;
        this.stdout = stdout;
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
