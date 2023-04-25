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

package com.aliyuncs.alikafka.model.v20190916;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetQuotaTipResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaTipResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Boolean success;

	private QuotaData quotaData;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public QuotaData getQuotaData() {
		return this.quotaData;
	}

	public void setQuotaData(QuotaData quotaData) {
		this.quotaData = quotaData;
	}

	public static class QuotaData {

		private Integer topicNumOfBuy;

		private Integer topicQuota;

		private Integer topicLeft;

		private Integer topicUsed;

		private Integer partitionNumOfBuy;

		private Integer partitionQuata;

		private Integer partitionLeft;

		private Integer partitionUsed;

		private Integer groupLeft;

		private Integer groupUsed;

		private Integer isPartitionBuy;

		private Integer partitionQuota;

		public Integer getTopicNumOfBuy() {
			return this.topicNumOfBuy;
		}

		public void setTopicNumOfBuy(Integer topicNumOfBuy) {
			this.topicNumOfBuy = topicNumOfBuy;
		}

		public Integer getTopicQuota() {
			return this.topicQuota;
		}

		public void setTopicQuota(Integer topicQuota) {
			this.topicQuota = topicQuota;
		}

		public Integer getTopicLeft() {
			return this.topicLeft;
		}

		public void setTopicLeft(Integer topicLeft) {
			this.topicLeft = topicLeft;
		}

		public Integer getTopicUsed() {
			return this.topicUsed;
		}

		public void setTopicUsed(Integer topicUsed) {
			this.topicUsed = topicUsed;
		}

		public Integer getPartitionNumOfBuy() {
			return this.partitionNumOfBuy;
		}

		public void setPartitionNumOfBuy(Integer partitionNumOfBuy) {
			this.partitionNumOfBuy = partitionNumOfBuy;
		}

		public Integer getPartitionQuata() {
			return this.partitionQuata;
		}

		public void setPartitionQuata(Integer partitionQuata) {
			this.partitionQuata = partitionQuata;
		}

		public Integer getPartitionLeft() {
			return this.partitionLeft;
		}

		public void setPartitionLeft(Integer partitionLeft) {
			this.partitionLeft = partitionLeft;
		}

		public Integer getPartitionUsed() {
			return this.partitionUsed;
		}

		public void setPartitionUsed(Integer partitionUsed) {
			this.partitionUsed = partitionUsed;
		}

		public Integer getGroupLeft() {
			return this.groupLeft;
		}

		public void setGroupLeft(Integer groupLeft) {
			this.groupLeft = groupLeft;
		}

		public Integer getGroupUsed() {
			return this.groupUsed;
		}

		public void setGroupUsed(Integer groupUsed) {
			this.groupUsed = groupUsed;
		}

		public Integer getIsPartitionBuy() {
			return this.isPartitionBuy;
		}

		public void setIsPartitionBuy(Integer isPartitionBuy) {
			this.isPartitionBuy = isPartitionBuy;
		}

		public Integer getPartitionQuota() {
			return this.partitionQuota;
		}

		public void setPartitionQuota(Integer partitionQuota) {
			this.partitionQuota = partitionQuota;
		}
	}

	@Override
	public GetQuotaTipResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaTipResponseUnmarshaller.unmarshall(this, context);
	}
}
