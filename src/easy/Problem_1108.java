package easy;

public class Problem_1108 {
    public String defangIPaddr(String address) {
        StringBuilder defangedIPaddr = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                defangedIPaddr.append("[.]");
            } else {
                defangedIPaddr.append(address.charAt(i));
            }
        }
        return defangedIPaddr.toString();
    }
}
