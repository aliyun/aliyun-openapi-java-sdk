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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.digitalstore.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSizesRequest extends RpcAcsRequest<ListSizesResponse> {
	   

	private String code;

	private String description;

	private String orderByField;

	private Integer pageNumber;

	private Integer pageSize;

	private String sizeId;

	private String sizeGroupId;

	private Long merchantId;

	private Integer disable;

	private String name;

	private String orderByMethod;
	public ListSizesRequest() {
		super("digitalstore", "2020-01-07", "ListSizes", "digitalstore");
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

	public String getOrderByField() {
		return this.orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
		if(orderByField != null){
			putBodyParameter("OrderByField", orderByField);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getSizeId() {
		return this.sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
		if(sizeId != null){
			putBodyParameter("SizeId", sizeId);
		}
	}

	public String getSizeGroupId() {
		return this.sizeGroupId;
	}

	public void setSizeGroupId(String sizeGroupId) {
		this.sizeGroupId = sizeGroupId;
		if(sizeGroupId != null){
			putBodyParameter("SizeGroupId", sizeGroupId);
		}
	}

	public Long getMerchantId() {
		return this.merchantId;
	}

	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
		if(merchantId != null){
			putBodyParameter("MerchantId", merchantId.toString());
		}
	}

	public Integer getDisable() {
		return this.disable;
	}

	public void setDisable(Integer disable) {
		this.disable = disable;
		if(disable != null){
			putBodyParameter("Disable", disable.toString());
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

	public String getOrderByMethod() {
		return this.orderByMethod;
	}

	public void setOrderByMethod(String orderByMethod) {
		this.orderByMethod = orderByMethod;
		if(orderByMethod != null){
			putBodyParameter("OrderByMethod", orderByMethod);
		}
	}

	@Override
	public Class<ListSizesResponse> getResponseClass() {
		return ListSizesResponse.class;
	}

}
