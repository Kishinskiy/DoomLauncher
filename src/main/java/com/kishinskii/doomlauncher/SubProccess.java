package com.kishinskii.doomlauncher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubProccess {
    public static void run (String command) {

        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("bash", "-c", command);

        try {

            Process process = processBuilder.start();

            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
