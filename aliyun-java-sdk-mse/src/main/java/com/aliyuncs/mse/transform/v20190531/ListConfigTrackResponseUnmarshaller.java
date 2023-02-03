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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListConfigTrackResponse;
import com.aliyuncs.mse.model.v20190531.ListConfigTrackResponse.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConfigTrackResponseUnmarshaller {

	public static ListConfigTrackResponse unmarshall(ListConfigTrackResponse listConfigTrackResponse, UnmarshallerContext _ctx) {
		
		listConfigTrackResponse.setRequestId(_ctx.stringValue("ListConfigTrackResponse.RequestId"));
		listConfigTrackResponse.setHttpCode(_ctx.stringValue("ListConfigTrackResponse.HttpCode"));
		listConfigTrackResponse.setPageSize(_ctx.longValue("ListConfigTrackResponse.PageSize"));
		listConfigTrackResponse.setPageNumber(_ctx.longValue("ListConfigTrackResponse.PageNumber"));
		listConfigTrackResponse.setTotalCount(_ctx.longValue("ListConfigTrackResponse.TotalCount"));
		listConfigTrackResponse.setMessage(_ctx.stringValue("ListConfigTrackResponse.Message"));
		listConfigTrackResponse.setErrorCode(_ctx.stringValue("ListConfigTrackResponse.ErrorCode"));
		listConfigTrackResponse.setSuccess(_ctx.booleanValue("ListConfigTrackResponse.Success"));

		List<Trace> traces = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("ListConfigTrackResponse.Traces.Length"); i++) {
			Trace trace = new Trace();
			trace.setLogDate(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].LogDate"));
			trace.setTs(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Ts"));
			trace.setRequestIp(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].RequestIp"));
			trace.setResponseIp(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].ResponseIp"));
			trace.setDataId(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].DataId"));
			trace.setGroup(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Group"));
			trace.setEvent(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Event"));
			trace.setResult(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Result"));
			trace.setDelay(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Delay"));
			trace.setMd5(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Md5"));
			trace.setType(_ctx.stringValue("ListConfigTrackResponse.Traces["+ i +"].Type"));
			trace.setPush(_ctx.booleanValue("ListConfigTrackResponse.Traces["+ i +"].Push"));
			trace.setClient(_ctx.booleanValue("ListConfigTrackResponse.Traces["+ i +"].Client"));

			traces.add(trace);
		}
		listConfigTrackResponse.setTraces(traces);
	 
	 	return listConfigTrackResponse;
	}
}