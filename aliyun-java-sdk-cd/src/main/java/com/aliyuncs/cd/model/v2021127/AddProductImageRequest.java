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

package com.aliyuncs.cd.model.v2021127;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddProductImageRequest extends RoaAcsRequest<AddProductImageResponse> {
	   

	private String country;

	private String productId;

	@SerializedName("productImageList")
	private List<ProductImageList> productImageList;

	private String productName;
	public AddProductImageRequest() {
		super("cd", "2021-12-7", "AddProductImage");
		setUriPattern("/AddProductImage");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("Country", country);
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

	public List<ProductImageList> getProductImageList() {
		return this.productImageList;
	}

	public void setProductImageList(List<ProductImageList> productImageList) {
		this.productImageList = productImageList;	
		if (productImageList != null) {
			putBodyParameter("ProductImageList" , new Gson().toJson(productImageList));
		}	
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putBodyParameter("ProductName", productName);
		}
	}

	public static class ProductImageList {

		@SerializedName("ProductImageUrl")
		private String productImageUrl;

		@SerializedName("ProductImageType")
		private String productImageType;

		@SerializedName("ProductImageLabels")
		private List<String> productImageLabels;

		@SerializedName("ProductImageCutout")
		private Boolean productImageCutout;

		@SerializedName("ProductImageId")
		private String productImageId;

		public String getProductImageUrl() {
			return this.productImageUrl;
		}

		public void setProductImageUrl(String productImageUrl) {
			this.productImageUrl = productImageUrl;
		}

		public String getProductImageType() {
			return this.productImageType;
		}

		public void setProductImageType(String productImageType) {
			this.productImageType = productImageType;
		}

		public List<String> getProductImageLabels() {
			return this.productImageLabels;
		}

		public void setProductImageLabels(List<String> productImageLabels) {
			this.productImageLabels = productImageLabels;
		}

		public Boolean getProductImageCutout() {
			return this.productImageCutout;
		}

		public void setProductImageCutout(Boolean productImageCutout) {
			this.productImageCutout = productImageCutout;
		}

		public String getProductImageId() {
			return this.productImageId;
		}

		public void setProductImageId(String productImageId) {
			this.productImageId = productImageId;
		}
	}

	@Override
	public Class<AddProductImageResponse> getResponseClass() {
		return AddProductImageResponse.class;
	}

}
