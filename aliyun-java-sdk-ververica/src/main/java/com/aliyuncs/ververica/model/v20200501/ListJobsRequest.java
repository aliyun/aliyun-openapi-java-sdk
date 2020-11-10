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

package com.aliyuncs.ververica.model.v20200501;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListJobsRequest extends RoaAcsRequest<ListJobsResponse> {
	   

	private String workspace;

	private String deploymentId;

	private String namespace;
	public ListJobsRequest() {
		super("ververica", "2020-05-01", "ListJobs", "ververica");
		setUriPattern("/pop/workspaces/[workspace]/api/v1/namespaces/[namespace]/jobs");
		setMethod(MethodType.GET);
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putPathParameter("workspace", workspace);
		}
	}

	public String getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(String deploymentId) {
		this.deploymentId = deploymentId;
		if(deploymentId != null){
			putQueryParameter("deploymentId", deploymentId);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putPathParameter("namespace", namespace);
		}
	}

	@Override
	public Class<ListJobsResponse> getResponseClass() {
		return ListJobsResponse.class;
	}

}
