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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.CreateFabricConsortiumResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateFabricConsortiumResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private Result result;

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

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer channelCount;

		private String domain;

		private String createTime;

		private String specName;

		private Integer ordererCount;

		private String serviceState;

		private String clusterState;

		private Long ownerUid;

		private String ownerBid;

		private String codeName;

		private String regionId;

		private Integer memberCount;

		private String channelPolicy;

		private String ordererType;

		private String description;

		private String consortiumId;

		private String zoneId;

		private String consortiumName;

		public Integer getChannelCount() {
			return this.channelCount;
		}

		public void setChannelCount(Integer channelCount) {
			this.channelCount = channelCount;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSpecName() {
			return this.specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public Integer getOrdererCount() {
			return this.ordererCount;
		}

		public void setOrdererCount(Integer ordererCount) {
			this.ordererCount = ordererCount;
		}

		public String getServiceState() {
			return this.serviceState;
		}

		public void setServiceState(String serviceState) {
			this.serviceState = serviceState;
		}

		public String getClusterState() {
			return this.clusterState;
		}

		public void setClusterState(String clusterState) {
			this.clusterState = clusterState;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}

		public String getOwnerBid() {
			return this.ownerBid;
		}

		public void setOwnerBid(String ownerBid) {
			this.ownerBid = ownerBid;
		}

		public String getCodeName() {
			return this.codeName;
		}

		public void setCodeName(String codeName) {
			this.codeName = codeName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getMemberCount() {
			return this.memberCount;
		}

		public void setMemberCount(Integer memberCount) {
			this.memberCount = memberCount;
		}

		public String getChannelPolicy() {
			return this.channelPolicy;
		}

		public void setChannelPolicy(String channelPolicy) {
			this.channelPolicy = channelPolicy;
		}

		public String getOrdererType() {
			return this.ordererType;
		}

		public void setOrdererType(String ordererType) {
			this.ordererType = ordererType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getConsortiumName() {
			return this.consortiumName;
		}

		public void setConsortiumName(String consortiumName) {
			this.consortiumName = consortiumName;
		}
	}

	@Override
	public CreateFabricConsortiumResponse getInstance(UnmarshallerContext context) {
		return	CreateFabricConsortiumResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
