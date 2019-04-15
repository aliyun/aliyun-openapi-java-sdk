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
public class InnerInstanceQueryByParamBackyardRequest extends RpcAcsRequest<InnerInstanceQueryByParamBackyardResponse> {
	
	public InnerInstanceQueryByParamBackyardRequest() {
		super("EcsInc", "2016-03-14", "InnerInstanceQueryByParamBackyard", "ecs", "innerAPI");
	}

	private Integer startOfInternetTx;

	private String ecsIds;

	private Long resourceOwnerId;

	private Long imageId;

	private String internetIp;

	private String izNo;

	private Boolean ioOptimized;

	private String channel;

	private String vpcInstanceId;

	private String imgPc;

	private Boolean notSyncHouyi;

	private String instanceTypeId;

	private String operator;

	private String vswInstanceId;

	private String hostname;

	private Integer cores;

	private String zoneNo;

	private Integer mem;

	private String bizStatus;

	private Integer pageSize;

	private Long aliUid;

	private String exclusionEcsIds;

	private String proxyId;

	private String order;

	private String systemDeviceCategory;

	private String imageType;

	private Integer agentId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer endOfInternetTx;

	private Long ownerId;

	private Long regionIndexId;

	private String token;

	private String ecsNetworkType;

	private String regionNo;

	private String instanceIds;

	private Integer pageNo;

	private Long zoneId;

	private String appKey;

	private String bid;

	private Long izId;

	private String intranetIp;

	private String status;

	private Boolean orderType;

	public Integer getStartOfInternetTx() {
		return this.startOfInternetTx;
	}

	public void setStartOfInternetTx(Integer startOfInternetTx) {
		this.startOfInternetTx = startOfInternetTx;
		if(startOfInternetTx != null){
			putQueryParameter("startOfInternetTx", startOfInternetTx.toString());
		}
	}

	public String getEcsIds() {
		return this.ecsIds;
	}

	public void setEcsIds(String ecsIds) {
		this.ecsIds = ecsIds;
		if(ecsIds != null){
			putQueryParameter("ecsIds", ecsIds);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
		if(internetIp != null){
			putQueryParameter("internetIp", internetIp);
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

	public String getImgPc() {
		return this.imgPc;
	}

	public void setImgPc(String imgPc) {
		this.imgPc = imgPc;
		if(imgPc != null){
			putQueryParameter("imgPc", imgPc);
		}
	}

	public Boolean getNotSyncHouyi() {
		return this.notSyncHouyi;
	}

	public void setNotSyncHouyi(Boolean notSyncHouyi) {
		this.notSyncHouyi = notSyncHouyi;
		if(notSyncHouyi != null){
			putQueryParameter("notSyncHouyi", notSyncHouyi.toString());
		}
	}

	public String getInstanceTypeId() {
		return this.instanceTypeId;
	}

	public void setInstanceTypeId(String instanceTypeId) {
		this.instanceTypeId = instanceTypeId;
		if(instanceTypeId != null){
			putQueryParameter("instanceTypeId", instanceTypeId);
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

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("hostname", hostname);
		}
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
		if(cores != null){
			putQueryParameter("cores", cores.toString());
		}
	}

	public String getZoneNo() {
		return this.zoneNo;
	}

	public void setZoneNo(String zoneNo) {
		this.zoneNo = zoneNo;
		if(zoneNo != null){
			putQueryParameter("zoneNo", zoneNo);
		}
	}

	public Integer getMem() {
		return this.mem;
	}

	public void setMem(Integer mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("mem", mem.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
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

	public String getExclusionEcsIds() {
		return this.exclusionEcsIds;
	}

	public void setExclusionEcsIds(String exclusionEcsIds) {
		this.exclusionEcsIds = exclusionEcsIds;
		if(exclusionEcsIds != null){
			putQueryParameter("exclusionEcsIds", exclusionEcsIds);
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

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("order", order);
		}
	}

	public String getSystemDeviceCategory() {
		return this.systemDeviceCategory;
	}

	public void setSystemDeviceCategory(String systemDeviceCategory) {
		this.systemDeviceCategory = systemDeviceCategory;
		if(systemDeviceCategory != null){
			putQueryParameter("systemDeviceCategory", systemDeviceCategory);
		}
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
		if(imageType != null){
			putQueryParameter("imageType", imageType);
		}
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("agentId", agentId.toString());
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

	public Integer getEndOfInternetTx() {
		return this.endOfInternetTx;
	}

	public void setEndOfInternetTx(Integer endOfInternetTx) {
		this.endOfInternetTx = endOfInternetTx;
		if(endOfInternetTx != null){
			putQueryParameter("endOfInternetTx", endOfInternetTx.toString());
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

	public Long getRegionIndexId() {
		return this.regionIndexId;
	}

	public void setRegionIndexId(Long regionIndexId) {
		this.regionIndexId = regionIndexId;
		if(regionIndexId != null){
			putQueryParameter("regionIndexId", regionIndexId.toString());
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

	public String getEcsNetworkType() {
		return this.ecsNetworkType;
	}

	public void setEcsNetworkType(String ecsNetworkType) {
		this.ecsNetworkType = ecsNetworkType;
		if(ecsNetworkType != null){
			putQueryParameter("ecsNetworkType", ecsNetworkType);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("regionNo", regionNo);
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

	public Long getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(Long zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("zoneId", zoneId.toString());
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("appKey", appKey);
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

	public Long getIzId() {
		return this.izId;
	}

	public void setIzId(Long izId) {
		this.izId = izId;
		if(izId != null){
			putQueryParameter("izId", izId.toString());
		}
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
		if(intranetIp != null){
			putQueryParameter("intranetIp", intranetIp);
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

	public Boolean getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Boolean orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("orderType", orderType.toString());
		}
	}

	@Override
	public Class<InnerInstanceQueryByParamBackyardResponse> getResponseClass() {
		return InnerInstanceQueryByParamBackyardResponse.class;
	}

}
