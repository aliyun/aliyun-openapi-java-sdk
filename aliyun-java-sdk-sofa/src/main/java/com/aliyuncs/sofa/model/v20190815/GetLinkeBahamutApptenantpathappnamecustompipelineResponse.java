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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutApptenantpathappnamecustompipelineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutApptenantpathappnamecustompipelineResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String context;

		private String displayName;

		private String id;

		private String iterationTemplateId;

		private String iterationTemplateName;

		private String modifier;

		private String pipeline;

		private String pipelineName;

		private String stageTemplateId;

		private String stageTemplateName;

		private String trigger;

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

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getIterationTemplateId() {
			return this.iterationTemplateId;
		}

		public void setIterationTemplateId(String iterationTemplateId) {
			this.iterationTemplateId = iterationTemplateId;
		}

		public String getIterationTemplateName() {
			return this.iterationTemplateName;
		}

		public void setIterationTemplateName(String iterationTemplateName) {
			this.iterationTemplateName = iterationTemplateName;
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

		public String getPipelineName() {
			return this.pipelineName;
		}

		public void setPipelineName(String pipelineName) {
			this.pipelineName = pipelineName;
		}

		public String getStageTemplateId() {
			return this.stageTemplateId;
		}

		public void setStageTemplateId(String stageTemplateId) {
			this.stageTemplateId = stageTemplateId;
		}

		public String getStageTemplateName() {
			return this.stageTemplateName;
		}

		public void setStageTemplateName(String stageTemplateName) {
			this.stageTemplateName = stageTemplateName;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}
	}

	@Override
	public GetLinkeBahamutApptenantpathappnamecustompipelineResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutApptenantpathappnamecustompipelineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
