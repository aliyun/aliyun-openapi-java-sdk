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
public class CreateBarcodeRequest extends RpcAcsRequest<CreateBarcodeResponse> {
	   

	private String code;

	private String description;

	private Float currentPrice;

	private Float retailPrice;

	private String sizeId;

	private String colorId;

	private String styleId;

	private Integer disable;

	private String name;
	public CreateBarcodeRequest() {
		super("digitalstore", "2020-01-07", "CreateBarcode", "digitalstore");
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

	public String getSizeId() {
		return this.sizeId;
	}

	public void setSizeId(String sizeId) {
		this.sizeId = sizeId;
		if(sizeId != null){
			putBodyParameter("SizeId", sizeId);
		}
	}

	public String getColorId() {
		return this.colorId;
	}

	public void setColorId(String colorId) {
		this.colorId = colorId;
		if(colorId != null){
			putBodyParameter("ColorId", colorId);
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

	@Override
	public Class<CreateBarcodeResponse> getResponseClass() {
		return CreateBarcodeResponse.class;
	}

}
