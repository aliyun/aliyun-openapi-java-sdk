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

	public static ListCallEventDetailByContactIdResponse unmarshall(ListCallEventDetailByContactIdResponse listCallEventDetailByContactIdResponse, UnmarshallerContext context) {
		
		listCallEventDetailByContactIdResponse.setRequestId(context.stringValue("ListCallEventDetailByContactIdResponse.RequestId"));
		listCallEventDetailByContactIdResponse.setSuccess(context.booleanValue("ListCallEventDetailByContactIdResponse.Success"));
		listCallEventDetailByContactIdResponse.setCode(context.stringValue("ListCallEventDetailByContactIdResponse.Code"));
		listCallEventDetailByContactIdResponse.setMessage(context.stringValue("ListCallEventDetailByContactIdResponse.Message"));
		listCallEventDetailByContactIdResponse.setHttpStatusCode(context.integerValue("ListCallEventDetailByContactIdResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCaller(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Caller"));
		data.setCallee(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Callee"));
		data.setCallType(context.stringValue("ListCallEventDetailByContactIdResponse.Data.CallType"));
		data.setStartTime(context.stringValue("ListCallEventDetailByContactIdResponse.Data.StartTime"));
		data.setPrivacyNumber(context.stringValue("ListCallEventDetailByContactIdResponse.Data.PrivacyNumber"));

		List<CallEventDetail> events = new ArrayList<CallEventDetail>();
		for (int i = 0; i < context.lengthValue("ListCallEventDetailByContactIdResponse.Data.Events.Length"); i++) {
			CallEventDetail callEventDetail = new CallEventDetail();
			callEventDetail.setTimeStamp(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].TimeStamp"));
			callEventDetail.setEvent(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].Event"));
			callEventDetail.setAgentName(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].AgentName"));
			callEventDetail.setStatus(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].Status"));
			callEventDetail.setCallMode(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].CallMode"));
			callEventDetail.setDuration(context.integerValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].Duration"));

			DetailData detailData = new DetailData();
			detailData.setEventType(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.EventType"));
			detailData.setHelper(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.Helper"));
			detailData.setSatisfactionalResearch(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.SatisfactionalResearch"));
			detailData.setSkillGroup(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.SkillGroup"));
			detailData.setHangUper(context.stringValue("ListCallEventDetailByContactIdResponse.Data.Events["+ i +"].DetailData.HangUper"));
			callEventDetail.setDetailData(detailData);

			events.add(callEventDetail);
		}
		data.setEvents(events);
		listCallEventDetailByContactIdResponse.setData(data);
	 
	 	return listCallEventDetailByContactIdResponse;
	}
}