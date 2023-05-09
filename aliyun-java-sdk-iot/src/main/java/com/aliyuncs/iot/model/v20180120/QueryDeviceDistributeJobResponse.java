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
import com.aliyuncs.iot.transform.v20180120.QueryDeviceDistributeJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceDistributeJobResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer strategy;

		private Integer status;

		private String productKey;

		private String targetUid;

		private String jobId;

		private Long gmtCreate;

		private String sourceUid;

		private Integer total;

		private String sourceInstanceId;

		private List<TargetInstanceConfigsItem> targetInstanceConfigs;

		public Integer getStrategy() {
			return this.strategy;
		}

		public void setStrategy(Integer strategy) {
			this.strategy = strategy;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getTargetUid() {
			return this.targetUid;
		}

		public void setTargetUid(String targetUid) {
			this.targetUid = targetUid;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getSourceUid() {
			return this.sourceUid;
		}

		public void setSourceUid(String sourceUid) {
			this.sourceUid = sourceUid;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getSourceInstanceId() {
			return this.sourceInstanceId;
		}

		public void setSourceInstanceId(String sourceInstanceId) {
			this.sourceInstanceId = sourceInstanceId;
		}

		public List<TargetInstanceConfigsItem> getTargetInstanceConfigs() {
			return this.targetInstanceConfigs;
		}

		public void setTargetInstanceConfigs(List<TargetInstanceConfigsItem> targetInstanceConfigs) {
			this.targetInstanceConfigs = targetInstanceConfigs;
		}

		public static class TargetInstanceConfigsItem {

			private String targetInstanceId;

			public String getTargetInstanceId() {
				return this.targetInstanceId;
			}

			public void setTargetInstanceId(String targetInstanceId) {
				this.targetInstanceId = targetInstanceId;
			}
		}
	}

	@Override
	public QueryDeviceDistributeJobResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceDistributeJobResponseUnmarshaller.unmarshall(this, context);
	}
}
