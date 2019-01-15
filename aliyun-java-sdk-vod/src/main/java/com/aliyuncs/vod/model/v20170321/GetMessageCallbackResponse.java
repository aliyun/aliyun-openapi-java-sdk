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

package com.aliyuncs.vod.model.v20170321;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetMessageCallbackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMessageCallbackResponse extends AcsResponse {

	private String requestId;

	private MessageCallback messageCallback;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MessageCallback getMessageCallback() {
		return this.messageCallback;
	}

	public void setMessageCallback(MessageCallback messageCallback) {
		this.messageCallback = messageCallback;
	}

	public static class MessageCallback {

		private String callbackType;

		private String callbackSwitch;

		private String callbackURL;

		private String eventTypeList;

		private String authSwitch;

		private String authKey;

		private String mnsEndpoint;

		private String mnsQueueName;

		public String getCallbackType() {
			return this.callbackType;
		}

		public void setCallbackType(String callbackType) {
			this.callbackType = callbackType;
		}

		public String getCallbackSwitch() {
			return this.callbackSwitch;
		}

		public void setCallbackSwitch(String callbackSwitch) {
			this.callbackSwitch = callbackSwitch;
		}

		public String getCallbackURL() {
			return this.callbackURL;
		}

		public void setCallbackURL(String callbackURL) {
			this.callbackURL = callbackURL;
		}

		public String getEventTypeList() {
			return this.eventTypeList;
		}

		public void setEventTypeList(String eventTypeList) {
			this.eventTypeList = eventTypeList;
		}

		public String getAuthSwitch() {
			return this.authSwitch;
		}

		public void setAuthSwitch(String authSwitch) {
			this.authSwitch = authSwitch;
		}

		public String getAuthKey() {
			return this.authKey;
		}

		public void setAuthKey(String authKey) {
			this.authKey = authKey;
		}

		public String getMnsEndpoint() {
			return this.mnsEndpoint;
		}

		public void setMnsEndpoint(String mnsEndpoint) {
			this.mnsEndpoint = mnsEndpoint;
		}

		public String getMnsQueueName() {
			return this.mnsQueueName;
		}

		public void setMnsQueueName(String mnsQueueName) {
			this.mnsQueueName = mnsQueueName;
		}
	}

	@Override
	public GetMessageCallbackResponse getInstance(UnmarshallerContext context) {
		return	GetMessageCallbackResponseUnmarshaller.unmarshall(this, context);
	}
}
