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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeCommandSupplierResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeCommandSupplierResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNo;

	private Integer pageSize;

	private List<Supplier> supplierList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Supplier> getSupplierList() {
		return this.supplierList;
	}

	public void setSupplierList(List<Supplier> supplierList) {
		this.supplierList = supplierList;
	}

	public static class Supplier {

		private Long aliyunUid;

		private String employeeId;

		private String supplierId;

		private String displayName;

		private String description;

		private String activeStatus;

		public Long getAliyunUid() {
			return this.aliyunUid;
		}

		public void setAliyunUid(Long aliyunUid) {
			this.aliyunUid = aliyunUid;
		}

		public String getEmployeeId() {
			return this.employeeId;
		}

		public void setEmployeeId(String employeeId) {
			this.employeeId = employeeId;
		}

		public String getSupplierId() {
			return this.supplierId;
		}

		public void setSupplierId(String supplierId) {
			this.supplierId = supplierId;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getActiveStatus() {
			return this.activeStatus;
		}

		public void setActiveStatus(String activeStatus) {
			this.activeStatus = activeStatus;
		}
	}

	@Override
	public OpsDescribeCommandSupplierResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeCommandSupplierResponseUnmarshaller.unmarshall(this, context);
	}
}
