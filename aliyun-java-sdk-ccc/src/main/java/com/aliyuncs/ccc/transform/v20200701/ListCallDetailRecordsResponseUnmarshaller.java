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

import com.aliyuncs.ccc.model.v20200701.ListCallDetailRecordsResponse;
import com.aliyuncs.ccc.model.v20200701.ListCallDetailRecordsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListCallDetailRecordsResponse.Data.CallDetailRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallDetailRecordsResponseUnmarshaller {

	public static ListCallDetailRecordsResponse unmarshall(ListCallDetailRecordsResponse listCallDetailRecordsResponse, UnmarshallerContext _ctx) {
		
		listCallDetailRecordsResponse.setRequestId(_ctx.stringValue("ListCallDetailRecordsResponse.RequestId"));
		listCallDetailRecordsResponse.setCode(_ctx.stringValue("ListCallDetailRecordsResponse.Code"));
		listCallDetailRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListCallDetailRecordsResponse.HttpStatusCode"));
		listCallDetailRecordsResponse.setMessage(_ctx.stringValue("ListCallDetailRecordsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCallDetailRecordsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCallDetailRecordsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCallDetailRecordsResponse.Data.TotalCount"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListCallDetailRecordsResponse.Data.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactDisposition(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].ContactDisposition"));
			callDetailRecord.setContactType(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].ContactType"));
			callDetailRecord.setEstablishedTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].EstablishedTime"));
			callDetailRecord.setCalledNumber(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].CalledNumber"));
			callDetailRecord.setAdditionalBroker(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].AdditionalBroker"));
			callDetailRecord.setSatisfactionIndex(_ctx.integerValue("ListCallDetailRecordsResponse.Data.List["+ i +"].SatisfactionIndex"));
			callDetailRecord.setSatisfactionSurveyChannel(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].SatisfactionSurveyChannel"));
			callDetailRecord.setReleaseTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].ReleaseTime"));
			callDetailRecord.setWaitTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].WaitTime"));
			callDetailRecord.setSkillGroupNames(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setIvrTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].IvrTime"));
			callDetailRecord.setSatisfactionDescription(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].SatisfactionDescription"));
			callDetailRecord.setReleaseInitiator(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].ReleaseInitiator"));
			callDetailRecord.setAgentIds(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].AgentIds"));
			callDetailRecord.setCallDuration(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].CallDuration"));
			callDetailRecord.setRecordingReady(_ctx.booleanValue("ListCallDetailRecordsResponse.Data.List["+ i +"].RecordingReady"));
			callDetailRecord.setInstanceId(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].InstanceId"));
			callDetailRecord.setRingTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].RingTime"));
			callDetailRecord.setSatisfactionSurveyOffered(_ctx.booleanValue("ListCallDetailRecordsResponse.Data.List["+ i +"].SatisfactionSurveyOffered"));
			callDetailRecord.setAgentNames(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].AgentNames"));
			callDetailRecord.setStartTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].StartTime"));
			callDetailRecord.setContactId(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].ContactId"));
			callDetailRecord.setRecordingDuration(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].RecordingDuration"));
			callDetailRecord.setCallingNumber(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].CallingNumber"));
			callDetailRecord.setQueueTime(_ctx.longValue("ListCallDetailRecordsResponse.Data.List["+ i +"].QueueTime"));
			callDetailRecord.setBroker(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].Broker"));
			callDetailRecord.setSkillGroupIds(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].SkillGroupIds"));
			callDetailRecord.setCallerLocation(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].CallerLocation"));
			callDetailRecord.setCalleeLocation(_ctx.stringValue("ListCallDetailRecordsResponse.Data.List["+ i +"].CalleeLocation"));

			list.add(callDetailRecord);
		}
		data.setList(list);
		listCallDetailRecordsResponse.setData(data);
	 
	 	return listCallDetailRecordsResponse;
	}
}