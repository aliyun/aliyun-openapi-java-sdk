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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.GetConversationalAutomationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConversationalAutomationResponse extends AcsResponse {

	private String accessDeniedDetail;

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private Data data;

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String phoneNumber;

		private Boolean enableWelcomeMessage;

		private List<CommandsItem> commands;

		private List<String> prompts;

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public Boolean getEnableWelcomeMessage() {
			return this.enableWelcomeMessage;
		}

		public void setEnableWelcomeMessage(Boolean enableWelcomeMessage) {
			this.enableWelcomeMessage = enableWelcomeMessage;
		}

		public List<CommandsItem> getCommands() {
			return this.commands;
		}

		public void setCommands(List<CommandsItem> commands) {
			this.commands = commands;
		}

		public List<String> getPrompts() {
			return this.prompts;
		}

		public void setPrompts(List<String> prompts) {
			this.prompts = prompts;
		}

		public static class CommandsItem {

			private String commandDescription;

			private String commandName;

			public String getCommandDescription() {
				return this.commandDescription;
			}

			public void setCommandDescription(String commandDescription) {
				this.commandDescription = commandDescription;
			}

			public String getCommandName() {
				return this.commandName;
			}

			public void setCommandName(String commandName) {
				this.commandName = commandName;
			}
		}
	}

	@Override
	public GetConversationalAutomationResponse getInstance(UnmarshallerContext context) {
		return	GetConversationalAutomationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
