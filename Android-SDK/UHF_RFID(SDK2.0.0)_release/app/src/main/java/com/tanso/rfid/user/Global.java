
/*
 *   *********************************************************************************
 *   版  权  声  明
 *   *********************************************************************************
 *   本公司既深圳市探索智能科技有限公司,致力于物联网领域应用技术的深度开发和研究.
 *   公司核心产品软硬件均为自主研发,深耕行业多年,多项技术在行业内领先,甚至填补空白.
 *
 *   以下原始代码为本公司开发,未经本公司许可,任何公司,个人,或组织,事业单位,不得使用,转让,租借,赠送,上传,
 *   或共享此代码,一经发现,违者将承担所有因此代码带来的各种损失和法律责任,违法必究,请大家遵守法律,尊重知识产权!
 *
 *   本代码在不断更新中,对于软件代码,功能定义,系统架构难免存在不足之处,实际效果最终解释权归本公司.
 *   有问题请与本公司反馈,用户需要定制软件或硬件接口,可以联系本公司!
 *
 *   公司 : 深圳市探索智能科技有限公司
 *   地址 : 深圳宝安西乡航城工业区,智汇创新中心B座西607室.
 *   作者 : 施探宇
 *   电话 : 18680399436 (同微信) QQ : 190376601.
 *   网店 : https://shop479675916.taobao.com
 *
 *
 */

package com.tanso.rfid.user;

import com.tanso.rfid.BuildConfig;

/**
 * 全局通用类
 *
 * @author Aleck
 * @version 1.00
 */
public class Global {
    /**
     * 调试打印开关
     */
    public static final boolean DEBUG = BuildConfig.DEBUG;

    public static final boolean APP_REPORT = false;

    /**
     * 输出数据
     *
     * @param array : 数组
     */
    public static void dumpArray(byte[] array) {
        if (array == null) {
            System.out.print("array[]={null}\n");
        } else {
            System.out.printf("array[%d]=\n{\n", array.length);
            for (int i = 0; i < array.length; i++) {
                System.out.printf("%02x,", array[i]);
                if (i % 16 == 15) {
                    System.out.print("\n");
                }
            }
            System.out.print("\n}\n");
        }
    }

    /**
     * 转换数组到字符串
     *
     * @param array : 数组
     * @return : 字符串
     */
    public static String arrayToText(byte[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("array[");
        if (array == null) {
            sb.append(0);
        } else {
            sb.append(array.length);
        }
        sb.append("]={");
        if (array == null) {
            sb.append("null");
        } else {
            for (byte anArray : array) {
                sb.append(String.format("%02x,", anArray));
            }
        }
        sb.append("}");
        return sb.toString();
    }
}