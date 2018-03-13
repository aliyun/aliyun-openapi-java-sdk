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
package com.aliyuncs.ehpc.model.v20170714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteClusterRequest extends RpcAcsRequest<DeleteClusterResponse> {
	
	public DeleteClusterRequest() {
		super("EHPC", "2017-07-14", "DeleteCluster", "ehs");
	}

	private String releaseInstance;

	private String clusterId;

	public String getReleaseInstance() {
		return this.releaseInstance;
	}

	public void setReleaseInstance(String releaseInstance) {
		this.releaseInstance = releaseInstance;
		if(releaseInstance != null){
			putQueryParameter("ReleaseInstance", releaseInstance);
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
	public Class<DeleteClusterResponse> getResponseClass() {
		return DeleteClusterResponse.class;
	}

}
