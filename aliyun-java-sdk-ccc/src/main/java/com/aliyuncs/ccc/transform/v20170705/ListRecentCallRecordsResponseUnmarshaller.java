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

import com.aliyuncs.ccc.model.v20170705.ListRecentCallRecordsResponse;
import com.aliyuncs.ccc.model.v20170705.ListRecentCallRecordsResponse.CallDetailRecords;
import com.aliyuncs.ccc.model.v20170705.ListRecentCallRecordsResponse.CallDetailRecords.CallDetailRecord;
import com.aliyuncs.ccc.model.v20170705.ListRecentCallRecordsResponse.CallDetailRecords.CallDetailRecord.CallDetailAgent;
import com.aliyuncs.ccc.model.v20170705.ListRecentCallRecordsResponse.CallDetailRecords.CallDetailRecord.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecentCallRecordsResponseUnmarshaller {

	public static ListRecentCallRecordsResponse unmarshall(ListRecentCallRecordsResponse listRecentCallRecordsResponse, UnmarshallerContext _ctx) {
		
		listRecentCallRecordsResponse.setRequestId(_ctx.stringValue("ListRecentCallRecordsResponse.RequestId"));
		listRecentCallRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListRecentCallRecordsResponse.HttpStatusCode"));
		listRecentCallRecordsResponse.setCode(_ctx.stringValue("ListRecentCallRecordsResponse.Code"));
		listRecentCallRecordsResponse.setMessage(_ctx.stringValue("ListRecentCallRecordsResponse.Message"));
		listRecentCallRecordsResponse.setSuccess(_ctx.booleanValue("ListRecentCallRecordsResponse.Success"));

		CallDetailRecords callDetailRecords = new CallDetailRecords();
		callDetailRecords.setPageNumber(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.PageNumber"));
		callDetailRecords.setPageSize(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.PageSize"));
		callDetailRecords.setTotalCount(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.TotalCount"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListRecentCallRecordsResponse.CallDetailRecords.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactDisposition(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ContactDisposition"));
			callDetailRecord.setContactType(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ContactType"));
			callDetailRecord.setInstanceId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].InstanceId"));
			callDetailRecord.setCalledNumber(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].CalledNumber"));
			callDetailRecord.setAgentNames(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].AgentNames"));
			callDetailRecord.setSatisfaction(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Satisfaction"));
			callDetailRecord.setStartTime(_ctx.longValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].StartTime"));
			callDetailRecord.setExtraAttr(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ExtraAttr"));
			callDetailRecord.setSatisfactionDesc(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].SatisfactionDesc"));
			callDetailRecord.setContactId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ContactId"));
			callDetailRecord.setCallingNumber(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].CallingNumber"));
			callDetailRecord.setDuration(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Duration"));
			callDetailRecord.setSkillGroupNames(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setFeedback(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Feedback"));

			List<CallDetailAgent> agents = new ArrayList<CallDetailAgent>();
			for (int j = 0; j < _ctx.lengthValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents.Length"); j++) {
				CallDetailAgent callDetailAgent = new CallDetailAgent();
				callDetailAgent.setAgentId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentId"));
				callDetailAgent.setTalkTime(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].TalkTime"));
				callDetailAgent.setWorkTime(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].WorkTime"));
				callDetailAgent.setAgentName(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentName"));
				callDetailAgent.setRingTime(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].RingTime"));
				callDetailAgent.setSatisfaction(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Satisfaction"));
				callDetailAgent.setStartTime(_ctx.longValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].StartTime"));
				callDetailAgent.setContactId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].ContactId"));
				callDetailAgent.setSkillGroupName(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].SkillGroupName"));
				callDetailAgent.setHoldTime(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].HoldTime"));
				callDetailAgent.setQueueTime(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].QueueTime"));
				callDetailAgent.setFeedback(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Feedback"));

				agents.add(callDetailAgent);
			}
			callDetailRecord.setAgents(agents);

			List<Recording> recordings = new ArrayList<Recording>();
			for (int j = 0; j < _ctx.lengthValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings.Length"); j++) {
				Recording recording = new Recording();
				recording.setContactType(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactType"));
				recording.setAgentId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentId"));
				recording.setAgentName(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentName"));
				recording.setInstanceId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].InstanceId"));
				recording.setFileName(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileName"));
				recording.setCalledNumber(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].CalledNumber"));
				recording.setStartTime(_ctx.longValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].StartTime"));
				recording.setFilePath(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FilePath"));
				recording.setContactId(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactId"));
				recording.setCallingNumber(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].CallingNumber"));
				recording.setDuration(_ctx.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Duration"));
				recording.setFileDescription(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileDescription"));
				recording.setChannel(_ctx.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Channel"));

				recordings.add(recording);
			}
			callDetailRecord.setRecordings(recordings);

			list.add(callDetailRecord);
		}
		callDetailRecords.setList(list);
		listRecentCallRecordsResponse.setCallDetailRecords(callDetailRecords);
	 
	 	return listRecentCallRecordsResponse;
	}
}