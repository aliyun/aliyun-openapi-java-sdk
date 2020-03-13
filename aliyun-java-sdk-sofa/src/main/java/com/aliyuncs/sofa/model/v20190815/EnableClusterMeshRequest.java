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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableClusterMeshRequest extends RpcAcsRequest<EnableClusterMeshResponse> {
	   

	private String server;

	private String clusterName;

	private String workspaceName;

	private String certificateAuthorityData;

	private String clientKeyData;

	private String clientCertificateData;

	private String user;
	public EnableClusterMeshRequest() {
		super("SOFA", "2019-08-15", "EnableClusterMesh", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
		if(server != null){
			putBodyParameter("Server", server);
		}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putBodyParameter("ClusterName", clusterName);
		}
	}

	public String getWorkspaceName() {
		return this.workspaceName;
	}

	public void setWorkspaceName(String workspaceName) {
		this.workspaceName = workspaceName;
		if(workspaceName != null){
			putBodyParameter("WorkspaceName", workspaceName);
		}
	}

	public String getCertificateAuthorityData() {
		return this.certificateAuthorityData;
	}

	public void setCertificateAuthorityData(String certificateAuthorityData) {
		this.certificateAuthorityData = certificateAuthorityData;
		if(certificateAuthorityData != null){
			putBodyParameter("CertificateAuthorityData", certificateAuthorityData);
		}
	}

	public String getClientKeyData() {
		return this.clientKeyData;
	}

	public void setClientKeyData(String clientKeyData) {
		this.clientKeyData = clientKeyData;
		if(clientKeyData != null){
			putBodyParameter("ClientKeyData", clientKeyData);
		}
	}

	public String getClientCertificateData() {
		return this.clientCertificateData;
	}

	public void setClientCertificateData(String clientCertificateData) {
		this.clientCertificateData = clientCertificateData;
		if(clientCertificateData != null){
			putBodyParameter("ClientCertificateData", clientCertificateData);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putBodyParameter("User", user);
		}
	}

	@Override
	public Class<EnableClusterMeshResponse> getResponseClass() {
		return EnableClusterMeshResponse.class;
	}

}
