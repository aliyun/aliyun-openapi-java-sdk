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
import com.aliyuncs.baas.transform.v20181221.DescribeFabricConsortiumChannelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFabricConsortiumChannelsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer errorCode;

	private List<ResultItem> result;

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

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private Integer batchTimeout;

		private String updateTime;

		private Integer chaincodeCount;

		private Integer preferredMaxBytes;

		private String memberJoinedCount;

		private String state;

		private String createTime;

		private Boolean supportChannelConfig;

		private String ownerName;

		private Long ownerUid;

		private String ownerBid;

		private Integer maxMessageCount;

		private Integer memberCount;

		private Boolean needJoined;

		private String requestId;

		private String consortiumId;

		private String channelName;

		private String deleteTime;

		private String channelId;

		private Integer consortiumChannelId;

		private Boolean deleted;

		private String consortiumName;

		private Integer blockCount;

		public Integer getBatchTimeout() {
			return this.batchTimeout;
		}

		public void setBatchTimeout(Integer batchTimeout) {
			this.batchTimeout = batchTimeout;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getChaincodeCount() {
			return this.chaincodeCount;
		}

		public void setChaincodeCount(Integer chaincodeCount) {
			this.chaincodeCount = chaincodeCount;
		}

		public Integer getPreferredMaxBytes() {
			return this.preferredMaxBytes;
		}

		public void setPreferredMaxBytes(Integer preferredMaxBytes) {
			this.preferredMaxBytes = preferredMaxBytes;
		}

		public String getMemberJoinedCount() {
			return this.memberJoinedCount;
		}

		public void setMemberJoinedCount(String memberJoinedCount) {
			this.memberJoinedCount = memberJoinedCount;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getSupportChannelConfig() {
			return this.supportChannelConfig;
		}

		public void setSupportChannelConfig(Boolean supportChannelConfig) {
			this.supportChannelConfig = supportChannelConfig;
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

		public String getOwnerBid() {
			return this.ownerBid;
		}

		public void setOwnerBid(String ownerBid) {
			this.ownerBid = ownerBid;
		}

		public Integer getMaxMessageCount() {
			return this.maxMessageCount;
		}

		public void setMaxMessageCount(Integer maxMessageCount) {
			this.maxMessageCount = maxMessageCount;
		}

		public Integer getMemberCount() {
			return this.memberCount;
		}

		public void setMemberCount(Integer memberCount) {
			this.memberCount = memberCount;
		}

		public Boolean getNeedJoined() {
			return this.needJoined;
		}

		public void setNeedJoined(Boolean needJoined) {
			this.needJoined = needJoined;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getConsortiumId() {
			return this.consortiumId;
		}

		public void setConsortiumId(String consortiumId) {
			this.consortiumId = consortiumId;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getDeleteTime() {
			return this.deleteTime;
		}

		public void setDeleteTime(String deleteTime) {
			this.deleteTime = deleteTime;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public Integer getConsortiumChannelId() {
			return this.consortiumChannelId;
		}

		public void setConsortiumChannelId(Integer consortiumChannelId) {
			this.consortiumChannelId = consortiumChannelId;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
		}

		public String getConsortiumName() {
			return this.consortiumName;
		}

		public void setConsortiumName(String consortiumName) {
			this.consortiumName = consortiumName;
		}

		public Integer getBlockCount() {
			return this.blockCount;
		}

		public void setBlockCount(Integer blockCount) {
			this.blockCount = blockCount;
		}
	}

	@Override
	public DescribeFabricConsortiumChannelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeFabricConsortiumChannelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
