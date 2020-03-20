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

package com.aliyuncs.eas.model.v20180522;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteResourceRequest extends RoaAcsRequest<DeleteResourceResponse> {
	   

	private String cluster_id;

	private String resource_name;
	public DeleteResourceRequest() {
		super("eas", "2018-05-22", "DeleteResource");
		setUriPattern("/api/resources/[cluster_id]/[resource_name]");
		setMethod(MethodType.DELETE);
	}

	public String getCluster_id() {
		return this.cluster_id;
	}

	public void setCluster_id(String cluster_id) {
		this.cluster_id = cluster_id;
		if(cluster_id != null){
			putPathParameter("cluster_id", cluster_id);
		}
	}

	public String getResource_name() {
		return this.resource_name;
	}

	public void setResource_name(String resource_name) {
		this.resource_name = resource_name;
		if(resource_name != null){
			putPathParameter("resource_name", resource_name);
		}
	}

	@Override
	public Class<DeleteResourceResponse> getResponseClass() {
		return DeleteResourceResponse.class;
	}

}
