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
public class ImportK8sClusterRequest extends RoaAcsRequest<ImportK8sClusterResponse> {
	
	public ImportK8sClusterRequest() {
		super("Edas", "2017-08-01", "ImportK8sCluster");
		setUriPattern("/pop/v5/import_k8s_cluster");
		setMethod(MethodType.POST);
	}

	private String clusterId;

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
	public Class<ImportK8sClusterResponse> getResponseClass() {
		return ImportK8sClusterResponse.class;
	}

}
