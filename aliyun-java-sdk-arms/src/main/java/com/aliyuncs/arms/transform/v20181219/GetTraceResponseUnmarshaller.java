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

package com.aliyuncs.arms.transform.v20181219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20181219.GetTraceResponse;
import com.aliyuncs.arms.model.v20181219.GetTraceResponse.CallChainInfo;
import com.aliyuncs.arms.model.v20181219.GetTraceResponse.CallChainInfo.LogEvent;
import com.aliyuncs.arms.model.v20181219.GetTraceResponse.CallChainInfo.LogEvent.TagEntry2;
import com.aliyuncs.arms.model.v20181219.GetTraceResponse.CallChainInfo.TagEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTraceResponseUnmarshaller {

	public static GetTraceResponse unmarshall(GetTraceResponse getTraceResponse, UnmarshallerContext context) {
		
		getTraceResponse.setRequestId(context.stringValue("GetTraceResponse.RequestId"));

		List<CallChainInfo> data = new ArrayList<CallChainInfo>();
		for (int i = 0; i < context.lengthValue("GetTraceResponse.Data.Length"); i++) {
			CallChainInfo callChainInfo = new CallChainInfo();
			callChainInfo.setTraceID(context.stringValue("GetTraceResponse.Data["+ i +"].TraceID"));
			callChainInfo.setOperationName(context.stringValue("GetTraceResponse.Data["+ i +"].OperationName"));
			callChainInfo.setDuration(context.integerValue("GetTraceResponse.Data["+ i +"].Duration"));
			callChainInfo.setServiceName(context.stringValue("GetTraceResponse.Data["+ i +"].ServiceName"));
			callChainInfo.setServiceIp(context.stringValue("GetTraceResponse.Data["+ i +"].ServiceIp"));
			callChainInfo.setTimestamp(context.longValue("GetTraceResponse.Data["+ i +"].Timestamp"));
			callChainInfo.setRpcId(context.stringValue("GetTraceResponse.Data["+ i +"].RpcId"));
			callChainInfo.setResultCode(context.stringValue("GetTraceResponse.Data["+ i +"].ResultCode"));
			callChainInfo.setHaveStack(context.booleanValue("GetTraceResponse.Data["+ i +"].HaveStack"));

			List<TagEntry> tagEntryList = new ArrayList<TagEntry>();
			for (int j = 0; j < context.lengthValue("GetTraceResponse.Data["+ i +"].TagEntryList.Length"); j++) {
				TagEntry tagEntry = new TagEntry();
				tagEntry.setKey(context.stringValue("GetTraceResponse.Data["+ i +"].TagEntryList["+ j +"].Key"));
				tagEntry.setValue(context.stringValue("GetTraceResponse.Data["+ i +"].TagEntryList["+ j +"].Value"));

				tagEntryList.add(tagEntry);
			}
			callChainInfo.setTagEntryList(tagEntryList);

			List<LogEvent> logEventList = new ArrayList<LogEvent>();
			for (int j = 0; j < context.lengthValue("GetTraceResponse.Data["+ i +"].LogEventList.Length"); j++) {
				LogEvent logEvent = new LogEvent();
				logEvent.setTimestamp(context.longValue("GetTraceResponse.Data["+ i +"].LogEventList["+ j +"].Timestamp"));

				List<TagEntry2> tagEntryList1 = new ArrayList<TagEntry2>();
				for (int k = 0; k < context.lengthValue("GetTraceResponse.Data["+ i +"].LogEventList["+ j +"].TagEntryList.Length"); k++) {
					TagEntry2 tagEntry2 = new TagEntry2();
					tagEntry2.setKey(context.stringValue("GetTraceResponse.Data["+ i +"].LogEventList["+ j +"].TagEntryList["+ k +"].Key"));
					tagEntry2.setValue(context.stringValue("GetTraceResponse.Data["+ i +"].LogEventList["+ j +"].TagEntryList["+ k +"].Value"));

					tagEntryList1.add(tagEntry2);
				}
				logEvent.setTagEntryList1(tagEntryList1);

				logEventList.add(logEvent);
			}
			callChainInfo.setLogEventList(logEventList);

			data.add(callChainInfo);
		}
		getTraceResponse.setData(data);
	 
	 	return getTraceResponse;
	}
}