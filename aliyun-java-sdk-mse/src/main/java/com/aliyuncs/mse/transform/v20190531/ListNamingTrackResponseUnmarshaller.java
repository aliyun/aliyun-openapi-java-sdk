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

import com.aliyuncs.mse.model.v20190531.ListNamingTrackResponse;
import com.aliyuncs.mse.model.v20190531.ListNamingTrackResponse.Trace;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNamingTrackResponseUnmarshaller {

	public static ListNamingTrackResponse unmarshall(ListNamingTrackResponse listNamingTrackResponse, UnmarshallerContext _ctx) {
		
		listNamingTrackResponse.setRequestId(_ctx.stringValue("ListNamingTrackResponse.RequestId"));
		listNamingTrackResponse.setHttpCode(_ctx.stringValue("ListNamingTrackResponse.HttpCode"));
		listNamingTrackResponse.setPageSize(_ctx.longValue("ListNamingTrackResponse.PageSize"));
		listNamingTrackResponse.setPageNumber(_ctx.longValue("ListNamingTrackResponse.PageNumber"));
		listNamingTrackResponse.setTotalCount(_ctx.longValue("ListNamingTrackResponse.TotalCount"));
		listNamingTrackResponse.setMessage(_ctx.stringValue("ListNamingTrackResponse.Message"));
		listNamingTrackResponse.setErrorCode(_ctx.stringValue("ListNamingTrackResponse.ErrorCode"));
		listNamingTrackResponse.setSuccess(_ctx.booleanValue("ListNamingTrackResponse.Success"));

		List<Trace> traces = new ArrayList<Trace>();
		for (int i = 0; i < _ctx.lengthValue("ListNamingTrackResponse.Traces.Length"); i++) {
			Trace trace = new Trace();
			trace.setPushTime(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].PushTime"));
			trace.setNodeName(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].NodeName"));
			trace.setClientIp(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].ClientIp"));
			trace.setServerName(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].ServerName"));
			trace.setGroup(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].Group"));
			trace.setInstanceSize(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].InstanceSize"));
			trace.setPushTimeAll(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].PushTimeAll"));
			trace.setPushTimeNetwork(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].PushTimeNetwork"));
			trace.setSlaTime(_ctx.stringValue("ListNamingTrackResponse.Traces["+ i +"].SlaTime"));

			traces.add(trace);
		}
		listNamingTrackResponse.setTraces(traces);
	 
	 	return listNamingTrackResponse;
	}
}