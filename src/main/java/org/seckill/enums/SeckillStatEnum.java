package org.seckill.enums;

/**
 * 使用枚举来表述常量字典
 */
public enum SeckillStatEnum {
    // 秒杀成功
    SUCCESS(1, "秒杀成功!"),
    // 秒杀结束
    END(0, "秒杀结束!"),
    // 重复秒杀
    REPEAT_KILL(-1, "重复秒杀!"),
    // 系统异常
    INNER_ERROR(-2, "系统异常!"),
    // 数据篡改
    DATA_REWRITE(-3, "数据篡改!"),
    // 售罄
    SOLD_OUT(-4, "商品售罄！");

    private int state;
    private String stateInfo;

    SeckillStatEnum(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public static SeckillStatEnum stateOf(int index) {
        for (SeckillStatEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
