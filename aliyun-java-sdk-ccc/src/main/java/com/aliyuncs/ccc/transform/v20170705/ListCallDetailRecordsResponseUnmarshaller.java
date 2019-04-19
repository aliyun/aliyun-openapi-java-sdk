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

import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords.CallDetailRecord;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords.CallDetailRecord.CallDetailAgent;
import com.aliyuncs.ccc.model.v20170705.ListCallDetailRecordsResponse.CallDetailRecords.CallDetailRecord.Recording;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallDetailRecordsResponseUnmarshaller {

	public static ListCallDetailRecordsResponse unmarshall(ListCallDetailRecordsResponse listCallDetailRecordsResponse, UnmarshallerContext context) {
		
		listCallDetailRecordsResponse.setRequestId(context.stringValue("ListCallDetailRecordsResponse.RequestId"));
		listCallDetailRecordsResponse.setSuccess(context.booleanValue("ListCallDetailRecordsResponse.Success"));
		listCallDetailRecordsResponse.setCode(context.stringValue("ListCallDetailRecordsResponse.Code"));
		listCallDetailRecordsResponse.setMessage(context.stringValue("ListCallDetailRecordsResponse.Message"));
		listCallDetailRecordsResponse.setHttpStatusCode(context.integerValue("ListCallDetailRecordsResponse.HttpStatusCode"));

		CallDetailRecords callDetailRecords = new CallDetailRecords();
		callDetailRecords.setTotalCount(context.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.TotalCount"));
		callDetailRecords.setPageNumber(context.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.PageNumber"));
		callDetailRecords.setPageSize(context.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.PageSize"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < context.lengthValue("ListCallDetailRecordsResponse.CallDetailRecords.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactId(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].ContactId"));
			callDetailRecord.setStartTime(context.longValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].StartTime"));
			callDetailRecord.setDuration(context.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Duration"));
			callDetailRecord.setSatisfaction(context.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Satisfaction"));
			callDetailRecord.setSatisfactionDesc(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].SatisfactionDesc"));
			callDetailRecord.setFeedback(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Feedback"));
			callDetailRecord.setContactType(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].ContactType"));
			callDetailRecord.setContactDisposition(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].ContactDisposition"));
			callDetailRecord.setCallingNumber(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].CallingNumber"));
			callDetailRecord.setCalledNumber(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].CalledNumber"));
			callDetailRecord.setAgentNames(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].AgentNames"));
			callDetailRecord.setSkillGroupNames(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setInstanceId(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].InstanceId"));

			List<CallDetailAgent> agents = new ArrayList<CallDetailAgent>();
			for (int j = 0; j < context.lengthValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents.Length"); j++) {
				CallDetailAgent callDetailAgent = new CallDetailAgent();
				callDetailAgent.setAgentId(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].AgentId"));
				callDetailAgent.setSatisfaction(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Satisfaction"));
				callDetailAgent.setFeedback(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Agents["+ j +"].Feedback"));

				agents.add(callDetailAgent);
			}
			callDetailRecord.setAgents(agents);

			List<Recording> recordings = new ArrayList<Recording>();
			for (int j = 0; j < context.lengthValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings.Length"); j++) {
				Recording recording = new Recording();
				recording.setContactId(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].ContactId"));
				recording.setAgentId(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentId"));
				recording.setAgentName(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].AgentName"));
				recording.setStartTime(context.longValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].StartTime"));
				recording.setDuration(context.integerValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].Duration"));
				recording.setFileName(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileName"));
				recording.setFileDescription(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].FileDescription"));
				recording.setQualityCheckTid(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].QualityCheckTid"));
				recording.setQualityCheckTaskId(context.stringValue("ListCallDetailRecordsResponse.CallDetailRecords.List["+ i +"].Recordings["+ j +"].QualityCheckTaskId"));

				recordings.add(recording);
			}
			callDetailRecord.setRecordings(recordings);

			list.add(callDetailRecord);
		}
		callDetailRecords.setList(list);
		listCallDetailRecordsResponse.setCallDetailRecords(callDetailRecords);
	 
	 	return listCallDetailRecordsResponse;
	}
}