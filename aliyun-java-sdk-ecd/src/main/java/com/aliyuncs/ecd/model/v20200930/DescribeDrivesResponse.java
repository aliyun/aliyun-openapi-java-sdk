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
import com.aliyuncs.ecd.transform.v20200930.DescribeDrivesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDrivesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Drive> drives;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Drive> getDrives() {
		return this.drives;
	}

	public void setDrives(List<Drive> drives) {
		this.drives = drives;
	}

	public static class Drive {

		private String id;

		private String gmtCreate;

		private String gmtModified;

		private Long aliUid;

		private String domainId;

		private String externalDomainId;

		private String driveId;

		private String externalDriveId;

		private String userId;

		private String externalUserId;

		private String name;

		private String description;

		private Long totalSize;

		private Long usedSize;

		private String status;

		private String type;

		private Boolean profileRoaming;

		private Integer desktopGroupCount;

		private Boolean enableProfileManagement;

		private List<DesktopGroup> desktopGroups;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getDomainId() {
			return this.domainId;
		}

		public void setDomainId(String domainId) {
			this.domainId = domainId;
		}

		public String getExternalDomainId() {
			return this.externalDomainId;
		}

		public void setExternalDomainId(String externalDomainId) {
			this.externalDomainId = externalDomainId;
		}

		public String getDriveId() {
			return this.driveId;
		}

		public void setDriveId(String driveId) {
			this.driveId = driveId;
		}

		public String getExternalDriveId() {
			return this.externalDriveId;
		}

		public void setExternalDriveId(String externalDriveId) {
			this.externalDriveId = externalDriveId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getExternalUserId() {
			return this.externalUserId;
		}

		public void setExternalUserId(String externalUserId) {
			this.externalUserId = externalUserId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public Long getUsedSize() {
			return this.usedSize;
		}

		public void setUsedSize(Long usedSize) {
			this.usedSize = usedSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getProfileRoaming() {
			return this.profileRoaming;
		}

		public void setProfileRoaming(Boolean profileRoaming) {
			this.profileRoaming = profileRoaming;
		}

		public Integer getDesktopGroupCount() {
			return this.desktopGroupCount;
		}

		public void setDesktopGroupCount(Integer desktopGroupCount) {
			this.desktopGroupCount = desktopGroupCount;
		}

		public Boolean getEnableProfileManagement() {
			return this.enableProfileManagement;
		}

		public void setEnableProfileManagement(Boolean enableProfileManagement) {
			this.enableProfileManagement = enableProfileManagement;
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
		}
	}

	@Override
	public DescribeDrivesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDrivesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
