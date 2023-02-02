package cn.wule.wuspace.util;

//汉江师范学院 数计学院 吴乐创建于2022/12/27 20:52:16

import java.text.SimpleDateFormat;
import java.util.Date;

/**获取当前系统时间
 * @author 吴乐*/
public class GetNowTime
{
    /**@return 当前系统时间,格式为yyyy/MM/dd HH:mm:ss*/
    public static String getNowTime()
    {
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        return simpleDateFormat.format(nowTime);
    }
}