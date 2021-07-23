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
import com.aliyuncs.vcs.transform.v20200515.DescribeModelServiceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeModelServiceListResponse extends AcsResponse {

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

		private String total;

		private List<ModelService> modelList;

		public String getTotal() {
			return this.total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public List<ModelService> getModelList() {
			return this.modelList;
		}

		public void setModelList(List<ModelService> modelList) {
			this.modelList = modelList;
		}

		public static class ModelService {

			private String modelServiceInstanceId;

			private String modelServiceStatus;

			private String modelServiceName;

			private String algorithmCode;

			private Integer qpsRequired;

			private String createTime;

			private String appCode;

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

			public String getModelServiceName() {
				return this.modelServiceName;
			}

			public void setModelServiceName(String modelServiceName) {
				this.modelServiceName = modelServiceName;
			}

			public String getAlgorithmCode() {
				return this.algorithmCode;
			}

			public void setAlgorithmCode(String algorithmCode) {
				this.algorithmCode = algorithmCode;
			}

			public Integer getQpsRequired() {
				return this.qpsRequired;
			}

			public void setQpsRequired(Integer qpsRequired) {
				this.qpsRequired = qpsRequired;
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
		}
	}

	@Override
	public DescribeModelServiceListResponse getInstance(UnmarshallerContext context) {
		return	DescribeModelServiceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
