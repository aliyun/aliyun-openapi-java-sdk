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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEcsNotInClusterRequest extends RoaAcsRequest<ListEcsNotInClusterResponse> {
	
	public ListEcsNotInClusterRequest() {
		super("Edas", "2017-08-01", "ListEcsNotInCluster", "edas");
		setUriPattern("/pop/v5/resource/ecs_not_in_cluster");
		setMethod(MethodType.GET);
	}

	private String vpcId;

	private Integer networkMode;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Integer getNetworkMode() {
		return this.networkMode;
	}

	public void setNetworkMode(Integer networkMode) {
		this.networkMode = networkMode;
		if(networkMode != null){
			putQueryParameter("NetworkMode", networkMode.toString());
		}
	}

	@Override
	public Class<ListEcsNotInClusterResponse> getResponseClass() {
		return ListEcsNotInClusterResponse.class;
	}

}
