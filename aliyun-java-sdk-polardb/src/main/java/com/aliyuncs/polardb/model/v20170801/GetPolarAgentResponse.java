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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.GetPolarAgentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPolarAgentResponse extends AcsResponse {

	private String content;

	private String requestId;

	private String reasoningContent;

	private String product;

	private String sessionId;

	private String queryId;

	private List<FunctionCallItem> functionCall;

	private List<UiFunctionCallItem> uiFunctionCall;

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getReasoningContent() {
		return this.reasoningContent;
	}

	public void setReasoningContent(String reasoningContent) {
		this.reasoningContent = reasoningContent;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getQueryId() {
		return this.queryId;
	}

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}

	public List<FunctionCallItem> getFunctionCall() {
		return this.functionCall;
	}

	public void setFunctionCall(List<FunctionCallItem> functionCall) {
		this.functionCall = functionCall;
	}

	public List<UiFunctionCallItem> getUiFunctionCall() {
		return this.uiFunctionCall;
	}

	public void setUiFunctionCall(List<UiFunctionCallItem> uiFunctionCall) {
		this.uiFunctionCall = uiFunctionCall;
	}

	public static class FunctionCallItem {

		private String name;

		private String arguments;

		private String id;

		private String status;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getArguments() {
			return this.arguments;
		}

		public void setArguments(String arguments) {
			this.arguments = arguments;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class UiFunctionCallItem {

		private String argsText;

		private String toolName;

		public String getArgsText() {
			return this.argsText;
		}

		public void setArgsText(String argsText) {
			this.argsText = argsText;
		}

		public String getToolName() {
			return this.toolName;
		}

		public void setToolName(String toolName) {
			this.toolName = toolName;
		}
	}

	@Override
	public GetPolarAgentResponse getInstance(UnmarshallerContext context) {
		return	GetPolarAgentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
