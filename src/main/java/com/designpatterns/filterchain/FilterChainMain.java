package com.designpatterns.filterchain;

import com.designpatterns.filterchain.filters.AuthenticationFilter;
import com.designpatterns.filterchain.filters.DebugFilter;

public class FilterChainMain {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
