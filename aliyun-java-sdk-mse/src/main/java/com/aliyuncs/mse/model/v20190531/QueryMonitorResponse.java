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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QueryMonitorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMonitorResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String errorCode;

	private Boolean success;

	private List<DataItem> data;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String podName;

		private String clusterNamePrefix;

		private List<Map<Object,Object>> values;

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getClusterNamePrefix() {
			return this.clusterNamePrefix;
		}

		public void setClusterNamePrefix(String clusterNamePrefix) {
			this.clusterNamePrefix = clusterNamePrefix;
		}

		public List<Map<Object,Object>> getValues() {
			return this.values;
		}

		public void setValues(List<Map<Object,Object>> values) {
			this.values = values;
		}
	}

	@Override
	public QueryMonitorResponse getInstance(UnmarshallerContext context) {
		return	QueryMonitorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
