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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<DataItem> data;

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long appServiceId;

		private String config;

		private Long configId;

		private String configStatus;

		private String configVersion;

		private Long gmtCreate;

		private String imageVersion;

		private String operator;

		public Long getAppServiceId() {
			return this.appServiceId;
		}

		public void setAppServiceId(Long appServiceId) {
			this.appServiceId = appServiceId;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public Long getConfigId() {
			return this.configId;
		}

		public void setConfigId(Long configId) {
			this.configId = configId;
		}

		public String getConfigStatus() {
			return this.configStatus;
		}

		public void setConfigStatus(String configStatus) {
			this.configStatus = configStatus;
		}

		public String getConfigVersion() {
			return this.configVersion;
		}

		public void setConfigVersion(String configVersion) {
			this.configVersion = configVersion;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	@Override
	public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
