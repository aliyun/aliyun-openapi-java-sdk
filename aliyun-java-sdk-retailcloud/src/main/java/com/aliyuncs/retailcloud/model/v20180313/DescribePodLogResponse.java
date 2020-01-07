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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.DescribePodLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePodLogResponse extends AcsResponse {

	private Integer code;

	private String errMsg;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String deployOrderName;

		private String envTypeName;

		private List<DeployLogStepRC> deployStepList;

		public String getDeployOrderName() {
			return this.deployOrderName;
		}

		public void setDeployOrderName(String deployOrderName) {
			this.deployOrderName = deployOrderName;
		}

		public String getEnvTypeName() {
			return this.envTypeName;
		}

		public void setEnvTypeName(String envTypeName) {
			this.envTypeName = envTypeName;
		}

		public List<DeployLogStepRC> getDeployStepList() {
			return this.deployStepList;
		}

		public void setDeployStepList(List<DeployLogStepRC> deployStepList) {
			this.deployStepList = deployStepList;
		}

		public static class DeployLogStepRC {

			private String stepName;

			private String stepCode;

			private String stepLog;

			private String status;

			public String getStepName() {
				return this.stepName;
			}

			public void setStepName(String stepName) {
				this.stepName = stepName;
			}

			public String getStepCode() {
				return this.stepCode;
			}

			public void setStepCode(String stepCode) {
				this.stepCode = stepCode;
			}

			public String getStepLog() {
				return this.stepLog;
			}

			public void setStepLog(String stepLog) {
				this.stepLog = stepLog;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribePodLogResponse getInstance(UnmarshallerContext context) {
		return	DescribePodLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
