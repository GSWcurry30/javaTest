import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class JMap {
    public static Map<String,String[]> model = new LinkedHashMap<String,String[]>();
    static {
        model.put("bj",new String[]{"hd","cy","dc"});
        model.put("sh",new String[]{"pd","ja"});
        model.put("sz",new String[]{"ft","lh"});
    }

    public Object[] getProvince(){
        Set<String> s = model.keySet();
        return s.toArray();
    }

    public static void main(String[] args){
        String str[] = {"df","ds","fs"};
        model.put("gz",str);
        String[] ss = model.get("sh");
        for(int i=0;i<ss.length;i++)
        {
            System.out.println(ss[i]);
        }
        Object[] sss = new JMap().getProvince();
        for(int i=0;i<sss.length;i++)
        {
            System.out.println(sss[i]);
        }
    }
}
