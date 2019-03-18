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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeSignatureTradeListResponse;
import com.aliyuncs.cas.model.v20180813.DescribeSignatureTradeListResponse.Trade;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSignatureTradeListResponseUnmarshaller {

	public static DescribeSignatureTradeListResponse unmarshall(DescribeSignatureTradeListResponse describeSignatureTradeListResponse, UnmarshallerContext context) {
		
		describeSignatureTradeListResponse.setRequestId(context.stringValue("DescribeSignatureTradeListResponse.RequestId"));
		describeSignatureTradeListResponse.setCurrentPage(context.integerValue("DescribeSignatureTradeListResponse.CurrentPage"));
		describeSignatureTradeListResponse.setShowSize(context.integerValue("DescribeSignatureTradeListResponse.ShowSize"));
		describeSignatureTradeListResponse.setTotalCount(context.integerValue("DescribeSignatureTradeListResponse.TotalCount"));

		List<Trade> tradeList = new ArrayList<Trade>();
		for (int i = 0; i < context.lengthValue("DescribeSignatureTradeListResponse.TradeList.Length"); i++) {
			Trade trade = new Trade();
			trade.setId(context.longValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].Id"));
			trade.setDocTitle(context.stringValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].DocTitle"));
			trade.setTransactionId(context.stringValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].TransactionId"));
			trade.setPeopleName(context.stringValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].PeopleName"));
			trade.setCreateTime(context.longValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].CreateTime"));
			trade.setSignStatus(context.integerValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].SignStatus"));
			trade.setSignMode(context.integerValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].SignMode"));
			trade.setDocId(context.stringValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].DocId"));
			trade.setPeopleId(context.stringValue("DescribeSignatureTradeListResponse.TradeList["+ i +"].PeopleId"));

			tradeList.add(trade);
		}
		describeSignatureTradeListResponse.setTradeList(tradeList);
	 
	 	return describeSignatureTradeListResponse;
	}
}