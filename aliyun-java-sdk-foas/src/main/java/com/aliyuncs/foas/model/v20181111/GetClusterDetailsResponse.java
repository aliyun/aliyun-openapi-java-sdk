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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetClusterDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetClusterDetailsResponse extends AcsResponse {

	private String requestId;

	private Details details;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Details getDetails() {
		return this.details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public static class Details {

		private String clusterId;

		private String regionId;

		private String zoneId;

		private String state;

		private String description;

		private String displayName;

		private String ownerId;

		private String operator;

		private String storageType;

		private Long gmtCreate;

		private Long gmtModified;

		private String userOssInfo;

		private String userVpcId;

		private String userSGId;

		private String userVSwitchList;

		private Boolean isMixDeploy;

		private String instanceInfos;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getUserOssInfo() {
			return this.userOssInfo;
		}

		public void setUserOssInfo(String userOssInfo) {
			this.userOssInfo = userOssInfo;
		}

		public String getUserVpcId() {
			return this.userVpcId;
		}

		public void setUserVpcId(String userVpcId) {
			this.userVpcId = userVpcId;
		}

		public String getUserSGId() {
			return this.userSGId;
		}

		public void setUserSGId(String userSGId) {
			this.userSGId = userSGId;
		}

		public String getUserVSwitchList() {
			return this.userVSwitchList;
		}

		public void setUserVSwitchList(String userVSwitchList) {
			this.userVSwitchList = userVSwitchList;
		}

		public Boolean getIsMixDeploy() {
			return this.isMixDeploy;
		}

		public void setIsMixDeploy(Boolean isMixDeploy) {
			this.isMixDeploy = isMixDeploy;
		}

		public String getInstanceInfos() {
			return this.instanceInfos;
		}

		public void setInstanceInfos(String instanceInfos) {
			this.instanceInfos = instanceInfos;
		}
	}

	@Override
	public GetClusterDetailsResponse getInstance(UnmarshallerContext context) {
		return	GetClusterDetailsResponseUnmarshaller.unmarshall(this, context);
	}
}
