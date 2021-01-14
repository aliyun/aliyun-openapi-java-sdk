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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountBillRequest extends RpcAcsRequest<QueryAccountBillResponse> {
	   

	private String productCode;

	private String billingCycle;

	private Integer pageNum;

	private Long ownerID;

	private Long billOwnerId;

	private String billingDate;

	private Boolean isGroupByProduct;

	private String granularity;

	private Integer pageSize;
	public QueryAccountBillRequest() {
		super("BssOpenApi", "2017-12-14", "QueryAccountBill");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getBillingCycle() {
		return this.billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
		if(billingCycle != null){
			putQueryParameter("BillingCycle", billingCycle);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public Long getOwnerID() {
		return this.ownerID;
	}

	public void setOwnerID(Long ownerID) {
		this.ownerID = ownerID;
		if(ownerID != null){
			putQueryParameter("OwnerID", ownerID.toString());
		}
	}

	public Long getBillOwnerId() {
		return this.billOwnerId;
	}

	public void setBillOwnerId(Long billOwnerId) {
		this.billOwnerId = billOwnerId;
		if(billOwnerId != null){
			putQueryParameter("BillOwnerId", billOwnerId.toString());
		}
	}

	public String getBillingDate() {
		return this.billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
		if(billingDate != null){
			putQueryParameter("BillingDate", billingDate);
		}
	}

	public Boolean getIsGroupByProduct() {
		return this.isGroupByProduct;
	}

	public void setIsGroupByProduct(Boolean isGroupByProduct) {
		this.isGroupByProduct = isGroupByProduct;
		if(isGroupByProduct != null){
			putQueryParameter("IsGroupByProduct", isGroupByProduct.toString());
		}
	}

	public String getGranularity() {
		return this.granularity;
	}

	public void setGranularity(String granularity) {
		this.granularity = granularity;
		if(granularity != null){
			putQueryParameter("Granularity", granularity);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<QueryAccountBillResponse> getResponseClass() {
		return QueryAccountBillResponse.class;
	}

}
