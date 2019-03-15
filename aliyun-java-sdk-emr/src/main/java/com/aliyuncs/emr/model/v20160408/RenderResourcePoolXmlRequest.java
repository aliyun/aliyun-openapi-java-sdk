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

/**
 * @author auto create
 * @version 
 */
public class RenderResourcePoolXmlRequest extends RpcAcsRequest<RenderResourcePoolXmlResponse> {
	
	public RenderResourcePoolXmlRequest() {
		super("Emr", "2016-04-08", "RenderResourcePoolXml");
	}

	private Long resourceOwnerId;

	private String resourcePoolId;

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

	public String getResourcePoolId() {
		return this.resourcePoolId;
	}

	public void setResourcePoolId(String resourcePoolId) {
		this.resourcePoolId = resourcePoolId;
		if(resourcePoolId != null){
			putQueryParameter("ResourcePoolId", resourcePoolId);
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
	public Class<RenderResourcePoolXmlResponse> getResponseClass() {
		return RenderResourcePoolXmlResponse.class;
	}

}
