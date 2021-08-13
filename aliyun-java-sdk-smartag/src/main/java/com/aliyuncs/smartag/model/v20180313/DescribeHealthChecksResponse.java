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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeHealthChecksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHealthChecksResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<HealthCheck> healthChecks;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<HealthCheck> getHealthChecks() {
		return this.healthChecks;
	}

	public void setHealthChecks(List<HealthCheck> healthChecks) {
		this.healthChecks = healthChecks;
	}

	public static class HealthCheck {

		private String type;

		private Integer probeTimeout;

		private String status;

		private String dstIpAddr;

		private Integer relationCount;

		private Integer rttFailThreshold;

		private String smartAGId;

		private Integer dstPort;

		private Integer failCountThreshold;

		private Integer rttThreshold;

		private Integer srcPort;

		private Integer probeCount;

		private String description;

		private String srcIpAddr;

		private Integer probeInterval;

		private String name;

		private String hcInstanceId;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getProbeTimeout() {
			return this.probeTimeout;
		}

		public void setProbeTimeout(Integer probeTimeout) {
			this.probeTimeout = probeTimeout;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDstIpAddr() {
			return this.dstIpAddr;
		}

		public void setDstIpAddr(String dstIpAddr) {
			this.dstIpAddr = dstIpAddr;
		}

		public Integer getRelationCount() {
			return this.relationCount;
		}

		public void setRelationCount(Integer relationCount) {
			this.relationCount = relationCount;
		}

		public Integer getRttFailThreshold() {
			return this.rttFailThreshold;
		}

		public void setRttFailThreshold(Integer rttFailThreshold) {
			this.rttFailThreshold = rttFailThreshold;
		}

		public String getSmartAGId() {
			return this.smartAGId;
		}

		public void setSmartAGId(String smartAGId) {
			this.smartAGId = smartAGId;
		}

		public Integer getDstPort() {
			return this.dstPort;
		}

		public void setDstPort(Integer dstPort) {
			this.dstPort = dstPort;
		}

		public Integer getFailCountThreshold() {
			return this.failCountThreshold;
		}

		public void setFailCountThreshold(Integer failCountThreshold) {
			this.failCountThreshold = failCountThreshold;
		}

		public Integer getRttThreshold() {
			return this.rttThreshold;
		}

		public void setRttThreshold(Integer rttThreshold) {
			this.rttThreshold = rttThreshold;
		}

		public Integer getSrcPort() {
			return this.srcPort;
		}

		public void setSrcPort(Integer srcPort) {
			this.srcPort = srcPort;
		}

		public Integer getProbeCount() {
			return this.probeCount;
		}

		public void setProbeCount(Integer probeCount) {
			this.probeCount = probeCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSrcIpAddr() {
			return this.srcIpAddr;
		}

		public void setSrcIpAddr(String srcIpAddr) {
			this.srcIpAddr = srcIpAddr;
		}

		public Integer getProbeInterval() {
			return this.probeInterval;
		}

		public void setProbeInterval(Integer probeInterval) {
			this.probeInterval = probeInterval;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getHcInstanceId() {
			return this.hcInstanceId;
		}

		public void setHcInstanceId(String hcInstanceId) {
			this.hcInstanceId = hcInstanceId;
		}
	}

	@Override
	public DescribeHealthChecksResponse getInstance(UnmarshallerContext context) {
		return	DescribeHealthChecksResponseUnmarshaller.unmarshall(this, context);
	}
}
