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

	public static ListRecentCallRecordsResponse unmarshall(ListRecentCallRecordsResponse listRecentCallRecordsResponse, UnmarshallerContext context) {
		
		listRecentCallRecordsResponse.setRequestId(context.stringValue("ListRecentCallRecordsResponse.RequestId"));
		listRecentCallRecordsResponse.setSuccess(context.booleanValue("ListRecentCallRecordsResponse.Success"));
		listRecentCallRecordsResponse.setCode(context.stringValue("ListRecentCallRecordsResponse.Code"));
		listRecentCallRecordsResponse.setMessage(context.stringValue("ListRecentCallRecordsResponse.Message"));
		listRecentCallRecordsResponse.setHttpStatusCode(context.integerValue("ListRecentCallRecordsResponse.HttpStatusCode"));

		CallDetailRecords callDetailRecords = new CallDetailRecords();
		callDetailRecords.setTotalCount(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.TotalCount"));
		callDetailRecords.setPageNumber(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.PageNumber"));
		callDetailRecords.setPageSize(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.PageSize"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < context.lengthValue("ListRecentCallRecordsResponse.CallDetailRecords.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ContactId"));
			callDetailRecord.setStartTime(context.longValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].StartTime"));
			callDetailRecord.setDuration(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Duration"));
			callDetailRecord.setSatisfaction(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Satisfaction"));
			callDetailRecord.setContactType(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ContactType"));
			callDetailRecord.setContactDisposition(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ContactDisposition"));
			callDetailRecord.setCallingNumber(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].CallingNumber"));
			callDetailRecord.setCalledNumber(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].CalledNumber"));
			callDetailRecord.setAgentNames(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].AgentNames"));
			callDetailRecord.setSkillGroupNames(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setInstanceId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].InstanceId"));
			callDetailRecord.setExtraAttr(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ExtraAttr"));
			callDetailRecord.setExtraAttr1(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].ExtraAttr"));
			callDetailRecord.setSatisfactionDesc(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].SatisfactionDesc"));
			callDetailRecord.setFeedback(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Feedback"));

			List<CallDetailAgent> agents = new ArrayList<CallDetailAgent>();
			for (int j = 0; j < context.lengthValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents.Length"); j++) {
				CallDetailAgent callDetailAgent = new CallDetailAgent();
				callDetailAgent.setContactId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].ContactId"));
				callDetailAgent.setAgentId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentId"));
				callDetailAgent.setAgentName(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentName"));
				callDetailAgent.setSkillGroupName(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].SkillGroupName"));
				callDetailAgent.setQueueTime(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].QueueTime"));
				callDetailAgent.setRingTime(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].RingTime"));
				callDetailAgent.setStartTime(context.longValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].StartTime"));
				callDetailAgent.setTalkTime(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].TalkTime"));
				callDetailAgent.setHoldTime(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].HoldTime"));
				callDetailAgent.setWorkTime(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].WorkTime"));
				callDetailAgent.setSatisfaction(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Satisfaction"));
				callDetailAgent.setFeedback(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Feedback"));

				agents.add(callDetailAgent);
			}
			callDetailRecord.setAgents(agents);

			List<Recording> recordings = new ArrayList<Recording>();
			for (int j = 0; j < context.lengthValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings.Length"); j++) {
				Recording recording = new Recording();
				recording.setContactId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactId"));
				recording.setContactType(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactType"));
				recording.setAgentId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentId"));
				recording.setAgentName(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentName"));
				recording.setCallingNumber(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].CallingNumber"));
				recording.setCalledNumber(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].CalledNumber"));
				recording.setStartTime(context.longValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].StartTime"));
				recording.setDuration(context.integerValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Duration"));
				recording.setFileName(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileName"));
				recording.setFilePath(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FilePath"));
				recording.setFileDescription(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileDescription"));
				recording.setChannel(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Channel"));
				recording.setInstanceId(context.stringValue("ListRecentCallRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].InstanceId"));

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