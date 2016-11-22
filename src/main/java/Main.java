import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by Ynull on 2016/11/22.
 */
public class Main {
    //测试方法
    public  static  void main(String[] args){
        String url = "";
        try {
            Document doc = Jsoup.connect(url).get();
            String pos = "";
            String res = Parser.parse(doc,pos);
            System.out.println(res);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
