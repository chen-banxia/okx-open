package org.dromara.okx.protocol.account;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dromara.okx.protocol.OkxResponse;

import java.util.List;

public class Balance {

    @Setter
    @Getter
    @ToString
    public static class Detail {
        private String availBal;
        private String availEq;
        private String cashBal;
        private String ccy;
        private String crossLiab;
        private String disEq;
        private String eq;
        private String eqUsd;
        private String frozenBal;
        private String interest;
        private String isoEq;
        private String isoLiab;
        private String isoUpl;
        private String liab;
        private String maxLoan;
        private String mgnRatio;
        private String notionalLever;
        private String ordFrozen;
        private String twap;
        private String uTime;
        private String upl;
        private String uplLiab;
        private String stgyEq;
        private String spotInUseAmt;
    }

    @Setter
    @Getter
    @ToString
    public static class Data {
        private String adjEq;
        private String imr;
        private String isoEq;
        private String mgnRatio;
        private String mmr;
        private String notionalUsd;
        private String ordFroz;
        private String totalEq;
        private String uTime;

        private List<Detail> details;
    }


    @ToString
    public static class Response extends OkxResponse {

        public List<Data> getData() {
            return getMultiData(Data.class);
        }
    }

}
