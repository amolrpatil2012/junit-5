public class StringUtils {

    public static Double converToDouble(String str)
    {
        if ( str==null)
            return null;
        else
            return Double.valueOf(str);

    }
    public static boolean isNullOrBlank(String s)
    {
        return  s==null || s.trim().length()==0;
    }
    public static String getDefaultIfNull(final String st, final String defaultSt) {
        return st == null ? defaultSt : st;
    }
    public static Integer convertToInt(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("String must be not null or empty");
        }
        return Integer.valueOf(str);
    }
}
