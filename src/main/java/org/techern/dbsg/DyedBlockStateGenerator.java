package org.techern.dbsg;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;

import java.nio.file.Path;
import java.util.logging.Logger;

/**
 * DyedBlockStateGenerator; A block state generator for dyed blocks
 *
 * @since 0.0.1
 */
public class DyedBlockStateGenerator {

    /**
     * The {@link Logger} used by {@link DyedBlockStateGenerator}
     *
     * @since 0.0.1
     */
    public static Logger LOGGER = Logger.getLogger("Generator");

    /**
     * Runs {@link DyedBlockStateGenerator}
     *
     * @param arguments The list of arguments
     * @since 0.0.1
     */
    public static void main(String... arguments) throws IOException {
        LOGGER.info("Starting the dyed block state generator...");

        Path rootPath = FileSystems.getDefault().getPath(".");

        Path templatePath = rootPath.resolve("templates");

        Path outputPath = rootPath.resolve("generated");

        LOGGER.info("Template path is " + templatePath.toString() + ", output path is " + outputPath.toString());

        if (Files.notExists(templatePath)) {
            Files.createDirectory(templatePath);
            LOGGER.warning("Template folder does not exist; Creating");
        }
        if (Files.notExists(outputPath)) {
            Files.createDirectory(outputPath);
            LOGGER.warning("Output folder does not exist; Creating");
        }



    }

}
