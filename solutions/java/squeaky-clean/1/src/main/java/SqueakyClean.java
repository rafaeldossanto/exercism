class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean proximoMaiusculo = false;

        for (char c : identifier.toCharArray()) {
            if (c == ' ') {
                sb.append('_');
            } else if (c == '-') {
                proximoMaiusculo = true;
            } else if (Character.isLetter(c)) {
                if (proximoMaiusculo) {
                    sb.append(Character.toUpperCase(c));
                    proximoMaiusculo = false;
                } else {
                    sb.append(c);
                }
            } else {
                switch (c) {
                    case '4': sb.append('a'); break;
                    case '3': sb.append('e'); break;
                    case '0': sb.append('o'); break;
                    case '1': sb.append('l'); break;
                    case '7': sb.append('t'); break;
                }
            }
        }

        return sb.toString();
    }
}