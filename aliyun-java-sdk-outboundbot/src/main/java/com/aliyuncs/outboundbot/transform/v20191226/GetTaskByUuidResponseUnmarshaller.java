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

import com.aliyuncs.outboundbot.model.v20191226.GetTaskByUuidResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetTaskByUuidResponse.Task;
import com.aliyuncs.outboundbot.model.v20191226.GetTaskByUuidResponse.Task.Conversation;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskByUuidResponseUnmarshaller {

	public static GetTaskByUuidResponse unmarshall(GetTaskByUuidResponse getTaskByUuidResponse, UnmarshallerContext _ctx) {
		
		getTaskByUuidResponse.setRequestId(_ctx.stringValue("GetTaskByUuidResponse.RequestId"));
		getTaskByUuidResponse.setCode(_ctx.stringValue("GetTaskByUuidResponse.Code"));
		getTaskByUuidResponse.setMessage(_ctx.stringValue("GetTaskByUuidResponse.Message"));
		getTaskByUuidResponse.setSuccess(_ctx.booleanValue("GetTaskByUuidResponse.Success"));
		getTaskByUuidResponse.setHttpStatusCode(_ctx.integerValue("GetTaskByUuidResponse.HttpStatusCode"));

		Task task = new Task();
		task.setJobGroupId(_ctx.stringValue("GetTaskByUuidResponse.Task.JobGroupId"));
		task.setEndTime(_ctx.longValue("GetTaskByUuidResponse.Task.EndTime"));
		task.setEndReason(_ctx.integerValue("GetTaskByUuidResponse.Task.EndReason"));
		task.setPlannedTime(_ctx.longValue("GetTaskByUuidResponse.Task.PlannedTime"));
		task.setJobId(_ctx.stringValue("GetTaskByUuidResponse.Task.JobId"));
		task.setCallId(_ctx.stringValue("GetTaskByUuidResponse.Task.CallId"));
		task.setCallingNumber(_ctx.stringValue("GetTaskByUuidResponse.Task.CallingNumber"));
		task.setActualTime(_ctx.longValue("GetTaskByUuidResponse.Task.ActualTime"));
		task.setInstanceId(_ctx.stringValue("GetTaskByUuidResponse.Task.InstanceId"));
		task.setCalledNumber(_ctx.stringValue("GetTaskByUuidResponse.Task.CalledNumber"));
		task.setId(_ctx.stringValue("GetTaskByUuidResponse.Task.Id"));

		List<Conversation> conversations = new ArrayList<Conversation>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskByUuidResponse.Task.Conversations.Length"); i++) {
			Conversation conversation = new Conversation();
			conversation.setSpeaker(_ctx.stringValue("GetTaskByUuidResponse.Task.Conversations["+ i +"].Speaker"));
			conversation.setScript(_ctx.stringValue("GetTaskByUuidResponse.Task.Conversations["+ i +"].Script"));
			conversation.setTimestamp(_ctx.longValue("GetTaskByUuidResponse.Task.Conversations["+ i +"].Timestamp"));
			conversation.setAction(_ctx.stringValue("GetTaskByUuidResponse.Task.Conversations["+ i +"].Action"));
			conversation.setSequenceId(_ctx.stringValue("GetTaskByUuidResponse.Task.Conversations["+ i +"].SequenceId"));

			conversations.add(conversation);
		}
		task.setConversations(conversations);
		getTaskByUuidResponse.setTask(task);
	 
	 	return getTaskByUuidResponse;
	}
}