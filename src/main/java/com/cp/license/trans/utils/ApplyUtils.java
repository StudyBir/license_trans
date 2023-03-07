package com.cp.license.trans.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApplyUtils {

	/**
	 * 判断ip是否在地址段内
	 * @param startip
	 * @param endip
	 * @param ip
	 * @return
	 */
	public static boolean ipIsSpecifyRange(String startip, String endip, String ip) {
		startip = startip.trim();
		endip = endip.trim();
        ip = ip.trim();
        String[] sips = startip.split("\\.");
        String[] sipe = endip.split("\\.");
        String[] sipt = ip.split("\\.");
        long ips = 0L, ipe = 0L, ipt = 0L;
        for (int i = 0; i < 4; ++i) {
            ips = ips << 8 | Integer.parseInt(sips[i]);
            ipe = ipe << 8 | Integer.parseInt(sipe[i]);
            ipt = ipt << 8 | Integer.parseInt(sipt[i]);
        }
        if (ips > ipe) {
            long t = ips;
            ips = ipe;
            ipe = t;
        }
        return ips <= ipt && ipt <= ipe;
    }
	
	/**
	 * 判断当前系统时间是否在可申请时间段内
	 * @param nowTime
	 * @param beginTime
	 * @param endTime
	 * @return
	 * @throws ParseException 
	 */
	public static boolean belongCalendar(Date beginTime, Date endTime) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm"); // 设置日期格式
		Date nowTime = null;
		nowTime = df.parse(df.format(new Date()));
        if (nowTime.getTime() == beginTime.getTime()
                || nowTime.getTime() == endTime.getTime()) {
            return true;
        }

        Calendar date = Calendar.getInstance();
        date.setTime(nowTime);

        Calendar begin = Calendar.getInstance();
        begin.setTime(beginTime);

        Calendar end = Calendar.getInstance();
        end.setTime(endTime);

        if (date.after(begin) && date.before(end)) {
            return true;
        } else {
            return false;
        }
    }
}
