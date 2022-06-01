package main.java.mkutcher.examples;

public interface Publisher {

    interface MessagePublisher {

        void publishAsync(String message, Callback callback);

        default void publishSync(String message) throws Exception {

        }
    }

    interface Callback {

        void successful();

        void error(Exception e);
    }

}
