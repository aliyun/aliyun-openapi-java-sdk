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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.UpdatePrometheusGlobalViewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdatePrometheusGlobalViewResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean success;

		private List<FailedInstance> failedInstances;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public List<FailedInstance> getFailedInstances() {
			return this.failedInstances;
		}

		public void setFailedInstances(List<FailedInstance> failedInstances) {
			this.failedInstances = failedInstances;
		}

		public static class FailedInstance {

			private String sourceName;

			private String sourceType;

			private String userId;

			private String clusterId;

			public String getSourceName() {
				return this.sourceName;
			}

			public void setSourceName(String sourceName) {
				this.sourceName = sourceName;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}
		}
	}

	@Override
	public UpdatePrometheusGlobalViewResponse getInstance(UnmarshallerContext context) {
		return	UpdatePrometheusGlobalViewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
