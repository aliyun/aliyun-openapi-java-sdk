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

import com.aliyuncs.ccc.model.v20200701.ListAttemptsResponse;
import com.aliyuncs.ccc.model.v20200701.ListAttemptsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListAttemptsResponse.Data.AttemptList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAttemptsResponseUnmarshaller {

	public static ListAttemptsResponse unmarshall(ListAttemptsResponse listAttemptsResponse, UnmarshallerContext _ctx) {
		
		listAttemptsResponse.setRequestId(_ctx.stringValue("ListAttemptsResponse.RequestId"));
		listAttemptsResponse.setCode(_ctx.stringValue("ListAttemptsResponse.Code"));
		listAttemptsResponse.setHttpStatusCode(_ctx.integerValue("ListAttemptsResponse.HttpStatusCode"));
		listAttemptsResponse.setMessage(_ctx.stringValue("ListAttemptsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListAttemptsResponse.Data.TotalCount"));
		data.setPageNumber(_ctx.integerValue("ListAttemptsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAttemptsResponse.Data.PageSize"));

		List<AttemptList> list = new ArrayList<AttemptList>();
		for (int i = 0; i < _ctx.lengthValue("ListAttemptsResponse.Data.List.Length"); i++) {
			AttemptList attemptList = new AttemptList();
			attemptList.setAttemptId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].AttemptId"));
			attemptList.setContactId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].ContactId"));
			attemptList.setCaseId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].CaseId"));
			attemptList.setCampaignId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].CampaignId"));
			attemptList.setInstanceId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].InstanceId"));
			attemptList.setQueueId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].QueueId"));
			attemptList.setCaller(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].Caller"));
			attemptList.setCallee(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].Callee"));
			attemptList.setAgentId(_ctx.stringValue("ListAttemptsResponse.Data.List["+ i +"].AgentId"));
			attemptList.setDialTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].DialTime"));
			attemptList.setDialDuration(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].DialDuration"));
			attemptList.setCustomerEstablishedTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].CustomerEstablishedTime"));
			attemptList.setCustomerReleasedTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].CustomerReleasedTime"));
			attemptList.setEnterIvrTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].EnterIvrTime"));
			attemptList.setIvrDuration(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].IvrDuration"));
			attemptList.setEnqueueTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].EnqueueTime"));
			attemptList.setQueueDuration(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].QueueDuration"));
			attemptList.setAssignAgentTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].AssignAgentTime"));
			attemptList.setAgentRingDuration(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].AgentRingDuration"));
			attemptList.setAgentEstablishedTime(_ctx.longValue("ListAttemptsResponse.Data.List["+ i +"].AgentEstablishedTime"));

			list.add(attemptList);
		}
		data.setList(list);
		listAttemptsResponse.setData(data);
	 
	 	return listAttemptsResponse;
	}
}