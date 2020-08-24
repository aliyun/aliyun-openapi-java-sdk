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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.QueryAIActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAIActionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private List<DataItem> data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String actionId;

		private String planId;

		private String actionTemplateId;

		private Integer actionIndex;

		private String algo;

		private String action;

		private String algoConfig;

		private String actionConfig;

		public String getActionId() {
			return this.actionId;
		}

		public void setActionId(String actionId) {
			this.actionId = actionId;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public String getActionTemplateId() {
			return this.actionTemplateId;
		}

		public void setActionTemplateId(String actionTemplateId) {
			this.actionTemplateId = actionTemplateId;
		}

		public Integer getActionIndex() {
			return this.actionIndex;
		}

		public void setActionIndex(Integer actionIndex) {
			this.actionIndex = actionIndex;
		}

		public String getAlgo() {
			return this.algo;
		}

		public void setAlgo(String algo) {
			this.algo = algo;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getAlgoConfig() {
			return this.algoConfig;
		}

		public void setAlgoConfig(String algoConfig) {
			this.algoConfig = algoConfig;
		}

		public String getActionConfig() {
			return this.actionConfig;
		}

		public void setActionConfig(String actionConfig) {
			this.actionConfig = actionConfig;
		}
	}

	@Override
	public QueryAIActionResponse getInstance(UnmarshallerContext context) {
		return	QueryAIActionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
