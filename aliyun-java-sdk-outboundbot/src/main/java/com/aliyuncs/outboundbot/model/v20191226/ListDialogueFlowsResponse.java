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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListDialogueFlowsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDialogueFlowsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<DialogueFlow> dialogueFlows;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<DialogueFlow> getDialogueFlows() {
		return this.dialogueFlows;
	}

	public void setDialogueFlows(List<DialogueFlow> dialogueFlows) {
		this.dialogueFlows = dialogueFlows;
	}

	public static class DialogueFlow {

		private String dialogueFlowId;

		private String dialogueFlowName;

		private String scriptId;

		private String scriptVersion;

		private String dialogueFlowType;

		private String dialogueFlowDefinition;

		public String getDialogueFlowId() {
			return this.dialogueFlowId;
		}

		public void setDialogueFlowId(String dialogueFlowId) {
			this.dialogueFlowId = dialogueFlowId;
		}

		public String getDialogueFlowName() {
			return this.dialogueFlowName;
		}

		public void setDialogueFlowName(String dialogueFlowName) {
			this.dialogueFlowName = dialogueFlowName;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getScriptVersion() {
			return this.scriptVersion;
		}

		public void setScriptVersion(String scriptVersion) {
			this.scriptVersion = scriptVersion;
		}

		public String getDialogueFlowType() {
			return this.dialogueFlowType;
		}

		public void setDialogueFlowType(String dialogueFlowType) {
			this.dialogueFlowType = dialogueFlowType;
		}

		public String getDialogueFlowDefinition() {
			return this.dialogueFlowDefinition;
		}

		public void setDialogueFlowDefinition(String dialogueFlowDefinition) {
			this.dialogueFlowDefinition = dialogueFlowDefinition;
		}
	}

	@Override
	public ListDialogueFlowsResponse getInstance(UnmarshallerContext context) {
		return	ListDialogueFlowsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
