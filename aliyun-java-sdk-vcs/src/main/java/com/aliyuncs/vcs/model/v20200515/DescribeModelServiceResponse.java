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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribeModelServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelServiceResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

		private String modelServiceInstanceId;

		private String modelServiceStatus;

		private String modelServiceInstanceName;

		private String algorithmCode;

		private Long qps;

		private String createTime;

		private String appCode;

		private List<ModelApi> modelApiList;

		public String getModelServiceInstanceId() {
			return this.modelServiceInstanceId;
		}

		public void setModelServiceInstanceId(String modelServiceInstanceId) {
			this.modelServiceInstanceId = modelServiceInstanceId;
		}

		public String getModelServiceStatus() {
			return this.modelServiceStatus;
		}

		public void setModelServiceStatus(String modelServiceStatus) {
			this.modelServiceStatus = modelServiceStatus;
		}

		public String getModelServiceInstanceName() {
			return this.modelServiceInstanceName;
		}

		public void setModelServiceInstanceName(String modelServiceInstanceName) {
			this.modelServiceInstanceName = modelServiceInstanceName;
		}

		public String getAlgorithmCode() {
			return this.algorithmCode;
		}

		public void setAlgorithmCode(String algorithmCode) {
			this.algorithmCode = algorithmCode;
		}

		public Long getQps() {
			return this.qps;
		}

		public void setQps(Long qps) {
			this.qps = qps;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAppCode() {
			return this.appCode;
		}

		public void setAppCode(String appCode) {
			this.appCode = appCode;
		}

		public List<ModelApi> getModelApiList() {
			return this.modelApiList;
		}

		public void setModelApiList(List<ModelApi> modelApiList) {
			this.modelApiList = modelApiList;
		}

		public static class ModelApi {

			private String algorithmApiCode;

			private String apiId;

			private String apiName;

			private String apiPath;

			private String createTime;

			public String getAlgorithmApiCode() {
				return this.algorithmApiCode;
			}

			public void setAlgorithmApiCode(String algorithmApiCode) {
				this.algorithmApiCode = algorithmApiCode;
			}

			public String getApiId() {
				return this.apiId;
			}

			public void setApiId(String apiId) {
				this.apiId = apiId;
			}

			public String getApiName() {
				return this.apiName;
			}

			public void setApiName(String apiName) {
				this.apiName = apiName;
			}

			public String getApiPath() {
				return this.apiPath;
			}

			public void setApiPath(String apiPath) {
				this.apiPath = apiPath;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}
		}
	}

	@Override
	public DescribeModelServiceResponse getInstance(UnmarshallerContext context) {
		return	DescribeModelServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
