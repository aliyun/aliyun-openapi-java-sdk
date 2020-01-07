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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribeAppEnvironmentDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppEnvironmentDetailResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String errMsg;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long appId;

		private Long envId;

		private String envName;

		private Integer envType;

		private String envTypeName;

		private Long appSchemaId;

		private String region;

		private Integer replicas;

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public Long getEnvId() {
			return this.envId;
		}

		public void setEnvId(Long envId) {
			this.envId = envId;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public Integer getEnvType() {
			return this.envType;
		}

		public void setEnvType(Integer envType) {
			this.envType = envType;
		}

		public String getEnvTypeName() {
			return this.envTypeName;
		}

		public void setEnvTypeName(String envTypeName) {
			this.envTypeName = envTypeName;
		}

		public Long getAppSchemaId() {
			return this.appSchemaId;
		}

		public void setAppSchemaId(Long appSchemaId) {
			this.appSchemaId = appSchemaId;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Integer getReplicas() {
			return this.replicas;
		}

		public void setReplicas(Integer replicas) {
			this.replicas = replicas;
		}
	}

	@Override
	public DescribeAppEnvironmentDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppEnvironmentDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
