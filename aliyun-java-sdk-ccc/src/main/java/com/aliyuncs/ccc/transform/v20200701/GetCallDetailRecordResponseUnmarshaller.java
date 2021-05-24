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
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.CdrAgentEventsItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.CdrAgentEventsItem.EventSequenceItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.CdrIvrEventsItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.CdrIvrEventsItem.EventSequenceItem2;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.CdrQueueEventsItem;
import com.aliyuncs.ccc.model.v20200701.GetCallDetailRecordResponse.Data.CdrQueueEventsItem.EventSequenceItem4;
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

		List<CdrAgentEventsItem> cdrAgentEvents = new ArrayList<CdrAgentEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallDetailRecordResponse.Data.CdrAgentEvents.Length"); i++) {
			CdrAgentEventsItem cdrAgentEventsItem = new CdrAgentEventsItem();
			cdrAgentEventsItem.setAgentId(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrAgentEvents["+ i +"].AgentId"));
			cdrAgentEventsItem.setAgentName(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrAgentEvents["+ i +"].AgentName"));
			cdrAgentEventsItem.setSkillGroupId(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrAgentEvents["+ i +"].SkillGroupId"));

			List<EventSequenceItem> eventSequence = new ArrayList<EventSequenceItem>();
			for (int j = 0; j < _ctx.lengthValue("GetCallDetailRecordResponse.Data.CdrAgentEvents["+ i +"].EventSequence.Length"); j++) {
				EventSequenceItem eventSequenceItem = new EventSequenceItem();
				eventSequenceItem.setEvent(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrAgentEvents["+ i +"].EventSequence["+ j +"].Event"));
				eventSequenceItem.setEventTime(_ctx.longValue("GetCallDetailRecordResponse.Data.CdrAgentEvents["+ i +"].EventSequence["+ j +"].EventTime"));

				eventSequence.add(eventSequenceItem);
			}
			cdrAgentEventsItem.setEventSequence(eventSequence);

			cdrAgentEvents.add(cdrAgentEventsItem);
		}
		data.setCdrAgentEvents(cdrAgentEvents);

		List<CdrIvrEventsItem> cdrIvrEvents = new ArrayList<CdrIvrEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallDetailRecordResponse.Data.CdrIvrEvents.Length"); i++) {
			CdrIvrEventsItem cdrIvrEventsItem = new CdrIvrEventsItem();
			cdrIvrEventsItem.setFlowId(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrIvrEvents["+ i +"].FlowId"));

			List<EventSequenceItem2> eventSequence1 = new ArrayList<EventSequenceItem2>();
			for (int j = 0; j < _ctx.lengthValue("GetCallDetailRecordResponse.Data.CdrIvrEvents["+ i +"].EventSequence.Length"); j++) {
				EventSequenceItem2 eventSequenceItem2 = new EventSequenceItem2();
				eventSequenceItem2.setEvent(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrIvrEvents["+ i +"].EventSequence["+ j +"].Event"));
				eventSequenceItem2.setEventTime(_ctx.longValue("GetCallDetailRecordResponse.Data.CdrIvrEvents["+ i +"].EventSequence["+ j +"].EventTime"));

				eventSequence1.add(eventSequenceItem2);
			}
			cdrIvrEventsItem.setEventSequence1(eventSequence1);

			cdrIvrEvents.add(cdrIvrEventsItem);
		}
		data.setCdrIvrEvents(cdrIvrEvents);

		List<CdrQueueEventsItem> cdrQueueEvents = new ArrayList<CdrQueueEventsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCallDetailRecordResponse.Data.CdrQueueEvents.Length"); i++) {
			CdrQueueEventsItem cdrQueueEventsItem = new CdrQueueEventsItem();
			cdrQueueEventsItem.setFlowId(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].FlowId"));
			cdrQueueEventsItem.setQueueId(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].QueueId"));
			cdrQueueEventsItem.setQueueName(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].QueueName"));
			cdrQueueEventsItem.setQueueType(_ctx.integerValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].QueueType"));

			List<EventSequenceItem4> eventSequence3 = new ArrayList<EventSequenceItem4>();
			for (int j = 0; j < _ctx.lengthValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].EventSequence.Length"); j++) {
				EventSequenceItem4 eventSequenceItem4 = new EventSequenceItem4();
				eventSequenceItem4.setEvent(_ctx.stringValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].EventSequence["+ j +"].Event"));
				eventSequenceItem4.setEventTime(_ctx.longValue("GetCallDetailRecordResponse.Data.CdrQueueEvents["+ i +"].EventSequence["+ j +"].EventTime"));

				eventSequence3.add(eventSequenceItem4);
			}
			cdrQueueEventsItem.setEventSequence3(eventSequence3);

			cdrQueueEvents.add(cdrQueueEventsItem);
		}
		data.setCdrQueueEvents(cdrQueueEvents);
		getCallDetailRecordResponse.setData(data);
	 
	 	return getCallDetailRecordResponse;
	}
}