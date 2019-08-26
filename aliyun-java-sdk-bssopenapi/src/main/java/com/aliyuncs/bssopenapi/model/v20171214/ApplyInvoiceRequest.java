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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ApplyInvoiceRequest extends RpcAcsRequest<ApplyInvoiceResponse> {
	
	public ApplyInvoiceRequest() {
		super("BssOpenApi", "2017-12-14", "ApplyInvoice");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer invoicingType;

	private String applyUserNick;

	private Boolean invoiceByAmount;

	private Long customerId;

	private List<Long> selectedIdss;

	private Integer processWay;

	private Long callerBid;

	private Long ownerId;

	private Long invoiceAmount;

	private Long addressId;

	private Long callerUid;

	public Integer getInvoicingType() {
		return this.invoicingType;
	}

	public void setInvoicingType(Integer invoicingType) {
		this.invoicingType = invoicingType;
		if(invoicingType != null){
			putQueryParameter("InvoicingType", invoicingType.toString());
		}
	}

	public String getApplyUserNick() {
		return this.applyUserNick;
	}

	public void setApplyUserNick(String applyUserNick) {
		this.applyUserNick = applyUserNick;
		if(applyUserNick != null){
			putQueryParameter("ApplyUserNick", applyUserNick);
		}
	}

	public Boolean getInvoiceByAmount() {
		return this.invoiceByAmount;
	}

	public void setInvoiceByAmount(Boolean invoiceByAmount) {
		this.invoiceByAmount = invoiceByAmount;
		if(invoiceByAmount != null){
			putQueryParameter("InvoiceByAmount", invoiceByAmount.toString());
		}
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putQueryParameter("CustomerId", customerId.toString());
		}
	}

	public List<Long> getSelectedIdss() {
		return this.selectedIdss;
	}

	public void setSelectedIdss(List<Long> selectedIdss) {
		this.selectedIdss = selectedIdss;	
		if (selectedIdss != null) {
			for (int i = 0; i < selectedIdss.size(); i++) {
				putQueryParameter("SelectedIds." + (i + 1) , selectedIdss.get(i));
			}
		}	
	}

	public Integer getProcessWay() {
		return this.processWay;
	}

	public void setProcessWay(Integer processWay) {
		this.processWay = processWay;
		if(processWay != null){
			putQueryParameter("ProcessWay", processWay.toString());
		}
	}

	public Long getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(Long callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putQueryParameter("callerBid", callerBid.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getInvoiceAmount() {
		return this.invoiceAmount;
	}

	public void setInvoiceAmount(Long invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
		if(invoiceAmount != null){
			putQueryParameter("InvoiceAmount", invoiceAmount.toString());
		}
	}

	public Long getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
		if(addressId != null){
			putQueryParameter("AddressId", addressId.toString());
		}
	}

	public Long getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(Long callerUid) {
		this.callerUid = callerUid;
		if(callerUid != null){
			putQueryParameter("callerUid", callerUid.toString());
		}
	}

	@Override
	public Class<ApplyInvoiceResponse> getResponseClass() {
		return ApplyInvoiceResponse.class;
	}

}
