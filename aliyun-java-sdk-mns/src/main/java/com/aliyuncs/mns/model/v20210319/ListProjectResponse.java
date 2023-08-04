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

package com.aliyuncs.mns.model.v20210319;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mns.transform.v20210319.ListProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String status;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private String projectName;

		private List<LogStoresItem> logStores;

		private List<AlertsItem> alerts;

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public List<LogStoresItem> getLogStores() {
			return this.logStores;
		}

		public void setLogStores(List<LogStoresItem> logStores) {
			this.logStores = logStores;
		}

		public List<AlertsItem> getAlerts() {
			return this.alerts;
		}

		public void setAlerts(List<AlertsItem> alerts) {
			this.alerts = alerts;
		}

		public static class LogStoresItem {

			private String logStoreName;

			public String getLogStoreName() {
				return this.logStoreName;
			}

			public void setLogStoreName(String logStoreName) {
				this.logStoreName = logStoreName;
			}
		}

		public static class AlertsItem {

			private String alertName;

			public String getAlertName() {
				return this.alertName;
			}

			public void setAlertName(String alertName) {
				this.alertName = alertName;
			}
		}
	}

	@Override
	public ListProjectResponse getInstance(UnmarshallerContext context) {
		return	ListProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
