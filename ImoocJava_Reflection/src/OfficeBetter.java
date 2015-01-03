/**
 * Created by Kevin on 2014/10/28.
 */
public class OfficeBetter {
    public static void main(String[] args){
        try{
            //动态加载类，在运行时刻加载。
            Class c = Class.forName(args[0]);
            //通过类类型，来创建对象
            //Word w = (Word)c.newInstance();
            OfficeAble oa = (OfficeAble)c.newInstance();
            oa.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
