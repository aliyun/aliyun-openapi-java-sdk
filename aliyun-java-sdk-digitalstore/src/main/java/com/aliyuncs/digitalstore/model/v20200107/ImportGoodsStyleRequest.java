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
public class ImportGoodsStyleRequest extends RpcAcsRequest<ImportGoodsStyleResponse> {
	   

	private String description;

	private String colorCode;

	private String sizeName;

	private Float currentPrice;

	private Float retailPrice;

	private String styleName;

	private String sizeGroupCode;

	private String barcode;

	private Integer useSkuColor;

	private String barcodeName;

	private String sizeCode;

	private String colorName;

	private Integer disable;

	private Integer useSkuSize;

	private String sizeGroupName;

	private String styleCode;
	public ImportGoodsStyleRequest() {
		super("digitalstore", "2020-01-07", "ImportGoodsStyle", "digitalstore");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getColorCode() {
		return this.colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
		if(colorCode != null){
			putBodyParameter("ColorCode", colorCode);
		}
	}

	public String getSizeName() {
		return this.sizeName;
	}

	public void setSizeName(String sizeName) {
		this.sizeName = sizeName;
		if(sizeName != null){
			putBodyParameter("SizeName", sizeName);
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

	public String getStyleName() {
		return this.styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
		if(styleName != null){
			putBodyParameter("StyleName", styleName);
		}
	}

	public String getSizeGroupCode() {
		return this.sizeGroupCode;
	}

	public void setSizeGroupCode(String sizeGroupCode) {
		this.sizeGroupCode = sizeGroupCode;
		if(sizeGroupCode != null){
			putBodyParameter("SizeGroupCode", sizeGroupCode);
		}
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
		if(barcode != null){
			putBodyParameter("Barcode", barcode);
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

	public String getBarcodeName() {
		return this.barcodeName;
	}

	public void setBarcodeName(String barcodeName) {
		this.barcodeName = barcodeName;
		if(barcodeName != null){
			putBodyParameter("BarcodeName", barcodeName);
		}
	}

	public String getSizeCode() {
		return this.sizeCode;
	}

	public void setSizeCode(String sizeCode) {
		this.sizeCode = sizeCode;
		if(sizeCode != null){
			putBodyParameter("SizeCode", sizeCode);
		}
	}

	public String getColorName() {
		return this.colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
		if(colorName != null){
			putBodyParameter("ColorName", colorName);
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

	public String getSizeGroupName() {
		return this.sizeGroupName;
	}

	public void setSizeGroupName(String sizeGroupName) {
		this.sizeGroupName = sizeGroupName;
		if(sizeGroupName != null){
			putBodyParameter("SizeGroupName", sizeGroupName);
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

	@Override
	public Class<ImportGoodsStyleResponse> getResponseClass() {
		return ImportGoodsStyleResponse.class;
	}

}
