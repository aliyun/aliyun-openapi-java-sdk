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

	private String requestId;

	private String nextToken;

	private List<DesktopGroup> desktopGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<DesktopGroup> getDesktopGroups() {
		return this.desktopGroups;
	}

	public void setDesktopGroups(List<DesktopGroup> desktopGroups) {
		this.desktopGroups = desktopGroups;
	}

	public static class DesktopGroup {

		private String desktopGroupId;

		private String desktopGroupName;

		private String officeSiteId;

		private String officeSiteName;

		private String officeSiteType;

		private String policyGroupId;

		private String policyGroupName;

		private String ownBundleId;

		private String ownBundleName;

		private Long endUserCount;

		private String payType;

		private String expiredTime;

		private String createTime;

		private String directoryId;

		private String directoryType;

		private Integer cpu;

		private Long memory;

		private Float gpuCount;

		private String gpuSpec;

		private String systemDiskCategory;

		private Integer systemDiskSize;

		private String dataDiskCategory;

		private String dataDiskSize;

		private String creator;

		private String comments;

		private Integer endUserCount1;

		private Long keepDuration;

		private Integer minDesktopsCount;

		private Integer maxDesktopsCount;

		public String getDesktopGroupId() {
			return this.desktopGroupId;
		}

		public void setDesktopGroupId(String desktopGroupId) {
			this.desktopGroupId = desktopGroupId;
		}

		public String getDesktopGroupName() {
			return this.desktopGroupName;
		}

		public void setDesktopGroupName(String desktopGroupName) {
			this.desktopGroupName = desktopGroupName;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getOfficeSiteName() {
			return this.officeSiteName;
		}

		public void setOfficeSiteName(String officeSiteName) {
			this.officeSiteName = officeSiteName;
		}

		public String getOfficeSiteType() {
			return this.officeSiteType;
		}

		public void setOfficeSiteType(String officeSiteType) {
			this.officeSiteType = officeSiteType;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getPolicyGroupName() {
			return this.policyGroupName;
		}

		public void setPolicyGroupName(String policyGroupName) {
			this.policyGroupName = policyGroupName;
		}

		public String getOwnBundleId() {
			return this.ownBundleId;
		}

		public void setOwnBundleId(String ownBundleId) {
			this.ownBundleId = ownBundleId;
		}

		public String getOwnBundleName() {
			return this.ownBundleName;
		}

		public void setOwnBundleName(String ownBundleName) {
			this.ownBundleName = ownBundleName;
		}

		public Long getEndUserCount() {
			return this.endUserCount;
		}

		public void setEndUserCount(Long endUserCount) {
			this.endUserCount = endUserCount;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
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

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public Float getGpuCount() {
			return this.gpuCount;
		}

		public void setGpuCount(Float gpuCount) {
			this.gpuCount = gpuCount;
		}

		public String getGpuSpec() {
			return this.gpuSpec;
		}

		public void setGpuSpec(String gpuSpec) {
			this.gpuSpec = gpuSpec;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getDataDiskCategory() {
			return this.dataDiskCategory;
		}

		public void setDataDiskCategory(String dataDiskCategory) {
			this.dataDiskCategory = dataDiskCategory;
		}

		public String getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(String dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getComments() {
			return this.comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public Integer getEndUserCount1() {
			return this.endUserCount1;
		}

		public void setEndUserCount1(Integer endUserCount1) {
			this.endUserCount1 = endUserCount1;
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

		public Integer getMaxDesktopsCount() {
			return this.maxDesktopsCount;
		}

		public void setMaxDesktopsCount(Integer maxDesktopsCount) {
			this.maxDesktopsCount = maxDesktopsCount;
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
