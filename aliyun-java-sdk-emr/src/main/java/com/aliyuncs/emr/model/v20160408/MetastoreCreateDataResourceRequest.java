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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MetastoreCreateDataResourceRequest extends RpcAcsRequest<MetastoreCreateDataResourceResponse> {
	
	public MetastoreCreateDataResourceRequest() {
		super("Emr", "2016-04-08", "MetastoreCreateDataResource", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private Boolean _default;

	private String accessType;

	private String name;

	private String description;

	private String metaType;

	private String clusterId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean get_Default() {
		return this._default;
	}

	public void set_Default(Boolean _default) {
		this._default = _default;
		if(_default != null){
			putQueryParameter("Default", _default.toString());
		}
	}

	public String getAccessType() {
		return this.accessType;
	}

	public void setAccessType(String accessType) {
		this.accessType = accessType;
		if(accessType != null){
			putQueryParameter("AccessType", accessType);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getMetaType() {
		return this.metaType;
	}

	public void setMetaType(String metaType) {
		this.metaType = metaType;
		if(metaType != null){
			putQueryParameter("MetaType", metaType);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<MetastoreCreateDataResourceResponse> getResponseClass() {
		return MetastoreCreateDataResourceResponse.class;
	}

}
