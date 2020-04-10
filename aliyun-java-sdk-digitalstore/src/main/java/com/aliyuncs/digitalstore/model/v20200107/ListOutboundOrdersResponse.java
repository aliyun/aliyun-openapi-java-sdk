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
import com.aliyuncs.digitalstore.transform.v20200107.ListOutboundOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOutboundOrdersResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<OutboundOrder> outboundOrders;

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

	public List<OutboundOrder> getOutboundOrders() {
		return this.outboundOrders;
	}

	public void setOutboundOrders(List<OutboundOrder> outboundOrders) {
		this.outboundOrders = outboundOrders;
	}

	public static class OutboundOrder {

		private String toWarehouseName;

		private String confirmTime;

		private String orderSubTypeCode;

		private String orderStatus;

		private String description;

		private Integer operateQuantity;

		private String fromWarehouseId;

		private String lastSyncTime;

		private Integer confirmQuantity;

		private String updateDate;

		private String fromBusinessUnitId;

		private String id;

		private String fromBusinessUnitName;

		private String orderCode;

		private String createDate;

		private String toWarehouseId;

		private String syncStatus;

		private String fromWarehouseName;

		private Integer quantity;

		private String sourceOrderCode;

		private String orderId;

		private String toBusinessUnitId;

		public String getToWarehouseName() {
			return this.toWarehouseName;
		}

		public void setToWarehouseName(String toWarehouseName) {
			this.toWarehouseName = toWarehouseName;
		}

		public String getConfirmTime() {
			return this.confirmTime;
		}

		public void setConfirmTime(String confirmTime) {
			this.confirmTime = confirmTime;
		}

		public String getOrderSubTypeCode() {
			return this.orderSubTypeCode;
		}

		public void setOrderSubTypeCode(String orderSubTypeCode) {
			this.orderSubTypeCode = orderSubTypeCode;
		}

		public String getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(String orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(Integer operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public String getFromWarehouseId() {
			return this.fromWarehouseId;
		}

		public void setFromWarehouseId(String fromWarehouseId) {
			this.fromWarehouseId = fromWarehouseId;
		}

		public String getLastSyncTime() {
			return this.lastSyncTime;
		}

		public void setLastSyncTime(String lastSyncTime) {
			this.lastSyncTime = lastSyncTime;
		}

		public Integer getConfirmQuantity() {
			return this.confirmQuantity;
		}

		public void setConfirmQuantity(Integer confirmQuantity) {
			this.confirmQuantity = confirmQuantity;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getFromBusinessUnitId() {
			return this.fromBusinessUnitId;
		}

		public void setFromBusinessUnitId(String fromBusinessUnitId) {
			this.fromBusinessUnitId = fromBusinessUnitId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getFromBusinessUnitName() {
			return this.fromBusinessUnitName;
		}

		public void setFromBusinessUnitName(String fromBusinessUnitName) {
			this.fromBusinessUnitName = fromBusinessUnitName;
		}

		public String getOrderCode() {
			return this.orderCode;
		}

		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getToWarehouseId() {
			return this.toWarehouseId;
		}

		public void setToWarehouseId(String toWarehouseId) {
			this.toWarehouseId = toWarehouseId;
		}

		public String getSyncStatus() {
			return this.syncStatus;
		}

		public void setSyncStatus(String syncStatus) {
			this.syncStatus = syncStatus;
		}

		public String getFromWarehouseName() {
			return this.fromWarehouseName;
		}

		public void setFromWarehouseName(String fromWarehouseName) {
			this.fromWarehouseName = fromWarehouseName;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}

		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getToBusinessUnitId() {
			return this.toBusinessUnitId;
		}

		public void setToBusinessUnitId(String toBusinessUnitId) {
			this.toBusinessUnitId = toBusinessUnitId;
		}
	}

	@Override
	public ListOutboundOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListOutboundOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
