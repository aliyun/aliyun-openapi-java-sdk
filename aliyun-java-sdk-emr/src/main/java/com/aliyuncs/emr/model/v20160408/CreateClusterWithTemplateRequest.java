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
public class CreateClusterWithTemplateRequest extends RpcAcsRequest<CreateClusterWithTemplateResponse> {
	
	public CreateClusterWithTemplateRequest() {
		super("Emr", "2016-04-08", "CreateClusterWithTemplate", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String uniqueTag;

	private String clusterName;

	private String templateBizId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getUniqueTag() {
		return this.uniqueTag;
	}

	public void setUniqueTag(String uniqueTag) {
		this.uniqueTag = uniqueTag;
		if(uniqueTag != null){
			putQueryParameter("UniqueTag", uniqueTag);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
	}

	public String getTemplateBizId() {
		return this.templateBizId;
	}

	public void setTemplateBizId(String templateBizId) {
		this.templateBizId = templateBizId;
		if(templateBizId != null){
			putQueryParameter("TemplateBizId", templateBizId);
		}
	}

	@Override
	public Class<CreateClusterWithTemplateResponse> getResponseClass() {
		return CreateClusterWithTemplateResponse.class;
	}

}
