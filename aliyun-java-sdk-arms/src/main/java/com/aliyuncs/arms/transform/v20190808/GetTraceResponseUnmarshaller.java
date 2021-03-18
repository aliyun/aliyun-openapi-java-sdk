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

import com.aliyuncs.arms.model.v20190808.GetTraceResponse;
import com.aliyuncs.arms.model.v20190808.GetTraceResponse.Span;
import com.aliyuncs.arms.model.v20190808.GetTraceResponse.Span.LogEvent;
import com.aliyuncs.arms.model.v20190808.GetTraceResponse.Span.LogEvent.TagEntry2;
import com.aliyuncs.arms.model.v20190808.GetTraceResponse.Span.TagEntry;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTraceResponseUnmarshaller {

	public static GetTraceResponse unmarshall(GetTraceResponse getTraceResponse, UnmarshallerContext _ctx) {
		
		getTraceResponse.setRequestId(_ctx.stringValue("GetTraceResponse.RequestId"));

		List<Span> spans = new ArrayList<Span>();
		for (int i = 0; i < _ctx.lengthValue("GetTraceResponse.Spans.Length"); i++) {
			Span span = new Span();
			span.setTraceID(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].TraceID"));
			span.setOperationName(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].OperationName"));
			span.setDuration(_ctx.longValue("GetTraceResponse.Spans["+ i +"].Duration"));
			span.setServiceName(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].ServiceName"));
			span.setServiceIp(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].ServiceIp"));
			span.setTimestamp(_ctx.longValue("GetTraceResponse.Spans["+ i +"].Timestamp"));
			span.setRpcId(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].RpcId"));
			span.setResultCode(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].ResultCode"));
			span.setHaveStack(_ctx.booleanValue("GetTraceResponse.Spans["+ i +"].HaveStack"));
			span.setRpcType(_ctx.integerValue("GetTraceResponse.Spans["+ i +"].RpcType"));
			span.setSpanId(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].SpanId"));
			span.setParentSpanId(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].ParentSpanId"));

			List<TagEntry> tagEntryList = new ArrayList<TagEntry>();
			for (int j = 0; j < _ctx.lengthValue("GetTraceResponse.Spans["+ i +"].TagEntryList.Length"); j++) {
				TagEntry tagEntry = new TagEntry();
				tagEntry.setKey(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].TagEntryList["+ j +"].Key"));
				tagEntry.setValue(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].TagEntryList["+ j +"].Value"));

				tagEntryList.add(tagEntry);
			}
			span.setTagEntryList(tagEntryList);

			List<LogEvent> logEventList = new ArrayList<LogEvent>();
			for (int j = 0; j < _ctx.lengthValue("GetTraceResponse.Spans["+ i +"].LogEventList.Length"); j++) {
				LogEvent logEvent = new LogEvent();
				logEvent.setTimestamp(_ctx.longValue("GetTraceResponse.Spans["+ i +"].LogEventList["+ j +"].Timestamp"));

				List<TagEntry2> tagEntryList1 = new ArrayList<TagEntry2>();
				for (int k = 0; k < _ctx.lengthValue("GetTraceResponse.Spans["+ i +"].LogEventList["+ j +"].TagEntryList.Length"); k++) {
					TagEntry2 tagEntry2 = new TagEntry2();
					tagEntry2.setKey(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].LogEventList["+ j +"].TagEntryList["+ k +"].Key"));
					tagEntry2.setValue(_ctx.stringValue("GetTraceResponse.Spans["+ i +"].LogEventList["+ j +"].TagEntryList["+ k +"].Value"));

					tagEntryList1.add(tagEntry2);
				}
				logEvent.setTagEntryList1(tagEntryList1);

				logEventList.add(logEvent);
			}
			span.setLogEventList(logEventList);

			spans.add(span);
		}
		getTraceResponse.setSpans(spans);
	 
	 	return getTraceResponse;
	}
}