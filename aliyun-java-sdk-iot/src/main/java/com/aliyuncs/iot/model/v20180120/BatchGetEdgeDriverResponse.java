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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.BatchGetEdgeDriverResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetEdgeDriverResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private List<Driver> driverList;

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

	public List<Driver> getDriverList() {
		return this.driverList;
	}

	public void setDriverList(List<Driver> driverList) {
		this.driverList = driverList;
	}

	public static class Driver {

		private Long gmtCreateTimestamp;

		private Integer type;

		private String cpuArch;

		private String driverId;

		private Boolean isBuiltIn;

		private Long gmtModifiedTimestamp;

		private String runtime;

		private String driverName;

		private String driverProtocol;

		private Integer useOfficialConfig;

		public Long getGmtCreateTimestamp() {
			return this.gmtCreateTimestamp;
		}

		public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
			this.gmtCreateTimestamp = gmtCreateTimestamp;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getCpuArch() {
			return this.cpuArch;
		}

		public void setCpuArch(String cpuArch) {
			this.cpuArch = cpuArch;
		}

		public String getDriverId() {
			return this.driverId;
		}

		public void setDriverId(String driverId) {
			this.driverId = driverId;
		}

		public Boolean getIsBuiltIn() {
			return this.isBuiltIn;
		}

		public void setIsBuiltIn(Boolean isBuiltIn) {
			this.isBuiltIn = isBuiltIn;
		}

		public Long getGmtModifiedTimestamp() {
			return this.gmtModifiedTimestamp;
		}

		public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
			this.gmtModifiedTimestamp = gmtModifiedTimestamp;
		}

		public String getRuntime() {
			return this.runtime;
		}

		public void setRuntime(String runtime) {
			this.runtime = runtime;
		}

		public String getDriverName() {
			return this.driverName;
		}

		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}

		public String getDriverProtocol() {
			return this.driverProtocol;
		}

		public void setDriverProtocol(String driverProtocol) {
			this.driverProtocol = driverProtocol;
		}

		public Integer getUseOfficialConfig() {
			return this.useOfficialConfig;
		}

		public void setUseOfficialConfig(Integer useOfficialConfig) {
			this.useOfficialConfig = useOfficialConfig;
		}
	}

	@Override
	public BatchGetEdgeDriverResponse getInstance(UnmarshallerContext context) {
		return	BatchGetEdgeDriverResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
