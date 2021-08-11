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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetHotlineCallActionResponse;
import com.aliyuncs.aiccs.model.v20191015.GetHotlineCallActionResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineCallActionResponseUnmarshaller {

	public static GetHotlineCallActionResponse unmarshall(GetHotlineCallActionResponse getHotlineCallActionResponse, UnmarshallerContext _ctx) {
		
		getHotlineCallActionResponse.setRequestId(_ctx.stringValue("GetHotlineCallActionResponse.RequestId"));
		getHotlineCallActionResponse.setMessage(_ctx.stringValue("GetHotlineCallActionResponse.Message"));
		getHotlineCallActionResponse.setCode(_ctx.stringValue("GetHotlineCallActionResponse.Code"));
		getHotlineCallActionResponse.setSuccess(_ctx.booleanValue("GetHotlineCallActionResponse.Success"));

		Data data = new Data();
		data.setTouchId(_ctx.longValue("GetHotlineCallActionResponse.Data.TouchId"));
		data.setDepId(_ctx.longValue("GetHotlineCallActionResponse.Data.DepId"));
		data.setMemberName(_ctx.stringValue("GetHotlineCallActionResponse.Data.MemberName"));
		data.setServicerName(_ctx.stringValue("GetHotlineCallActionResponse.Data.ServicerName"));
		data.setChannelType(_ctx.longValue("GetHotlineCallActionResponse.Data.ChannelType"));
		data.setActionId(_ctx.longValue("GetHotlineCallActionResponse.Data.ActionId"));
		data.setCalloutName(_ctx.stringValue("GetHotlineCallActionResponse.Data.CalloutName"));
		data.setSubTouchId(_ctx.longValue("GetHotlineCallActionResponse.Data.SubTouchId"));
		data.setServicerId(_ctx.longValue("GetHotlineCallActionResponse.Data.ServicerId"));
		data.setBuId(_ctx.longValue("GetHotlineCallActionResponse.Data.BuId"));
		data.setCalloutId(_ctx.longValue("GetHotlineCallActionResponse.Data.CalloutId"));
		data.setCaseId(_ctx.longValue("GetHotlineCallActionResponse.Data.CaseId"));
		data.setChannelId(_ctx.stringValue("GetHotlineCallActionResponse.Data.ChannelId"));
		data.setIsTransfer(_ctx.stringValue("GetHotlineCallActionResponse.Data.IsTransfer"));
		data.setMemberId(_ctx.longValue("GetHotlineCallActionResponse.Data.MemberId"));
		data.setTaskId(_ctx.longValue("GetHotlineCallActionResponse.Data.TaskId"));
		data.setMemberList(_ctx.stringValue("GetHotlineCallActionResponse.Data.MemberList"));
		getHotlineCallActionResponse.setData(data);
	 
	 	return getHotlineCallActionResponse;
	}
}