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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopGroupsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DesktopGroup> desktopGroups;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DesktopGroup> getDesktopGroups() {
		return this.desktopGroups;
	}

	public void setDesktopGroups(List<DesktopGroup> desktopGroups) {
		this.desktopGroups = desktopGroups;
	}

	public static class DesktopGroup {

		private String createTime;

		private String payType;

		private String policyGroupName;

		private String creator;

		private Integer maxDesktopsCount;

		private Integer systemDiskSize;

		private String policyGroupId;

		private String ownBundleId;

		private Float gpuCount;

		private Long memory;

		private String gpuSpec;

		private String directoryId;

		private String ownBundleName;

		private String dataDiskCategory;

		private String desktopGroupName;

		private String systemDiskCategory;

		private String officeSiteId;

		private Long keepDuration;

		private Integer minDesktopsCount;

		private Integer endUserCount;

		private String dataDiskSize;

		private String desktopGroupId;

		private String officeSiteName;

		private String directoryType;

		private Integer cpu;

		private String expiredTime;

		private String comments;

		private String officeSiteType;

		private Integer status;

		private Long resetType;

		private Long loadPolicy;

		private Long bindAmount;

		private Long ownType;

		private String imageId;

		private Boolean volumeEncryptionEnabled;

		private String volumeEncryptionKey;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getPolicyGroupName() {
			return this.policyGroupName;
		}

		public void setPolicyGroupName(String policyGroupName) {
			this.policyGroupName = policyGroupName;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Integer getMaxDesktopsCount() {
			return this.maxDesktopsCount;
		}

		public void setMaxDesktopsCount(Integer maxDesktopsCount) {
			this.maxDesktopsCount = maxDesktopsCount;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getOwnBundleId() {
			return this.ownBundleId;
		}

		public void setOwnBundleId(String ownBundleId) {
			this.ownBundleId = ownBundleId;
		}

		public Float getGpuCount() {
			return this.gpuCount;
		}

		public void setGpuCount(Float gpuCount) {
			this.gpuCount = gpuCount;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getGpuSpec() {
			return this.gpuSpec;
		}

		public void setGpuSpec(String gpuSpec) {
			this.gpuSpec = gpuSpec;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getOwnBundleName() {
			return this.ownBundleName;
		}

		public void setOwnBundleName(String ownBundleName) {
			this.ownBundleName = ownBundleName;
		}

		public String getDataDiskCategory() {
			return this.dataDiskCategory;
		}

		public void setDataDiskCategory(String dataDiskCategory) {
			this.dataDiskCategory = dataDiskCategory;
		}

		public String getDesktopGroupName() {
			return this.desktopGroupName;
		}

		public void setDesktopGroupName(String desktopGroupName) {
			this.desktopGroupName = desktopGroupName;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public Long getKeepDuration() {
			return this.keepDuration;
		}

		public void setKeepDuration(Long keepDuration) {
			this.keepDuration = keepDuration;
		}

		public Integer getMinDesktopsCount() {
			return this.minDesktopsCount;
		}

		public void setMinDesktopsCount(Integer minDesktopsCount) {
			this.minDesktopsCount = minDesktopsCount;
		}

		public Integer getEndUserCount() {
			return this.endUserCount;
		}

		public void setEndUserCount(Integer endUserCount) {
			this.endUserCount = endUserCount;
		}

		public String getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(String dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getDesktopGroupId() {
			return this.desktopGroupId;
		}

		public void setDesktopGroupId(String desktopGroupId) {
			this.desktopGroupId = desktopGroupId;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public String getDirectoryType() {
			return this.directoryType;
		}

		public void setDirectoryType(String directoryType) {
			this.directoryType = directoryType;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getOfficeSiteType() {
			return this.officeSiteType;
		}

		public void setOfficeSiteType(String officeSiteType) {
			this.officeSiteType = officeSiteType;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getResetType() {
			return this.resetType;
		}

		public void setResetType(Long resetType) {
			this.resetType = resetType;
		}

		public Long getLoadPolicy() {
			return this.loadPolicy;
		}

		public void setLoadPolicy(Long loadPolicy) {
			this.loadPolicy = loadPolicy;
		}

		public Long getBindAmount() {
			return this.bindAmount;
		}

		public void setBindAmount(Long bindAmount) {
			this.bindAmount = bindAmount;
		}

		public Long getOwnType() {
			return this.ownType;
		}

		public void setOwnType(Long ownType) {
			this.ownType = ownType;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Boolean getVolumeEncryptionEnabled() {
			return this.volumeEncryptionEnabled;
		}

		public void setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
			this.volumeEncryptionEnabled = volumeEncryptionEnabled;
		}

		public String getVolumeEncryptionKey() {
			return this.volumeEncryptionKey;
		}

		public void setVolumeEncryptionKey(String volumeEncryptionKey) {
			this.volumeEncryptionKey = volumeEncryptionKey;
		}
	}

	@Override
	public DescribeDesktopGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
