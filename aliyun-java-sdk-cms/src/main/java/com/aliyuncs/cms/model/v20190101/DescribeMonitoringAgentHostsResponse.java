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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitoringAgentHostsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitoringAgentHostsResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private String requestId;

	private Integer pageTotal;

	private Integer total;

	private List<Host> hosts;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageTotal() {
		return this.pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Host> getHosts() {
		return this.hosts;
	}

	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}

	public static class Host {

		private String instanceId;

		private String serialNumber;

		private String hostName;

		private Long aliUid;

		private String operatingSystem;

		private String ipGroup;

		private String region;

		private String agentVersion;

		private String eipAddress;

		private String eipId;

		private Boolean isAliyunHost;

		private String natIp;

		private String networkType;

		private String instanceTypeFamily;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getOperatingSystem() {
			return this.operatingSystem;
		}

		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}

		public String getIpGroup() {
			return this.ipGroup;
		}

		public void setIpGroup(String ipGroup) {
			this.ipGroup = ipGroup;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
		}

		public String getEipId() {
			return this.eipId;
		}

		public void setEipId(String eipId) {
			this.eipId = eipId;
		}

		public Boolean getIsAliyunHost() {
			return this.isAliyunHost;
		}

		public void setIsAliyunHost(Boolean isAliyunHost) {
			this.isAliyunHost = isAliyunHost;
		}

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}
	}

	@Override
	public DescribeMonitoringAgentHostsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitoringAgentHostsResponseUnmarshaller.unmarshall(this, context);
	}
}
