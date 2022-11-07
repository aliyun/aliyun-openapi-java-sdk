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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.GetSentinelAppSumMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSentinelAppSumMetricResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private MetricData metricData;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public MetricData getMetricData() {
		return this.metricData;
	}

	public void setMetricData(MetricData metricData) {
		this.metricData = metricData;
	}

	public static class MetricData {

		private String appName;

		private Float passCount;

		private Long machineCount;

		private Float avgRt;

		private String userId;

		private String namespace;

		private Float totalCount;

		private Float blockCount;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Float getPassCount() {
			return this.passCount;
		}

		public void setPassCount(Float passCount) {
			this.passCount = passCount;
		}

		public Long getMachineCount() {
			return this.machineCount;
		}

		public void setMachineCount(Long machineCount) {
			this.machineCount = machineCount;
		}

		public Float getAvgRt() {
			return this.avgRt;
		}

		public void setAvgRt(Float avgRt) {
			this.avgRt = avgRt;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public Float getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Float totalCount) {
			this.totalCount = totalCount;
		}

		public Float getBlockCount() {
			return this.blockCount;
		}

		public void setBlockCount(Float blockCount) {
			this.blockCount = blockCount;
		}
	}

	@Override
	public GetSentinelAppSumMetricResponse getInstance(UnmarshallerContext context) {
		return	GetSentinelAppSumMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
