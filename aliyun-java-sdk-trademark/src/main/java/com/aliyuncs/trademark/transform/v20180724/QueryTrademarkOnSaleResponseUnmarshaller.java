/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkOnSaleResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkOnSaleResponse.Trademark;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkOnSaleResponseUnmarshaller {

	public static QueryTrademarkOnSaleResponse unmarshall(QueryTrademarkOnSaleResponse queryTrademarkOnSaleResponse, UnmarshallerContext _ctx) {
		
		queryTrademarkOnSaleResponse.setRequestId(_ctx.stringValue("QueryTrademarkOnSaleResponse.RequestId"));
		queryTrademarkOnSaleResponse.setPageSize(_ctx.integerValue("QueryTrademarkOnSaleResponse.PageSize"));
		queryTrademarkOnSaleResponse.setPageNumber(_ctx.integerValue("QueryTrademarkOnSaleResponse.PageNumber"));
		queryTrademarkOnSaleResponse.setTotalPageNumber(_ctx.integerValue("QueryTrademarkOnSaleResponse.TotalPageNumber"));
		queryTrademarkOnSaleResponse.setTotalCount(_ctx.integerValue("QueryTrademarkOnSaleResponse.TotalCount"));

		List<Trademark> trademarks = new ArrayList<Trademark>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkOnSaleResponse.Trademarks.Length"); i++) {
			Trademark trademark = new Trademark();
			trademark.setTrademarkName(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].TrademarkName"));
			trademark.setStatus(_ctx.longValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].Status"));
			trademark.setRegistrationNumber(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].RegistrationNumber"));
			trademark.setIcon(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].Icon"));
			trademark.setClassification(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].Classification"));
			trademark.setOrderPrice(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].OrderPrice"));
			trademark.setTmType(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].TmType"));
			trademark.setAuditResult(_ctx.stringValue("QueryTrademarkOnSaleResponse.Trademarks["+ i +"].AuditResult"));

			trademarks.add(trademark);
		}
		queryTrademarkOnSaleResponse.setTrademarks(trademarks);
	 
	 	return queryTrademarkOnSaleResponse;
	}
}