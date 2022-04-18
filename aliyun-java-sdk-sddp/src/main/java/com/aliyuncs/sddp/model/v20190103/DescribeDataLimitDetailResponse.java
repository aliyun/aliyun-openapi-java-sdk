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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeDataLimitDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataLimitDetailResponse extends AcsResponse {

	private String requestId;

	private DataLimit dataLimit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DataLimit getDataLimit() {
		return this.dataLimit;
	}

	public void setDataLimit(DataLimit dataLimit) {
		this.dataLimit = dataLimit;
	}

	public static class DataLimit {

		private String localName;

		private Integer checkStatus;

		private String connector;

		private Integer port;

		private String checkStatusName;

		private String regionId;

		private String parentId;

		private Long resourceType;

		private Integer logStoreDay;

		private Long gmtCreate;

		private String resourceTypeCode;

		private String userName;

		private Long id;

		private Integer auditStatus;

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public Integer getCheckStatus() {
			return this.checkStatus;
		}

		public void setCheckStatus(Integer checkStatus) {
			this.checkStatus = checkStatus;
		}

		public String getConnector() {
			return this.connector;
		}

		public void setConnector(String connector) {
			this.connector = connector;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getCheckStatusName() {
			return this.checkStatusName;
		}

		public void setCheckStatusName(String checkStatusName) {
			this.checkStatusName = checkStatusName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public Long getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(Long resourceType) {
			this.resourceType = resourceType;
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

		public String getResourceTypeCode() {
			return this.resourceTypeCode;
		}

		public void setResourceTypeCode(String resourceTypeCode) {
			this.resourceTypeCode = resourceTypeCode;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}
	}

	@Override
	public DescribeDataLimitDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataLimitDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
