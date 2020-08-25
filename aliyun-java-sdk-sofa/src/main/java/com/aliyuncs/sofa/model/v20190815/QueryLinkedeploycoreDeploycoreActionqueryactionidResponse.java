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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkedeploycoreDeploycoreActionqueryactionidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkedeploycoreDeploycoreActionqueryactionidResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String actionLevel;

		private String actionStatus;

		private String actionType;

		private String appService;

		private Long appServiceId;

		private Long childId;

		private Long configurationId;

		private String detail;

		private String executionResult;

		private Long executionResultId;

		private Long gmtCreate;

		private Long gmtModified;

		private Long id;

		private String log;

		private String operator;

		private Long orderId;

		private Long parentId;

		private Long step;

		private Long timeout;

		private List<String> subActions;

		public String getActionLevel() {
			return this.actionLevel;
		}

		public void setActionLevel(String actionLevel) {
			this.actionLevel = actionLevel;
		}

		public String getActionStatus() {
			return this.actionStatus;
		}

		public void setActionStatus(String actionStatus) {
			this.actionStatus = actionStatus;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public String getAppService() {
			return this.appService;
		}

		public void setAppService(String appService) {
			this.appService = appService;
		}

		public Long getAppServiceId() {
			return this.appServiceId;
		}

		public void setAppServiceId(Long appServiceId) {
			this.appServiceId = appServiceId;
		}

		public Long getChildId() {
			return this.childId;
		}

		public void setChildId(Long childId) {
			this.childId = childId;
		}

		public Long getConfigurationId() {
			return this.configurationId;
		}

		public void setConfigurationId(Long configurationId) {
			this.configurationId = configurationId;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getExecutionResult() {
			return this.executionResult;
		}

		public void setExecutionResult(String executionResult) {
			this.executionResult = executionResult;
		}

		public Long getExecutionResultId() {
			return this.executionResultId;
		}

		public void setExecutionResultId(Long executionResultId) {
			this.executionResultId = executionResultId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getLog() {
			return this.log;
		}

		public void setLog(String log) {
			this.log = log;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public Long getParentId() {
			return this.parentId;
		}

		public void setParentId(Long parentId) {
			this.parentId = parentId;
		}

		public Long getStep() {
			return this.step;
		}

		public void setStep(Long step) {
			this.step = step;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public List<String> getSubActions() {
			return this.subActions;
		}

		public void setSubActions(List<String> subActions) {
			this.subActions = subActions;
		}
	}

	@Override
	public QueryLinkedeploycoreDeploycoreActionqueryactionidResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkedeploycoreDeploycoreActionqueryactionidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
