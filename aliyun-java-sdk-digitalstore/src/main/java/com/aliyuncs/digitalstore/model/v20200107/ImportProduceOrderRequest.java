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
public class ImportProduceOrderRequest extends RpcAcsRequest<ImportProduceOrderResponse> {
	   

	private String code;

	private String description;

	private String scanType;

	private String purchaseOrderId;

	private String deliveryDate;

	private String sourceOrderCode;

	private String sourceOrderType;

	private String warehouseCode;

	private List<DetailList> detailLists;

	private String businessUnitCode;

	private String originalOrderCode;

	private String name;

	private String purchaseOrderCode;

	private String styleCode;

	private String status;
	public ImportProduceOrderRequest() {
		super("digitalstore", "2020-01-07", "ImportProduceOrder", "digitalstore");
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

	public String getScanType() {
		return this.scanType;
	}

	public void setScanType(String scanType) {
		this.scanType = scanType;
		if(scanType != null){
			putBodyParameter("ScanType", scanType);
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

	public String getSourceOrderCode() {
		return this.sourceOrderCode;
	}

	public void setSourceOrderCode(String sourceOrderCode) {
		this.sourceOrderCode = sourceOrderCode;
		if(sourceOrderCode != null){
			putBodyParameter("SourceOrderCode", sourceOrderCode);
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

	public List<DetailList> getDetailLists() {
		return this.detailLists;
	}

	public void setDetailLists(List<DetailList> detailLists) {
		this.detailLists = detailLists;	
		if (detailLists != null) {
			for (int depth1 = 0; depth1 < detailLists.size(); depth1++) {
				putBodyParameter("DetailList." + (depth1 + 1) + ".CaseCode" , detailLists.get(depth1).getCaseCode());
				putBodyParameter("DetailList." + (depth1 + 1) + ".Quantity" , detailLists.get(depth1).getQuantity());
				putBodyParameter("DetailList." + (depth1 + 1) + ".PreQuantity" , detailLists.get(depth1).getPreQuantity());
				putBodyParameter("DetailList." + (depth1 + 1) + ".BusinessPrice" , detailLists.get(depth1).getBusinessPrice());
				putBodyParameter("DetailList." + (depth1 + 1) + ".MoreQuantity" , detailLists.get(depth1).getMoreQuantity());
				putBodyParameter("DetailList." + (depth1 + 1) + ".ToleranceRate" , detailLists.get(depth1).getToleranceRate());
				putBodyParameter("DetailList." + (depth1 + 1) + ".Barcode" , detailLists.get(depth1).getBarcode());
			}
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

	public String getOriginalOrderCode() {
		return this.originalOrderCode;
	}

	public void setOriginalOrderCode(String originalOrderCode) {
		this.originalOrderCode = originalOrderCode;
		if(originalOrderCode != null){
			putBodyParameter("OriginalOrderCode", originalOrderCode);
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

	public String getStyleCode() {
		return this.styleCode;
	}

	public void setStyleCode(String styleCode) {
		this.styleCode = styleCode;
		if(styleCode != null){
			putBodyParameter("StyleCode", styleCode);
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

	public static class DetailList {

		private String caseCode;

		private Integer quantity;

		private Integer preQuantity;

		private Integer businessPrice;

		private Integer moreQuantity;

		private Integer toleranceRate;

		private String barcode;

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

		public Integer getPreQuantity() {
			return this.preQuantity;
		}

		public void setPreQuantity(Integer preQuantity) {
			this.preQuantity = preQuantity;
		}

		public Integer getBusinessPrice() {
			return this.businessPrice;
		}

		public void setBusinessPrice(Integer businessPrice) {
			this.businessPrice = businessPrice;
		}

		public Integer getMoreQuantity() {
			return this.moreQuantity;
		}

		public void setMoreQuantity(Integer moreQuantity) {
			this.moreQuantity = moreQuantity;
		}

		public Integer getToleranceRate() {
			return this.toleranceRate;
		}

		public void setToleranceRate(Integer toleranceRate) {
			this.toleranceRate = toleranceRate;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}
	}

	@Override
	public Class<ImportProduceOrderResponse> getResponseClass() {
		return ImportProduceOrderResponse.class;
	}

}
