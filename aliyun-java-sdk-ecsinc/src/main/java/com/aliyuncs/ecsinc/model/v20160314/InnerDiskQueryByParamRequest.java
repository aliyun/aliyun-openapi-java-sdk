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
public class InnerDiskQueryByParamRequest extends RpcAcsRequest<InnerDiskQueryByParamResponse> {
	
	public InnerDiskQueryByParamRequest() {
		super("EcsInc", "2016-03-14", "InnerDiskQueryByParam", "ecs", "innerAPI");
	}

	private String fuzzyDiskName;

	private Long resourceOwnerId;

	private String izNo;

	private String prePayEcsInstanceIds;

	private String autoSnapshotPolicyId;

	private String channel;

	private String operator;

	private String excludeStatus;

	private String diskName;

	private Boolean deleteAutoSnapshot;

	private String diskCategory;

	private Integer pageSize;

	private String snapshotNo;

	private Long aliUid;

	private Boolean deleteWithInstance;

	private String proxyId;

	private String postPayEcsInstanceIds;

	private String ecsInstanceId;

	private Boolean enableAutoSnapshot;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Boolean active;

	private String imageNo;

	private String createTimeFrom;

	private Boolean enableAutomatedSnapshotPolicy;

	private Boolean portable;

	private Long ownerId;

	private String diskType;

	private String token;

	private String tags;

	private Boolean async;

	private String instanceIds;

	private Integer pageNo;

	private String createTimeTo;

	private String bid;

	private String status;

	public String getFuzzyDiskName() {
		return this.fuzzyDiskName;
	}

	public void setFuzzyDiskName(String fuzzyDiskName) {
		this.fuzzyDiskName = fuzzyDiskName;
		if(fuzzyDiskName != null){
			putQueryParameter("fuzzyDiskName", fuzzyDiskName);
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

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("izNo", izNo);
		}
	}

	public String getPrePayEcsInstanceIds() {
		return this.prePayEcsInstanceIds;
	}

	public void setPrePayEcsInstanceIds(String prePayEcsInstanceIds) {
		this.prePayEcsInstanceIds = prePayEcsInstanceIds;
		if(prePayEcsInstanceIds != null){
			putQueryParameter("prePayEcsInstanceIds", prePayEcsInstanceIds);
		}
	}

	public String getAutoSnapshotPolicyId() {
		return this.autoSnapshotPolicyId;
	}

	public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
		this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		if(autoSnapshotPolicyId != null){
			putQueryParameter("autoSnapshotPolicyId", autoSnapshotPolicyId);
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("operator", operator);
		}
	}

	public String getExcludeStatus() {
		return this.excludeStatus;
	}

	public void setExcludeStatus(String excludeStatus) {
		this.excludeStatus = excludeStatus;
		if(excludeStatus != null){
			putQueryParameter("excludeStatus", excludeStatus);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("diskName", diskName);
		}
	}

	public Boolean getDeleteAutoSnapshot() {
		return this.deleteAutoSnapshot;
	}

	public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
		this.deleteAutoSnapshot = deleteAutoSnapshot;
		if(deleteAutoSnapshot != null){
			putQueryParameter("deleteAutoSnapshot", deleteAutoSnapshot.toString());
		}
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
		if(diskCategory != null){
			putQueryParameter("diskCategory", diskCategory);
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

	public String getSnapshotNo() {
		return this.snapshotNo;
	}

	public void setSnapshotNo(String snapshotNo) {
		this.snapshotNo = snapshotNo;
		if(snapshotNo != null){
			putQueryParameter("snapshotNo", snapshotNo);
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

	public Boolean getDeleteWithInstance() {
		return this.deleteWithInstance;
	}

	public void setDeleteWithInstance(Boolean deleteWithInstance) {
		this.deleteWithInstance = deleteWithInstance;
		if(deleteWithInstance != null){
			putQueryParameter("deleteWithInstance", deleteWithInstance.toString());
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

	public String getPostPayEcsInstanceIds() {
		return this.postPayEcsInstanceIds;
	}

	public void setPostPayEcsInstanceIds(String postPayEcsInstanceIds) {
		this.postPayEcsInstanceIds = postPayEcsInstanceIds;
		if(postPayEcsInstanceIds != null){
			putQueryParameter("postPayEcsInstanceIds", postPayEcsInstanceIds);
		}
	}

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("ecsInstanceId", ecsInstanceId);
		}
	}

	public Boolean getEnableAutoSnapshot() {
		return this.enableAutoSnapshot;
	}

	public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
		this.enableAutoSnapshot = enableAutoSnapshot;
		if(enableAutoSnapshot != null){
			putQueryParameter("enableAutoSnapshot", enableAutoSnapshot.toString());
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

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
		if(active != null){
			putQueryParameter("active", active.toString());
		}
	}

	public String getImageNo() {
		return this.imageNo;
	}

	public void setImageNo(String imageNo) {
		this.imageNo = imageNo;
		if(imageNo != null){
			putQueryParameter("imageNo", imageNo);
		}
	}

	public String getCreateTimeFrom() {
		return this.createTimeFrom;
	}

	public void setCreateTimeFrom(String createTimeFrom) {
		this.createTimeFrom = createTimeFrom;
		if(createTimeFrom != null){
			putQueryParameter("createTimeFrom", createTimeFrom);
		}
	}

	public Boolean getEnableAutomatedSnapshotPolicy() {
		return this.enableAutomatedSnapshotPolicy;
	}

	public void setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
		this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
		if(enableAutomatedSnapshotPolicy != null){
			putQueryParameter("enableAutomatedSnapshotPolicy", enableAutomatedSnapshotPolicy.toString());
		}
	}

	public Boolean getPortable() {
		return this.portable;
	}

	public void setPortable(Boolean portable) {
		this.portable = portable;
		if(portable != null){
			putQueryParameter("portable", portable.toString());
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

	public String getCreateTimeTo() {
		return this.createTimeTo;
	}

	public void setCreateTimeTo(String createTimeTo) {
		this.createTimeTo = createTimeTo;
		if(createTimeTo != null){
			putQueryParameter("createTimeTo", createTimeTo);
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
	public Class<InnerDiskQueryByParamResponse> getResponseClass() {
		return InnerDiskQueryByParamResponse.class;
	}

}
