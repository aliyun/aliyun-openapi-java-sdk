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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReleaseClusterByTemplateTagForInternalRequest extends RpcAcsRequest<ReleaseClusterByTemplateTagForInternalResponse> {
	   

	private List<String> templateTagSets;

	private Long resourceOwnerId;
	public ReleaseClusterByTemplateTagForInternalRequest() {
		super("Emr", "2016-04-08", "ReleaseClusterByTemplateTagForInternal");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTemplateTagSets() {
		return this.templateTagSets;
	}

	public void setTemplateTagSets(List<String> templateTagSets) {
		this.templateTagSets = templateTagSets;	
		if (templateTagSets != null) {
			for (int i = 0; i < templateTagSets.size(); i++) {
				putQueryParameter("TemplateTagSet." + (i + 1) , templateTagSets.get(i));
			}
		}	
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	@Override
	public Class<ReleaseClusterByTemplateTagForInternalResponse> getResponseClass() {
		return ReleaseClusterByTemplateTagForInternalResponse.class;
	}

}
