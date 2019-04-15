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
public class InnerImageQueryAvailableImgsRequest extends RpcAcsRequest<InnerImageQueryAvailableImgsResponse> {
	
	public InnerImageQueryAvailableImgsRequest() {
		super("EcsInc", "2016-03-14", "InnerImageQueryAvailableImgs", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String snapshotId;

	private Boolean ioOptimized;

	private String channel;

	private Boolean isAll;

	private String fuzzyImageName;

	private String operator;

	private String imageOwnerAlias;

	private String imageName;

	private Integer pageSize;

	private String instanceType;

	private Long aliUid;

	private String quoteType;

	private String createEndTime;

	private String proxyId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String userCountryType;

	private String osType;

	private Long ownerId;

	private String createStartTime;

	private String token;

	private String tags;

	private String regionNos;

	private Boolean async;

	private Integer pageNo;

	private Integer osBit;

	private String bid;

	private String imageIds;

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

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("snapshotId", snapshotId);
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

	public Boolean getIsAll() {
		return this.isAll;
	}

	public void setIsAll(Boolean isAll) {
		this.isAll = isAll;
		if(isAll != null){
			putQueryParameter("isAll", isAll.toString());
		}
	}

	public String getFuzzyImageName() {
		return this.fuzzyImageName;
	}

	public void setFuzzyImageName(String fuzzyImageName) {
		this.fuzzyImageName = fuzzyImageName;
		if(fuzzyImageName != null){
			putQueryParameter("fuzzyImageName", fuzzyImageName);
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

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("imageOwnerAlias", imageOwnerAlias);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("imageName", imageName);
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

	public String getQuoteType() {
		return this.quoteType;
	}

	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
		if(quoteType != null){
			putQueryParameter("quoteType", quoteType);
		}
	}

	public String getCreateEndTime() {
		return this.createEndTime;
	}

	public void setCreateEndTime(String createEndTime) {
		this.createEndTime = createEndTime;
		if(createEndTime != null){
			putQueryParameter("createEndTime", createEndTime);
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

	public String getUserCountryType() {
		return this.userCountryType;
	}

	public void setUserCountryType(String userCountryType) {
		this.userCountryType = userCountryType;
		if(userCountryType != null){
			putQueryParameter("userCountryType", userCountryType);
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("osType", osType);
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

	public String getCreateStartTime() {
		return this.createStartTime;
	}

	public void setCreateStartTime(String createStartTime) {
		this.createStartTime = createStartTime;
		if(createStartTime != null){
			putQueryParameter("createStartTime", createStartTime);
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

	public String getRegionNos() {
		return this.regionNos;
	}

	public void setRegionNos(String regionNos) {
		this.regionNos = regionNos;
		if(regionNos != null){
			putQueryParameter("regionNos", regionNos);
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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("pageNo", pageNo.toString());
		}
	}

	public Integer getOsBit() {
		return this.osBit;
	}

	public void setOsBit(Integer osBit) {
		this.osBit = osBit;
		if(osBit != null){
			putQueryParameter("osBit", osBit.toString());
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

	public String getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(String imageIds) {
		this.imageIds = imageIds;
		if(imageIds != null){
			putQueryParameter("imageIds", imageIds);
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
	public Class<InnerImageQueryAvailableImgsResponse> getResponseClass() {
		return InnerImageQueryAvailableImgsResponse.class;
	}

}
