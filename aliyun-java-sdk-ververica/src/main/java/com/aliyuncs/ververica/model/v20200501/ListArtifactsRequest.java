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
public class ListArtifactsRequest extends RoaAcsRequest<ListArtifactsResponse> {
	   

	private String workspace;

	private String namespace;
	public ListArtifactsRequest() {
		super("ververica", "2020-05-01", "ListArtifacts", "ververica");
		setUriPattern("/pop/workspaces/[workspace]/artifacts/v1/namespaces/[namespace]/artifacts:list");
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
	public Class<ListArtifactsResponse> getResponseClass() {
		return ListArtifactsResponse.class;
	}

}
