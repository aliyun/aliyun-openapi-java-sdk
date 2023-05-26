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
import com.aliyuncs.arms.transform.v20190808.ListPrometheusMonitoringResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPrometheusMonitoringResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private List<Monitoring> data;

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

	public List<Monitoring> getData() {
		return this.data;
	}

	public void setData(List<Monitoring> data) {
		this.data = data;
	}

	public static class Monitoring {

		private String clusterId;

		private String monitoringName;

		private String type;

		private String configYaml;

		private String status;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getMonitoringName() {
			return this.monitoringName;
		}

		public void setMonitoringName(String monitoringName) {
			this.monitoringName = monitoringName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
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
	public ListPrometheusMonitoringResponse getInstance(UnmarshallerContext context) {
		return	ListPrometheusMonitoringResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
