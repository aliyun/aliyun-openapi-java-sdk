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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.cdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetRemoveQueryStringConfigRequest extends RpcAcsRequest<SetRemoveQueryStringConfigResponse> {
	
	public SetRemoveQueryStringConfigRequest() {
		super("Cdn", "2018-05-10", "SetRemoveQueryStringConfig", "cdn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String aliRemoveArgs;

	private String keepOssArgs;

	private String domainName;

	private Long ownerId;

	private Long configId;

	public String getAliRemoveArgs() {
		return this.aliRemoveArgs;
	}

	public void setAliRemoveArgs(String aliRemoveArgs) {
		this.aliRemoveArgs = aliRemoveArgs;
		if(aliRemoveArgs != null){
			putQueryParameter("AliRemoveArgs", aliRemoveArgs);
		}
	}

	public String getKeepOssArgs() {
		return this.keepOssArgs;
	}

	public void setKeepOssArgs(String keepOssArgs) {
		this.keepOssArgs = keepOssArgs;
		if(keepOssArgs != null){
			putQueryParameter("KeepOssArgs", keepOssArgs);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getConfigId() {
		return this.configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
		if(configId != null){
			putQueryParameter("ConfigId", configId.toString());
		}
	}

	@Override
	public Class<SetRemoveQueryStringConfigResponse> getResponseClass() {
		return SetRemoveQueryStringConfigResponse.class;
	}

}
