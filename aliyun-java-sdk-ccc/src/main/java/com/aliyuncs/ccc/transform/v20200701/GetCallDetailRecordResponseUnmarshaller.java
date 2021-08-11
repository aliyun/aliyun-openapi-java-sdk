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

import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.AgentEventsItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.AgentEventsItem.EventSequenceItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.IvrEventsItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.IvrEventsItem.EventSequenceItem2;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.QueueEventsItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.QueueEventsItem.EventSequenceItem4;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallDetailRecordResponseUnmarshaller {

	public static GetCallDetailRecordResponse unmarshall(GetCallDetailRecordResponse getCallDetailRecordResponse, UnmarshallerContext _ctx) {
		
		getCallDetailRecordResponse.setRequestId(_ctx.stringValue("GetCallDetailRecordResponse.RequestId"));
		getCallDetailRecordResponse.setCode(_ctx.stringValue("GetCallDetailRecordResponse.Code"));
		getCallDetailRecordResponse.setHttpStatusCode(_ctx.integerValue("GetCallDetailRecordResponse.HttpStatusCode"));
		getCallDetailRecordResponse.setMessage(_ctx.stringValue("GetCallDetailRecordResponse.Message"));

		Data data = new Data();
		data.setAgentIds(_ctx.stringValue("GetCallDetailRecordResponse.Data.AgentIds"));
		data.setAgentNames(_ctx.stringValue("GetCallDetailRecordResponse.Data.AgentNames"));
		data.setCalledNumber(_ctx.stringValue("GetCallDetailRecordResponse.Data.CalledNumber"));
		data.setCallingNumber(_ctx.stringValue("GetCallDetailRecordResponse.Data.CallingNumber"));
		data.setContactDisposition(_ctx.stringValue("GetCallDetailRecordResponse.Data.ContactDisposition"));
		data.setContactId(_ctx.stringValue("GetCallDetailRecordResponse.Data.ContactId"));
		data.setContactType(_ctx.stringValue("GetCallDetailRecordResponse.Data.ContactType"));
		data.setCallDuration(_ctx.longValue("GetCallDetailRecordResponse.Data.CallDuration"));
		data.setEstablishedTime(_ctx.longValue("GetCallDetailRecordResponse.Data.EstablishedTime"));
		data.setInstanceId(_ctx.stringValue("GetCallDetailRecordResponse.Data.InstanceId"));
		data.setStartTime(_ctx.longValue("GetCallDetailRecordResponse.Data.StartTime"));
		data.setReleaseTime(_ctx.longValue("GetCallDetailRecordResponse.Data.ReleaseTime"));
		data.setSkillGroupIds(_ctx.stringValue("GetCallDetailRecordResponse.Data.SkillGroupIds"));
		data.setSkillGroupNames(_ctx.stringValue("GetCallDetailRecordResponse.Data.SkillGroupNames"));
		data.setSatisfactionSurveyOffered(_ctx.booleanValue("GetCallDetailRecordResponse.Data.SatisfactionSurveyOffered"));
		data.setSatisfaction(_ctx.integerValue("GetCallDetailRecordResponse.Data.Satisfaction"));
		data.setSatisfactionSurveyChannel(_ctx.stringValue("GetCallDetailRecordResponse.Data.SatisfactionSurveyChannel"));
		data.setReleaseInitiator(_ctx.stringValue("GetCallDetailRecordResponse.Data.ReleaseInitiator"));
		data.setRecordingReady(_ctx.booleanValue("GetCallDetailRecordResponse.Data.RecordingReady"));

		List<AgentEventsItem> agentEvents = new ArrayList<AgentEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallDetailRecordResponse.Data.AgentEvents.Length"); i++) {
			AgentEventsItem agentEventsItem = new AgentEventsItem();
			agentEventsItem.setAgentId(_ctx.stringValue("GetCallDetailRecordResponse.Data.AgentEvents["+ i +"].AgentId"));
			agentEventsItem.setAgentName(_ctx.stringValue("GetCallDetailRecordResponse.Data.AgentEvents["+ i +"].AgentName"));
			agentEventsItem.setSkillGroupId(_ctx.stringValue("GetCallDetailRecordResponse.Data.AgentEvents["+ i +"].SkillGroupId"));

			List<EventSequenceItem> eventSequence = new ArrayList<EventSequenceItem>();
			for (int j = 0; j < _ctx.lengthValue("GetCallDetailRecordResponse.Data.AgentEvents["+ i +"].EventSequence.Length"); j++) {
				EventSequenceItem eventSequenceItem = new EventSequenceItem();
				eventSequenceItem.setEvent(_ctx.stringValue("GetCallDetailRecordResponse.Data.AgentEvents["+ i +"].EventSequence["+ j +"].Event"));
				eventSequenceItem.setEventTime(_ctx.longValue("GetCallDetailRecordResponse.Data.AgentEvents["+ i +"].EventSequence["+ j +"].EventTime"));

				eventSequence.add(eventSequenceItem);
			}
			agentEventsItem.setEventSequence(eventSequence);

			agentEvents.add(agentEventsItem);
		}
		data.setAgentEvents(agentEvents);

		List<IvrEventsItem> ivrEvents = new ArrayList<IvrEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallDetailRecordResponse.Data.IvrEvents.Length"); i++) {
			IvrEventsItem ivrEventsItem = new IvrEventsItem();
			ivrEventsItem.setFlowId(_ctx.stringValue("GetCallDetailRecordResponse.Data.IvrEvents["+ i +"].FlowId"));

			List<EventSequenceItem2> eventSequence1 = new ArrayList<EventSequenceItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetCallDetailRecordResponse.Data.IvrEvents["+ i +"].EventSequence.Length"); j++) {
				EventSequenceItem2 eventSequenceItem2 = new EventSequenceItem2();
				eventSequenceItem2.setEvent(_ctx.stringValue("GetCallDetailRecordResponse.Data.IvrEvents["+ i +"].EventSequence["+ j +"].Event"));
				eventSequenceItem2.setEventTime(_ctx.longValue("GetCallDetailRecordResponse.Data.IvrEvents["+ i +"].EventSequence["+ j +"].EventTime"));

				eventSequence1.add(eventSequenceItem2);
			}
			ivrEventsItem.setEventSequence1(eventSequence1);

			ivrEvents.add(ivrEventsItem);
		}
		data.setIvrEvents(ivrEvents);

		List<QueueEventsItem> queueEvents = new ArrayList<QueueEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallDetailRecordResponse.Data.QueueEvents.Length"); i++) {
			QueueEventsItem queueEventsItem = new QueueEventsItem();
			queueEventsItem.setFlowId(_ctx.stringValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].FlowId"));
			queueEventsItem.setQueueId(_ctx.stringValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].QueueId"));
			queueEventsItem.setQueueName(_ctx.stringValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].QueueName"));
			queueEventsItem.setQueueType(_ctx.integerValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].QueueType"));

			List<EventSequenceItem4> eventSequence3 = new ArrayList<EventSequenceItem4>();
			for (int j = 0; j < _ctx.lengthValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].EventSequence.Length"); j++) {
				EventSequenceItem4 eventSequenceItem4 = new EventSequenceItem4();
				eventSequenceItem4.setEvent(_ctx.stringValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].EventSequence["+ j +"].Event"));
				eventSequenceItem4.setEventTime(_ctx.longValue("GetCallDetailRecordResponse.Data.QueueEvents["+ i +"].EventSequence["+ j +"].EventTime"));

				eventSequence3.add(eventSequenceItem4);
			}
			queueEventsItem.setEventSequence3(eventSequence3);

			queueEvents.add(queueEventsItem);
		}
		data.setQueueEvents(queueEvents);
		getCallDetailRecordResponse.setData(data);
	 
	 	return getCallDetailRecordResponse;
	}
}