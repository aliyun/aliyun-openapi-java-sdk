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
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutComponentexecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutComponentexecutionsResponse extends AcsResponse {

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

		private String causedBy;

		private String componentDisplayName;

		private String componentId;

		private String componentName;

		private String componentType;

		private String data;

		private String detailStatus;

		private String errorMsg;

		private String executionResult;

		private String executionTaskId;

		private String expressionData;

		private String expressionDesc;

		private String expressionRule;

		private String failReason;

		private String htmlText;

		private String loggerUrl;

		private String status;

		private Boolean success;

		private String tipHtml;

		public String getCausedBy() {
			return this.causedBy;
		}

		public void setCausedBy(String causedBy) {
			this.causedBy = causedBy;
		}

		public String getComponentDisplayName() {
			return this.componentDisplayName;
		}

		public void setComponentDisplayName(String componentDisplayName) {
			this.componentDisplayName = componentDisplayName;
		}

		public String getComponentId() {
			return this.componentId;
		}

		public void setComponentId(String componentId) {
			this.componentId = componentId;
		}

		public String getComponentName() {
			return this.componentName;
		}

		public void setComponentName(String componentName) {
			this.componentName = componentName;
		}

		public String getComponentType() {
			return this.componentType;
		}

		public void setComponentType(String componentType) {
			this.componentType = componentType;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getDetailStatus() {
			return this.detailStatus;
		}

		public void setDetailStatus(String detailStatus) {
			this.detailStatus = detailStatus;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getExecutionResult() {
			return this.executionResult;
		}

		public void setExecutionResult(String executionResult) {
			this.executionResult = executionResult;
		}

		public String getExecutionTaskId() {
			return this.executionTaskId;
		}

		public void setExecutionTaskId(String executionTaskId) {
			this.executionTaskId = executionTaskId;
		}

		public String getExpressionData() {
			return this.expressionData;
		}

		public void setExpressionData(String expressionData) {
			this.expressionData = expressionData;
		}

		public String getExpressionDesc() {
			return this.expressionDesc;
		}

		public void setExpressionDesc(String expressionDesc) {
			this.expressionDesc = expressionDesc;
		}

		public String getExpressionRule() {
			return this.expressionRule;
		}

		public void setExpressionRule(String expressionRule) {
			this.expressionRule = expressionRule;
		}

		public String getFailReason() {
			return this.failReason;
		}

		public void setFailReason(String failReason) {
			this.failReason = failReason;
		}

		public String getHtmlText() {
			return this.htmlText;
		}

		public void setHtmlText(String htmlText) {
			this.htmlText = htmlText;
		}

		public String getLoggerUrl() {
			return this.loggerUrl;
		}

		public void setLoggerUrl(String loggerUrl) {
			this.loggerUrl = loggerUrl;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getTipHtml() {
			return this.tipHtml;
		}

		public void setTipHtml(String tipHtml) {
			this.tipHtml = tipHtml;
		}
	}

	@Override
	public GetLinkeBahamutComponentexecutionsResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutComponentexecutionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
