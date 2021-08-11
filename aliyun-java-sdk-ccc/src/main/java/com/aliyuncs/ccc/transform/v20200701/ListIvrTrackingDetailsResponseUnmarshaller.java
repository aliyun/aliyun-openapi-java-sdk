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

import com.aliyuncs.ccc.model.v20200701.ListIvrTrackingDetailsResponse;
import com.aliyuncs.ccc.model.v20200701.ListIvrTrackingDetailsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListIvrTrackingDetailsResponse.Data.IvrTracking;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIvrTrackingDetailsResponseUnmarshaller {

	public static ListIvrTrackingDetailsResponse unmarshall(ListIvrTrackingDetailsResponse listIvrTrackingDetailsResponse, UnmarshallerContext _ctx) {
		
		listIvrTrackingDetailsResponse.setRequestId(_ctx.stringValue("ListIvrTrackingDetailsResponse.RequestId"));
		listIvrTrackingDetailsResponse.setCode(_ctx.stringValue("ListIvrTrackingDetailsResponse.Code"));
		listIvrTrackingDetailsResponse.setHttpStatusCode(_ctx.integerValue("ListIvrTrackingDetailsResponse.HttpStatusCode"));
		listIvrTrackingDetailsResponse.setMessage(_ctx.stringValue("ListIvrTrackingDetailsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListIvrTrackingDetailsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListIvrTrackingDetailsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListIvrTrackingDetailsResponse.Data.TotalCount"));

		List<IvrTracking> list = new ArrayList<IvrTracking>();
		for (int i = 0; i < _ctx.lengthValue("ListIvrTrackingDetailsResponse.Data.List.Length"); i++) {
			IvrTracking ivrTracking = new IvrTracking();
			ivrTracking.setCallee(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].Callee"));
			ivrTracking.setCaller(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].Caller"));
			ivrTracking.setChannelId(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].ChannelId"));
			ivrTracking.setChannelVariables(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].ChannelVariables"));
			ivrTracking.setContactId(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].ContactId"));
			ivrTracking.setEnterTime(_ctx.longValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].EnterTime"));
			ivrTracking.setFlowId(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].FlowId"));
			ivrTracking.setFlowName(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].FlowName"));
			ivrTracking.setInstance(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].Instance"));
			ivrTracking.setLeaveTime(_ctx.longValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].LeaveTime"));
			ivrTracking.setNodeExitCode(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].NodeExitCode"));
			ivrTracking.setNodeId(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].NodeId"));
			ivrTracking.setNodeName(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].NodeName"));
			ivrTracking.setNodeProperties(_ctx.mapValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].NodeProperties"));
			ivrTracking.setNodeType(_ctx.stringValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].NodeType"));
			ivrTracking.setNodeVariables(_ctx.mapValue("ListIvrTrackingDetailsResponse.Data.List["+ i +"].NodeVariables"));

			list.add(ivrTracking);
		}
		data.setList(list);
		listIvrTrackingDetailsResponse.setData(data);
	 
	 	return listIvrTrackingDetailsResponse;
	}
}