package io.github.sachithariyathilaka;

import io.github.sachithariyathilaka.enums.Operation;

/**
 * Main class for the tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/27
 */
public class MavenRemoteApplicationTutorial
{

    public static void main(String[] args)
    {
        int a = 100;
        int b = 50;

        MavenRemoteLibraryTutorial.calculate(Operation.ADD, a, b);
        MavenRemoteLibraryTutorial.calculate(Operation.SUBSTRACT, a, b);
        MavenRemoteLibraryTutorial.calculate(Operation.MULTIPLY, a, b);
        MavenRemoteLibraryTutorial.calculate(Operation.DIVIDE, a, b);
    }
}
