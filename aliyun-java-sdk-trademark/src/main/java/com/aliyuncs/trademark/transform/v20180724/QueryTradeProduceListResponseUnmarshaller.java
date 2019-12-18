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

import com.aliyuncs.trademark.model.v20180724.QueryTradeProduceListResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeProduceListResponse.TradeProduces;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeProduceListResponseUnmarshaller {

	public static QueryTradeProduceListResponse unmarshall(QueryTradeProduceListResponse queryTradeProduceListResponse, UnmarshallerContext _ctx) {
		
		queryTradeProduceListResponse.setRequestId(_ctx.stringValue("QueryTradeProduceListResponse.RequestId"));
		queryTradeProduceListResponse.setTotalItemNum(_ctx.integerValue("QueryTradeProduceListResponse.TotalItemNum"));
		queryTradeProduceListResponse.setCurrentPageNum(_ctx.integerValue("QueryTradeProduceListResponse.CurrentPageNum"));
		queryTradeProduceListResponse.setPageSize(_ctx.integerValue("QueryTradeProduceListResponse.PageSize"));
		queryTradeProduceListResponse.setTotalPageNum(_ctx.integerValue("QueryTradeProduceListResponse.TotalPageNum"));

		List<TradeProduces> data = new ArrayList<TradeProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeProduceListResponse.Data.Length"); i++) {
			TradeProduces tradeProduces = new TradeProduces();
			tradeProduces.setBizId(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].BizId"));
			tradeProduces.setPreOrderId(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].PreOrderId"));
			tradeProduces.setPreAmount(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].PreAmount"));
			tradeProduces.setFinalAmount(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].FinalAmount"));
			tradeProduces.setRegisterNumber(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].RegisterNumber"));
			tradeProduces.setClassification(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].Classification"));
			tradeProduces.setIcon(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].Icon"));
			tradeProduces.setOperateNote(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].OperateNote"));
			tradeProduces.setBuyerStatus(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].BuyerStatus"));
			tradeProduces.setUserId(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].UserId"));
			tradeProduces.setCreateTime(_ctx.longValue("QueryTradeProduceListResponse.Data["+ i +"].CreateTime"));
			tradeProduces.setUpdateTime(_ctx.longValue("QueryTradeProduceListResponse.Data["+ i +"].UpdateTime"));
			tradeProduces.setAllowCancel(_ctx.booleanValue("QueryTradeProduceListResponse.Data["+ i +"].AllowCancel"));
			tradeProduces.setFailReason(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].FailReason"));

			data.add(tradeProduces);
		}
		queryTradeProduceListResponse.setData(data);
	 
	 	return queryTradeProduceListResponse;
	}
}