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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeIspFlushCacheInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIspFlushCacheInstancesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalPages;

	private Integer totalItems;

	private List<IspFlushCacheInstance> ispFlushCacheInstances;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public List<IspFlushCacheInstance> getIspFlushCacheInstances() {
		return this.ispFlushCacheInstances;
	}

	public void setIspFlushCacheInstances(List<IspFlushCacheInstance> ispFlushCacheInstances) {
		this.ispFlushCacheInstances = ispFlushCacheInstances;
	}

	public static class IspFlushCacheInstance {

		private String isp;

		private String expireTime;

		private String instanceId;

		private Long expireTimestamp;

		private String instanceName;

		private String versionCode;

		private String status;

		private QuotaInfo quotaInfo;

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getExpireTimestamp() {
			return this.expireTimestamp;
		}

		public void setExpireTimestamp(Long expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public QuotaInfo getQuotaInfo() {
			return this.quotaInfo;
		}

		public void setQuotaInfo(QuotaInfo quotaInfo) {
			this.quotaInfo = quotaInfo;
		}

		public static class QuotaInfo {

			private Integer instanceQuota;

			private Integer instanceQuotaUsed;

			public Integer getInstanceQuota() {
				return this.instanceQuota;
			}

			public void setInstanceQuota(Integer instanceQuota) {
				this.instanceQuota = instanceQuota;
			}

			public Integer getInstanceQuotaUsed() {
				return this.instanceQuotaUsed;
			}

			public void setInstanceQuotaUsed(Integer instanceQuotaUsed) {
				this.instanceQuotaUsed = instanceQuotaUsed;
			}
		}
	}

	@Override
	public DescribeIspFlushCacheInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeIspFlushCacheInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
