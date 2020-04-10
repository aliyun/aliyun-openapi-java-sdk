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
public class ListGoodsStylesRequest extends RpcAcsRequest<ListGoodsStylesResponse> {
	   

	private String code;

	private String orderByField;

	private Float currentPrice;

	private Integer pageNumber;

	private Float retailPrice;

	private Integer pageSize;

	private Integer useSkuColor;

	private String sizeGroupId;

	private Long merchantId;

	private Integer disable;

	private String styleId;

	private Integer useSkuSize;

	private String name;

	private String orderByMethod;
	public ListGoodsStylesRequest() {
		super("digitalstore", "2020-01-07", "ListGoodsStyles", "digitalstore");
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

	public String getOrderByField() {
		return this.orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
		if(orderByField != null){
			putBodyParameter("OrderByField", orderByField);
		}
	}

	public Float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
		if(currentPrice != null){
			putBodyParameter("CurrentPrice", currentPrice.toString());
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

	public Float getRetailPrice() {
		return this.retailPrice;
	}

	public void setRetailPrice(Float retailPrice) {
		this.retailPrice = retailPrice;
		if(retailPrice != null){
			putBodyParameter("RetailPrice", retailPrice.toString());
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

	public Integer getUseSkuColor() {
		return this.useSkuColor;
	}

	public void setUseSkuColor(Integer useSkuColor) {
		this.useSkuColor = useSkuColor;
		if(useSkuColor != null){
			putBodyParameter("UseSkuColor", useSkuColor.toString());
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

	public String getStyleId() {
		return this.styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
		if(styleId != null){
			putBodyParameter("StyleId", styleId);
		}
	}

	public Integer getUseSkuSize() {
		return this.useSkuSize;
	}

	public void setUseSkuSize(Integer useSkuSize) {
		this.useSkuSize = useSkuSize;
		if(useSkuSize != null){
			putBodyParameter("UseSkuSize", useSkuSize.toString());
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
	public Class<ListGoodsStylesResponse> getResponseClass() {
		return ListGoodsStylesResponse.class;
	}

}
