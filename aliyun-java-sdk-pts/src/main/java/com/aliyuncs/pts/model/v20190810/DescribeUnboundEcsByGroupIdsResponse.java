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
import com.aliyuncs.pts.transform.v20190810.DescribeUnboundEcsByGroupIdsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUnboundEcsByGroupIdsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Integer httpStatusCode;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<SceneMonitorEcsInfoView> ecsList;

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

	public List<SceneMonitorEcsInfoView> getEcsList() {
		return this.ecsList;
	}

	public void setEcsList(List<SceneMonitorEcsInfoView> ecsList) {
		this.ecsList = ecsList;
	}

	public static class SceneMonitorEcsInfoView {

		private String instanceId;

		private String instanceName;

		private String regionId;

		private String regionName;

		private String instanceNetworkType;

		private String instanceNetworkTypeName;

		private String eipAddress;

		private String status;

		private String statusName;

		private String internetMaxBandwidthOut;

		private Integer eipBandwidth;

		private String agentStatus;

		private List<String> primaryIpAddress;

		private List<String> publicIpAddress;

		private List<String> innerIpAddress;

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

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
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

		public String getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}

		public List<String> getPrimaryIpAddress() {
			return this.primaryIpAddress;
		}

		public void setPrimaryIpAddress(List<String> primaryIpAddress) {
			this.primaryIpAddress = primaryIpAddress;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}
	}

	@Override
	public DescribeUnboundEcsByGroupIdsResponse getInstance(UnmarshallerContext context) {
		return	DescribeUnboundEcsByGroupIdsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
