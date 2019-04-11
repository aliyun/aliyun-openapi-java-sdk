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

package com.aliyuncs.imagesearch.model.v20190325;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddImageRequest extends RoaAcsRequest<AddImageResponse> {
	
	public AddImageRequest() {
		super("ImageSearch", "2019-03-25", "AddImage", "imagesearch");
		setUriPattern("/v2/image/add");
		setMethod(MethodType.POST);
	}

	private String picContent;

	private String strAttr;

	private String instanceName;

	private Integer intAttr;

	private String productId;

	private String picName;

	private String customContent;

	private String region;

	private Integer categoryId;

	private Boolean crop;

	public String getPicContent() {
		return this.picContent;
	}

	public void setPicContent(String picContent) {
		this.picContent = picContent;
		if(picContent != null){
			putBodyParameter("PicContent", picContent);
		}
	}

	public String getStrAttr() {
		return this.strAttr;
	}

	public void setStrAttr(String strAttr) {
		this.strAttr = strAttr;
		if(strAttr != null){
			putBodyParameter("StrAttr", strAttr);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putBodyParameter("InstanceName", instanceName);
		}
	}

	public Integer getIntAttr() {
		return this.intAttr;
	}

	public void setIntAttr(Integer intAttr) {
		this.intAttr = intAttr;
		if(intAttr != null){
			putBodyParameter("IntAttr", intAttr.toString());
		}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId);
		}
	}

	public String getPicName() {
		return this.picName;
	}

	public void setPicName(String picName) {
		this.picName = picName;
		if(picName != null){
			putBodyParameter("PicName", picName);
		}
	}

	public String getCustomContent() {
		return this.customContent;
	}

	public void setCustomContent(String customContent) {
		this.customContent = customContent;
		if(customContent != null){
			putBodyParameter("CustomContent", customContent);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putBodyParameter("Region", region);
		}
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId.toString());
		}
	}

	public Boolean getCrop() {
		return this.crop;
	}

	public void setCrop(Boolean crop) {
		this.crop = crop;
		if(crop != null){
			putBodyParameter("Crop", crop.toString());
		}
	}

	@Override
	public Class<AddImageResponse> getResponseClass() {
		return AddImageResponse.class;
	}

}
