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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.unimkt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteUnionBrandRequest extends RpcAcsRequest<DeleteUnionBrandResponse> {
	   

	private Long proxyUserId;

	private Long brandMainId;

	private String channelId;
	public DeleteUnionBrandRequest() {
		super("UniMkt", "2018-12-12", "DeleteUnionBrand");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getProxyUserId() {
		return this.proxyUserId;
	}

	public void setProxyUserId(Long proxyUserId) {
		this.proxyUserId = proxyUserId;
		if(proxyUserId != null){
			putQueryParameter("ProxyUserId", proxyUserId.toString());
		}
	}

	public Long getBrandMainId() {
		return this.brandMainId;
	}

	public void setBrandMainId(Long brandMainId) {
		this.brandMainId = brandMainId;
		if(brandMainId != null){
			putQueryParameter("BrandMainId", brandMainId.toString());
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<DeleteUnionBrandResponse> getResponseClass() {
		return DeleteUnionBrandResponse.class;
	}

}
