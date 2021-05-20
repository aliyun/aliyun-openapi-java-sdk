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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListCallEventDetailByContactIdResponse;
import com.aliyuncs.ccc.model.v20170705.ListCallEventDetailByContactIdResponse.Data;
import com.aliyuncs.ccc.model.v20170705.ListCallEventDetailByContactIdResponse.Data.CallEventDetail;
import com.aliyuncs.ccc.model.v20170705.ListCallEventDetailByContactIdResponse.Data.CallEventDetail.DetailData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallEventDetailByContactIdResponseUnmarshaller {

	public static ListCallEventDetailByContactIdResponse unmarshall(ListCallEventDetailByContactIdResponse listCallEventDetailByContactIdResponse, UnmarshallerContext _ctx) {
		
		listCallEventDetailByContactIdResponse.setRequestId(_ctx.stringValue("ListCallEventDetailByContactIdResponse.RequestId"));
		listCallEventDetailByContactIdResponse.setSuccess(_ctx.booleanValue("ListCallEventDetailByContactIdResponse.Success"));
		listCallEventDetailByContactIdResponse.setCode(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Code"));
		listCallEventDetailByContactIdResponse.setMessage(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Message"));
		listCallEventDetailByContactIdResponse.setHttpStatusCode(_ctx.integerValue("ListCallEventDetailByContactIdResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCaller(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Caller"));
		data.setCallee(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Callee"));
		data.setCallType(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.CallType"));
		data.setStartTime(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.StartTime"));
		data.setPrivacyNumber(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.PrivacyNumber"));
		data.setReleaseAgent(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.ReleaseAgent"));
		data.setReleaseReason(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.ReleaseReason"));

		List<CallEventDetail> events = new ArrayList<CallEventDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListCallEventDetailByContactIdResponse.Data.Events.Length"); i++) {
			CallEventDetail callEventDetail = new CallEventDetail();
			callEventDetail.setTimeStamp(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].TimeStamp"));
			callEventDetail.setEvent(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].Event"));
			callEventDetail.setAgentName(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].AgentName"));
			callEventDetail.setStatus(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].Status"));
			callEventDetail.setCallMode(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].CallMode"));
			callEventDetail.setDuration(_ctx.integerValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].Duration"));

			DetailData detailData = new DetailData();
			detailData.setEventType(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.EventType"));
			detailData.setHelper(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.Helper"));
			detailData.setSatisfactionalResearch(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.SatisfactionalResearch"));
			detailData.setSkillGroup(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.SkillGroup"));
			detailData.setHangUper(_ctx.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.HangUper"));
			callEventDetail.setDetailData(detailData);

			events.add(callEventDetail);
		}
		data.setEvents(events);
		listCallEventDetailByContactIdResponse.setData(data);
	 
	 	return listCallEventDetailByContactIdResponse;
	}
}