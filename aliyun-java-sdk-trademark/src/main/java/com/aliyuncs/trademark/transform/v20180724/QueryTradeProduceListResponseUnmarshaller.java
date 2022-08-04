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
		queryTradeProduceListResponse.setCurrentPageNum(_ctx.integerValue("QueryTradeProduceListResponse.CurrentPageNum"));
		queryTradeProduceListResponse.setTotalPageNum(_ctx.integerValue("QueryTradeProduceListResponse.TotalPageNum"));
		queryTradeProduceListResponse.setPageSize(_ctx.integerValue("QueryTradeProduceListResponse.PageSize"));
		queryTradeProduceListResponse.setTotalItemNum(_ctx.integerValue("QueryTradeProduceListResponse.TotalItemNum"));

		List<TradeProduces> data = new ArrayList<TradeProduces>();
		for (int i = 0; i < _ctx.lengthValue("QueryTradeProduceListResponse.Data.Length"); i++) {
			TradeProduces tradeProduces = new TradeProduces();
			tradeProduces.setUpdateTime(_ctx.longValue("QueryTradeProduceListResponse.Data["+ i +"].UpdateTime"));
			tradeProduces.setPreAmount(_ctx.floatValue("QueryTradeProduceListResponse.Data["+ i +"].PreAmount"));
			tradeProduces.setCreateTime(_ctx.longValue("QueryTradeProduceListResponse.Data["+ i +"].CreateTime"));
			tradeProduces.setUserId(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].UserId"));
			tradeProduces.setBizId(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].BizId"));
			tradeProduces.setIcon(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].Icon"));
			tradeProduces.setBuyerStatus(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].BuyerStatus"));
			tradeProduces.setSource(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].Source"));
			tradeProduces.setOperateNote(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].OperateNote"));
			tradeProduces.setPreOrderId(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].PreOrderId"));
			tradeProduces.setAllowCancel(_ctx.booleanValue("QueryTradeProduceListResponse.Data["+ i +"].AllowCancel"));
			tradeProduces.setRegisterNumber(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].RegisterNumber"));
			tradeProduces.setClassification(_ctx.stringValue("QueryTradeProduceListResponse.Data["+ i +"].Classification"));
			tradeProduces.setFinalAmount(_ctx.floatValue("QueryTradeProduceListResponse.Data["+ i +"].FinalAmount"));
			tradeProduces.setFailReason(_ctx.integerValue("QueryTradeProduceListResponse.Data["+ i +"].FailReason"));

			data.add(tradeProduces);
		}
		queryTradeProduceListResponse.setData(data);
	 
	 	return queryTradeProduceListResponse;
	}
}