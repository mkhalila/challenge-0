public class SingleCharacterEdit {
	private static boolean editMade;

    public static String singleCharacterEditWillTurnAIntoB(String a, String b) {
        if ( (Math.abs( a.length() - b.length() ) < 2) && (!a.equals(b)) ) {
        	editMade = false;
        	while(editMade == false) {
        		if (a.length() == b.length()) {
        			return replace(a, b);
        		}
        		else if (a.length() > b.length()) {
        			return remove(a, b);
        		}
        		else {
        			return insert(a, b);
        		}
        	}
        }
        return null; // this is only here to make it compile
    }

    private static String replace(String a, String b) {
    	for (int i = 0; i < a.length(); i++) {
    		if (a.charAt(i) != b.charAt(i)) {
    			editMade = true;
    			return "replace," + i + "," + b.charAt(i);
    		}
    	}
    	return null;
    }

    private static String remove(String a, String b) {
    	for (int i = 0; i < a.length(); i++) {
    		if (a.charAt(i) != b.charAt(i)) {
    			editMade = true;
    			return "remove," + i;
    		}
    	}
    	return null;
    }

    private static String insert(String a, String b) {
    	return null;
    }

}

