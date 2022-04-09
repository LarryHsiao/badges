package com.larryhsiao.badges.web;

import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.Exit;
import org.takes.http.FtBasic;

/**
 * Main object.
 */
public final class Main {
    private Main() {
    }

    private static final int DEFAULT_PORT = 8080;

    /**
     * Entry point of this web accessing module.
     *
     * @param args Arguments from execution.
     * @throws Exception Anything can happend.
     */
    public static void main(final String[] args) throws Exception {
        final RepositoryFactory factory = new RepositoryFactory();
        new FtBasic(
            new TkFork(
                new FkRegex("/robots\\.txt", "")
            ),
            DEFAULT_PORT
        ).start(Exit.NEVER);
    }
}
