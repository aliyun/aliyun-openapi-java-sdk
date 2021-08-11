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

package com.aliyuncs.cassandra.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cassandra.transform.v20190101.DescribeClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClustersResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Cluster> clusters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Cluster> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}

	public static class Cluster {

		private String clusterId;

		private String clusterName;

		private String status;

		private String payType;

		private String createdTime;

		private String expireTime;

		private String majorVersion;

		private String minorVersion;

		private Integer dataCenterCount;

		private String lockMode;

		private Boolean autoRenewal;

		private Integer autoRenewPeriod;

		private String resourceGroupId;

		private List<Tag> tags;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getMajorVersion() {
			return this.majorVersion;
		}

		public void setMajorVersion(String majorVersion) {
			this.majorVersion = majorVersion;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public Integer getDataCenterCount() {
			return this.dataCenterCount;
		}

		public void setDataCenterCount(Integer dataCenterCount) {
			this.dataCenterCount = dataCenterCount;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public Boolean getAutoRenewal() {
			return this.autoRenewal;
		}

		public void setAutoRenewal(Boolean autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public Integer getAutoRenewPeriod() {
			return this.autoRenewPeriod;
		}

		public void setAutoRenewPeriod(Integer autoRenewPeriod) {
			this.autoRenewPeriod = autoRenewPeriod;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

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
	public DescribeClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
