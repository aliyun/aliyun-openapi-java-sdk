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
public class CreateApplicationOrderRequest extends RpcAcsRequest<CreateApplicationOrderResponse> {
	   

	private String expressCompanyId;

	private String description;

	private String scanType;

	private String reservationDeliveryDateTimeRange;

	private String warehouseId;

	private String sourceOrderId;

	private List<String> caseIdss;

	private String reservationDeliveryTime;

	private String waybillCode;
	public CreateApplicationOrderRequest() {
		super("digitalstore", "2020-01-07", "CreateApplicationOrder", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpressCompanyId() {
		return this.expressCompanyId;
	}

	public void setExpressCompanyId(String expressCompanyId) {
		this.expressCompanyId = expressCompanyId;
		if(expressCompanyId != null){
			putBodyParameter("ExpressCompanyId", expressCompanyId);
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

	public String getReservationDeliveryDateTimeRange() {
		return this.reservationDeliveryDateTimeRange;
	}

	public void setReservationDeliveryDateTimeRange(String reservationDeliveryDateTimeRange) {
		this.reservationDeliveryDateTimeRange = reservationDeliveryDateTimeRange;
		if(reservationDeliveryDateTimeRange != null){
			putBodyParameter("ReservationDeliveryDateTimeRange", reservationDeliveryDateTimeRange);
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

	public String getSourceOrderId() {
		return this.sourceOrderId;
	}

	public void setSourceOrderId(String sourceOrderId) {
		this.sourceOrderId = sourceOrderId;
		if(sourceOrderId != null){
			putBodyParameter("SourceOrderId", sourceOrderId);
		}
	}

	public List<String> getCaseIdss() {
		return this.caseIdss;
	}

	public void setCaseIdss(List<String> caseIdss) {
		this.caseIdss = caseIdss;	
		if (caseIdss != null) {
			for (int i = 0; i < caseIdss.size(); i++) {
				putBodyParameter("CaseIds." + (i + 1) , caseIdss.get(i));
			}
		}	
	}

	public String getReservationDeliveryTime() {
		return this.reservationDeliveryTime;
	}

	public void setReservationDeliveryTime(String reservationDeliveryTime) {
		this.reservationDeliveryTime = reservationDeliveryTime;
		if(reservationDeliveryTime != null){
			putBodyParameter("ReservationDeliveryTime", reservationDeliveryTime);
		}
	}

	public String getWaybillCode() {
		return this.waybillCode;
	}

	public void setWaybillCode(String waybillCode) {
		this.waybillCode = waybillCode;
		if(waybillCode != null){
			putBodyParameter("WaybillCode", waybillCode);
		}
	}

	@Override
	public Class<CreateApplicationOrderResponse> getResponseClass() {
		return CreateApplicationOrderResponse.class;
	}

}
