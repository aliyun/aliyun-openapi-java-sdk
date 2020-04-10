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
import com.aliyuncs.digitalstore.transform.v20200107.ListProduceOrdersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProduceOrdersResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<ProduceOrderModel> orders;

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

	public List<ProduceOrderModel> getOrders() {
		return this.orders;
	}

	public void setOrders(List<ProduceOrderModel> orders) {
		this.orders = orders;
	}

	public static class ProduceOrderModel {

		private String orderId;

		private Integer totalBinding;

		private String code;

		private String updateDate;

		private String warehouseName;

		private Integer inboundQuantity;

		private String businessUnitId;

		private String warehouseCode;

		private String description;

		private String styleName;

		private String styleId;

		private String purchaseOrderCode;

		private Float businessAmount;

		private String deliveryDate;

		private String businessUnitCode;

		private String makeDateTime;

		private String businessUnitName;

		private Integer totalBoxQuantity;

		private String createDate;

		private String styleCode;

		private String contractNumber;

		private String warehouseId;

		private Integer quantity;

		private String sourceOrderCode;

		private String purchaseOrderId;

		private String sourceOrderType;

		private String status;

		private String scanType;

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Integer getTotalBinding() {
			return this.totalBinding;
		}

		public void setTotalBinding(Integer totalBinding) {
			this.totalBinding = totalBinding;
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

		public Integer getInboundQuantity() {
			return this.inboundQuantity;
		}

		public void setInboundQuantity(Integer inboundQuantity) {
			this.inboundQuantity = inboundQuantity;
		}

		public String getBusinessUnitId() {
			return this.businessUnitId;
		}

		public void setBusinessUnitId(String businessUnitId) {
			this.businessUnitId = businessUnitId;
		}

		public String getWarehouseCode() {
			return this.warehouseCode;
		}

		public void setWarehouseCode(String warehouseCode) {
			this.warehouseCode = warehouseCode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStyleName() {
			return this.styleName;
		}

		public void setStyleName(String styleName) {
			this.styleName = styleName;
		}

		public String getStyleId() {
			return this.styleId;
		}

		public void setStyleId(String styleId) {
			this.styleId = styleId;
		}

		public String getPurchaseOrderCode() {
			return this.purchaseOrderCode;
		}

		public void setPurchaseOrderCode(String purchaseOrderCode) {
			this.purchaseOrderCode = purchaseOrderCode;
		}

		public Float getBusinessAmount() {
			return this.businessAmount;
		}

		public void setBusinessAmount(Float businessAmount) {
			this.businessAmount = businessAmount;
		}

		public String getDeliveryDate() {
			return this.deliveryDate;
		}

		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}

		public String getBusinessUnitCode() {
			return this.businessUnitCode;
		}

		public void setBusinessUnitCode(String businessUnitCode) {
			this.businessUnitCode = businessUnitCode;
		}

		public String getMakeDateTime() {
			return this.makeDateTime;
		}

		public void setMakeDateTime(String makeDateTime) {
			this.makeDateTime = makeDateTime;
		}

		public String getBusinessUnitName() {
			return this.businessUnitName;
		}

		public void setBusinessUnitName(String businessUnitName) {
			this.businessUnitName = businessUnitName;
		}

		public Integer getTotalBoxQuantity() {
			return this.totalBoxQuantity;
		}

		public void setTotalBoxQuantity(Integer totalBoxQuantity) {
			this.totalBoxQuantity = totalBoxQuantity;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getStyleCode() {
			return this.styleCode;
		}

		public void setStyleCode(String styleCode) {
			this.styleCode = styleCode;
		}

		public String getContractNumber() {
			return this.contractNumber;
		}

		public void setContractNumber(String contractNumber) {
			this.contractNumber = contractNumber;
		}

		public String getWarehouseId() {
			return this.warehouseId;
		}

		public void setWarehouseId(String warehouseId) {
			this.warehouseId = warehouseId;
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

		public String getPurchaseOrderId() {
			return this.purchaseOrderId;
		}

		public void setPurchaseOrderId(String purchaseOrderId) {
			this.purchaseOrderId = purchaseOrderId;
		}

		public String getSourceOrderType() {
			return this.sourceOrderType;
		}

		public void setSourceOrderType(String sourceOrderType) {
			this.sourceOrderType = sourceOrderType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getScanType() {
			return this.scanType;
		}

		public void setScanType(String scanType) {
			this.scanType = scanType;
		}
	}

	@Override
	public ListProduceOrdersResponse getInstance(UnmarshallerContext context) {
		return	ListProduceOrdersResponseUnmarshaller.unmarshall(this, context);
	}
}
