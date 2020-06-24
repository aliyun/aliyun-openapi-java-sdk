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

package com.aliyuncs.dbs.model.v20190306;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbs.transform.v20190306.DescribeBackupPlanBillingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupPlanBillingResponse extends AcsResponse {

	private Boolean success;

	private String errCode;

	private String errMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Item item;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrCode() {
		return this.errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMessage() {
		return this.errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public static class Item {

		private String buySpec;

		private String buyChargeType;

		private Long buyExpiredTimestamp;

		private Long totalFreeBytes;

		private Long paiedBytes;

		private Long usedFullBytes;

		private Long usedIncrementBytes;

		private Long quotaStartTimestamp;

		private Long quotaEndTimestamp;

		private Long buyCreateTimestamp;

		private Long fullStorageSize;

		private Long contStorageSize;

		private Boolean isExpired;

		private Boolean isFreeBytesUnlimited;

		public String getBuySpec() {
			return this.buySpec;
		}

		public void setBuySpec(String buySpec) {
			this.buySpec = buySpec;
		}

		public String getBuyChargeType() {
			return this.buyChargeType;
		}

		public void setBuyChargeType(String buyChargeType) {
			this.buyChargeType = buyChargeType;
		}

		public Long getBuyExpiredTimestamp() {
			return this.buyExpiredTimestamp;
		}

		public void setBuyExpiredTimestamp(Long buyExpiredTimestamp) {
			this.buyExpiredTimestamp = buyExpiredTimestamp;
		}

		public Long getTotalFreeBytes() {
			return this.totalFreeBytes;
		}

		public void setTotalFreeBytes(Long totalFreeBytes) {
			this.totalFreeBytes = totalFreeBytes;
		}

		public Long getPaiedBytes() {
			return this.paiedBytes;
		}

		public void setPaiedBytes(Long paiedBytes) {
			this.paiedBytes = paiedBytes;
		}

		public Long getUsedFullBytes() {
			return this.usedFullBytes;
		}

		public void setUsedFullBytes(Long usedFullBytes) {
			this.usedFullBytes = usedFullBytes;
		}

		public Long getUsedIncrementBytes() {
			return this.usedIncrementBytes;
		}

		public void setUsedIncrementBytes(Long usedIncrementBytes) {
			this.usedIncrementBytes = usedIncrementBytes;
		}

		public Long getQuotaStartTimestamp() {
			return this.quotaStartTimestamp;
		}

		public void setQuotaStartTimestamp(Long quotaStartTimestamp) {
			this.quotaStartTimestamp = quotaStartTimestamp;
		}

		public Long getQuotaEndTimestamp() {
			return this.quotaEndTimestamp;
		}

		public void setQuotaEndTimestamp(Long quotaEndTimestamp) {
			this.quotaEndTimestamp = quotaEndTimestamp;
		}

		public Long getBuyCreateTimestamp() {
			return this.buyCreateTimestamp;
		}

		public void setBuyCreateTimestamp(Long buyCreateTimestamp) {
			this.buyCreateTimestamp = buyCreateTimestamp;
		}

		public Long getFullStorageSize() {
			return this.fullStorageSize;
		}

		public void setFullStorageSize(Long fullStorageSize) {
			this.fullStorageSize = fullStorageSize;
		}

		public Long getContStorageSize() {
			return this.contStorageSize;
		}

		public void setContStorageSize(Long contStorageSize) {
			this.contStorageSize = contStorageSize;
		}

		public Boolean getIsExpired() {
			return this.isExpired;
		}

		public void setIsExpired(Boolean isExpired) {
			this.isExpired = isExpired;
		}

		public Boolean getIsFreeBytesUnlimited() {
			return this.isFreeBytesUnlimited;
		}

		public void setIsFreeBytesUnlimited(Boolean isFreeBytesUnlimited) {
			this.isFreeBytesUnlimited = isFreeBytesUnlimited;
		}
	}

	@Override
	public DescribeBackupPlanBillingResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupPlanBillingResponseUnmarshaller.unmarshall(this, context);
	}
}
