package com.larryhsiao.badges.web;

import com.larryhsiao.badges.web.repositories.RepositoryFactory;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
import org.takes.http.Exit;
import org.takes.http.FtBasic;

public class Main {
    public static void main(String[] args) throws Exception {
        final RepositoryFactory factory = new RepositoryFactory();
        new FtBasic(
            new TkFork(
                new FkRegex("/robots\\.txt", "")
            ),
            8080
        ).start(Exit.NEVER);
    }
}
