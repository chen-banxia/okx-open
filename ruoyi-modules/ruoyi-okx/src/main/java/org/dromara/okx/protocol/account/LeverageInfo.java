package org.dromara.okx.protocol.account;

import com.codingapi.springboot.framework.rest.param.IRestParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dromara.okx.protocol.OkxResponse;

import java.util.List;

public class LeverageInfo {

    @Setter
    @Getter
    @ToString
    public static class Request implements IRestParam {

        /**
         * 产品ID
         * 支持多个instId查询，半角逗号分隔。instId个数不超过20个
         * 是否必须 是
         */
        private String instId;
        /**
         * 保证金模式
         * isolated：逐仓 cross：全仓
         * 是否必须 是
         */
        private String mgnMode;

    }

    @Setter
    @Getter
    @ToString
    public static class Data {
        private String instId;
        private String mgnMode;
        private String pocSide;
        private String lever;
    }

    @ToString
    public static class Response extends OkxResponse {

        public List<Data> getData() {
            return getMultiData(Data.class);
        }
    }
}
