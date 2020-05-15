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
public class CreateGoodsStyleRequest extends RpcAcsRequest<CreateGoodsStyleResponse> {
	   

	private String code;

	private String description;

	private Float currentPrice;

	private Float retailPrice;

	private Integer useSkuColor;

	private String sizeGroupId;

	private Integer disable;

	private Integer useSkuSize;

	private String name;
	public CreateGoodsStyleRequest() {
		super("digitalstore", "2020-01-07", "CreateGoodsStyle", "digitalstore");
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

	public Float getCurrentPrice() {
		return this.currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
		if(currentPrice != null){
			putBodyParameter("CurrentPrice", currentPrice.toString());
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

	public Integer getDisable() {
		return this.disable;
	}

	public void setDisable(Integer disable) {
		this.disable = disable;
		if(disable != null){
			putBodyParameter("Disable", disable.toString());
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

	@Override
	public Class<CreateGoodsStyleResponse> getResponseClass() {
		return CreateGoodsStyleResponse.class;
	}

}
