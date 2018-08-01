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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.GetCloudMetricLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCloudMetricLogsResponse extends AcsResponse {

	private String requestId;

	private List<MetricLog> metricLogs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MetricLog> getMetricLogs() {
		return this.metricLogs;
	}

	public void setMetricLogs(List<MetricLog> metricLogs) {
		this.metricLogs = metricLogs;
	}

	public static class MetricLog {

		private Integer time;

		private String instanceId;

		private String hostname;

		private Integer processId;

		private String processName;

		private String networkInterface;

		private String diskDevice;

		private String metricData;

		public Integer getTime() {
			return this.time;
		}

		public void setTime(Integer time) {
			this.time = time;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Integer getProcessId() {
			return this.processId;
		}

		public void setProcessId(Integer processId) {
			this.processId = processId;
		}

		public String getProcessName() {
			return this.processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getNetworkInterface() {
			return this.networkInterface;
		}

		public void setNetworkInterface(String networkInterface) {
			this.networkInterface = networkInterface;
		}

		public String getDiskDevice() {
			return this.diskDevice;
		}

		public void setDiskDevice(String diskDevice) {
			this.diskDevice = diskDevice;
		}

		public String getMetricData() {
			return this.metricData;
		}

		public void setMetricData(String metricData) {
			this.metricData = metricData;
		}
	}

	@Override
	public GetCloudMetricLogsResponse getInstance(UnmarshallerContext context) {
		return	GetCloudMetricLogsResponseUnmarshaller.unmarshall(this, context);
	}
}
