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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mhub.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyProductRequest extends RpcAcsRequest<ModifyProductResponse> {
	   

	private String productId;

	private String iconName;

	private Integer industryId;

	private String name;

	private Boolean removeIcon;

	private String encodedIcon;
	public ModifyProductRequest() {
		super("Mhub", "2017-08-25", "ModifyProduct");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId);
		}
	}

	public String getIconName() {
		return this.iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
		if(iconName != null){
			putQueryParameter("IconName", iconName);
		}
	}

	public Integer getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
		if(industryId != null){
			putQueryParameter("IndustryId", industryId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getRemoveIcon() {
		return this.removeIcon;
	}

	public void setRemoveIcon(Boolean removeIcon) {
		this.removeIcon = removeIcon;
		if(removeIcon != null){
			putQueryParameter("RemoveIcon", removeIcon.toString());
		}
	}

	public String getEncodedIcon() {
		return this.encodedIcon;
	}

	public void setEncodedIcon(String encodedIcon) {
		this.encodedIcon = encodedIcon;
		if(encodedIcon != null){
			putQueryParameter("EncodedIcon", encodedIcon);
		}
	}

	@Override
	public Class<ModifyProductResponse> getResponseClass() {
		return ModifyProductResponse.class;
	}

}
