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

package com.aliyuncs.viapi_oxs_cross.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateSDKInstanceRequest extends RpcAcsRequest<CreateSDKInstanceResponse> {
	   

	private String recipe;

	private String bundleId;

	private String platform;

	private Long validFrom;

	private String pk;

	private Long validTo;
	public CreateSDKInstanceRequest() {
		super("viapi-oxs-cross", "2020-07-01", "CreateSDKInstance");
		setMethod(MethodType.POST);
	}

	public String getRecipe() {
		return this.recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
		if(recipe != null){
			putQueryParameter("Recipe", recipe);
		}
	}

	public String getBundleId() {
		return this.bundleId;
	}

	public void setBundleId(String bundleId) {
		this.bundleId = bundleId;
		if(bundleId != null){
			putQueryParameter("BundleId", bundleId);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public Long getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Long validFrom) {
		this.validFrom = validFrom;
		if(validFrom != null){
			putQueryParameter("ValidFrom", validFrom.toString());
		}
	}

	public String getPk() {
		return this.pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
		if(pk != null){
			putQueryParameter("Pk", pk);
		}
	}

	public Long getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Long validTo) {
		this.validTo = validTo;
		if(validTo != null){
			putQueryParameter("ValidTo", validTo.toString());
		}
	}

	@Override
	public Class<CreateSDKInstanceResponse> getResponseClass() {
		return CreateSDKInstanceResponse.class;
	}

}
