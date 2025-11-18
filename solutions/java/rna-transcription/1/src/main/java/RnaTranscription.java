class RnaTranscription {

    String transcribe(String dnaStrand) {
        char[] arr = dnaStrand.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            {
                switch (arr[i]) {
                    case 'A':
                        arr[i] = 'U';
                        break;
                    case 'C':
                        arr[i] = 'G';
                        break;
                    case 'T':
                        arr[i] = 'A';
                        break;
                    case 'G':
                        arr[i] = 'C';
                        break;
                }
            }
        }
        return String.valueOf(arr);
    }

}
