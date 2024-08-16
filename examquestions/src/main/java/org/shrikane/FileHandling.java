package org.shrikane;

import java.nio.file.Path;

public class FileHandling {
    public static void main(String[] args) {
        final Path p1 = Path.of("E:\\Developer\\springprojects\\JavaCertification\\examquestions\\users\\joe");
        final Path p2 = Path.of("E:\\Developer\\springprojects\\JavaCertification\\examquestions\\users\\bob");
        System.out.println(p1.resolve(p1.relativize(p2)).normalize().getName(-1));

    }
}
