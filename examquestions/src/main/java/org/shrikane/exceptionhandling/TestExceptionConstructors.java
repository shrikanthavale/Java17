package org.shrikane.exceptionhandling;

import java.io.Closeable;
import java.io.IOException;

public class TestExceptionConstructors {
    public static void main(String[] args) throws Exception {
        try (var h = new Java17PrepExceptionAutoClosable(3); var i = new Java17PrepExceptionAutoClosable(4)) {

        } catch(final IOException e) {

        }catch(final Exception e) {

        } finally {
            System.out.println(9);
        }
//        test = null;
    }

    public static void doSomething () throws Java17PrepException {
        throw new Java17PrepException();
    }
}

class Java17PrepIOException extends IOException {
    public Java17PrepIOException(String message) {
        super(message);
    }
}

class Java17PrepException extends Exception {
    public Java17PrepException(Exception cause) {
    }

    public Java17PrepException(String message) {
        super(new Exception(new Java17PrepException()));
    }

    public Java17PrepException() {
        super("Java17Prep");
    }
}

class Java17PrepExceptionAutoClosable implements AutoCloseable {

    private final int someVariable;

    Java17PrepExceptionAutoClosable(int someVariable) {
        this.someVariable = someVariable;
    }

    public void throwException() throws IOException {
        throw new IOException();
    }

    @Override
    public void close() throws Exception {
        System.out.println(someVariable);
        throw new Exception("from close method");
    }
    
    public static void testException() throws IOException {
        throw new RuntimeException();
    }
}
