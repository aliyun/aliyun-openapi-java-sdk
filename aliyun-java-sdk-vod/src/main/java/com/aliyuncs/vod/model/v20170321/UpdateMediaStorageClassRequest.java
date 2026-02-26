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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMediaStorageClassRequest extends RpcAcsRequest<UpdateMediaStorageClassResponse> {
	   

	private String restoreTier;

	private String scope;

	private String mediaIds;

	private String storageClass;

	private Boolean allowUpdateWithoutTimeLimit;
	public UpdateMediaStorageClassRequest() {
		super("vod", "2017-03-21", "UpdateMediaStorageClass", "vod");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRestoreTier() {
		return this.restoreTier;
	}

	public void setRestoreTier(String restoreTier) {
		this.restoreTier = restoreTier;
		if(restoreTier != null){
			putQueryParameter("RestoreTier", restoreTier);
		}
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
		if(scope != null){
			putQueryParameter("Scope", scope);
		}
	}

	public String getMediaIds() {
		return this.mediaIds;
	}

	public void setMediaIds(String mediaIds) {
		this.mediaIds = mediaIds;
		if(mediaIds != null){
			putQueryParameter("MediaIds", mediaIds);
		}
	}

	public String getStorageClass() {
		return this.storageClass;
	}

	public void setStorageClass(String storageClass) {
		this.storageClass = storageClass;
		if(storageClass != null){
			putQueryParameter("StorageClass", storageClass);
		}
	}

	public Boolean getAllowUpdateWithoutTimeLimit() {
		return this.allowUpdateWithoutTimeLimit;
	}

	public void setAllowUpdateWithoutTimeLimit(Boolean allowUpdateWithoutTimeLimit) {
		this.allowUpdateWithoutTimeLimit = allowUpdateWithoutTimeLimit;
		if(allowUpdateWithoutTimeLimit != null){
			putQueryParameter("AllowUpdateWithoutTimeLimit", allowUpdateWithoutTimeLimit.toString());
		}
	}

	@Override
	public Class<UpdateMediaStorageClassResponse> getResponseClass() {
		return UpdateMediaStorageClassResponse.class;
	}

}
