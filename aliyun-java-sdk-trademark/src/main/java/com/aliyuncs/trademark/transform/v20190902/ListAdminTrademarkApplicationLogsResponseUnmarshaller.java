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

import com.aliyuncs.trademark.model.v20190902.ListAdminTrademarkApplicationLogsResponse;
import com.aliyuncs.trademark.model.v20190902.ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAdminTrademarkApplicationLogsResponseUnmarshaller {

	public static ListAdminTrademarkApplicationLogsResponse unmarshall(ListAdminTrademarkApplicationLogsResponse listAdminTrademarkApplicationLogsResponse, UnmarshallerContext _ctx) {
		
		listAdminTrademarkApplicationLogsResponse.setRequestId(_ctx.stringValue("ListAdminTrademarkApplicationLogsResponse.RequestId"));

		List<TrademarkApplicationLog> trademarkApplicationLogs = new ArrayList<TrademarkApplicationLog>();
		for (int i = 0; i < _ctx.lengthValue("ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLogs.Length"); i++) {
			TrademarkApplicationLog trademarkApplicationLog = new TrademarkApplicationLog();
			trademarkApplicationLog.setOperateTime(_ctx.longValue("ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].OperateTime"));
			trademarkApplicationLog.setOperateType(_ctx.integerValue("ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].OperateType"));
			trademarkApplicationLog.setNote(_ctx.stringValue("ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].Note"));
			trademarkApplicationLog.setBizId(_ctx.stringValue("ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].BizId"));
			trademarkApplicationLog.setBizStatus(_ctx.integerValue("ListAdminTrademarkApplicationLogsResponse.TrademarkApplicationLogs["+ i +"].BizStatus"));

			trademarkApplicationLogs.add(trademarkApplicationLog);
		}
		listAdminTrademarkApplicationLogsResponse.setTrademarkApplicationLogs(trademarkApplicationLogs);
	 
	 	return listAdminTrademarkApplicationLogsResponse;
	}
}