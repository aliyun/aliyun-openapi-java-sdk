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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.ListAIStaffChatEventsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAIStaffChatEventsResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAIStaffChatEventsResponse.Module.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIStaffChatEventsResponseUnmarshaller {

	public static ListAIStaffChatEventsResponse unmarshall(ListAIStaffChatEventsResponse listAIStaffChatEventsResponse, UnmarshallerContext _ctx) {
		
		listAIStaffChatEventsResponse.setRequestId(_ctx.stringValue("ListAIStaffChatEventsResponse.RequestId"));
		listAIStaffChatEventsResponse.setDynamicCode(_ctx.stringValue("ListAIStaffChatEventsResponse.DynamicCode"));
		listAIStaffChatEventsResponse.setDynamicMessage(_ctx.stringValue("ListAIStaffChatEventsResponse.DynamicMessage"));
		listAIStaffChatEventsResponse.setSynchro(_ctx.booleanValue("ListAIStaffChatEventsResponse.Synchro"));
		listAIStaffChatEventsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAIStaffChatEventsResponse.AccessDeniedDetail"));
		listAIStaffChatEventsResponse.setRootErrorMsg(_ctx.stringValue("ListAIStaffChatEventsResponse.RootErrorMsg"));
		listAIStaffChatEventsResponse.setRootErrorCode(_ctx.stringValue("ListAIStaffChatEventsResponse.RootErrorCode"));
		listAIStaffChatEventsResponse.setAllowRetry(_ctx.booleanValue("ListAIStaffChatEventsResponse.AllowRetry"));
		listAIStaffChatEventsResponse.setAppName(_ctx.stringValue("ListAIStaffChatEventsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAIStaffChatEventsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAIStaffChatEventsResponse.ErrorArgs["+ i +"]"));
		}
		listAIStaffChatEventsResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setConversationId(_ctx.stringValue("ListAIStaffChatEventsResponse.Module.ConversationId"));
		module.setChatId(_ctx.stringValue("ListAIStaffChatEventsResponse.Module.ChatId"));
		module.setLastEventId(_ctx.integerValue("ListAIStaffChatEventsResponse.Module.LastEventId"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("ListAIStaffChatEventsResponse.Module.Events.Length"); i++) {
			Event event = new Event();
			event.setId(_ctx.integerValue("ListAIStaffChatEventsResponse.Module.Events["+ i +"].Id"));
			event.setName(_ctx.stringValue("ListAIStaffChatEventsResponse.Module.Events["+ i +"].Name"));
			event.setData(_ctx.stringValue("ListAIStaffChatEventsResponse.Module.Events["+ i +"].Data"));

			events.add(event);
		}
		module.setEvents(events);
		listAIStaffChatEventsResponse.setModule(module);
	 
	 	return listAIStaffChatEventsResponse;
	}
}