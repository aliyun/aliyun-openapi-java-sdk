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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribePropertyUserDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyUserDetailResponse extends AcsResponse {

	private String requestId;

	private List<PropertyUser> propertys;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PropertyUser> getPropertys() {
		return this.propertys;
	}

	public void setPropertys(List<PropertyUser> propertys) {
		this.propertys = propertys;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PropertyUser {

		private String lastLoginTime;

		private String isRoot;

		private String instanceName;

		private String accountsExpirationDate;

		private String passwordExpirationDate;

		private String ip;

		private String create;

		private Long createTimestamp;

		private String user;

		private String uuid;

		private String lastLoginIp;

		private String instanceId;

		private String intranetIp;

		private String internetIp;

		private String status;

		private List<String> groupNames;

		public String getLastLoginTime() {
			return this.lastLoginTime;
		}

		public void setLastLoginTime(String lastLoginTime) {
			this.lastLoginTime = lastLoginTime;
		}

		public String getIsRoot() {
			return this.isRoot;
		}

		public void setIsRoot(String isRoot) {
			this.isRoot = isRoot;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getAccountsExpirationDate() {
			return this.accountsExpirationDate;
		}

		public void setAccountsExpirationDate(String accountsExpirationDate) {
			this.accountsExpirationDate = accountsExpirationDate;
		}

		public String getPasswordExpirationDate() {
			return this.passwordExpirationDate;
		}

		public void setPasswordExpirationDate(String passwordExpirationDate) {
			this.passwordExpirationDate = passwordExpirationDate;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getCreate() {
			return this.create;
		}

		public void setCreate(String create) {
			this.create = create;
		}

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getLastLoginIp() {
			return this.lastLoginIp;
		}

		public void setLastLoginIp(String lastLoginIp) {
			this.lastLoginIp = lastLoginIp;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<String> getGroupNames() {
			return this.groupNames;
		}

		public void setGroupNames(List<String> groupNames) {
			this.groupNames = groupNames;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}
	}

	@Override
	public DescribePropertyUserDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribePropertyUserDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
