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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateClusterRequest extends RpcAcsRequest<UpdateClusterResponse> {
	
	public UpdateClusterRequest() {
		super("mse", "2019-05-31", "UpdateCluster", "mse");
	}

	private String requestPars;

	private String clusterAliasName;

	private String clusterId;

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putBodyParameter("RequestPars", requestPars);
		}
	}

	public String getClusterAliasName() {
		return this.clusterAliasName;
	}

	public void setClusterAliasName(String clusterAliasName) {
		this.clusterAliasName = clusterAliasName;
		if(clusterAliasName != null){
			putBodyParameter("ClusterAliasName", clusterAliasName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<UpdateClusterResponse> getResponseClass() {
		return UpdateClusterResponse.class;
	}

}
