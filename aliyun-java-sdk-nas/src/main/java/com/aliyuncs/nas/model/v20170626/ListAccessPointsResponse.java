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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.ListAccessPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccessPointsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private List<AccessPoint> accessPoints;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<AccessPoint> getAccessPoints() {
		return this.accessPoints;
	}

	public void setAccessPoints(List<AccessPoint> accessPoints) {
		this.accessPoints = accessPoints;
	}

	public static class AccessPoint {

		private String status;

		private String modifyTime;

		private String rootPath;

		private String modifyTimeUtc;

		private String domainName;

		private String createTime;

		private String vSwitchId;

		private Boolean enabledRam;

		private String createTimeUtc;

		private String accessPointName;

		private String vpcId;

		private String accessGroup;

		private String accessPointId;

		private String fileSystemId;

		private String agenticSpaceId;

		private String aRN;

		private String rootPathStatus;

		private List<Tag> tags;

		private PosixUser posixUser;

		private RootPathPermission rootPathPermission;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getRootPath() {
			return this.rootPath;
		}

		public void setRootPath(String rootPath) {
			this.rootPath = rootPath;
		}

		public String getModifyTimeUtc() {
			return this.modifyTimeUtc;
		}

		public void setModifyTimeUtc(String modifyTimeUtc) {
			this.modifyTimeUtc = modifyTimeUtc;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Boolean getEnabledRam() {
			return this.enabledRam;
		}

		public void setEnabledRam(Boolean enabledRam) {
			this.enabledRam = enabledRam;
		}

		public String getCreateTimeUtc() {
			return this.createTimeUtc;
		}

		public void setCreateTimeUtc(String createTimeUtc) {
			this.createTimeUtc = createTimeUtc;
		}

		public String getAccessPointName() {
			return this.accessPointName;
		}

		public void setAccessPointName(String accessPointName) {
			this.accessPointName = accessPointName;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getAccessGroup() {
			return this.accessGroup;
		}

		public void setAccessGroup(String accessGroup) {
			this.accessGroup = accessGroup;
		}

		public String getAccessPointId() {
			return this.accessPointId;
		}

		public void setAccessPointId(String accessPointId) {
			this.accessPointId = accessPointId;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getAgenticSpaceId() {
			return this.agenticSpaceId;
		}

		public void setAgenticSpaceId(String agenticSpaceId) {
			this.agenticSpaceId = agenticSpaceId;
		}

		public String getARN() {
			return this.aRN;
		}

		public void setARN(String aRN) {
			this.aRN = aRN;
		}

		public String getRootPathStatus() {
			return this.rootPathStatus;
		}

		public void setRootPathStatus(String rootPathStatus) {
			this.rootPathStatus = rootPathStatus;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public PosixUser getPosixUser() {
			return this.posixUser;
		}

		public void setPosixUser(PosixUser posixUser) {
			this.posixUser = posixUser;
		}

		public RootPathPermission getRootPathPermission() {
			return this.rootPathPermission;
		}

		public void setRootPathPermission(RootPathPermission rootPathPermission) {
			this.rootPathPermission = rootPathPermission;
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class PosixUser {

			private Integer posixGroupId;

			private Integer posixUserId;

			private List<Integer> posixSecondaryGroupIds;

			public Integer getPosixGroupId() {
				return this.posixGroupId;
			}

			public void setPosixGroupId(Integer posixGroupId) {
				this.posixGroupId = posixGroupId;
			}

			public Integer getPosixUserId() {
				return this.posixUserId;
			}

			public void setPosixUserId(Integer posixUserId) {
				this.posixUserId = posixUserId;
			}

			public List<Integer> getPosixSecondaryGroupIds() {
				return this.posixSecondaryGroupIds;
			}

			public void setPosixSecondaryGroupIds(List<Integer> posixSecondaryGroupIds) {
				this.posixSecondaryGroupIds = posixSecondaryGroupIds;
			}
		}

		public static class RootPathPermission {

			private Long ownerUserId;

			private String permission;

			private Long ownerGroupId;

			public Long getOwnerUserId() {
				return this.ownerUserId;
			}

			public void setOwnerUserId(Long ownerUserId) {
				this.ownerUserId = ownerUserId;
			}

			public String getPermission() {
				return this.permission;
			}

			public void setPermission(String permission) {
				this.permission = permission;
			}

			public Long getOwnerGroupId() {
				return this.ownerGroupId;
			}

			public void setOwnerGroupId(Long ownerGroupId) {
				this.ownerGroupId = ownerGroupId;
			}
		}
	}

	@Override
	public ListAccessPointsResponse getInstance(UnmarshallerContext context) {
		return	ListAccessPointsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
