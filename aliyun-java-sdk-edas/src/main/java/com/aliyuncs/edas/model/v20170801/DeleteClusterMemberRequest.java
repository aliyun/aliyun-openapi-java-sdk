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
public class DeleteClusterMemberRequest extends RoaAcsRequest<DeleteClusterMemberResponse> {
	
	public DeleteClusterMemberRequest() {
		super("Edas", "2017-08-01", "DeleteClusterMember");
		setUriPattern("/pop/v5/resource/cluster_member");
		setMethod(MethodType.DELETE);
	}

	private String clusterMemberId;

	private String clusterId;

	public String getClusterMemberId() {
		return this.clusterMemberId;
	}

	public void setClusterMemberId(String clusterMemberId) {
		this.clusterMemberId = clusterMemberId;
		if(clusterMemberId != null){
			putQueryParameter("ClusterMemberId", clusterMemberId);
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
	public Class<DeleteClusterMemberResponse> getResponseClass() {
		return DeleteClusterMemberResponse.class;
	}

}
