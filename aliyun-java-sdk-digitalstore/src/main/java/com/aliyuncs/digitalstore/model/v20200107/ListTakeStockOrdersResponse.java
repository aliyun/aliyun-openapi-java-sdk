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
import com.aliyuncs.digitalstore.transform.v20200107.ListTakeStockOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTakeStockOrdersResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<TakeStockOrderModel> takeStockOrders;

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

	public List<TakeStockOrderModel> getTakeStockOrders() {
		return this.takeStockOrders;
	}

	public void setTakeStockOrders(List<TakeStockOrderModel> takeStockOrders) {
		this.takeStockOrders = takeStockOrders;
	}

	public static class TakeStockOrderModel {

		private String warehouseCode;

		private String createDate;

		private String warehouseName;

		private String confirmDateTime;

		private String description;

		private String orderId;

		private String updateDate;

		private String code;

		private String syncStatus;

		private String status;

		private String makeDateTime;

		private String sourceOrderCode;

		private String lastSyncDateTime;

		private String warehouseId;

		public String getWarehouseCode() {
			return this.warehouseCode;
		}

		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getWarehouseName() {
			return this.warehouseName;
		}

		public void setWarehouseName(String warehouseName) {
			this.warehouseName = warehouseName;
		}

		public String getConfirmDateTime() {
			return this.confirmDateTime;
		}

		public void setConfirmDateTime(String confirmDateTime) {
			this.confirmDateTime = confirmDateTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(String syncStatus) {
			this.syncStatus = syncStatus;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMakeDateTime() {
			return this.makeDateTime;
		}

		public void setMakeDateTime(String makeDateTime) {
			this.makeDateTime = makeDateTime;
		}

		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}

		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}

		public String getLastSyncDateTime() {
			return this.lastSyncDateTime;
		}

		public void setLastSyncDateTime(String lastSyncDateTime) {
			this.lastSyncDateTime = lastSyncDateTime;
		}

		public String getWarehouseId() {
			return this.warehouseId;
		}

		public void setWarehouseId(String warehouseId) {
			this.warehouseId = warehouseId;
		}
	}

	@Override
	public ListTakeStockOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListTakeStockOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
