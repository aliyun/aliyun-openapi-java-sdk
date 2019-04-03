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

package com.aliyuncs.uis.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uis.transform.v20180821.DescribeUiseNodeStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUiseNodeStatusResponse extends AcsResponse {

	private String requestId;

	private List<IpStatus> ipStatusList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IpStatus> getIpStatusList() {
		return this.ipStatusList;
	}

	public void setIpStatusList(List<IpStatus> ipStatusList) {
		this.ipStatusList = ipStatusList;
	}

	public static class IpStatus {

		private String ip;

		private Integer maxConnections;

		private Integer currentConnections;

		private String cpuStatus;

		private String memStatus;

		private String bandwidthStatus;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public Integer getCurrentConnections() {
			return this.currentConnections;
		}

		public void setCurrentConnections(Integer currentConnections) {
			this.currentConnections = currentConnections;
		}

		public String getCpuStatus() {
			return this.cpuStatus;
		}

		public void setCpuStatus(String cpuStatus) {
			this.cpuStatus = cpuStatus;
		}

		public String getMemStatus() {
			return this.memStatus;
		}

		public void setMemStatus(String memStatus) {
			this.memStatus = memStatus;
		}

		public String getBandwidthStatus() {
			return this.bandwidthStatus;
		}

		public void setBandwidthStatus(String bandwidthStatus) {
			this.bandwidthStatus = bandwidthStatus;
		}
	}

	@Override
	public DescribeUiseNodeStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeUiseNodeStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
