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
import com.aliyuncs.ecd.transform.v20200930.GetDesktopGroupDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDesktopGroupDetailResponse extends AcsResponse {

	private String requestId;

	private Desktops desktops;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Desktops getDesktops() {
		return this.desktops;
	}

	public void setDesktops(Desktops desktops) {
		this.desktops = desktops;
	}

	public static class Desktops {

		private Integer status;

		private String creationTime;

		private String payType;

		private Integer resetType;

		private Integer loadPolicy;

		private String policyGroupName;

		private String creator;

		private Integer maxDesktopsCount;

		private Integer allowAutoSetup;

		private Integer resType;

		private Integer systemDiskSize;

		private String policyGroupId;

		private String ownBundleId;

		private Float gpuCount;

		private Integer allowBufferCount;

		private Long memory;

		private String gpuSpec;

		private String directoryId;

		private String ownBundleName;

		private String dataDiskCategory;

		private String desktopGroupName;

		private Integer bindAmount;

		private Integer ownType;

		private String systemDiskCategory;

		private String officeSiteId;

		private Long keepDuration;

		private Integer minDesktopsCount;

		private String dataDiskSize;

		private String desktopGroupId;

		private String officeSiteName;

		private String directoryType;

		private Integer cpu;

		private String expiredTime;

		private String comments;

		private String officeSiteType;

		private List<TimerInfo> timerInfos;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public Integer getResetType() {
			return this.resetType;
		}

		public void setResetType(Integer resetType) {
			this.resetType = resetType;
		}

		public Integer getLoadPolicy() {
			return this.loadPolicy;
		}

		public void setLoadPolicy(Integer loadPolicy) {
			this.loadPolicy = loadPolicy;
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

		public Integer getAllowAutoSetup() {
			return this.allowAutoSetup;
		}

		public void setAllowAutoSetup(Integer allowAutoSetup) {
			this.allowAutoSetup = allowAutoSetup;
		}

		public Integer getResType() {
			return this.resType;
		}

		public void setResType(Integer resType) {
			this.resType = resType;
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

		public Integer getAllowBufferCount() {
			return this.allowBufferCount;
		}

		public void setAllowBufferCount(Integer allowBufferCount) {
			this.allowBufferCount = allowBufferCount;
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

		public Integer getBindAmount() {
			return this.bindAmount;
		}

		public void setBindAmount(Integer bindAmount) {
			this.bindAmount = bindAmount;
		}

		public Integer getOwnType() {
			return this.ownType;
		}

		public void setOwnType(Integer ownType) {
			this.ownType = ownType;
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

		public List<TimerInfo> getTimerInfos() {
			return this.timerInfos;
		}

		public void setTimerInfos(List<TimerInfo> timerInfos) {
			this.timerInfos = timerInfos;
		}

		public static class TimerInfo {

			private Integer status;

			private String cronExpression;

			private Integer timerType;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getCronExpression() {
				return this.cronExpression;
			}

			public void setCronExpression(String cronExpression) {
				this.cronExpression = cronExpression;
			}

			public Integer getTimerType() {
				return this.timerType;
			}

			public void setTimerType(Integer timerType) {
				this.timerType = timerType;
			}
		}
	}

	@Override
	public GetDesktopGroupDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDesktopGroupDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
