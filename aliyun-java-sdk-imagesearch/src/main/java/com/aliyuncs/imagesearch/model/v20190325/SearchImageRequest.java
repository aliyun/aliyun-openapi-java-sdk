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
public class SearchImageRequest extends RoaAcsRequest<SearchImageResponse> {
	
	public SearchImageRequest() {
		super("ImageSearch", "2019-03-25", "SearchImage", "imagesearch");
		setUriPattern("/v2/image/search");
		setMethod(MethodType.POST);
	}

	private String filter;

	private String picContent;

	private String instanceName;

	private String productId;

	private Integer num;

	private String picName;

	private Integer start;

	private String region;

	private String type;

	private Integer categoryId;

	private Boolean crop;

	public String getFilter() {
		return this.filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
		if(filter != null){
			putBodyParameter("Filter", filter);
		}
	}

	public String getPicContent() {
		return this.picContent;
	}

	public void setPicContent(String picContent) {
		this.picContent = picContent;
		if(picContent != null){
			putBodyParameter("PicContent", picContent);
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

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putBodyParameter("ProductId", productId);
		}
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
		if(num != null){
			putBodyParameter("Num", num.toString());
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

	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
		if(start != null){
			putBodyParameter("Start", start.toString());
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
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
	public Class<SearchImageResponse> getResponseClass() {
		return SearchImageResponse.class;
	}

}
