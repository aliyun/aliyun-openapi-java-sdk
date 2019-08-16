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
import com.aliyuncs.iot.transform.v20180120.BatchGetEdgeInstanceDriverConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetEdgeInstanceDriverConfigsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private List<DriverConfig> driverConfigList;

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

	public List<DriverConfig> getDriverConfigList() {
		return this.driverConfigList;
	}

	public void setDriverConfigList(List<DriverConfig> driverConfigList) {
		this.driverConfigList = driverConfigList;
	}

	public static class DriverConfig {

		private String driverId;

		private List<Config> configList;

		public String getDriverId() {
			return this.driverId;
		}

		public void setDriverId(String driverId) {
			this.driverId = driverId;
		}

		public List<Config> getConfigList() {
			return this.configList;
		}

		public void setConfigList(List<Config> configList) {
			this.configList = configList;
		}

		public static class Config {

			private String configId;

			private String format;

			private String content;

			private String key;

			public String getConfigId() {
				return this.configId;
			}

			public void setConfigId(String configId) {
				this.configId = configId;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public BatchGetEdgeInstanceDriverConfigsResponse getInstance(UnmarshallerContext context) {
		return	BatchGetEdgeInstanceDriverConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
