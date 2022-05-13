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
import com.aliyuncs.ecd.transform.v20200930.DescribeDesktopsInGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopsInGroupResponse extends AcsResponse {

	private Integer postPaidDesktopsCount;

	private String nextToken;

	private Integer paidDesktopsCount;

	private String requestId;

	private Integer postPaidDesktopsTotalAmount;

	private Integer onlinePrePaidDesktopsCount;

	private Integer runningPrePaidDesktopsCount;

	private Integer stopedPrePaidDesktopsCount;

	private List<PaidDesktop> paidDesktops;

	private List<PostPaidDesktop> postPaidDesktops;

	public Integer getPostPaidDesktopsCount() {
		return this.postPaidDesktopsCount;
	}

	public void setPostPaidDesktopsCount(Integer postPaidDesktopsCount) {
		this.postPaidDesktopsCount = postPaidDesktopsCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPaidDesktopsCount() {
		return this.paidDesktopsCount;
	}

	public void setPaidDesktopsCount(Integer paidDesktopsCount) {
		this.paidDesktopsCount = paidDesktopsCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPostPaidDesktopsTotalAmount() {
		return this.postPaidDesktopsTotalAmount;
	}

	public void setPostPaidDesktopsTotalAmount(Integer postPaidDesktopsTotalAmount) {
		this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
	}

	public Integer getOnlinePrePaidDesktopsCount() {
		return this.onlinePrePaidDesktopsCount;
	}

	public void setOnlinePrePaidDesktopsCount(Integer onlinePrePaidDesktopsCount) {
		this.onlinePrePaidDesktopsCount = onlinePrePaidDesktopsCount;
	}

	public Integer getRunningPrePaidDesktopsCount() {
		return this.runningPrePaidDesktopsCount;
	}

	public void setRunningPrePaidDesktopsCount(Integer runningPrePaidDesktopsCount) {
		this.runningPrePaidDesktopsCount = runningPrePaidDesktopsCount;
	}

	public Integer getStopedPrePaidDesktopsCount() {
		return this.stopedPrePaidDesktopsCount;
	}

	public void setStopedPrePaidDesktopsCount(Integer stopedPrePaidDesktopsCount) {
		this.stopedPrePaidDesktopsCount = stopedPrePaidDesktopsCount;
	}

	public List<PaidDesktop> getPaidDesktops() {
		return this.paidDesktops;
	}

	public void setPaidDesktops(List<PaidDesktop> paidDesktops) {
		this.paidDesktops = paidDesktops;
	}

	public List<PostPaidDesktop> getPostPaidDesktops() {
		return this.postPaidDesktops;
	}

	public void setPostPaidDesktops(List<PostPaidDesktop> postPaidDesktops) {
		this.postPaidDesktops = postPaidDesktops;
	}

	public static class PaidDesktop {

		private String endUserId;

		private String desktopStatus;

		private String desktopName;

		private String connectionStatus;

		private String desktopId;

		private String endUserName;

		private String managementFlag;

		private String resetTime;

		private String imageId;

		private String imageName;

		private Integer systemDiskSize;

		private String osType;

		private String gpuDriverVersion;

		private String diskType;

		private List<String> endUserIds;

		private List<String> endUserNames;

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getDesktopStatus() {
			return this.desktopStatus;
		}

		public void setDesktopStatus(String desktopStatus) {
			this.desktopStatus = desktopStatus;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getEndUserName() {
			return this.endUserName;
		}

		public void setEndUserName(String endUserName) {
			this.endUserName = endUserName;
		}

		public String getManagementFlag() {
			return this.managementFlag;
		}

		public void setManagementFlag(String managementFlag) {
			this.managementFlag = managementFlag;
		}

		public String getResetTime() {
			return this.resetTime;
		}

		public void setResetTime(String resetTime) {
			this.resetTime = resetTime;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getGpuDriverVersion() {
			return this.gpuDriverVersion;
		}

		public void setGpuDriverVersion(String gpuDriverVersion) {
			this.gpuDriverVersion = gpuDriverVersion;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public List<String> getEndUserIds() {
			return this.endUserIds;
		}

		public void setEndUserIds(List<String> endUserIds) {
			this.endUserIds = endUserIds;
		}

		public List<String> getEndUserNames() {
			return this.endUserNames;
		}

		public void setEndUserNames(List<String> endUserNames) {
			this.endUserNames = endUserNames;
		}
	}

	public static class PostPaidDesktop {

		private String createDuration;

		private String endUserId;

		private String desktopStatus;

		private String createTime;

		private String releaseTime;

		private String desktopName;

		private String connectionStatus;

		private String desktopId;

		private String endUserName;

		private String managementFlag;

		private String resetTime;

		private String imageId;

		private String imageName;

		private Integer systemDiskSize;

		private String osType;

		private String gpuDriverVersion;

		private String diskType;

		private List<String> endUserIds1;

		private List<String> endUserNames2;

		public String getCreateDuration() {
			return this.createDuration;
		}

		public void setCreateDuration(String createDuration) {
			this.createDuration = createDuration;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getDesktopStatus() {
			return this.desktopStatus;
		}

		public void setDesktopStatus(String desktopStatus) {
			this.desktopStatus = desktopStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(String releaseTime) {
			this.releaseTime = releaseTime;
		}

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getConnectionStatus() {
			return this.connectionStatus;
		}

		public void setConnectionStatus(String connectionStatus) {
			this.connectionStatus = connectionStatus;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public String getEndUserName() {
			return this.endUserName;
		}

		public void setEndUserName(String endUserName) {
			this.endUserName = endUserName;
		}

		public String getManagementFlag() {
			return this.managementFlag;
		}

		public void setManagementFlag(String managementFlag) {
			this.managementFlag = managementFlag;
		}

		public String getResetTime() {
			return this.resetTime;
		}

		public void setResetTime(String resetTime) {
			this.resetTime = resetTime;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getGpuDriverVersion() {
			return this.gpuDriverVersion;
		}

		public void setGpuDriverVersion(String gpuDriverVersion) {
			this.gpuDriverVersion = gpuDriverVersion;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public List<String> getEndUserIds1() {
			return this.endUserIds1;
		}

		public void setEndUserIds1(List<String> endUserIds1) {
			this.endUserIds1 = endUserIds1;
		}

		public List<String> getEndUserNames2() {
			return this.endUserNames2;
		}

		public void setEndUserNames2(List<String> endUserNames2) {
			this.endUserNames2 = endUserNames2;
		}
	}

	@Override
	public DescribeDesktopsInGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeDesktopsInGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
