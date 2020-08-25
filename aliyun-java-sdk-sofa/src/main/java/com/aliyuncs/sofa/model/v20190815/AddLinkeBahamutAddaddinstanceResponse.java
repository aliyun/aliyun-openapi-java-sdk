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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.AddLinkeBahamutAddaddinstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeBahamutAddaddinstanceResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean auto;

		private String context;

		private String displayName;

		private Boolean inVisible;

		private Long lastModified;

		private String modifier;

		private String pipeline;

		private Long pipelineInstanceId;

		private Long pipelineTemplateId;

		private String pipelineTrigger;

		public Boolean getAuto() {
			return this.auto;
		}

		public void setAuto(Boolean auto) {
			this.auto = auto;
		}

		public String getContext() {
			return this.context;
		}

		public void setContext(String context) {
			this.context = context;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Boolean getInVisible() {
			return this.inVisible;
		}

		public void setInVisible(Boolean inVisible) {
			this.inVisible = inVisible;
		}

		public Long getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(Long lastModified) {
			this.lastModified = lastModified;
		}

		public String getModifier() {
			return this.modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public String getPipeline() {
			return this.pipeline;
		}

		public void setPipeline(String pipeline) {
			this.pipeline = pipeline;
		}

		public Long getPipelineInstanceId() {
			return this.pipelineInstanceId;
		}

		public void setPipelineInstanceId(Long pipelineInstanceId) {
			this.pipelineInstanceId = pipelineInstanceId;
		}

		public Long getPipelineTemplateId() {
			return this.pipelineTemplateId;
		}

		public void setPipelineTemplateId(Long pipelineTemplateId) {
			this.pipelineTemplateId = pipelineTemplateId;
		}

		public String getPipelineTrigger() {
			return this.pipelineTrigger;
		}

		public void setPipelineTrigger(String pipelineTrigger) {
			this.pipelineTrigger = pipelineTrigger;
		}
	}

	@Override
	public AddLinkeBahamutAddaddinstanceResponse getInstance(UnmarshallerContext context) {
		return	AddLinkeBahamutAddaddinstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
