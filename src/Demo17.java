void main() {

    final String BLUE = "\033[34;1m";
    final String RESET = "\033[0m";
    int ADDRESS_LENGTH = 10;
    int NAME_LENGTH = 20;
    final String LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(NAME_LENGTH)}+\{"-".repeat(ADDRESS_LENGTH)}+";
    final String HEADER_ROW = STR."|\{BLUE}%-5s\{RESET}|\{BLUE}%-\{NAME_LENGTH}s\{RESET}|\{BLUE}%-\{ADDRESS_LENGTH}s\{RESET}|\n";
    final String ROW = STR."|%-5s|%-\{NAME_LENGTH}s|%-\{ADDRESS_LENGTH}s|\n";
    System.out.println(LINE);
    System.out.printf(HEADER_ROW, " ID", " NAME", "ADDRESS");
    System.out.println(LINE);

    // ID-Name-Address, ID-Name-Address, ID-Name-Address
    String data = """
            5-Kasun Sampath-Galle,
            2-Amil Shantha-Panadura,
            10-Pradeep Kumara-Kandy,
            250-Ruwani-Matara,
            11-Supun-Panadura
            """;

    data = data.replace("\n", "");
    int count = data.isBlank() ? 0 : data.length() - data.replace(",", "").length() + 1;

    String ids = "", names = "", addresses = "";
    int commaIndex = 0;
    for (int i = 0; i < count; i++) {
        String studentDetail = data.substring(commaIndex, (i == count -1) ? data.length() :
                                                                data.indexOf(",", commaIndex));
        int firstHyphenIndex = studentDetail.indexOf("-");
        int lastHyphenIndex = studentDetail.lastIndexOf("-");
        String id = String.format("S%03d", Integer.parseInt(studentDetail.substring(0, firstHyphenIndex)));
        String name = studentDetail.substring(firstHyphenIndex + 1, lastHyphenIndex);
        String address = studentDetail.substring(lastHyphenIndex + 1);

//        ids += STR."\{id},";
//        names += STR."\{name},";
//        addresses += STR."\{address},";

        System.out.printf(ROW, id , name, address);

        commaIndex = data.indexOf(",", commaIndex) + 1;

        //            int hyphenIndex = studentDetail.indexOf("-");
//            String id = studentDetail.substring(0, hyphenIndex++);
//            String name = studentDetail.substring(hyphenIndex,
//                    hyphenIndex = studentDetail.indexOf("-", hyphenIndex) );
//            String address = studentDetail.substring(hyphenIndex+1);
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(address);
    }

    if (count == 0){
        System.out.printf(STR."|%-\{5 + NAME_LENGTH + ADDRESS_LENGTH + 2}s|\n", " NO DATA AVAILABLE");
    }

    System.out.println(LINE);
}