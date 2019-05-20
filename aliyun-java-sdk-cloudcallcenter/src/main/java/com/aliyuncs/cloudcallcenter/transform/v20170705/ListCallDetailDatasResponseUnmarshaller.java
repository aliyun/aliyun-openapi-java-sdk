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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListCallDetailDatasResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCallDetailDatasResponse.CallDetailRecords;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCallDetailDatasResponse.CallDetailRecords.CallDetailRecord;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCallDetailDatasResponse.CallDetailRecords.CallDetailRecord.CallDetailAgent;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListCallDetailDatasResponse.CallDetailRecords.CallDetailRecord.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallDetailDatasResponseUnmarshaller {

	public static ListCallDetailDatasResponse unmarshall(ListCallDetailDatasResponse listCallDetailDatasResponse, UnmarshallerContext context) {
		
		listCallDetailDatasResponse.setRequestId(context.stringValue("ListCallDetailDatasResponse.RequestId"));
		listCallDetailDatasResponse.setSuccess(context.booleanValue("ListCallDetailDatasResponse.Success"));
		listCallDetailDatasResponse.setCode(context.stringValue("ListCallDetailDatasResponse.Code"));
		listCallDetailDatasResponse.setMessage(context.stringValue("ListCallDetailDatasResponse.Message"));
		listCallDetailDatasResponse.setHttpStatusCode(context.integerValue("ListCallDetailDatasResponse.HttpStatusCode"));

		CallDetailRecords callDetailRecords = new CallDetailRecords();
		callDetailRecords.setTotalCount(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.TotalCount"));
		callDetailRecords.setPageNumber(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.PageNumber"));
		callDetailRecords.setPageSize(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.PageSize"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < context.lengthValue("ListCallDetailDatasResponse.CallDetailRecords.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].ContactId"));
			callDetailRecord.setStartTime(context.longValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].StartTime"));
			callDetailRecord.setDuration(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Duration"));
			callDetailRecord.setSatisfaction(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Satisfaction"));
			callDetailRecord.setContactType(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].ContactType"));
			callDetailRecord.setContactDisposition(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].ContactDisposition"));
			callDetailRecord.setCallingNumber(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].CallingNumber"));
			callDetailRecord.setCalledNumber(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].CalledNumber"));
			callDetailRecord.setAgentNames(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].AgentNames"));
			callDetailRecord.setSkillGroupNames(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setInstanceId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].InstanceId"));
			callDetailRecord.setExtraAttr(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].ExtraAttr"));
			callDetailRecord.setExtraAttr1(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].ExtraAttr"));
			callDetailRecord.setSatisfactionDesc(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].SatisfactionDesc"));
			callDetailRecord.setFeedback(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Feedback"));

			List<CallDetailAgent> agents = new ArrayList<CallDetailAgent>();
			for (int j = 0; j < context.lengthValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents.Length"); j++) {
				CallDetailAgent callDetailAgent = new CallDetailAgent();
				callDetailAgent.setContactId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].ContactId"));
				callDetailAgent.setAgentId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentId"));
				callDetailAgent.setAgentName(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentName"));
				callDetailAgent.setSkillGroupName(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].SkillGroupName"));
				callDetailAgent.setQueueTime(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].QueueTime"));
				callDetailAgent.setRingTime(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].RingTime"));
				callDetailAgent.setStartTime(context.longValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].StartTime"));
				callDetailAgent.setTalkTime(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].TalkTime"));
				callDetailAgent.setHoldTime(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].HoldTime"));
				callDetailAgent.setWorkTime(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].WorkTime"));
				callDetailAgent.setSatisfaction(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Satisfaction"));
				callDetailAgent.setFeedback(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Feedback"));

				agents.add(callDetailAgent);
			}
			callDetailRecord.setAgents(agents);

			List<Recording> recordings = new ArrayList<Recording>();
			for (int j = 0; j < context.lengthValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings.Length"); j++) {
				Recording recording = new Recording();
				recording.setContactId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactId"));
				recording.setContactType(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactType"));
				recording.setAgentId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentId"));
				recording.setAgentName(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentName"));
				recording.setCallingNumber(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].CallingNumber"));
				recording.setCalledNumber(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].CalledNumber"));
				recording.setStartTime(context.longValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].StartTime"));
				recording.setDuration(context.integerValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Duration"));
				recording.setFileName(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileName"));
				recording.setFilePath(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FilePath"));
				recording.setFileDescription(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileDescription"));
				recording.setChannel(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Channel"));
				recording.setInstanceId(context.stringValue("ListCallDetailDatasResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].InstanceId"));

				recordings.add(recording);
			}
			callDetailRecord.setRecordings(recordings);

			list.add(callDetailRecord);
		}
		callDetailRecords.setList(list);
		listCallDetailDatasResponse.setCallDetailRecords(callDetailRecords);
	 
	 	return listCallDetailDatasResponse;
	}
}