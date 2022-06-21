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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateUserImageRegistryInfoCacheRequest extends RpcAcsRequest<CreateUserImageRegistryInfoCacheResponse> {
	   

	private String registry;

	private String cacheName;

	private String containerServiceId;

	private String site;

	private String password;

	private String userName;
	public CreateUserImageRegistryInfoCacheRequest() {
		super("SWAS", "2017-08-10", "CreateUserImageRegistryInfoCache", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getRegistry() {
		return this.registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
		if(registry != null){
			putQueryParameter("Registry", registry);
		}
	}

	public String getCacheName() {
		return this.cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
		if(cacheName != null){
			putQueryParameter("CacheName", cacheName);
		}
	}

	public String getContainerServiceId() {
		return this.containerServiceId;
	}

	public void setContainerServiceId(String containerServiceId) {
		this.containerServiceId = containerServiceId;
		if(containerServiceId != null){
			putQueryParameter("ContainerServiceId", containerServiceId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateUserImageRegistryInfoCacheResponse> getResponseClass() {
		return CreateUserImageRegistryInfoCacheResponse.class;
	}

}
