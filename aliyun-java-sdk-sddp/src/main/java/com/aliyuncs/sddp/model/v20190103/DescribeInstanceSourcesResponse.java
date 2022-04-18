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

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<InstanceSource> items;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

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

		private String lastModifyUserId;

		private Integer passwordStatus;

		private String engineType;

		private String tenantName;

		private String instanceId;

		private String instanceDescription;

		private Long dataLimitId;

		private String regionId;

		private String dbName;

		private Long lastModifyTime;

		private String regionName;

		private Boolean canModifyUserName;

		private Integer logStoreDay;

		private Long gmtCreate;

		private Integer autoScan;

		private Long productId;

		private Long instanceSize;

		private String userName;

		private Integer auditStatus;

		private Long id;

		private String tenantId;

		private Integer enable;

		private Integer checkStatus;

		private Integer datamaskStatus;

		private String errorMessage;

		private Integer samplingSize;

		public String getLastModifyUserId() {
			return this.lastModifyUserId;
		}

		public void setLastModifyUserId(String lastModifyUserId) {
			this.lastModifyUserId = lastModifyUserId;
		}

		public Integer getPasswordStatus() {
			return this.passwordStatus;
		}

		public void setPasswordStatus(Integer passwordStatus) {
			this.passwordStatus = passwordStatus;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public Long getDataLimitId() {
			return this.dataLimitId;
		}

		public void setDataLimitId(Long dataLimitId) {
			this.dataLimitId = dataLimitId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDbName() {
			return this.dbName;
		}

		public void setDbName(String dbName) {
			this.dbName = dbName;
		}

		public Long getLastModifyTime() {
			return this.lastModifyTime;
		}

		public void setLastModifyTime(Long lastModifyTime) {
			this.lastModifyTime = lastModifyTime;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Boolean getCanModifyUserName() {
			return this.canModifyUserName;
		}

		public void setCanModifyUserName(Boolean canModifyUserName) {
			this.canModifyUserName = canModifyUserName;
		}

		public Integer getLogStoreDay() {
			return this.logStoreDay;
		}

		public void setLogStoreDay(Integer logStoreDay) {
			this.logStoreDay = logStoreDay;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getAutoScan() {
			return this.autoScan;
		}

		public void setAutoScan(Integer autoScan) {
			this.autoScan = autoScan;
		}

		public Long getProductId() {
			return this.productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public Long getInstanceSize() {
			return this.instanceSize;
		}

		public void setInstanceSize(Long instanceSize) {
			this.instanceSize = instanceSize;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public Integer getEnable() {
			return this.enable;
		}

		public void setEnable(Integer enable) {
			this.enable = enable;
		}

		public Integer getCheckStatus() {
			return this.checkStatus;
		}

		public void setCheckStatus(Integer checkStatus) {
			this.checkStatus = checkStatus;
		}

		public Integer getDatamaskStatus() {
			return this.datamaskStatus;
		}

		public void setDatamaskStatus(Integer datamaskStatus) {
			this.datamaskStatus = datamaskStatus;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public Integer getSamplingSize() {
			return this.samplingSize;
		}

		public void setSamplingSize(Integer samplingSize) {
			this.samplingSize = samplingSize;
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
