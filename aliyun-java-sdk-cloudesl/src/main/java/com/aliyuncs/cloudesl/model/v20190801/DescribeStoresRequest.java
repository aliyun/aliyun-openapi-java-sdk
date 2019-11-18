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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeStoresRequest extends RpcAcsRequest<DescribeStoresResponse> {
	   

	private String storeName;

	private String storeId;

	private Integer pageNumber;

	private String fromDate;

	private String companyId;

	private String toDate;

	private Integer pageSize;

	private String brand;
	public DescribeStoresRequest() {
		super("cloudesl", "2019-08-01", "DescribeStores", "144001");
		setMethod(MethodType.POST);
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putBodyParameter("StoreName", storeName);
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
		if(fromDate != null){
			putBodyParameter("FromDate", fromDate);
		}
	}

	public String getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
		if(companyId != null){
			putBodyParameter("CompanyId", companyId);
		}
	}

	public String getToDate() {
		return this.toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
		if(toDate != null){
			putBodyParameter("ToDate", toDate);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
		if(brand != null){
			putBodyParameter("Brand", brand);
		}
	}

	@Override
	public Class<DescribeStoresResponse> getResponseClass() {
		return DescribeStoresResponse.class;
	}

}
