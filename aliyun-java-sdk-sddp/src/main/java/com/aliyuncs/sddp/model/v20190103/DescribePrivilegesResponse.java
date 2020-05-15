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
import com.aliyuncs.sddp.transform.v20190103.DescribePrivilegesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePrivilegesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<Privilege> items;

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

	public List<Privilege> getItems() {
		return this.items;
	}

	public void setItems(List<Privilege> items) {
		this.items = items;
	}

	public static class Privilege {

		private Long id;

		private Long accountId;

		private Integer accountType;

		private Long useAccountId;

		private Integer useAccountType;

		private String productName;

		private String productCode;

		private String dataType;

		private String dataTypeId;

		private String dataTypeName;

		private String dataInstance;

		private String dataTable;

		private String dataColumn;

		private String dataPackage;

		private String resourceName;

		private String resourcePath;

		private String operation;

		private String policyCondition;

		private String sensitive;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAccountId() {
			return this.accountId;
		}

		public void setAccountId(Long accountId) {
			this.accountId = accountId;
		}

		public Integer getAccountType() {
			return this.accountType;
		}

		public void setAccountType(Integer accountType) {
			this.accountType = accountType;
		}

		public Long getUseAccountId() {
			return this.useAccountId;
		}

		public void setUseAccountId(Long useAccountId) {
			this.useAccountId = useAccountId;
		}

		public Integer getUseAccountType() {
			return this.useAccountType;
		}

		public void setUseAccountType(Integer useAccountType) {
			this.useAccountType = useAccountType;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public String getDataTypeId() {
			return this.dataTypeId;
		}

		public void setDataTypeId(String dataTypeId) {
			this.dataTypeId = dataTypeId;
		}

		public String getDataTypeName() {
			return this.dataTypeName;
		}

		public void setDataTypeName(String dataTypeName) {
			this.dataTypeName = dataTypeName;
		}

		public String getDataInstance() {
			return this.dataInstance;
		}

		public void setDataInstance(String dataInstance) {
			this.dataInstance = dataInstance;
		}

		public String getDataTable() {
			return this.dataTable;
		}

		public void setDataTable(String dataTable) {
			this.dataTable = dataTable;
		}

		public String getDataColumn() {
			return this.dataColumn;
		}

		public void setDataColumn(String dataColumn) {
			this.dataColumn = dataColumn;
		}

		public String getDataPackage() {
			return this.dataPackage;
		}

		public void setDataPackage(String dataPackage) {
			this.dataPackage = dataPackage;
		}

		public String getResourceName() {
			return this.resourceName;
		}

		public void setResourceName(String resourceName) {
			this.resourceName = resourceName;
		}

		public String getResourcePath() {
			return this.resourcePath;
		}

		public void setResourcePath(String resourcePath) {
			this.resourcePath = resourcePath;
		}

		public String getOperation() {
			return this.operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}

		public String getPolicyCondition() {
			return this.policyCondition;
		}

		public void setPolicyCondition(String policyCondition) {
			this.policyCondition = policyCondition;
		}

		public String getSensitive() {
			return this.sensitive;
		}

		public void setSensitive(String sensitive) {
			this.sensitive = sensitive;
		}
	}

	@Override
	public DescribePrivilegesResponse getInstance(UnmarshallerContext context) {
		return	DescribePrivilegesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
