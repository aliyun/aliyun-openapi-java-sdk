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
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalItems;

	private Integer totalPages;

	private List<GtmInstance> gtmInstances;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<GtmInstance> getGtmInstances() {
		return this.gtmInstances;
	}

	public void setGtmInstances(List<GtmInstance> gtmInstances) {
		this.gtmInstances = gtmInstances;
	}

	public static class GtmInstance {

		private String instanceId;

		private String instanceName;

		private String cname;

		private String userDomainName;

		private String versionCode;

		private Integer ttl;

		private String lbaStrategy;

		private String createTime;

		private Long createTimestamp;

		private String expireTime;

		private Long expireTimestamp;

		private String alertGroup;

		private String cnameMode;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getUserDomainName() {
			return this.userDomainName;
		}

		public void setUserDomainName(String userDomainName) {
			this.userDomainName = userDomainName;
		}

		public String getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(String versionCode) {
			this.versionCode = versionCode;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public String getLbaStrategy() {
			return this.lbaStrategy;
		}

		public void setLbaStrategy(String lbaStrategy) {
			this.lbaStrategy = lbaStrategy;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getExpireTimestamp() {
			return this.expireTimestamp;
		}

		public void setExpireTimestamp(Long expireTimestamp) {
			this.expireTimestamp = expireTimestamp;
		}

		public String getAlertGroup() {
			return this.alertGroup;
		}

		public void setAlertGroup(String alertGroup) {
			this.alertGroup = alertGroup;
		}

		public String getCnameMode() {
			return this.cnameMode;
		}

		public void setCnameMode(String cnameMode) {
			this.cnameMode = cnameMode;
		}
	}

	@Override
	public DescribeGtmInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
