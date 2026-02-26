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

import com.aliyuncs.ccc.model.v20200701.ListCallDetailRecordsV2Response;
import com.aliyuncs.ccc.model.v20200701.ListCallDetailRecordsV2Response.Data;
import com.aliyuncs.ccc.model.v20200701.ListCallDetailRecordsV2Response.Data.CallDetailRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallDetailRecordsV2ResponseUnmarshaller {

	public static ListCallDetailRecordsV2Response unmarshall(ListCallDetailRecordsV2Response listCallDetailRecordsV2Response, UnmarshallerContext _ctx) {
		
		listCallDetailRecordsV2Response.setRequestId(_ctx.stringValue("ListCallDetailRecordsV2Response.RequestId"));
		listCallDetailRecordsV2Response.setCode(_ctx.stringValue("ListCallDetailRecordsV2Response.Code"));
		listCallDetailRecordsV2Response.setHttpStatusCode(_ctx.integerValue("ListCallDetailRecordsV2Response.HttpStatusCode"));
		listCallDetailRecordsV2Response.setMessage(_ctx.stringValue("ListCallDetailRecordsV2Response.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCallDetailRecordsV2Response.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCallDetailRecordsV2Response.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCallDetailRecordsV2Response.Data.TotalCount"));

		List<CallDetailRecord> list = new ArrayList<CallDetailRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListCallDetailRecordsV2Response.Data.List.Length"); i++) {
			CallDetailRecord callDetailRecord = new CallDetailRecord();
			callDetailRecord.setContactDisposition(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ContactDisposition"));
			callDetailRecord.setContactType(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ContactType"));
			callDetailRecord.setEstablishedTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].EstablishedTime"));
			callDetailRecord.setCalledNumber(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].CalledNumber"));
			callDetailRecord.setAdditionalBroker(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AdditionalBroker"));
			callDetailRecord.setSatisfactionIndex(_ctx.integerValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].SatisfactionIndex"));
			callDetailRecord.setSatisfactionSurveyChannel(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].SatisfactionSurveyChannel"));
			callDetailRecord.setReleaseTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ReleaseTime"));
			callDetailRecord.setWaitTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].WaitTime"));
			callDetailRecord.setSkillGroupNames(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].SkillGroupNames"));
			callDetailRecord.setIvrTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].IvrTime"));
			callDetailRecord.setSatisfactionDescription(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].SatisfactionDescription"));
			callDetailRecord.setReleaseInitiator(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ReleaseInitiator"));
			callDetailRecord.setAgentIds(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AgentIds"));
			callDetailRecord.setCallDuration(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].CallDuration"));
			callDetailRecord.setRecordingReady(_ctx.booleanValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].RecordingReady"));
			callDetailRecord.setInstanceId(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].InstanceId"));
			callDetailRecord.setRingTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].RingTime"));
			callDetailRecord.setSatisfactionSurveyOffered(_ctx.booleanValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].SatisfactionSurveyOffered"));
			callDetailRecord.setAgentNames(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AgentNames"));
			callDetailRecord.setStartTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].StartTime"));
			callDetailRecord.setContactId(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ContactId"));
			callDetailRecord.setRecordingDuration(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].RecordingDuration"));
			callDetailRecord.setCallingNumber(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].CallingNumber"));
			callDetailRecord.setQueueTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].QueueTime"));
			callDetailRecord.setBroker(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].Broker"));
			callDetailRecord.setSkillGroupIds(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].SkillGroupIds"));
			callDetailRecord.setCallerLocation(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].CallerLocation"));
			callDetailRecord.setCalleeLocation(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].CalleeLocation"));
			callDetailRecord.setEarlyMediaState(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].EarlyMediaState"));
			callDetailRecord.setReleaseReason(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ReleaseReason"));
			callDetailRecord.setDialingTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].DialingTime"));
			callDetailRecord.setTalkTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].TalkTime"));
			callDetailRecord.setHeldTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].HeldTime"));
			callDetailRecord.setEarlyMediaText(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].EarlyMediaText"));
			callDetailRecord.setOffSiteAgentIds(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].OffSiteAgentIds"));
			callDetailRecord.setOffsiteAgentDestinationNumbers(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].OffsiteAgentDestinationNumbers"));
			callDetailRecord.setMessagesSent(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].MessagesSent"));
			callDetailRecord.setMessagesSentByCustomer(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].MessagesSentByCustomer"));
			callDetailRecord.setMessagesSentByAgent(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].MessagesSentByAgent"));
			callDetailRecord.setFirstResponseTime(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].FirstResponseTime"));
			callDetailRecord.setMediaType(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].MediaType"));
			callDetailRecord.setTransferCount(_ctx.longValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].TransferCount"));
			callDetailRecord.setAccessChannelType(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AccessChannelType"));
			callDetailRecord.setAccessChannelName(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AccessChannelName"));
			callDetailRecord.setAccessChannelUserId(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AccessChannelUserId"));
			callDetailRecord.setAccessChannelUserName(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].AccessChannelUserName"));
			callDetailRecord.setClientIpAddress(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ClientIpAddress"));
			callDetailRecord.setClientLocation(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ClientLocation"));
			callDetailRecord.setClientUserAgent(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ClientUserAgent"));
			callDetailRecord.setClientAppName(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].ClientAppName"));
			callDetailRecord.setOffsiteAgentOriginatorNumbers(_ctx.stringValue("ListCallDetailRecordsV2Response.Data.List["+ i +"].OffsiteAgentOriginatorNumbers"));

			list.add(callDetailRecord);
		}
		data.setList(list);
		listCallDetailRecordsV2Response.setData(data);
	 
	 	return listCallDetailRecordsV2Response;
	}
}