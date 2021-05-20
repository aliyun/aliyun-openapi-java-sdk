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
import com.aliyuncs.ververica.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateUdfArtifactRequest extends RoaAcsRequest<UpdateUdfArtifactResponse> {
	   

	private String workspace;

	private String paramsJson;

	private String namespace;

	private String udfArtifactName;
	public UpdateUdfArtifactRequest() {
		super("ververica", "2020-05-01", "UpdateUdfArtifact");
		setUriPattern("/pop/workspaces/[workspace]/sql/v1beta1/namespaces/[namespace]/udfartifacts/[udfArtifactName]");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getParamsJson() {
		return this.paramsJson;
	}

	public void setParamsJson(String paramsJson) {
		this.paramsJson = paramsJson;
		if(paramsJson != null){
			putBodyParameter("paramsJson", paramsJson);
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

	public String getUdfArtifactName() {
		return this.udfArtifactName;
	}

	public void setUdfArtifactName(String udfArtifactName) {
		this.udfArtifactName = udfArtifactName;
		if(udfArtifactName != null){
			putPathParameter("udfArtifactName", udfArtifactName);
		}
	}

	@Override
	public Class<UpdateUdfArtifactResponse> getResponseClass() {
		return UpdateUdfArtifactResponse.class;
	}

}
