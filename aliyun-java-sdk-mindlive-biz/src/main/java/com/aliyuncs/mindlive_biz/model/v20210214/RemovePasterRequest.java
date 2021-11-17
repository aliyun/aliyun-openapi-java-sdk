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

package com.aliyuncs.mindlive_biz.model.v20210214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RemovePasterRequest extends RpcAcsRequest<RemovePasterResponse> {
	   

	private String resourceUuids;

	private String userSource;

	private String userId;
	public RemovePasterRequest() {
		super("mindlive-biz", "2021-02-14", "RemovePaster");
		setMethod(MethodType.POST);
	}

	public String getResourceUuids() {
		return this.resourceUuids;
	}

	public void setResourceUuids(String resourceUuids) {
		this.resourceUuids = resourceUuids;
		if(resourceUuids != null){
			putQueryParameter("ResourceUuids", resourceUuids);
		}
	}

	public String getUserSource() {
		return this.userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
		if(userSource != null){
			putQueryParameter("UserSource", userSource);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	@Override
	public Class<RemovePasterResponse> getResponseClass() {
		return RemovePasterResponse.class;
	}

}
