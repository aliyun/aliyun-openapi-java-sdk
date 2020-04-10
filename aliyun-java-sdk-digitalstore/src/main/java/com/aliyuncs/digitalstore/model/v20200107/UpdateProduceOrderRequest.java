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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateProduceOrderRequest extends RpcAcsRequest<UpdateProduceOrderResponse> {
	   

	private String code;

	private String description;

	private String gmtModified;

	private String purchaseOrderId;

	private String deliveryDate;

	private String makeDateTime;

	private String sourceOrderCode;

	private String warehouseId;

	private String sourceOrderType;

	private String warehouseCode;

	private String orderId;

	private List<DetailList> detailLists;

	private String gmtCreate;

	private String businessUnitCode;

	private String businessUnitId;

	private String styleId;

	private String contractNumber;

	private String name;

	private String purchaseOrderCode;

	private String status;

	private String styleCode;
	public UpdateProduceOrderRequest() {
		super("digitalstore", "2020-01-07", "UpdateProduceOrder", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
		if(gmtModified != null){
			putBodyParameter("GmtModified", gmtModified);
		}
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
		if(purchaseOrderId != null){
			putBodyParameter("PurchaseOrderId", purchaseOrderId);
		}
	}

	public String getDeliveryDate() {
		return this.deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
		if(deliveryDate != null){
			putBodyParameter("DeliveryDate", deliveryDate);
		}
	}

	public String getMakeDateTime() {
		return this.makeDateTime;
	}

	public void setMakeDateTime(String makeDateTime) {
		this.makeDateTime = makeDateTime;
		if(makeDateTime != null){
			putBodyParameter("MakeDateTime", makeDateTime);
		}
	}

	public String getSourceOrderCode() {
		return this.sourceOrderCode;
	}

	public void setSourceOrderCode(String sourceOrderCode) {
		this.sourceOrderCode = sourceOrderCode;
		if(sourceOrderCode != null){
			putBodyParameter("SourceOrderCode", sourceOrderCode);
		}
	}

	public String getWarehouseId() {
		return this.warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
		if(warehouseId != null){
			putBodyParameter("WarehouseId", warehouseId);
		}
	}

	public String getSourceOrderType() {
		return this.sourceOrderType;
	}

	public void setSourceOrderType(String sourceOrderType) {
		this.sourceOrderType = sourceOrderType;
		if(sourceOrderType != null){
			putBodyParameter("SourceOrderType", sourceOrderType);
		}
	}

	public String getWarehouseCode() {
		return this.warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
		if(warehouseCode != null){
			putBodyParameter("WarehouseCode", warehouseCode);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putBodyParameter("OrderId", orderId);
		}
	}

	public List<DetailList> getDetailLists() {
		return this.detailLists;
	}

	public void setDetailLists(List<DetailList> detailLists) {
		this.detailLists = detailLists;	
		if (detailLists != null) {
			for (int depth1 = 0; depth1 < detailLists.size(); depth1++) {
				putBodyParameter("DetailList." + (depth1 + 1) + ".CaseCode" , detailLists.get(depth1).getCaseCode());
				putBodyParameter("DetailList." + (depth1 + 1) + ".Quantity" , detailLists.get(depth1).getQuantity());
				putBodyParameter("DetailList." + (depth1 + 1) + ".MoreQuantity" , detailLists.get(depth1).getMoreQuantity());
				putBodyParameter("DetailList." + (depth1 + 1) + ".BarcodeId" , detailLists.get(depth1).getBarcodeId());
			}
		}	
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
		if(gmtCreate != null){
			putBodyParameter("GmtCreate", gmtCreate);
		}
	}

	public String getBusinessUnitCode() {
		return this.businessUnitCode;
	}

	public void setBusinessUnitCode(String businessUnitCode) {
		this.businessUnitCode = businessUnitCode;
		if(businessUnitCode != null){
			putBodyParameter("BusinessUnitCode", businessUnitCode);
		}
	}

	public String getBusinessUnitId() {
		return this.businessUnitId;
	}

	public void setBusinessUnitId(String businessUnitId) {
		this.businessUnitId = businessUnitId;
		if(businessUnitId != null){
			putBodyParameter("BusinessUnitId", businessUnitId);
		}
	}

	public String getStyleId() {
		return this.styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
		if(styleId != null){
			putBodyParameter("StyleId", styleId);
		}
	}

	public String getContractNumber() {
		return this.contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
		if(contractNumber != null){
			putBodyParameter("ContractNumber", contractNumber);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getPurchaseOrderCode() {
		return this.purchaseOrderCode;
	}

	public void setPurchaseOrderCode(String purchaseOrderCode) {
		this.purchaseOrderCode = purchaseOrderCode;
		if(purchaseOrderCode != null){
			putBodyParameter("PurchaseOrderCode", purchaseOrderCode);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	public String getStyleCode() {
		return this.styleCode;
	}

	public void setStyleCode(String styleCode) {
		this.styleCode = styleCode;
		if(styleCode != null){
			putBodyParameter("StyleCode", styleCode);
		}
	}

	public static class DetailList {

		private String caseCode;

		private Integer quantity;

		private Integer moreQuantity;

		private String barcodeId;

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Integer getMoreQuantity() {
			return this.moreQuantity;
		}

		public void setMoreQuantity(Integer moreQuantity) {
			this.moreQuantity = moreQuantity;
		}

		public String getBarcodeId() {
			return this.barcodeId;
		}

		public void setBarcodeId(String barcodeId) {
			this.barcodeId = barcodeId;
		}
	}

	@Override
	public Class<UpdateProduceOrderResponse> getResponseClass() {
		return UpdateProduceOrderResponse.class;
	}

}
