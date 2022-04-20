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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListSipTracesResponse;
import com.aliyuncs.ccc.model.v20200701.ListSipTracesResponse.CallTraces;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSipTracesResponseUnmarshaller {

	public static ListSipTracesResponse unmarshall(ListSipTracesResponse listSipTracesResponse, UnmarshallerContext _ctx) {
		
		listSipTracesResponse.setRequestId(_ctx.stringValue("ListSipTracesResponse.RequestId"));
		listSipTracesResponse.setCode(_ctx.stringValue("ListSipTracesResponse.Code"));
		listSipTracesResponse.setHttpStatusCode(_ctx.integerValue("ListSipTracesResponse.HttpStatusCode"));
		listSipTracesResponse.setMessage(_ctx.stringValue("ListSipTracesResponse.Message"));

		List<CallTraces> data = new ArrayList<CallTraces>();
		for (int i = 0; i < _ctx.lengthValue("ListSipTracesResponse.Data.Length"); i++) {
			CallTraces callTraces = new CallTraces();
			callTraces.setCallId(_ctx.stringValue("ListSipTracesResponse.Data["+ i +"].CallId"));
			callTraces.setContactId(_ctx.stringValue("ListSipTracesResponse.Data["+ i +"].ContactId"));
			callTraces.setFirstLine(_ctx.stringValue("ListSipTracesResponse.Data["+ i +"].FirstLine"));
			callTraces.setDestinationNodeIp(_ctx.stringValue("ListSipTracesResponse.Data["+ i +"].DestinationNodeIp"));
			callTraces.setSourceNodeIp(_ctx.stringValue("ListSipTracesResponse.Data["+ i +"].SourceNodeIp"));
			callTraces.setPayload(_ctx.stringValue("ListSipTracesResponse.Data["+ i +"].Payload"));
			callTraces.setTimestamp(_ctx.longValue("ListSipTracesResponse.Data["+ i +"].Timestamp"));

			data.add(callTraces);
		}
		listSipTracesResponse.setData(data);
	 
	 	return listSipTracesResponse;
	}
}