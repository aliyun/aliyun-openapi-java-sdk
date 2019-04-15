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
public class InnerSnapshotQueryUserSnapshotsRequest extends RpcAcsRequest<InnerSnapshotQueryUserSnapshotsResponse> {
	
	public InnerSnapshotQueryUserSnapshotsRequest() {
		super("EcsInc", "2016-03-14", "InnerSnapshotQueryUserSnapshots", "ecs", "innerAPI");
	}

	private String ecsIds;

	private Long resourceOwnerId;

	private String snapshotNickName;

	private String aliUids;

	private String snapshotIds;

	private String channel;

	private String deviceNo;

	private String operator;

	private String deviceType;

	private String gmtCreatedBegin;

	private String ecsSnapshotStatus;

	private Boolean createFinished;

	private String fuzzySnapshotName;

	private Integer pageSize;

	private String diskId;

	private String ecsSnapshotTypes;

	private String quoteType;

	private String gmtCreatedEnd;

	private String proxyId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String excludeSnapshotIds;

	private Long ownerId;

	private String diskType;

	private Long regionIndexId;

	private String token;

	private String regionNo;

	private Integer pageNo;

	private Integer snapshotSizeLowLimit;

	private String ids;

	private Integer snapshotSizeLimit;

	private Boolean isSyncHouyi;

	private String bid;

	private String snapshotNos;

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

	public String getSnapshotNickName() {
		return this.snapshotNickName;
	}

	public void setSnapshotNickName(String snapshotNickName) {
		this.snapshotNickName = snapshotNickName;
		if(snapshotNickName != null){
			putQueryParameter("snapshotNickName", snapshotNickName);
		}
	}

	public String getAliUids() {
		return this.aliUids;
	}

	public void setAliUids(String aliUids) {
		this.aliUids = aliUids;
		if(aliUids != null){
			putQueryParameter("aliUids", aliUids);
		}
	}

	public String getSnapshotIds() {
		return this.snapshotIds;
	}

	public void setSnapshotIds(String snapshotIds) {
		this.snapshotIds = snapshotIds;
		if(snapshotIds != null){
			putQueryParameter("snapshotIds", snapshotIds);
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

	public String getDeviceNo() {
		return this.deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
		if(deviceNo != null){
			putQueryParameter("deviceNo", deviceNo);
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

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("deviceType", deviceType);
		}
	}

	public String getGmtCreatedBegin() {
		return this.gmtCreatedBegin;
	}

	public void setGmtCreatedBegin(String gmtCreatedBegin) {
		this.gmtCreatedBegin = gmtCreatedBegin;
		if(gmtCreatedBegin != null){
			putQueryParameter("gmtCreatedBegin", gmtCreatedBegin);
		}
	}

	public String getEcsSnapshotStatus() {
		return this.ecsSnapshotStatus;
	}

	public void setEcsSnapshotStatus(String ecsSnapshotStatus) {
		this.ecsSnapshotStatus = ecsSnapshotStatus;
		if(ecsSnapshotStatus != null){
			putQueryParameter("ecsSnapshotStatus", ecsSnapshotStatus);
		}
	}

	public Boolean getCreateFinished() {
		return this.createFinished;
	}

	public void setCreateFinished(Boolean createFinished) {
		this.createFinished = createFinished;
		if(createFinished != null){
			putQueryParameter("createFinished", createFinished.toString());
		}
	}

	public String getFuzzySnapshotName() {
		return this.fuzzySnapshotName;
	}

	public void setFuzzySnapshotName(String fuzzySnapshotName) {
		this.fuzzySnapshotName = fuzzySnapshotName;
		if(fuzzySnapshotName != null){
			putQueryParameter("fuzzySnapshotName", fuzzySnapshotName);
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

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("diskId", diskId);
		}
	}

	public String getEcsSnapshotTypes() {
		return this.ecsSnapshotTypes;
	}

	public void setEcsSnapshotTypes(String ecsSnapshotTypes) {
		this.ecsSnapshotTypes = ecsSnapshotTypes;
		if(ecsSnapshotTypes != null){
			putQueryParameter("ecsSnapshotTypes", ecsSnapshotTypes);
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

	public String getGmtCreatedEnd() {
		return this.gmtCreatedEnd;
	}

	public void setGmtCreatedEnd(String gmtCreatedEnd) {
		this.gmtCreatedEnd = gmtCreatedEnd;
		if(gmtCreatedEnd != null){
			putQueryParameter("gmtCreatedEnd", gmtCreatedEnd);
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

	public String getExcludeSnapshotIds() {
		return this.excludeSnapshotIds;
	}

	public void setExcludeSnapshotIds(String excludeSnapshotIds) {
		this.excludeSnapshotIds = excludeSnapshotIds;
		if(excludeSnapshotIds != null){
			putQueryParameter("excludeSnapshotIds", excludeSnapshotIds);
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

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
		if(diskType != null){
			putQueryParameter("diskType", diskType);
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

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("regionNo", regionNo);
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

	public Integer getSnapshotSizeLowLimit() {
		return this.snapshotSizeLowLimit;
	}

	public void setSnapshotSizeLowLimit(Integer snapshotSizeLowLimit) {
		this.snapshotSizeLowLimit = snapshotSizeLowLimit;
		if(snapshotSizeLowLimit != null){
			putQueryParameter("snapshotSizeLowLimit", snapshotSizeLowLimit.toString());
		}
	}

	public String getIds() {
		return this.ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
		if(ids != null){
			putQueryParameter("ids", ids);
		}
	}

	public Integer getSnapshotSizeLimit() {
		return this.snapshotSizeLimit;
	}

	public void setSnapshotSizeLimit(Integer snapshotSizeLimit) {
		this.snapshotSizeLimit = snapshotSizeLimit;
		if(snapshotSizeLimit != null){
			putQueryParameter("snapshotSizeLimit", snapshotSizeLimit.toString());
		}
	}

	public Boolean getIsSyncHouyi() {
		return this.isSyncHouyi;
	}

	public void setIsSyncHouyi(Boolean isSyncHouyi) {
		this.isSyncHouyi = isSyncHouyi;
		if(isSyncHouyi != null){
			putQueryParameter("isSyncHouyi", isSyncHouyi.toString());
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

	public String getSnapshotNos() {
		return this.snapshotNos;
	}

	public void setSnapshotNos(String snapshotNos) {
		this.snapshotNos = snapshotNos;
		if(snapshotNos != null){
			putQueryParameter("snapshotNos", snapshotNos);
		}
	}

	@Override
	public Class<InnerSnapshotQueryUserSnapshotsResponse> getResponseClass() {
		return InnerSnapshotQueryUserSnapshotsResponse.class;
	}

}
