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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.ListTrademarkApplicationLogsResponse;
import com.aliyuncs.trademark.model.v20190902.ListTrademarkApplicationLogsResponse.TrademarkApplicationLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrademarkApplicationLogsResponseUnmarshaller {

	public static ListTrademarkApplicationLogsResponse unmarshall(ListTrademarkApplicationLogsResponse listTrademarkApplicationLogsResponse, UnmarshallerContext _ctx) {
		
		listTrademarkApplicationLogsResponse.setRequestId(_ctx.stringValue("ListTrademarkApplicationLogsResponse.RequestId"));

		List<TrademarkApplicationLog> trademarkApplicationLogs = new ArrayList<TrademarkApplicationLog>();
		for (int i = 0; i < _ctx.lengthValue("ListTrademarkApplicationLogsResponse.TrademarkApplicationLogs.Length"); i++) {
			TrademarkApplicationLog trademarkApplicationLog = new TrademarkApplicationLog();
			trademarkApplicationLog.setBizId(_ctx.stringValue("ListTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].BizId"));
			trademarkApplicationLog.setNote(_ctx.stringValue("ListTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].Note"));
			trademarkApplicationLog.setOperateType(_ctx.integerValue("ListTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].OperateType"));
			trademarkApplicationLog.setOperateTime(_ctx.longValue("ListTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].OperateTime"));
			trademarkApplicationLog.setBizStatus(_ctx.integerValue("ListTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].BizStatus"));

			trademarkApplicationLogs.add(trademarkApplicationLog);
		}
		listTrademarkApplicationLogsResponse.setTrademarkApplicationLogs(trademarkApplicationLogs);
	 
	 	return listTrademarkApplicationLogsResponse;
	}
}