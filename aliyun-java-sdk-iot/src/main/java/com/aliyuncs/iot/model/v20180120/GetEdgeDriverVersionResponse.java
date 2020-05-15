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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetEdgeDriverVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEdgeDriverVersionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String driverId;

		private String driverVersion;

		private String versionState;

		private String edgeVersion;

		private String description;

		private String sourceConfig;

		private String driverConfig;

		private String containerConfig;

		private String configCheckRule;

		private Long gmtCreateTimestamp;

		private Long gmtModifiedTimestamp;

		public String getDriverId() {
			return this.driverId;
		}

		public void setDriverId(String driverId) {
			this.driverId = driverId;
		}

		public String getDriverVersion() {
			return this.driverVersion;
		}

		public void setDriverVersion(String driverVersion) {
			this.driverVersion = driverVersion;
		}

		public String getVersionState() {
			return this.versionState;
		}

		public void setVersionState(String versionState) {
			this.versionState = versionState;
		}

		public String getEdgeVersion() {
			return this.edgeVersion;
		}

		public void setEdgeVersion(String edgeVersion) {
			this.edgeVersion = edgeVersion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSourceConfig() {
			return this.sourceConfig;
		}

		public void setSourceConfig(String sourceConfig) {
			this.sourceConfig = sourceConfig;
		}

		public String getDriverConfig() {
			return this.driverConfig;
		}

		public void setDriverConfig(String driverConfig) {
			this.driverConfig = driverConfig;
		}

		public String getContainerConfig() {
			return this.containerConfig;
		}

		public void setContainerConfig(String containerConfig) {
			this.containerConfig = containerConfig;
		}

		public String getConfigCheckRule() {
			return this.configCheckRule;
		}

		public void setConfigCheckRule(String configCheckRule) {
			this.configCheckRule = configCheckRule;
		}

		public Long getGmtCreateTimestamp() {
			return this.gmtCreateTimestamp;
		}

		public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
			this.gmtCreateTimestamp = gmtCreateTimestamp;
		}

		public Long getGmtModifiedTimestamp() {
			return this.gmtModifiedTimestamp;
		}

		public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
			this.gmtModifiedTimestamp = gmtModifiedTimestamp;
		}
	}

	@Override
	public GetEdgeDriverVersionResponse getInstance(UnmarshallerContext context) {
		return	GetEdgeDriverVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
