package com.draxvel.petClinic;

import com.draxvel.petClinic.view.ConsoleView;

public class ClinicRunner
{
    public static void main(String[] args)
    {
        ConsoleView consoleView = new ConsoleView();
        consoleView.addClients();
        consoleView.show();
    }
}
