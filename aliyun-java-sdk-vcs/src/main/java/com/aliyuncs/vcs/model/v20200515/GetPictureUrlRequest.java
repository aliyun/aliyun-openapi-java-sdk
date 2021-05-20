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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPictureUrlRequest extends RpcAcsRequest<GetPictureUrlResponse> {
	   

	private String expireTime;

	private String originUrl;
	public GetPictureUrlRequest() {
		super("Vcs", "2020-05-15", "GetPictureUrl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putBodyParameter("ExpireTime", expireTime);
		}
	}

	public String getOriginUrl() {
		return this.originUrl;
	}

	public void setOriginUrl(String originUrl) {
		this.originUrl = originUrl;
		if(originUrl != null){
			putBodyParameter("OriginUrl", originUrl);
		}
	}

	@Override
	public Class<GetPictureUrlResponse> getResponseClass() {
		return GetPictureUrlResponse.class;
	}

}
