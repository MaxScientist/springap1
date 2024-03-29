package com.max.course.TheBasicsOfSpring;

public class App {
        private Client client;
        private ConsoleEventLogger eventLogger;
    public static void main(String[] args) {
        App app = new App();
        app.client = new Client(1, "John Smith");
        app.eventLogger = new ConsoleEventLogger();

        app.logevent("Some event for user 1");
    }

    private void logevent(String msg){
        String message = msg.replaceAll(String.valueOf(client.getId()),
                client.getFullName());
        eventLogger.logEvent(message);
    }


}
