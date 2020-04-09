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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListWarehousesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListWarehousesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<WarehouseModel> warehouses;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<WarehouseModel> getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(List<WarehouseModel> warehouses) {
		this.warehouses = warehouses;
	}

	public static class WarehouseModel {

		private String tel;

		private String description;

		private String name;

		private String warehouseCategoryCode;

		private String createDate;

		private String code;

		private String address;

		private String updateDate;

		private String contact;

		private Integer disable;

		private String warehouseId;

		public String getTel() {
			return this.tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getWarehouseCategoryCode() {
			return this.warehouseCategoryCode;
		}

		public void setWarehouseCategoryCode(String warehouseCategoryCode) {
			this.warehouseCategoryCode = warehouseCategoryCode;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getContact() {
			return this.contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public Integer getDisable() {
			return this.disable;
		}

		public void setDisable(Integer disable) {
			this.disable = disable;
		}

		public String getWarehouseId() {
			return this.warehouseId;
		}

		public void setWarehouseId(String warehouseId) {
			this.warehouseId = warehouseId;
		}
	}

	@Override
	public ListWarehousesResponse getInstance(UnmarshallerContext context) {
		return	ListWarehousesResponseUnmarshaller.unmarshall(this, context);
	}
}
