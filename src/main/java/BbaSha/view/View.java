package BbaSha.view;


import BbaSha.exception.BbaShaException;
import BbaSha.util.IOUtils;

public interface View {

    void print();

    default String input() throws BbaShaException {
        return IOUtils.readLine();
    }
}
