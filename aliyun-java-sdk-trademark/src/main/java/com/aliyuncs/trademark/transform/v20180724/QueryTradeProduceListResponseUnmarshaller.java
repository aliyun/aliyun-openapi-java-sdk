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

	public static QueryTradeProduceListResponse unmarshall(QueryTradeProduceListResponse queryTradeProduceListResponse, UnmarshallerContext context) {
		
		queryTradeProduceListResponse.setRequestId(context.stringValue("QueryTradeProduceListResponse.RequestId"));
		queryTradeProduceListResponse.setTotalItemNum(context.integerValue("QueryTradeProduceListResponse.TotalItemNum"));
		queryTradeProduceListResponse.setCurrentPageNum(context.integerValue("QueryTradeProduceListResponse.CurrentPageNum"));
		queryTradeProduceListResponse.setPageSize(context.integerValue("QueryTradeProduceListResponse.PageSize"));
		queryTradeProduceListResponse.setTotalPageNum(context.integerValue("QueryTradeProduceListResponse.TotalPageNum"));

		List<TradeProduces> data = new ArrayList<TradeProduces>();
		for (int i = 0; i < context.lengthValue("QueryTradeProduceListResponse.Data.Length"); i++) {
			TradeProduces tradeProduces = new TradeProduces();
			tradeProduces.setBizId(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].BizId"));
			tradeProduces.setPreOrderId(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].PreOrderId"));
			tradeProduces.setPreAmount(context.integerValue("QueryTradeProduceListResponse.Data["+ i +"].PreAmount"));
			tradeProduces.setFinalAmount(context.integerValue("QueryTradeProduceListResponse.Data["+ i +"].FinalAmount"));
			tradeProduces.setRegisterNumber(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].RegisterNumber"));
			tradeProduces.setClassification(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].Classification"));
			tradeProduces.setIcon(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].Icon"));
			tradeProduces.setOperateNote(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].OperateNote"));
			tradeProduces.setBuyerStatus(context.integerValue("QueryTradeProduceListResponse.Data["+ i +"].BuyerStatus"));
			tradeProduces.setUserId(context.stringValue("QueryTradeProduceListResponse.Data["+ i +"].UserId"));
			tradeProduces.setCreateTime(context.longValue("QueryTradeProduceListResponse.Data["+ i +"].CreateTime"));
			tradeProduces.setUpdateTime(context.longValue("QueryTradeProduceListResponse.Data["+ i +"].UpdateTime"));
			tradeProduces.setAllowCancel(context.booleanValue("QueryTradeProduceListResponse.Data["+ i +"].AllowCancel"));

			data.add(tradeProduces);
		}
		queryTradeProduceListResponse.setData(data);
	 
	 	return queryTradeProduceListResponse;
	}
}