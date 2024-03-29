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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayCachesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayCachesResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Boolean success;

	private List<Cache> caches;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Cache> getCaches() {
		return this.caches;
	}

	public void setCaches(List<Cache> caches) {
		this.caches = caches;
	}

	public static class Cache {

		private String performanceLevel;

		private Long sizeInGB;

		private String buyURL;

		private Long iops;

		private String cacheId;

		private String cacheType;

		private Boolean isUsed;

		private Long expiredTime;

		private String localFilePath;

		private String subscriptionInstanceId;

		private Integer expireStatus;

		private String renewURL;

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public Long getSizeInGB() {
			return this.sizeInGB;
		}

		public void setSizeInGB(Long sizeInGB) {
			this.sizeInGB = sizeInGB;
		}

		public String getBuyURL() {
			return this.buyURL;
		}

		public void setBuyURL(String buyURL) {
			this.buyURL = buyURL;
		}

		public Long getIops() {
			return this.iops;
		}

		public void setIops(Long iops) {
			this.iops = iops;
		}

		public String getCacheId() {
			return this.cacheId;
		}

		public void setCacheId(String cacheId) {
			this.cacheId = cacheId;
		}

		public String getCacheType() {
			return this.cacheType;
		}

		public void setCacheType(String cacheType) {
			this.cacheType = cacheType;
		}

		public Boolean getIsUsed() {
			return this.isUsed;
		}

		public void setIsUsed(Boolean isUsed) {
			this.isUsed = isUsed;
		}

		public Long getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(Long expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getLocalFilePath() {
			return this.localFilePath;
		}

		public void setLocalFilePath(String localFilePath) {
			this.localFilePath = localFilePath;
		}

		public String getSubscriptionInstanceId() {
			return this.subscriptionInstanceId;
		}

		public void setSubscriptionInstanceId(String subscriptionInstanceId) {
			this.subscriptionInstanceId = subscriptionInstanceId;
		}

		public Integer getExpireStatus() {
			return this.expireStatus;
		}

		public void setExpireStatus(Integer expireStatus) {
			this.expireStatus = expireStatus;
		}

		public String getRenewURL() {
			return this.renewURL;
		}

		public void setRenewURL(String renewURL) {
			this.renewURL = renewURL;
		}
	}

	@Override
	public DescribeGatewayCachesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayCachesResponseUnmarshaller.unmarshall(this, context);
	}
}
