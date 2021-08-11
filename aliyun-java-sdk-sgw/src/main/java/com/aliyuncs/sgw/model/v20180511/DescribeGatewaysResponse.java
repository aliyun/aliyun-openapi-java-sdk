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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewaysResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Gateway> gateways;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<Gateway> getGateways() {
		return this.gateways;
	}

	public void setGateways(List<Gateway> gateways) {
		this.gateways = gateways;
	}

	public static class Gateway {

		private String gatewayId;

		private String storageBundleId;

		private String name;

		private String description;

		private String location;

		private String category;

		private String type;

		private String gatewayClass;

		private String model;

		private String serialNumber;

		private String status;

		private String ecsInstanceId;

		private String vpcId;

		private String vSwitchId;

		private String ip;

		private String innerIp;

		private Long createdTime;

		private Long activatedTime;

		private String taskId;

		private String gatewayVersion;

		private String buyURL;

		private String renewURL;

		private Boolean isPostPaid;

		private Boolean isReleaseAfterExpiration;

		private Long expiredTime;

		private Integer expireStatus;

		private String commonBuyInstanceId;

		private Integer publicNetworkBandwidth;

		private String gatewayType;

		private Boolean elasticGateway;

		private Integer maxThroughput;

		private Integer capacity;

		private String dataLoadType;

		private Integer dataLoadInterval;

		private String lastErrorKey;

		private String innerIpv6Ip;

		private List<String> elasticNodes;

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public String getStorageBundleId() {
			return this.storageBundleId;
		}

		public void setStorageBundleId(String storageBundleId) {
			this.storageBundleId = storageBundleId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getGatewayClass() {
			return this.gatewayClass;
		}

		public void setGatewayClass(String gatewayClass) {
			this.gatewayClass = gatewayClass;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEcsInstanceId() {
			return this.ecsInstanceId;
		}

		public void setEcsInstanceId(String ecsInstanceId) {
			this.ecsInstanceId = ecsInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInnerIp() {
			return this.innerIp;
		}

		public void setInnerIp(String innerIp) {
			this.innerIp = innerIp;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
		}

		public Long getActivatedTime() {
			return this.activatedTime;
		}

		public void setActivatedTime(Long activatedTime) {
			this.activatedTime = activatedTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getGatewayVersion() {
			return this.gatewayVersion;
		}

		public void setGatewayVersion(String gatewayVersion) {
			this.gatewayVersion = gatewayVersion;
		}

		public String getBuyURL() {
			return this.buyURL;
		}

		public void setBuyURL(String buyURL) {
			this.buyURL = buyURL;
		}

		public String getRenewURL() {
			return this.renewURL;
		}

		public void setRenewURL(String renewURL) {
			this.renewURL = renewURL;
		}

		public Boolean getIsPostPaid() {
			return this.isPostPaid;
		}

		public void setIsPostPaid(Boolean isPostPaid) {
			this.isPostPaid = isPostPaid;
		}

		public Boolean getIsReleaseAfterExpiration() {
			return this.isReleaseAfterExpiration;
		}

		public void setIsReleaseAfterExpiration(Boolean isReleaseAfterExpiration) {
			this.isReleaseAfterExpiration = isReleaseAfterExpiration;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Integer getExpireStatus() {
			return this.expireStatus;
		}

		public void setExpireStatus(Integer expireStatus) {
			this.expireStatus = expireStatus;
		}

		public String getCommonBuyInstanceId() {
			return this.commonBuyInstanceId;
		}

		public void setCommonBuyInstanceId(String commonBuyInstanceId) {
			this.commonBuyInstanceId = commonBuyInstanceId;
		}

		public Integer getPublicNetworkBandwidth() {
			return this.publicNetworkBandwidth;
		}

		public void setPublicNetworkBandwidth(Integer publicNetworkBandwidth) {
			this.publicNetworkBandwidth = publicNetworkBandwidth;
		}

		public String getGatewayType() {
			return this.gatewayType;
		}

		public void setGatewayType(String gatewayType) {
			this.gatewayType = gatewayType;
		}

		public Boolean getElasticGateway() {
			return this.elasticGateway;
		}

		public void setElasticGateway(Boolean elasticGateway) {
			this.elasticGateway = elasticGateway;
		}

		public Integer getMaxThroughput() {
			return this.maxThroughput;
		}

		public void setMaxThroughput(Integer maxThroughput) {
			this.maxThroughput = maxThroughput;
		}

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public String getDataLoadType() {
			return this.dataLoadType;
		}

		public void setDataLoadType(String dataLoadType) {
			this.dataLoadType = dataLoadType;
		}

		public Integer getDataLoadInterval() {
			return this.dataLoadInterval;
		}

		public void setDataLoadInterval(Integer dataLoadInterval) {
			this.dataLoadInterval = dataLoadInterval;
		}

		public String getLastErrorKey() {
			return this.lastErrorKey;
		}

		public void setLastErrorKey(String lastErrorKey) {
			this.lastErrorKey = lastErrorKey;
		}

		public String getInnerIpv6Ip() {
			return this.innerIpv6Ip;
		}

		public void setInnerIpv6Ip(String innerIpv6Ip) {
			this.innerIpv6Ip = innerIpv6Ip;
		}

		public List<String> getElasticNodes() {
			return this.elasticNodes;
		}

		public void setElasticNodes(List<String> elasticNodes) {
			this.elasticNodes = elasticNodes;
		}
	}

	@Override
	public DescribeGatewaysResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewaysResponseUnmarshaller.unmarshall(this, context);
	}
}
