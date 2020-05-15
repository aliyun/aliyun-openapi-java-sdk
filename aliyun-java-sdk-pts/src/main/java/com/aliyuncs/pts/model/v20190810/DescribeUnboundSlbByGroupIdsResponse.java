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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeUnboundSlbByGroupIdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUnboundSlbByGroupIdsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Integer httpStatusCode;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<SceneMonitorSlbInfoView> slbList;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SceneMonitorSlbInfoView> getSlbList() {
		return this.slbList;
	}

	public void setSlbList(List<SceneMonitorSlbInfoView> slbList) {
		this.slbList = slbList;
	}

	public static class SceneMonitorSlbInfoView {

		private String instanceId;

		private String instanceName;

		private String regionId;

		private String regionName;

		private String instanceNetworkType;

		private String instanceNetworkTypeName;

		private String address;

		private String status;

		private String statusName;

		private String addressType;

		private Integer addressTypeName;

		private String port;

		private String protocol;

		private String masterZoneId;

		private String slaveZoneId;

		private String bandwidth;

		private String loadBalancerSpec;

		private Integer maxConn;

		private Integer qps;

		private Integer cpu;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getInstanceNetworkTypeName() {
			return this.instanceNetworkTypeName;
		}

		public void setInstanceNetworkTypeName(String instanceNetworkTypeName) {
			this.instanceNetworkTypeName = instanceNetworkTypeName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStatusName() {
			return this.statusName;
		}

		public void setStatusName(String statusName) {
			this.statusName = statusName;
		}

		public String getAddressType() {
			return this.addressType;
		}

		public void setAddressType(String addressType) {
			this.addressType = addressType;
		}

		public Integer getAddressTypeName() {
			return this.addressTypeName;
		}

		public void setAddressTypeName(Integer addressTypeName) {
			this.addressTypeName = addressTypeName;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getMasterZoneId() {
			return this.masterZoneId;
		}

		public void setMasterZoneId(String masterZoneId) {
			this.masterZoneId = masterZoneId;
		}

		public String getSlaveZoneId() {
			return this.slaveZoneId;
		}

		public void setSlaveZoneId(String slaveZoneId) {
			this.slaveZoneId = slaveZoneId;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getLoadBalancerSpec() {
			return this.loadBalancerSpec;
		}

		public void setLoadBalancerSpec(String loadBalancerSpec) {
			this.loadBalancerSpec = loadBalancerSpec;
		}

		public Integer getMaxConn() {
			return this.maxConn;
		}

		public void setMaxConn(Integer maxConn) {
			this.maxConn = maxConn;
		}

		public Integer getQps() {
			return this.qps;
		}

		public void setQps(Integer qps) {
			this.qps = qps;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}
	}

	@Override
	public DescribeUnboundSlbByGroupIdsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUnboundSlbByGroupIdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
