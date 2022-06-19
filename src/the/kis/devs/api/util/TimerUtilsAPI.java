package the.kis.devs.api.util;

import com.kisman.cc.util.TimerUtils;

/**
 * @author _kisman_
 * @since 13:10 of 16.06.2022
 */
public class TimerUtilsAPI extends TimerUtils {
    @Override public boolean isDelay(long delay) {return super.isDelay(delay);}
    @Override public boolean hasTimeElapsed(long time, boolean reset) {return super.hasTimeElapsed(time, reset);}
    @Override public long getCurrentMS() {return super.getCurrentMS();}
    @Override public void setLastMS(long lastMS) {super.setLastMS(lastMS);}
    @Override public void setLastMS() {super.setLastMS();}
    @Override public int convertToMS(int d) {return super.convertToMS(d);}
    @Override public void setTicks(long ticks) {super.setTicks(ticks);}
    @Override public void setNano(long time) {super.setNano(time);}
    @Override public void setMicro(long time) {super.setMicro(time);}
    @Override public void setMillis(long time) {super.setMillis(time);}
    @Override public void setSec(long time) {super.setSec(time);}
    @Override public long getTicks() {return super.getTicks();}
    @Override public long getNano() {return super.getNano();}
    @Override public long getMicro() {return super.getMicro();}
    @Override public long getMillis() {return super.getMillis();}
    @Override public long getSec() {return super.getSec();}
    @Override public boolean passedTicks(long ticks) {return super.passedTicks(ticks);}
    @Override public boolean passedNano(long time) {return super.passedNano(time);}
    @Override public boolean passedMicro(long time) {return super.passedMicro(time);}
    @Override public boolean passedMillis(long time) {return super.passedMillis(time);}
    @Override public boolean passedSec(long time) {return super.passedSec(time);}
    @Override public boolean hasReached(float f) {return super.hasReached(f);}
    @Override public void reset() {super.reset();}
    @Override public void resetTimeSkipTo(long ms) {super.resetTimeSkipTo(ms);}
    @Override public boolean delay(float milliSec) {return super.delay(milliSec);}
    @Override public long getTime() {return super.getTime();}
    @Override public long convertMillisToTicks(long time) {return super.convertMillisToTicks(time);}
    @Override public long convertTicksToMillis(long ticks) {return super.convertTicksToMillis(ticks);}
    @Override public long convertNanoToTicks(long time) {return super.convertNanoToTicks(time);}
    @Override public long convertTicksToNano(long ticks) {return super.convertTicksToNano(ticks);}
    @Override public long convertSecToMillis(long time) {return super.convertSecToMillis(time);}
    @Override public long convertSecToMicro(long time) {return super.convertSecToMicro(time);}
    @Override public long convertSecToNano(long time) {return super.convertSecToNano(time);}
    @Override public long convertMillisToMicro(long time) {return super.convertMillisToMicro(time);}
    @Override public long convertMillisToNano(long time) {return super.convertMillisToNano(time);}
    @Override public long convertMicroToNano(long time) {return super.convertMicroToNano(time);}
    @Override public long convertNanoToMicro(long time) {return super.convertNanoToMicro(time);}
    @Override public long convertNanoToMillis(long time) {return super.convertNanoToMillis(time);}
    @Override public long convertNanoToSec(long time) {return super.convertNanoToSec(time);}
    @Override public long convertMicroToMillis(long time) {return super.convertMicroToMillis(time);}
    @Override public long convertMicroToSec(long time) {return super.convertMicroToSec(time);}
    @Override public long convertMillisToSec(long time) {return super.convertMillisToSec(time);}
}
