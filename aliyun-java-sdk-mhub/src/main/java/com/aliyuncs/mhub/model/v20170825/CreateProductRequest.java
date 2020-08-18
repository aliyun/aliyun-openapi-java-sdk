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
public class CreateProductRequest extends RpcAcsRequest<CreateProductResponse> {
	   

	private String iconName;

	private Integer industryId;

	private String name;

	private String encodedIcon;
	public CreateProductRequest() {
		super("Mhub", "2017-08-25", "CreateProduct");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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
	public Class<CreateProductResponse> getResponseClass() {
		return CreateProductResponse.class;
	}

}
