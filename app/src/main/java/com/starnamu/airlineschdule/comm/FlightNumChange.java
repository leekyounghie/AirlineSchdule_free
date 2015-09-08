package com.starnamu.airlineschdule.comm;

/**
 * 문자열을 넘겨받아 ASCII Code로 변환 시키는 Class
 */
public class FlightNumChange {

    public int getAscIICode(String str) {
        int FlightIntI = 0;
        for (int i = 0; i < str.length(); i++) {
            int FlightIntO = (int) str.charAt(i);
            FlightIntI = FlightIntI + FlightIntO;
        }
        return FlightIntI;
    }

    public Boolean getCondition(String FlightNum, int AscIICodeNUm) {
        int FlightAscIICode = getAscIICode(FlightNum);
        if (FlightAscIICode != AscIICodeNUm) {
            return false;
        }
        return true;
    }
}
