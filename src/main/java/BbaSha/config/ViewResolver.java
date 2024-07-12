package BbaSha.config;

import BbaSha.view.NotFoundView;
import BbaSha.view.View;

import java.util.HashMap;
import java.util.Map;

public class ViewResolver {

    private static final Map<String, View> viewMap = new HashMap<>();

    private static final View defaultView = new NotFoundView();

    public ViewResolver() {
        for(ConfigView configView : ConfigView.values()) {
            viewMap.put(configView.getName(), configView.getView());
        }
    }

    public View resolve(String viewName) {
        return viewMap.getOrDefault(viewName, defaultView);
    }

}
