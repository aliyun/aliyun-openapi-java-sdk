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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeFabricOrganizationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricOrganizationResponse extends AcsResponse {

	private Integer errorCode;

	private String requestId;

	private Boolean success;

	private Result result;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String cANAME;

		private String cAUrl;

		private String codeName;

		private Integer consortiumCount;

		private String createTime;

		private String domain;

		private String mSP;

		private String organizationDescription;

		private String organizationId;

		private String organizationName;

		private String ownerBid;

		private String ownerName;

		private Long ownerUid;

		private Integer peerCount;

		private String regionId;

		private String requestId;

		private String specName;

		private String state;

		private Integer userCount;

		private String zoneId;

		private List<TagsItem> tags;

		public String getCANAME() {
			return this.cANAME;
		}

		public void setCANAME(String cANAME) {
			this.cANAME = cANAME;
		}

		public String getCAUrl() {
			return this.cAUrl;
		}

		public void setCAUrl(String cAUrl) {
			this.cAUrl = cAUrl;
		}

		public String getCodeName() {
			return this.codeName;
		}

		public void setCodeName(String codeName) {
			this.codeName = codeName;
		}

		public Integer getConsortiumCount() {
			return this.consortiumCount;
		}

		public void setConsortiumCount(Integer consortiumCount) {
			this.consortiumCount = consortiumCount;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getMSP() {
			return this.mSP;
		}

		public void setMSP(String mSP) {
			this.mSP = mSP;
		}

		public String getOrganizationDescription() {
			return this.organizationDescription;
		}

		public void setOrganizationDescription(String organizationDescription) {
			this.organizationDescription = organizationDescription;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getOrganizationName() {
			return this.organizationName;
		}

		public void setOrganizationName(String organizationName) {
			this.organizationName = organizationName;
		}

		public String getOwnerBid() {
			return this.ownerBid;
		}

		public void setOwnerBid(String ownerBid) {
			this.ownerBid = ownerBid;
		}

		public String getOwnerName() {
			return this.ownerName;
		}

		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}

		public Integer getPeerCount() {
			return this.peerCount;
		}

		public void setPeerCount(Integer peerCount) {
			this.peerCount = peerCount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getSpecName() {
			return this.specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Integer userCount) {
			this.userCount = userCount;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

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
	}

	@Override
	public DescribeFabricOrganizationResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricOrganizationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
