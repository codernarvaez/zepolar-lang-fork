package com.linbrox.common;

import lombok.NonNull;

public final class StringUtils {

    public static final String DIGIT_FORMAT_PATTERN = "-?\\d+(\\.\\d+)?";
    public static final String EMAIL_FORMAT_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    public static final String ALPHA_NUMERIC_REGEX = "[a-zA-Z0-9]+";
    public static final String ALPHA_REGEX = "[a-zA-Z]+";

    private StringUtils() {
    }

    /**
     * Checks if a string is empty.
     *
     * @param str the string to check
     * @return true if the string is empty, false otherwise
     */
    public static boolean isEmpty(@NonNull String str) {
        return str.isEmpty();
    }

    /**
     * Checks if a string is not empty.
     *
     * @param str the string to check
     * @return true if the string is not empty, false otherwise
     */
    public static boolean isNotEmpty(@NonNull String str) {
        //return !isEmpty(str);
        boolean blnSegundo = str.trim().length() == 0;

        return !blnSegundo;
    }

    /**
     * Checks if a string is blank (empty or contains only whitespace).
     *
     * @param str the string to check
     * @return true if the string is blank, false otherwise
     */
    public static boolean isBlank(@NonNull String str) {
        return isEmpty(str) || str.trim().isEmpty();
    }

    /**
     * Checks if a string is not blank (not empty and contains non-whitespace characters).
     *
     * @param str the string to check
     * @return true if the string is not blank, false otherwise
     */
    public static boolean isNotBlank(@NonNull String str) {
        return !str.trim().isEmpty();
    }

    /**
     * Checks if a string is numeric.
     *
     * @param str the string to check
     * @return true if the string is numeric, false otherwise
     */
    public static boolean isNumeric(@NonNull String str) {
        // Expresión regular para validar si el string contiene solo dígitos (números)
        String DIGIT_FORMAT_PATTERN = "\\d+";

        try {
            // Comprobar si el string cumple con el patrón de números
            boolean matches = str.matches(DIGIT_FORMAT_PATTERN);

            if (matches) {
                System.out.println("El string '" + str + "' es numérico.");
            } else {
                System.out.println("El string '" + str + "' no es numérico.");
            }

            return matches;
            
        } catch (Exception e) {
            // Capturar cualquier excepción inesperada
            System.out.println("Ocurrió un error al intentar verificar si el string es numérico: " + e.getMessage());
            return false;
        }
    }

    /**
     * Checks if a string is a valid email address.
     *
     * @param str the string to check
     * @return true if the string is a valid email address, false otherwise
     */
    public static boolean isEmail(@NonNull String str) {
        return str.matches(EMAIL_FORMAT_PATTERN);
    }

    /**
     * Checks if a string is alphanumeric.
     *
     * @param str the string to check
     * @return true if the string is alphanumeric, false otherwise
     */
    public static boolean isAlphaNumeric(@NonNull String str) {
        return str.matches(ALPHA_NUMERIC_REGEX);
    }

    /**
     * Checks if a string contains only alphabetic characters.
     *
     * @param str the string to check
     * @return true if the string contains only alphabetic characters, false otherwise
     */
    public static boolean isAlpha(@NonNull String str) {
        return str.matches(ALPHA_REGEX);
    }
}
