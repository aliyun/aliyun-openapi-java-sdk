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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetMultipleTraceResponse;
import com.aliyuncs.arms.model.v20190808.GetMultipleTraceResponse.MultiCallChainInfo;
import com.aliyuncs.arms.model.v20190808.GetMultipleTraceResponse.MultiCallChainInfo.Span;
import com.aliyuncs.arms.model.v20190808.GetMultipleTraceResponse.MultiCallChainInfo.Span.LogEvent;
import com.aliyuncs.arms.model.v20190808.GetMultipleTraceResponse.MultiCallChainInfo.Span.LogEvent.TagEntry2;
import com.aliyuncs.arms.model.v20190808.GetMultipleTraceResponse.MultiCallChainInfo.Span.TagEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMultipleTraceResponseUnmarshaller {

	public static GetMultipleTraceResponse unmarshall(GetMultipleTraceResponse getMultipleTraceResponse, UnmarshallerContext _ctx) {
		
		getMultipleTraceResponse.setRequestId(_ctx.stringValue("GetMultipleTraceResponse.RequestId"));

		List<MultiCallChainInfo> multiCallChainInfos = new ArrayList<MultiCallChainInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetMultipleTraceResponse.MultiCallChainInfos.Length"); i++) {
			MultiCallChainInfo multiCallChainInfo = new MultiCallChainInfo();
			multiCallChainInfo.setTraceID(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].TraceID"));

			List<Span> spans = new ArrayList<Span>();
			for (int j = 0; j < _ctx.lengthValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans.Length"); j++) {
				Span span = new Span();
				span.setTraceID(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].TraceID"));
				span.setOperationName(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].OperationName"));
				span.setDuration(_ctx.longValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].Duration"));
				span.setServiceName(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].ServiceName"));
				span.setServiceIp(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].ServiceIp"));
				span.setTimestamp(_ctx.longValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].Timestamp"));
				span.setRpcId(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].RpcId"));
				span.setResultCode(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].ResultCode"));
				span.setHaveStack(_ctx.booleanValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].HaveStack"));
				span.setRpcType(_ctx.integerValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].RpcType"));
				span.setSpanId(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].SpanId"));
				span.setParentSpanId(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].ParentSpanId"));

				List<TagEntry> tagEntryList = new ArrayList<TagEntry>();
				for (int k = 0; k < _ctx.lengthValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].TagEntryList.Length"); k++) {
					TagEntry tagEntry = new TagEntry();
					tagEntry.setKey(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].TagEntryList["+ k +"].Key"));
					tagEntry.setValue(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].TagEntryList["+ k +"].Value"));

					tagEntryList.add(tagEntry);
				}
				span.setTagEntryList(tagEntryList);

				List<LogEvent> logEventList = new ArrayList<LogEvent>();
				for (int k = 0; k < _ctx.lengthValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].LogEventList.Length"); k++) {
					LogEvent logEvent = new LogEvent();
					logEvent.setTimestamp(_ctx.longValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].LogEventList["+ k +"].Timestamp"));

					List<TagEntry2> tagEntryList1 = new ArrayList<TagEntry2>();
					for (int l = 0; l < _ctx.lengthValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].LogEventList["+ k +"].TagEntryList.Length"); l++) {
						TagEntry2 tagEntry2 = new TagEntry2();
						tagEntry2.setKey(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].LogEventList["+ k +"].TagEntryList["+ l +"].Key"));
						tagEntry2.setValue(_ctx.stringValue("GetMultipleTraceResponse.MultiCallChainInfos["+ i +"].Spans["+ j +"].LogEventList["+ k +"].TagEntryList["+ l +"].Value"));

						tagEntryList1.add(tagEntry2);
					}
					logEvent.setTagEntryList1(tagEntryList1);

					logEventList.add(logEvent);
				}
				span.setLogEventList(logEventList);

				spans.add(span);
			}
			multiCallChainInfo.setSpans(spans);

			multiCallChainInfos.add(multiCallChainInfo);
		}
		getMultipleTraceResponse.setMultiCallChainInfos(multiCallChainInfos);
	 
	 	return getMultipleTraceResponse;
	}
}