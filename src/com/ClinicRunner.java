package com;

import com.view.ConsoleView;

public class ClinicRunner
{
    public static void main(String[] args)
    {
        ConsoleView consoleView = new ConsoleView();
        consoleView.addClients();
        consoleView.show();
    }
}
