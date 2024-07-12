package BbaSha;


import BbaSha.config.Dispatcher;
import BbaSha.exception.BbaShaException;
import BbaSha.view.View;

import static BbaSha.config.ConfigView.BUCKET_VIEW;
import static BbaSha.config.ConfigView.MAIN_VIEW;
import static BbaSha.util.IOUtils.writelnAndFlush;

public class BbaShaApplication {

    private static View view = BUCKET_VIEW.getView();
    private static final Dispatcher dispatcher = Dispatcher.of();


    public static void run() {

        try{
            startMain();
        } catch(BbaShaException e) {
            writelnAndFlush(e.getMessage());
        }
    }

    public static void startMain() throws BbaShaException {
        while(true) {
            view.print();
            String request = view.input();
            if(request.equals("0")) return;
            view = dispatcher.dispatch(view, request);
        }
    }
}
