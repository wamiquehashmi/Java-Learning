public class SearchInString {

    public static void main(String[] args) {
        String name = "wamique";
        System.out.println(search(name, 'u'));
        System.out.println(search2(name, 'u'));
    }

    // searching char in string
    static boolean search(String name, char ch) {
        if(name.isEmpty()) {
            return false;
        }
        for (int i=0; i<name.length(); i++) {
            if(name.charAt(i)==ch) {
                return true;
            }
        }
        return false;
    }

    // searching using different syntax
    static boolean search2(String name, char target) {
        if(name.isEmpty()) {
            return false;
        }
        for (char ch : name.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
}
