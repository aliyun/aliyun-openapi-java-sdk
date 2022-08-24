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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.viapi_regen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLabelsetRequest extends RpcAcsRequest<UpdateLabelsetResponse> {
	   

	private String description;

	private Long id;

	private String userOssUrl;

	private String objectKey;

	private String name;
	public UpdateLabelsetRequest() {
		super("viapi-regen", "2021-11-19", "UpdateLabelset", "selflearning");
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getUserOssUrl() {
		return this.userOssUrl;
	}

	public void setUserOssUrl(String userOssUrl) {
		this.userOssUrl = userOssUrl;
		if(userOssUrl != null){
			putBodyParameter("UserOssUrl", userOssUrl);
		}
	}

	public String getObjectKey() {
		return this.objectKey;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
		if(objectKey != null){
			putBodyParameter("ObjectKey", objectKey);
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
	public Class<UpdateLabelsetResponse> getResponseClass() {
		return UpdateLabelsetResponse.class;
	}

}
