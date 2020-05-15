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
public class ListExpressCompanyRequest extends RpcAcsRequest<ListExpressCompanyResponse> {
	   

	private String expressCompanyName;

	private String expressCompanyId;

	private String orderByField;

	private Integer pageNumber;

	private Integer pageSize;

	private String expressCompanyCode;

	private Long merchantId;

	private Integer disable;

	private String orderByMethod;
	public ListExpressCompanyRequest() {
		super("digitalstore", "2020-01-07", "ListExpressCompany", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpressCompanyName() {
		return this.expressCompanyName;
	}

	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
		if(expressCompanyName != null){
			putBodyParameter("ExpressCompanyName", expressCompanyName);
		}
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

	public String getExpressCompanyCode() {
		return this.expressCompanyCode;
	}

	public void setExpressCompanyCode(String expressCompanyCode) {
		this.expressCompanyCode = expressCompanyCode;
		if(expressCompanyCode != null){
			putBodyParameter("ExpressCompanyCode", expressCompanyCode);
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
	public Class<ListExpressCompanyResponse> getResponseClass() {
		return ListExpressCompanyResponse.class;
	}

}
