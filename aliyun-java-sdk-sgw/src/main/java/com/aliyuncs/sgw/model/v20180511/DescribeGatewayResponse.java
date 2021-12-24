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
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayResponse extends AcsResponse {

	private String description;

	private Long createdTime;

	private Integer publicNetworkBandwidth;

	private String dataLoadType;

	private String category;

	private String taskId;

	private String message;

	private Integer expireStatus;

	private String ip;

	private String gatewayType;

	private String storageBundleId;

	private String gatewayClass;

	private Boolean success;

	private String name;

	private Boolean isPostPaid;

	private Integer capacity;

	private Long expiredTime;

	private String gatewayVersion;

	private Boolean isReleaseAfterExpiration;

	private String status;

	private String buyURL;

	private Integer maxThroughput;

	private Integer dataLoadInterval;

	private String innerIp;

	private String requestId;

	private String vSwitchId;

	private String gatewayId;

	private String code;

	private String ecsInstanceId;

	private String type;

	private String renewURL;

	private String vpcId;

	private String serialNumber;

	private Long activatedTime;

	private Boolean elasticGateway;

	private String commonBuyInstanceId;

	private String innerIpv6Ip;

	private String model;

	private String lastErrorKey;

	private String location;

	private List<String> elasticNodes;

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getPublicNetworkBandwidth() {
		return this.publicNetworkBandwidth;
	}

	public void setPublicNetworkBandwidth(Integer publicNetworkBandwidth) {
		this.publicNetworkBandwidth = publicNetworkBandwidth;
	}

	public String getDataLoadType() {
		return this.dataLoadType;
	}

	public void setDataLoadType(String dataLoadType) {
		this.dataLoadType = dataLoadType;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getExpireStatus() {
		return this.expireStatus;
	}

	public void setExpireStatus(Integer expireStatus) {
		this.expireStatus = expireStatus;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getGatewayType() {
		return this.gatewayType;
	}

	public void setGatewayType(String gatewayType) {
		this.gatewayType = gatewayType;
	}

	public String getStorageBundleId() {
		return this.storageBundleId;
	}

	public void setStorageBundleId(String storageBundleId) {
		this.storageBundleId = storageBundleId;
	}

	public String getGatewayClass() {
		return this.gatewayClass;
	}

	public void setGatewayClass(String gatewayClass) {
		this.gatewayClass = gatewayClass;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsPostPaid() {
		return this.isPostPaid;
	}

	public void setIsPostPaid(Boolean isPostPaid) {
		this.isPostPaid = isPostPaid;
	}

	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Long getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(Long expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getGatewayVersion() {
		return this.gatewayVersion;
	}

	public void setGatewayVersion(String gatewayVersion) {
		this.gatewayVersion = gatewayVersion;
	}

	public Boolean getIsReleaseAfterExpiration() {
		return this.isReleaseAfterExpiration;
	}

	public void setIsReleaseAfterExpiration(Boolean isReleaseAfterExpiration) {
		this.isReleaseAfterExpiration = isReleaseAfterExpiration;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBuyURL() {
		return this.buyURL;
	}

	public void setBuyURL(String buyURL) {
		this.buyURL = buyURL;
	}

	public Integer getMaxThroughput() {
		return this.maxThroughput;
	}

	public void setMaxThroughput(Integer maxThroughput) {
		this.maxThroughput = maxThroughput;
	}

	public Integer getDataLoadInterval() {
		return this.dataLoadInterval;
	}

	public void setDataLoadInterval(Integer dataLoadInterval) {
		this.dataLoadInterval = dataLoadInterval;
	}

	public String getInnerIp() {
		return this.innerIp;
	}

	public void setInnerIp(String innerIp) {
		this.innerIp = innerIp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRenewURL() {
		return this.renewURL;
	}

	public void setRenewURL(String renewURL) {
		this.renewURL = renewURL;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Long getActivatedTime() {
		return this.activatedTime;
	}

	public void setActivatedTime(Long activatedTime) {
		this.activatedTime = activatedTime;
	}

	public Boolean getElasticGateway() {
		return this.elasticGateway;
	}

	public void setElasticGateway(Boolean elasticGateway) {
		this.elasticGateway = elasticGateway;
	}

	public String getCommonBuyInstanceId() {
		return this.commonBuyInstanceId;
	}

	public void setCommonBuyInstanceId(String commonBuyInstanceId) {
		this.commonBuyInstanceId = commonBuyInstanceId;
	}

	public String getInnerIpv6Ip() {
		return this.innerIpv6Ip;
	}

	public void setInnerIpv6Ip(String innerIpv6Ip) {
		this.innerIpv6Ip = innerIpv6Ip;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLastErrorKey() {
		return this.lastErrorKey;
	}

	public void setLastErrorKey(String lastErrorKey) {
		this.lastErrorKey = lastErrorKey;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getElasticNodes() {
		return this.elasticNodes;
	}

	public void setElasticNodes(List<String> elasticNodes) {
		this.elasticNodes = elasticNodes;
	}

	@Override
	public DescribeGatewayResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
