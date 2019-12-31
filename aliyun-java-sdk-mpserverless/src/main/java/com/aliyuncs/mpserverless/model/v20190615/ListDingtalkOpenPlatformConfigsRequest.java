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

package com.aliyuncs.mpserverless.model.v20190615;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDingtalkOpenPlatformConfigsRequest extends RpcAcsRequest<ListDingtalkOpenPlatformConfigsResponse> {
	   

	private String spaceId;
	public ListDingtalkOpenPlatformConfigsRequest() {
		super("MPServerless", "2019-06-15", "ListDingtalkOpenPlatformConfigs", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
		if(spaceId != null){
			putBodyParameter("SpaceId", spaceId);
		}
	}

	@Override
	public Class<ListDingtalkOpenPlatformConfigsResponse> getResponseClass() {
		return ListDingtalkOpenPlatformConfigsResponse.class;
	}

}
