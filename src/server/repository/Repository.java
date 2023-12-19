package server.repository;

public interface Repository {
    String readLog();

    void saveInLog(String text);
}
