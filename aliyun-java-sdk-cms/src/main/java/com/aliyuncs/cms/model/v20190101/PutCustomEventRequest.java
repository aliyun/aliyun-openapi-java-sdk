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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutCustomEventRequest extends RpcAcsRequest<PutCustomEventResponse> {
	   

	private List<EventInfo> eventInfos;
	public PutCustomEventRequest() {
		super("Cms", "2019-01-01", "PutCustomEvent", "cms");
		setMethod(MethodType.POST);
	}

	public List<EventInfo> getEventInfos() {
		return this.eventInfos;
	}

	public void setEventInfos(List<EventInfo> eventInfos) {
		this.eventInfos = eventInfos;	
		if (eventInfos != null) {
			for (int depth1 = 0; depth1 < eventInfos.size(); depth1++) {
				putQueryParameter("EventInfo." + (depth1 + 1) + ".GroupId" , eventInfos.get(depth1).getGroupId());
				putQueryParameter("EventInfo." + (depth1 + 1) + ".Time" , eventInfos.get(depth1).getTime());
				putQueryParameter("EventInfo." + (depth1 + 1) + ".EventName" , eventInfos.get(depth1).getEventName());
				putQueryParameter("EventInfo." + (depth1 + 1) + ".Content" , eventInfos.get(depth1).getContent());
			}
		}	
	}

	public static class EventInfo {

		private String groupId;

		private String time;

		private String eventName;

		private String content;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<PutCustomEventResponse> getResponseClass() {
		return PutCustomEventResponse.class;
	}

}
