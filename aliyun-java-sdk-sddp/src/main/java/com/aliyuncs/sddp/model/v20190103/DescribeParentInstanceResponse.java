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
import com.aliyuncs.sddp.transform.v20190103.DescribeParentInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeParentInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer currentPage;

	private Integer pageSize;

	private Integer totalCount;

	private List<Data> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
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

	public List<Data> getItems() {
		return this.items;
	}

	public void setItems(List<Data> items) {
		this.items = items;
	}

	public static class Data {

		private String instanceId;

		private String localName;

		private String engineType;

		private String parentId;

		private String dbNum;

		private String clusterStatus;

		private String tenantId;

		private String tenantName;

		private String instanceDescription;

		private String resourceType;

		private String unConnectDbCount;

		private String unSupportOneClickAuthReason;

		private String connectNode;

		private String supportConnectNodes;

		private Integer authStatus;

		private Long instanceSize;

		private Integer auditStatus;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public String getEngineType() {
			return this.engineType;
		}

		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getDbNum() {
			return this.dbNum;
		}

		public void setDbNum(String dbNum) {
			this.dbNum = dbNum;
		}

		public String getClusterStatus() {
			return this.clusterStatus;
		}

		public void setClusterStatus(String clusterStatus) {
			this.clusterStatus = clusterStatus;
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

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getUnConnectDbCount() {
			return this.unConnectDbCount;
		}

		public void setUnConnectDbCount(String unConnectDbCount) {
			this.unConnectDbCount = unConnectDbCount;
		}

		public String getUnSupportOneClickAuthReason() {
			return this.unSupportOneClickAuthReason;
		}

		public void setUnSupportOneClickAuthReason(String unSupportOneClickAuthReason) {
			this.unSupportOneClickAuthReason = unSupportOneClickAuthReason;
		}

		public String getConnectNode() {
			return this.connectNode;
		}

		public void setConnectNode(String connectNode) {
			this.connectNode = connectNode;
		}

		public String getSupportConnectNodes() {
			return this.supportConnectNodes;
		}

		public void setSupportConnectNodes(String supportConnectNodes) {
			this.supportConnectNodes = supportConnectNodes;
		}

		public Integer getAuthStatus() {
			return this.authStatus;
		}

		public void setAuthStatus(Integer authStatus) {
			this.authStatus = authStatus;
		}

		public Long getInstanceSize() {
			return this.instanceSize;
		}

		public void setInstanceSize(Long instanceSize) {
			this.instanceSize = instanceSize;
		}

		public Integer getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(Integer auditStatus) {
			this.auditStatus = auditStatus;
		}
	}

	@Override
	public DescribeParentInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeParentInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
