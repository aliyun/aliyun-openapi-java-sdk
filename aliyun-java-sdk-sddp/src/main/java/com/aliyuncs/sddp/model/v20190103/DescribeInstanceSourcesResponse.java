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

package com.aliyuncs.sddp.model.v20190103;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeInstanceSourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceSourcesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<InstanceSource> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<InstanceSource> getItems() {
		return this.items;
	}

	public void setItems(List<InstanceSource> items) {
		this.items = items;
	}

	public static class InstanceSource {

		private String regionId;

		private String regionName;

		private String instanceId;

		private Long id;

		private String userName;

		private String dbName;

		private Long dataLimitId;

		private Long gmtCreate;

		private Long productId;

		private Integer auditStatus;

		private Integer logStoreDay;

		private Integer enable;

		private Integer autoScan;

		private String engineType;

		private Long instanceSize;

		private Integer passwordStatus;

		private String lastModifyUserId;

		private Long lastModifyTime;

		private String tenantId;

		private String tenantName;

		private String instanceDescription;

		private Boolean canModifyUserName;

		private String instanceDescription1;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public Long getDataLimitId() {
			return this.dataLimitId;
		}

		public void setDataLimitId(Long dataLimitId) {
			this.dataLimitId = dataLimitId;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getProductId() {
			return this.productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public Integer getLogStoreDay() {
			return this.logStoreDay;
		}

		public void setLogStoreDay(Integer logStoreDay) {
			this.logStoreDay = logStoreDay;
		}

		public Integer getEnable() {
			return this.enable;
		}

		public void setEnable(Integer enable) {
			this.enable = enable;
		}

		public Integer getAutoScan() {
			return this.autoScan;
		}

		public void setAutoScan(Integer autoScan) {
			this.autoScan = autoScan;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public Long getInstanceSize() {
			return this.instanceSize;
		}

		public void setInstanceSize(Long instanceSize) {
			this.instanceSize = instanceSize;
		}

		public Integer getPasswordStatus() {
			return this.passwordStatus;
		}

		public void setPasswordStatus(Integer passwordStatus) {
			this.passwordStatus = passwordStatus;
		}

		public String getLastModifyUserId() {
			return this.lastModifyUserId;
		}

		public void setLastModifyUserId(String lastModifyUserId) {
			this.lastModifyUserId = lastModifyUserId;
		}

		public Long getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(Long lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public Boolean getCanModifyUserName() {
			return this.canModifyUserName;
		}

		public void setCanModifyUserName(Boolean canModifyUserName) {
			this.canModifyUserName = canModifyUserName;
		}

		public String getInstanceDescription1() {
			return this.instanceDescription1;
		}

		public void setInstanceDescription1(String instanceDescription1) {
			this.instanceDescription1 = instanceDescription1;
		}
	}

	@Override
	public DescribeInstanceSourcesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceSourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
