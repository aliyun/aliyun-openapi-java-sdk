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
import com.aliyuncs.digitalstore.transform.v20200107.ListApplicationOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationOrdersResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<ApplyOrderModel> applyOrders;

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

	public List<ApplyOrderModel> getApplyOrders() {
		return this.applyOrders;
	}

	public void setApplyOrders(List<ApplyOrderModel> applyOrders) {
		this.applyOrders = applyOrders;
	}

	public static class ApplyOrderModel {

		private String orderId;

		private Integer confirmTotal;

		private String code;

		private String updateDate;

		private String warehouseName;

		private Integer productionOrderQuantity;

		private String warehouseCode;

		private String confirmDateTime;

		private Integer confirmCaseQuantity;

		private String productionOrderSourceOrderCode;

		private String confirmDeliveryDate;

		private String purchaseOrderCode;

		private String rejectReason;

		private Integer total;

		private String deliveryDate;

		private String confirmDeliveryDateTimeRange;

		private String productId;

		private String fromBusinessUnitCode;

		private String fromBusinessUnitId;

		private String createDate;

		private String toWarehouseContact;

		private Integer contractNumber;

		private String warehouseId;

		private Integer caseQuantity;

		private String purchaseOrderId;

		private String sourceOrderCode;

		private String toWarehouseTel;

		private Integer receivedQuantity;

		private String status;

		private String fromBusinessUnitName;

		private String scanType;

		private String toWarehouseAddress;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Integer getConfirmTotal() {
			return this.confirmTotal;
		}

		public void setConfirmTotal(Integer confirmTotal) {
			this.confirmTotal = confirmTotal;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getWarehouseName() {
			return this.warehouseName;
		}

		public void setWarehouseName(String warehouseName) {
			this.warehouseName = warehouseName;
		}

		public Integer getProductionOrderQuantity() {
			return this.productionOrderQuantity;
		}

		public void setProductionOrderQuantity(Integer productionOrderQuantity) {
			this.productionOrderQuantity = productionOrderQuantity;
		}

		public String getWarehouseCode() {
			return this.warehouseCode;
		}

		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

		public String getConfirmDateTime() {
			return this.confirmDateTime;
		}

		public void setConfirmDateTime(String confirmDateTime) {
			this.confirmDateTime = confirmDateTime;
		}

		public Integer getConfirmCaseQuantity() {
			return this.confirmCaseQuantity;
		}

		public void setConfirmCaseQuantity(Integer confirmCaseQuantity) {
			this.confirmCaseQuantity = confirmCaseQuantity;
		}

		public String getProductionOrderSourceOrderCode() {
			return this.productionOrderSourceOrderCode;
		}

		public void setProductionOrderSourceOrderCode(String productionOrderSourceOrderCode) {
			this.productionOrderSourceOrderCode = productionOrderSourceOrderCode;
		}

		public String getConfirmDeliveryDate() {
			return this.confirmDeliveryDate;
		}

		public void setConfirmDeliveryDate(String confirmDeliveryDate) {
			this.confirmDeliveryDate = confirmDeliveryDate;
		}

		public String getPurchaseOrderCode() {
			return this.purchaseOrderCode;
		}

		public void setPurchaseOrderCode(String purchaseOrderCode) {
			this.purchaseOrderCode = purchaseOrderCode;
		}

		public String getRejectReason() {
			return this.rejectReason;
		}

		public void setRejectReason(String rejectReason) {
			this.rejectReason = rejectReason;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getDeliveryDate() {
			return this.deliveryDate;
		}

		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}

		public String getConfirmDeliveryDateTimeRange() {
			return this.confirmDeliveryDateTimeRange;
		}

		public void setConfirmDeliveryDateTimeRange(String confirmDeliveryDateTimeRange) {
			this.confirmDeliveryDateTimeRange = confirmDeliveryDateTimeRange;
		}

		public String getProductId() {
			return this.productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
		}

		public String getFromBusinessUnitCode() {
			return this.fromBusinessUnitCode;
		}

		public void setFromBusinessUnitCode(String fromBusinessUnitCode) {
			this.fromBusinessUnitCode = fromBusinessUnitCode;
		}

		public String getFromBusinessUnitId() {
			return this.fromBusinessUnitId;
		}

		public void setFromBusinessUnitId(String fromBusinessUnitId) {
			this.fromBusinessUnitId = fromBusinessUnitId;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getToWarehouseContact() {
			return this.toWarehouseContact;
		}

		public void setToWarehouseContact(String toWarehouseContact) {
			this.toWarehouseContact = toWarehouseContact;
		}

		public Integer getContractNumber() {
			return this.contractNumber;
		}

		public void setContractNumber(Integer contractNumber) {
			this.contractNumber = contractNumber;
		}

		public String getWarehouseId() {
			return this.warehouseId;
		}

		public void setWarehouseId(String warehouseId) {
			this.warehouseId = warehouseId;
		}

		public Integer getCaseQuantity() {
			return this.caseQuantity;
		}

		public void setCaseQuantity(Integer caseQuantity) {
			this.caseQuantity = caseQuantity;
		}

		public String getPurchaseOrderId() {
			return this.purchaseOrderId;
		}

		public void setPurchaseOrderId(String purchaseOrderId) {
			this.purchaseOrderId = purchaseOrderId;
		}

		public String getSourceOrderCode() {
			return this.sourceOrderCode;
		}

		public void setSourceOrderCode(String sourceOrderCode) {
			this.sourceOrderCode = sourceOrderCode;
		}

		public String getToWarehouseTel() {
			return this.toWarehouseTel;
		}

		public void setToWarehouseTel(String toWarehouseTel) {
			this.toWarehouseTel = toWarehouseTel;
		}

		public Integer getReceivedQuantity() {
			return this.receivedQuantity;
		}

		public void setReceivedQuantity(Integer receivedQuantity) {
			this.receivedQuantity = receivedQuantity;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFromBusinessUnitName() {
			return this.fromBusinessUnitName;
		}

		public void setFromBusinessUnitName(String fromBusinessUnitName) {
			this.fromBusinessUnitName = fromBusinessUnitName;
		}

		public String getScanType() {
			return this.scanType;
		}

		public void setScanType(String scanType) {
			this.scanType = scanType;
		}

		public String getToWarehouseAddress() {
			return this.toWarehouseAddress;
		}

		public void setToWarehouseAddress(String toWarehouseAddress) {
			this.toWarehouseAddress = toWarehouseAddress;
		}
	}

	@Override
	public ListApplicationOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
