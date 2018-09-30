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

/**
 * @author auto create
 * @version 
 */
public class SetFileCacheExpiredConfigRequest extends RpcAcsRequest<SetFileCacheExpiredConfigResponse> {
	
	public SetFileCacheExpiredConfigRequest() {
		super("Cdn", "2018-05-10", "SetFileCacheExpiredConfig");
	}

	private String domainName;

	private String cacheContent;

	private Long ownerId;

	private String tTL;

	private Long configId;

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public String getCacheContent() {
		return this.cacheContent;
	}

	public void setCacheContent(String cacheContent) {
		this.cacheContent = cacheContent;
		if(cacheContent != null){
			putQueryParameter("CacheContent", cacheContent);
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

	public String getTTL() {
		return this.tTL;
	}

	public void setTTL(String tTL) {
		this.tTL = tTL;
		if(tTL != null){
			putQueryParameter("TTL", tTL);
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
	public Class<SetFileCacheExpiredConfigResponse> getResponseClass() {
		return SetFileCacheExpiredConfigResponse.class;
	}

}
