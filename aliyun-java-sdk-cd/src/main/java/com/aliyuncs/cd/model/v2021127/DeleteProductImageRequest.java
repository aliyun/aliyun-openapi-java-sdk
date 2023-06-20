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
public class DeleteProductImageRequest extends RoaAcsRequest<DeleteProductImageResponse> {
	   

	private String country;

	private String productCode;

	@SerializedName("productImageIds")
	private List<String> productImageIds;
	public DeleteProductImageRequest() {
		super("cd", "2021-12-7", "DeleteProductImage");
		setUriPattern("/DeleteProductImage");
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

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public List<String> getProductImageIds() {
		return this.productImageIds;
	}

	public void setProductImageIds(List<String> productImageIds) {
		this.productImageIds = productImageIds;	
		if (productImageIds != null) {
			putBodyParameter("ProductImageIds" , new Gson().toJson(productImageIds));
		}	
	}

	@Override
	public Class<DeleteProductImageResponse> getResponseClass() {
		return DeleteProductImageResponse.class;
	}

}
