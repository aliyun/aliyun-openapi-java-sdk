package com.aliyuncs.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Only for internal use within the package, do not use it arbitrarily, backward compatibility and sustainability cannot be guaranteed.
 */
public class ProfileUtils {
    private final static Log log = LogFactory.getLog(ProfileUtils.class);
    private static final Pattern EMPTY_LINE = Pattern.compile("^[\t ]*$");

    public static Map<String, Map<String, String>> parseFile(String profilePath) throws IOException {
        return parseFile(new FileReader(profilePath));
    }

    static Map<String, Map<String, String>> parseFile(Reader input) throws IOException {
        ParserProgress progress = new ParserProgress();
        BufferedReader profileReader = null;
        try {
            profileReader = new BufferedReader(input);
            String line;
            while ((line = profileReader.readLine()) != null) {
                parseLine(progress, line);
            }
        } finally {
            if (profileReader != null) {
                profileReader.close();
            }
        }
        return progress.profiles;
    }

    private static void parseLine(ParserProgress progress, String line) {
        ++progress.currentLineNumber;
        if (!EMPTY_LINE.matcher(line).matches() && !(line.startsWith("#") || line.startsWith(";"))) {
            if (isSectionDefinitionLine(line)) {
                readSectionDefinitionLine(progress, line);
            } else if (line.startsWith("\t")) {
                readPropertyContinuationLine(progress, line);
            } else {
                readPropertyDefinitionLine(progress, line);
            }
        }
    }

    private static void readSectionDefinitionLine(ParserProgress progress, String line) {
        String lineWithoutComments = removeTrailingComments(line, "#", ";");
        String lineWithoutWhitespace = lineWithoutComments.trim();

        if (!lineWithoutWhitespace.endsWith("]")) {
            throw new IllegalArgumentException(String.format("Section definition must end with ']' on line %s: %s", progress.currentLineNumber, line));
        }

        String lineWithoutBrackets = lineWithoutWhitespace.substring(1, lineWithoutWhitespace.length() - 1);
        String profileName = lineWithoutBrackets.trim();
        if (profileName.isEmpty()) {
            progress.ignoringCurrentProfile = true;
            return;
        }
        progress.currentProfileBeingRead = profileName;
        progress.currentPropertyBeingRead = null;
        progress.ignoringCurrentProfile = false;
        if (!progress.profiles.containsKey(profileName)) {
            progress.profiles.put(profileName, new LinkedHashMap<String, String>());
        }
    }

    private static void readPropertyDefinitionLine(ParserProgress progress, String line) {
        // Invalid profile, ignore its properties
        if (progress.ignoringCurrentProfile) {
            return;
        }
        if (progress.currentProfileBeingRead == null) {
            // throw new IllegalArgumentException(String.format("Expected a profile definition on line %s", progress.currentLineNumber));
            // To be consistent with ini4j's behavior
            progress.currentProfileBeingRead = "?";
            if (!progress.profiles.containsKey(progress.currentProfileBeingRead)) {
                progress.profiles.put(progress.currentProfileBeingRead, new LinkedHashMap<String, String>());
            }
        }

        // Comments with property must have whitespace before them, or they will be considered part of the value
        String lineWithoutComments = removeTrailingComments(line, " #", " ;", "\t#", "\t;");
        String lineWithoutWhitespace = lineWithoutComments.trim();
        Property<String, String> property = parsePropertyDefinition(progress, lineWithoutWhitespace);

        if (progress.profiles.get(progress.currentProfileBeingRead).containsKey(property.key())) {
            log.warn("Duplicate property '" + property.key() + "' detected on line " + progress.currentLineNumber +
                    ". The later one in the file will be used.");
        }

        progress.currentPropertyBeingRead = property.key();

        progress.profiles.get(progress.currentProfileBeingRead).put(property.key(), property.value());
    }

    private static void readPropertyContinuationLine(ParserProgress progress, String line) {
        // Invalid profile, ignore its properties
        if (progress.ignoringCurrentProfile) {
            return;
        }
        if (progress.currentProfileBeingRead == null) {
            // throw new IllegalArgumentException(String.format("Expected a profile definition on line %s", progress.currentLineNumber));
            // To be consistent with ini4j's behavior
            progress.currentProfileBeingRead = "?";
            if (!progress.profiles.containsKey(progress.currentProfileBeingRead)) {
                progress.profiles.put(progress.currentProfileBeingRead, new LinkedHashMap<String, String>());
            }
        }

        // Comments are not removed on property continuation lines. They're considered part of the value.
        line = line.trim();
        Map<String, String> profileProperties = progress.profiles.get(progress.currentProfileBeingRead);

        String currentPropertyValue = profileProperties.get(progress.currentPropertyBeingRead);
        String newPropertyValue = currentPropertyValue + "\n" + line;
        profileProperties.put(progress.currentPropertyBeingRead, newPropertyValue);
    }

    private static Property<String, String> parsePropertyDefinition(ParserProgress progress, String line) {
        int firstEqualsLocation = line.indexOf('=');
        String propertyKey = null;
        String propertyValue = null;
        if (firstEqualsLocation == -1) {
            // throw new IllegalArgumentException(String.format("Expected an '=' sign defining a property on line %s", progress.currentLineNumber));
            // To be consistent with ini4j's behavior
            propertyKey = line.trim();
        } else {
            propertyKey = line.substring(0, firstEqualsLocation).trim();
            propertyValue = line.substring(firstEqualsLocation + 1).trim();
        }

        if (propertyKey.isEmpty()) {
            throw new IllegalArgumentException(String.format("Property did not have a name on line %s", progress.currentLineNumber));
        }

        return new Property<String, String>(propertyKey, propertyValue);
    }

    private static boolean isSectionDefinitionLine(String line) {
        return line.trim().startsWith("[");
    }

    private static String removeTrailingComments(String line, String... commentPatterns) {
        int earliestMatchIndex = line.length();
        for (String pattern : commentPatterns) {
            int index = line.indexOf(pattern);
            if (index >= 0 && index < earliestMatchIndex) {
                earliestMatchIndex = index;
            }
        }
        return line.substring(0, earliestMatchIndex);
    }

    private static final class ParserProgress {
        private int currentLineNumber;
        private String currentProfileBeingRead;
        private String currentPropertyBeingRead;
        private boolean ignoringCurrentProfile;
        private final Map<String, Map<String, String>> profiles;

        private ParserProgress() {
            this.currentLineNumber = 0;
            this.currentProfileBeingRead = null;
            this.currentPropertyBeingRead = null;
            this.ignoringCurrentProfile = false;
            this.profiles = new LinkedHashMap<String, Map<String, String>>();
        }
    }

    private static final class Property<Key, Value> {
        private final Key key;
        private final Value value;

        private Property(Key key, Value value) {
            this.key = key;
            this.value = value;
        }

        public Key key() {
            return this.key;
        }

        public Value value() {
            return this.value;
        }
    }
}
