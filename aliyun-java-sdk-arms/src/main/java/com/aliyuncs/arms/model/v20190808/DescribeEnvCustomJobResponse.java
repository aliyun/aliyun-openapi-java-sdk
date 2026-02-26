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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeEnvCustomJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnvCustomJobResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String environmentId;

		private String regionId;

		private String customJobName;

		private String configYaml;

		private String status;

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCustomJobName() {
			return this.customJobName;
		}

		public void setCustomJobName(String customJobName) {
			this.customJobName = customJobName;
		}

		public String getConfigYaml() {
			return this.configYaml;
		}

		public void setConfigYaml(String configYaml) {
			this.configYaml = configYaml;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeEnvCustomJobResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnvCustomJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
