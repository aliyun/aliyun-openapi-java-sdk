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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeImagesRequest extends RpcAcsRequest<DescribeImagesResponse> {
	
	public DescribeImagesRequest() {
		super("Ecs", "2014-05-26", "DescribeImages", "ecs");
	}

	private String tag4Value;

	private String actionType;

	private Long resourceOwnerId;

	private String imageId;

	private String snapshotId;

	private String tag2Key;

	private String usage;

	private String tag3Key;

	private Integer pageNumber;

	private String imageOwnerAlias;

	private String tag1Value;

	private String resourceGroupId;

	private Boolean isSupportIoOptimized;

	private String imageName;

	private Boolean isSupportCloudinit;

	private Integer pageSize;

	private String instanceType;

	private String tag3Value;

	private String architecture;

	private Boolean dryRun;

	private String tag5Key;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Boolean showExpired;

	private String oSType;

	private Long ownerId;

	private String tag5Value;

	private String tag1Key;

	private List<Filter> filters;

	private String tag2Value;

	private String tag4Key;

	private String status;

	public String getTag4Value() {
		return this.tag4Value;
	}

	public void setTag4Value(String tag4Value) {
		this.tag4Value = tag4Value;
		if(tag4Value != null){
			putQueryParameter("Tag.4.Value", tag4Value);
		}
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putQueryParameter("ActionType", actionType);
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

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public String getTag2Key() {
		return this.tag2Key;
	}

	public void setTag2Key(String tag2Key) {
		this.tag2Key = tag2Key;
		if(tag2Key != null){
			putQueryParameter("Tag.2.Key", tag2Key);
		}
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
		if(usage != null){
			putQueryParameter("Usage", usage);
		}
	}

	public String getTag3Key() {
		return this.tag3Key;
	}

	public void setTag3Key(String tag3Key) {
		this.tag3Key = tag3Key;
		if(tag3Key != null){
			putQueryParameter("Tag.3.Key", tag3Key);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
		}
	}

	public String getTag1Value() {
		return this.tag1Value;
	}

	public void setTag1Value(String tag1Value) {
		this.tag1Value = tag1Value;
		if(tag1Value != null){
			putQueryParameter("Tag.1.Value", tag1Value);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Boolean getIsSupportIoOptimized() {
		return this.isSupportIoOptimized;
	}

	public void setIsSupportIoOptimized(Boolean isSupportIoOptimized) {
		this.isSupportIoOptimized = isSupportIoOptimized;
		if(isSupportIoOptimized != null){
			putQueryParameter("IsSupportIoOptimized", isSupportIoOptimized.toString());
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public Boolean getIsSupportCloudinit() {
		return this.isSupportCloudinit;
	}

	public void setIsSupportCloudinit(Boolean isSupportCloudinit) {
		this.isSupportCloudinit = isSupportCloudinit;
		if(isSupportCloudinit != null){
			putQueryParameter("IsSupportCloudinit", isSupportCloudinit.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getTag3Value() {
		return this.tag3Value;
	}

	public void setTag3Value(String tag3Value) {
		this.tag3Value = tag3Value;
		if(tag3Value != null){
			putQueryParameter("Tag.3.Value", tag3Value);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getTag5Key() {
		return this.tag5Key;
	}

	public void setTag5Key(String tag5Key) {
		this.tag5Key = tag5Key;
		if(tag5Key != null){
			putQueryParameter("Tag.5.Key", tag5Key);
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

	public Boolean getShowExpired() {
		return this.showExpired;
	}

	public void setShowExpired(Boolean showExpired) {
		this.showExpired = showExpired;
		if(showExpired != null){
			putQueryParameter("ShowExpired", showExpired.toString());
		}
	}

	public String getOSType() {
		return this.oSType;
	}

	public void setOSType(String oSType) {
		this.oSType = oSType;
		if(oSType != null){
			putQueryParameter("OSType", oSType);
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

	public String getTag5Value() {
		return this.tag5Value;
	}

	public void setTag5Value(String tag5Value) {
		this.tag5Value = tag5Value;
		if(tag5Value != null){
			putQueryParameter("Tag.5.Value", tag5Value);
		}
	}

	public String getTag1Key() {
		return this.tag1Key;
	}

	public void setTag1Key(String tag1Key) {
		this.tag1Key = tag1Key;
		if(tag1Key != null){
			putQueryParameter("Tag.1.Key", tag1Key);
		}
	}

	public List<Filter> getFilters() {
		return this.filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;	
		if (filters != null) {
			for (int depth1 = 0; depth1 < filters.size(); depth1++) {
				putQueryParameter("Filter." + (depth1 + 1) + ".Key" , filters.get(depth1).getKey());
				putQueryParameter("Filter." + (depth1 + 1) + ".Value" , filters.get(depth1).getValue());
			}
		}	
	}

	public String getTag2Value() {
		return this.tag2Value;
	}

	public void setTag2Value(String tag2Value) {
		this.tag2Value = tag2Value;
		if(tag2Value != null){
			putQueryParameter("Tag.2.Value", tag2Value);
		}
	}

	public String getTag4Key() {
		return this.tag4Key;
	}

	public void setTag4Key(String tag4Key) {
		this.tag4Key = tag4Key;
		if(tag4Key != null){
			putQueryParameter("Tag.4.Key", tag4Key);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public static class Filter {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<DescribeImagesResponse> getResponseClass() {
		return DescribeImagesResponse.class;
	}

}
