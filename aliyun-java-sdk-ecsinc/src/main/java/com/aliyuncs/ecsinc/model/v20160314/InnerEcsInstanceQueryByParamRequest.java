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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsInstanceQueryByParamRequest extends RpcAcsRequest<InnerEcsInstanceQueryByParamResponse> {
	
	public InnerEcsInstanceQueryByParamRequest() {
		super("EcsInc", "2016-03-14", "InnerEcsInstanceQueryByParam", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String izNo;

	private Long imageId;

	private Boolean isNeedDetail;

	private Boolean ioOptimized;

	private String channel;

	private String vpcInstanceId;

	private String operator;

	private String vswInstanceId;

	private String innerIps;

	private String bizStatus;

	private Boolean deviceAvailable;

	private Integer pageSize;

	private String instanceType;

	private Long aliUid;

	private String publicIps;

	private String proxyId;

	private String privateIps;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String instanceTypeFamily;

	private Long ownerId;

	private String token;

	private String tags;

	private String ecsNetworkType;

	private Boolean async;

	private String instanceIds;

	private Integer pageNo;

	private String fuzzyInstanceName;

	private String bid;

	private String groupNo;

	private String status;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("izNo", izNo);
		}
	}

	public Long getImageId() {
		return this.imageId;
	}

	public void setImageId(Long imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("imageId", imageId.toString());
		}
	}

	public Boolean getIsNeedDetail() {
		return this.isNeedDetail;
	}

	public void setIsNeedDetail(Boolean isNeedDetail) {
		this.isNeedDetail = isNeedDetail;
		if(isNeedDetail != null){
			putQueryParameter("isNeedDetail", isNeedDetail.toString());
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("ioOptimized", ioOptimized.toString());
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("channel", channel);
		}
	}

	public String getVpcInstanceId() {
		return this.vpcInstanceId;
	}

	public void setVpcInstanceId(String vpcInstanceId) {
		this.vpcInstanceId = vpcInstanceId;
		if(vpcInstanceId != null){
			putQueryParameter("vpcInstanceId", vpcInstanceId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("operator", operator);
		}
	}

	public String getVswInstanceId() {
		return this.vswInstanceId;
	}

	public void setVswInstanceId(String vswInstanceId) {
		this.vswInstanceId = vswInstanceId;
		if(vswInstanceId != null){
			putQueryParameter("vswInstanceId", vswInstanceId);
		}
	}

	public String getInnerIps() {
		return this.innerIps;
	}

	public void setInnerIps(String innerIps) {
		this.innerIps = innerIps;
		if(innerIps != null){
			putQueryParameter("innerIps", innerIps);
		}
	}

	public String getBizStatus() {
		return this.bizStatus;
	}

	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
		if(bizStatus != null){
			putQueryParameter("bizStatus", bizStatus);
		}
	}

	public Boolean getDeviceAvailable() {
		return this.deviceAvailable;
	}

	public void setDeviceAvailable(Boolean deviceAvailable) {
		this.deviceAvailable = deviceAvailable;
		if(deviceAvailable != null){
			putQueryParameter("deviceAvailable", deviceAvailable.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("instanceType", instanceType);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("aliUid", aliUid.toString());
		}
	}

	public String getPublicIps() {
		return this.publicIps;
	}

	public void setPublicIps(String publicIps) {
		this.publicIps = publicIps;
		if(publicIps != null){
			putQueryParameter("publicIps", publicIps);
		}
	}

	public String getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
		if(proxyId != null){
			putQueryParameter("proxyId", proxyId);
		}
	}

	public String getPrivateIps() {
		return this.privateIps;
	}

	public void setPrivateIps(String privateIps) {
		this.privateIps = privateIps;
		if(privateIps != null){
			putQueryParameter("privateIps", privateIps);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("instanceTypeFamily", instanceTypeFamily);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("tags", tags);
		}
	}

	public String getEcsNetworkType() {
		return this.ecsNetworkType;
	}

	public void setEcsNetworkType(String ecsNetworkType) {
		this.ecsNetworkType = ecsNetworkType;
		if(ecsNetworkType != null){
			putQueryParameter("ecsNetworkType", ecsNetworkType);
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putQueryParameter("async", async.toString());
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("instanceIds", instanceIds);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("pageNo", pageNo.toString());
		}
	}

	public String getFuzzyInstanceName() {
		return this.fuzzyInstanceName;
	}

	public void setFuzzyInstanceName(String fuzzyInstanceName) {
		this.fuzzyInstanceName = fuzzyInstanceName;
		if(fuzzyInstanceName != null){
			putQueryParameter("fuzzyInstanceName", fuzzyInstanceName);
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("bid", bid);
		}
	}

	public String getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
		if(groupNo != null){
			putQueryParameter("groupNo", groupNo);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status);
		}
	}

	@Override
	public Class<InnerEcsInstanceQueryByParamResponse> getResponseClass() {
		return InnerEcsInstanceQueryByParamResponse.class;
	}

}
