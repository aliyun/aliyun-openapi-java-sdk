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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdatePrometheusGlobalViewRequest extends RpcAcsRequest<UpdatePrometheusGlobalViewResponse> {
	   

	private Boolean allSubClustersSuccess;

	private String clusterId;

	private String groupName;

	private String resourceGroupId;

	private String mostRegionId;

	private String subClustersJson;
	public UpdatePrometheusGlobalViewRequest() {
		super("ARMS", "2019-08-08", "UpdatePrometheusGlobalView", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAllSubClustersSuccess() {
		return this.allSubClustersSuccess;
	}

	public void setAllSubClustersSuccess(Boolean allSubClustersSuccess) {
		this.allSubClustersSuccess = allSubClustersSuccess;
		if(allSubClustersSuccess != null){
			putQueryParameter("AllSubClustersSuccess", allSubClustersSuccess.toString());
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getMostRegionId() {
		return this.mostRegionId;
	}

	public void setMostRegionId(String mostRegionId) {
		this.mostRegionId = mostRegionId;
		if(mostRegionId != null){
			putQueryParameter("MostRegionId", mostRegionId);
		}
	}

	public String getSubClustersJson() {
		return this.subClustersJson;
	}

	public void setSubClustersJson(String subClustersJson) {
		this.subClustersJson = subClustersJson;
		if(subClustersJson != null){
			putQueryParameter("SubClustersJson", subClustersJson);
		}
	}

	@Override
	public Class<UpdatePrometheusGlobalViewResponse> getResponseClass() {
		return UpdatePrometheusGlobalViewResponse.class;
	}

}
