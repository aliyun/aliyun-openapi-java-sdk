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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Contact;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.KeyValuePair;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Script;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.SummaryItem;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task.Contact3;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task.ConversationDetail;
import com.aliyuncs.outboundbot.model.v20191226.DescribeJobResponse.Job.Task.ConversationDetail.SummaryItem2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobResponseUnmarshaller {

	public static DescribeJobResponse unmarshall(DescribeJobResponse describeJobResponse, UnmarshallerContext _ctx) {
		
		describeJobResponse.setRequestId(_ctx.stringValue("DescribeJobResponse.RequestId"));
		describeJobResponse.setHttpStatusCode(_ctx.integerValue("DescribeJobResponse.HttpStatusCode"));
		describeJobResponse.setCode(_ctx.stringValue("DescribeJobResponse.Code"));
		describeJobResponse.setMessage(_ctx.stringValue("DescribeJobResponse.Message"));
		describeJobResponse.setSuccess(_ctx.booleanValue("DescribeJobResponse.Success"));

		Job job = new Job();
		job.setStatus(_ctx.stringValue("DescribeJobResponse.Job.Status"));
		job.setActualTime(_ctx.longValue("DescribeJobResponse.Job.ActualTime"));
		job.setPriority(_ctx.integerValue("DescribeJobResponse.Job.Priority"));
		job.setDsReport(_ctx.stringValue("DescribeJobResponse.Job.DsReport"));
		job.setNextExecutionTime(_ctx.longValue("DescribeJobResponse.Job.NextExecutionTime"));
		job.setFailureReason(_ctx.stringValue("DescribeJobResponse.Job.FailureReason"));
		job.setSystemPriority(_ctx.integerValue("DescribeJobResponse.Job.SystemPriority"));
		job.setInstanceId(_ctx.stringValue("DescribeJobResponse.Job.InstanceId"));
		job.setCalledNumber(_ctx.stringValue("DescribeJobResponse.Job.CalledNumber"));
		job.setReferenceId(_ctx.stringValue("DescribeJobResponse.Job.ReferenceId"));
		job.setJobGroupId(_ctx.stringValue("DescribeJobResponse.Job.JobGroupId"));
		job.setScenarioId(_ctx.stringValue("DescribeJobResponse.Job.ScenarioId"));
		job.setStrategyId(_ctx.stringValue("DescribeJobResponse.Job.StrategyId"));
		job.setEndReason(_ctx.integerValue("DescribeJobResponse.Job.EndReason"));
		job.setJobId(_ctx.stringValue("DescribeJobResponse.Job.JobId"));

		List<String> callingNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.CallingNumbers.Length"); i++) {
			callingNumbers.add(_ctx.stringValue("DescribeJobResponse.Job.CallingNumbers["+ i +"]"));
		}
		job.setCallingNumbers(callingNumbers);

		Script script = new Script();
		script.setStatus(_ctx.stringValue("DescribeJobResponse.Job.Script.Status"));
		script.setUpdateTime(_ctx.longValue("DescribeJobResponse.Job.Script.UpdateTime"));
		script.setChatbotId(_ctx.stringValue("DescribeJobResponse.Job.Script.ChatbotId"));
		script.setScriptId(_ctx.stringValue("DescribeJobResponse.Job.Script.ScriptId"));
		script.setIsDebugDrafted(_ctx.booleanValue("DescribeJobResponse.Job.Script.IsDebugDrafted"));
		script.setIndustry(_ctx.stringValue("DescribeJobResponse.Job.Script.Industry"));
		script.setScriptDescription(_ctx.stringValue("DescribeJobResponse.Job.Script.ScriptDescription"));
		script.setMiniPlaybackConfigEnabled(_ctx.booleanValue("DescribeJobResponse.Job.Script.MiniPlaybackConfigEnabled"));
		script.setIsDrafted(_ctx.booleanValue("DescribeJobResponse.Job.Script.IsDrafted"));
		script.setTtsConfig(_ctx.stringValue("DescribeJobResponse.Job.Script.TtsConfig"));
		script.setDebugStatus(_ctx.stringValue("DescribeJobResponse.Job.Script.DebugStatus"));
		script.setAsrConfig(_ctx.stringValue("DescribeJobResponse.Job.Script.AsrConfig"));
		script.setScene(_ctx.stringValue("DescribeJobResponse.Job.Script.Scene"));
		script.setName(_ctx.stringValue("DescribeJobResponse.Job.Script.Name"));
		job.setScript(script);

		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Contacts.Length"); i++) {
			Contact contact = new Contact();
			contact.setPhoneNumber(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].PhoneNumber"));
			contact.setState(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].State"));
			contact.setContactId(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].ContactId"));
			contact.setHonorific(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].Honorific"));
			contact.setJobId(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].JobId"));
			contact.setContactName(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].ContactName"));
			contact.setRole(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].Role"));
			contact.setReferenceId(_ctx.stringValue("DescribeJobResponse.Job.Contacts["+ i +"].ReferenceId"));

			contacts.add(contact);
		}
		job.setContacts(contacts);

		List<KeyValuePair> extras = new ArrayList<KeyValuePair>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Extras.Length"); i++) {
			KeyValuePair keyValuePair = new KeyValuePair();
			keyValuePair.setKey(_ctx.stringValue("DescribeJobResponse.Job.Extras["+ i +"].Key"));
			keyValuePair.setValue(_ctx.stringValue("DescribeJobResponse.Job.Extras["+ i +"].Value"));

			extras.add(keyValuePair);
		}
		job.setExtras(extras);

		List<SummaryItem> summary = new ArrayList<SummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Summary.Length"); i++) {
			SummaryItem summaryItem = new SummaryItem();
			summaryItem.setSummaryName(_ctx.stringValue("DescribeJobResponse.Job.Summary["+ i +"].SummaryName"));
			summaryItem.setCategory(_ctx.stringValue("DescribeJobResponse.Job.Summary["+ i +"].Category"));
			summaryItem.setContent(_ctx.stringValue("DescribeJobResponse.Job.Summary["+ i +"].Content"));

			summary.add(summaryItem);
		}
		job.setSummary(summary);

		List<Task> tasks = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobResponse.Job.Tasks.Length"); i++) {
			Task task = new Task();
			task.setStatus(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Status"));
			task.setPlanedTime(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].PlanedTime"));
			task.setChatbotId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].ChatbotId"));
			task.setActualTime(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].ActualTime"));
			task.setCalledNumber(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].CalledNumber"));
			task.setEndTime(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].EndTime"));
			task.setScenarioId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].ScenarioId"));
			task.setEndReason(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].EndReason"));
			task.setJobId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].JobId"));
			task.setCallId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].CallId"));
			task.setCallingNumber(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].CallingNumber"));
			task.setBrief(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Brief"));
			task.setDuration(_ctx.integerValue("DescribeJobResponse.Job.Tasks["+ i +"].Duration"));
			task.setTaskId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].TaskId"));
			task.setHangUpDirection(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].HangUpDirection"));
			task.setRingingDuration(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].RingingDuration"));

			Contact3 contact3 = new Contact3();
			contact3.setPhoneNumber(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.PhoneNumber"));
			contact3.setState(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.State"));
			contact3.setContactId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.ContactId"));
			contact3.setHonorific(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.Honorific"));
			contact3.setJobId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.JobId"));
			contact3.setContactName(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.ContactName"));
			contact3.setRole(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.Role"));
			contact3.setReferenceId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Contact.ReferenceId"));
			task.setContact3(contact3);

			List<ConversationDetail> conversation = new ArrayList<ConversationDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation.Length"); j++) {
				ConversationDetail conversationDetail = new ConversationDetail();
				conversationDetail.setActionParams(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].ActionParams"));
				conversationDetail.setAction(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Action"));
				conversationDetail.setTimestamp(_ctx.longValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Timestamp"));
				conversationDetail.setSpeaker(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Speaker"));
				conversationDetail.setScript(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Script"));
				conversationDetail.setSequenceId(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].SequenceId"));

				List<SummaryItem2> summary1 = new ArrayList<SummaryItem2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary.Length"); k++) {
					SummaryItem2 summaryItem2 = new SummaryItem2();
					summaryItem2.setSummaryName(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].SummaryName"));
					summaryItem2.setCategory(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Category"));
					summaryItem2.setContent(_ctx.stringValue("DescribeJobResponse.Job.Tasks["+ i +"].Conversation["+ j +"].Summary["+ k +"].Content"));

					summary1.add(summaryItem2);
				}
				conversationDetail.setSummary1(summary1);

				conversation.add(conversationDetail);
			}
			task.setConversation(conversation);

			tasks.add(task);
		}
		job.setTasks(tasks);
		describeJobResponse.setJob(job);
	 
	 	return describeJobResponse;
	}
}