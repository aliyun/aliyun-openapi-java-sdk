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

		private Float ratioThreshold;

		private Long connectDuration;

		private Long idleDisconnectDuration;

		private Long version;

		private Long stopDuration;

		private Boolean profileFollowSwitch;

		private String nasFileSystemID;

		private String nasFileSystemName;

		private String timingStrategyInfo;

		private List<TimerInfo> timerInfos;

		private List<ScaleTimerInfo> scaleTimerInfos;

		private List<String> policyGroupIds;

		private List<String> policyGroupNames;

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

		public Float getRatioThreshold() {
			return this.ratioThreshold;
		}

		public void setRatioThreshold(Float ratioThreshold) {
			this.ratioThreshold = ratioThreshold;
		}

		public Long getConnectDuration() {
			return this.connectDuration;
		}

		public void setConnectDuration(Long connectDuration) {
			this.connectDuration = connectDuration;
		}

		public Long getIdleDisconnectDuration() {
			return this.idleDisconnectDuration;
		}

		public void setIdleDisconnectDuration(Long idleDisconnectDuration) {
			this.idleDisconnectDuration = idleDisconnectDuration;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public Long getStopDuration() {
			return this.stopDuration;
		}

		public void setStopDuration(Long stopDuration) {
			this.stopDuration = stopDuration;
		}

		public Boolean getProfileFollowSwitch() {
			return this.profileFollowSwitch;
		}

		public void setProfileFollowSwitch(Boolean profileFollowSwitch) {
			this.profileFollowSwitch = profileFollowSwitch;
		}

		public String getNasFileSystemID() {
			return this.nasFileSystemID;
		}

		public void setNasFileSystemID(String nasFileSystemID) {
			this.nasFileSystemID = nasFileSystemID;
		}

		public String getNasFileSystemName() {
			return this.nasFileSystemName;
		}

		public void setNasFileSystemName(String nasFileSystemName) {
			this.nasFileSystemName = nasFileSystemName;
		}

		public String getTimingStrategyInfo() {
			return this.timingStrategyInfo;
		}

		public void setTimingStrategyInfo(String timingStrategyInfo) {
			this.timingStrategyInfo = timingStrategyInfo;
		}

		public List<TimerInfo> getTimerInfos() {
			return this.timerInfos;
		}

		public void setTimerInfos(List<TimerInfo> timerInfos) {
			this.timerInfos = timerInfos;
		}

		public List<ScaleTimerInfo> getScaleTimerInfos() {
			return this.scaleTimerInfos;
		}

		public void setScaleTimerInfos(List<ScaleTimerInfo> scaleTimerInfos) {
			this.scaleTimerInfos = scaleTimerInfos;
		}

		public List<String> getPolicyGroupIds() {
			return this.policyGroupIds;
		}

		public void setPolicyGroupIds(List<String> policyGroupIds) {
			this.policyGroupIds = policyGroupIds;
		}

		public List<String> getPolicyGroupNames() {
			return this.policyGroupNames;
		}

		public void setPolicyGroupNames(List<String> policyGroupNames) {
			this.policyGroupNames = policyGroupNames;
		}

		public static class TimerInfo {

			private Integer status;

			private String cronExpression;

			private Integer timerType;

			private Boolean forced;

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

			public Boolean getForced() {
				return this.forced;
			}

			public void setForced(Boolean forced) {
				this.forced = forced;
			}
		}

		public static class ScaleTimerInfo {

			private String type;

			private String cron;

			private Integer loadPolicy;

			private Integer minResAmount;

			private Long keepDuration;

			private Float ratioThreshold;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCron() {
				return this.cron;
			}

			public void setCron(String cron) {
				this.cron = cron;
			}

			public Integer getLoadPolicy() {
				return this.loadPolicy;
			}

			public void setLoadPolicy(Integer loadPolicy) {
				this.loadPolicy = loadPolicy;
			}

			public Integer getMinResAmount() {
				return this.minResAmount;
			}

			public void setMinResAmount(Integer minResAmount) {
				this.minResAmount = minResAmount;
			}

			public Long getKeepDuration() {
				return this.keepDuration;
			}

			public void setKeepDuration(Long keepDuration) {
				this.keepDuration = keepDuration;
			}

			public Float getRatioThreshold() {
				return this.ratioThreshold;
			}

			public void setRatioThreshold(Float ratioThreshold) {
				this.ratioThreshold = ratioThreshold;
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
