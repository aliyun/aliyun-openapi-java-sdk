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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssociateAdditionalCertificatesWithListenerRequest extends RpcAcsRequest<AssociateAdditionalCertificatesWithListenerResponse> {
	   

	private String clientToken;

	private String listenerId;

	private List<Certificates> certificatess;

	private String acceleratorId;
	public AssociateAdditionalCertificatesWithListenerRequest() {
		super("Ga", "2019-11-20", "AssociateAdditionalCertificatesWithListener", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public List<Certificates> getCertificatess() {
		return this.certificatess;
	}

	public void setCertificatess(List<Certificates> certificatess) {
		this.certificatess = certificatess;	
		if (certificatess != null) {
			for (int depth1 = 0; depth1 < certificatess.size(); depth1++) {
				putQueryParameter("Certificates." + (depth1 + 1) + ".Id" , certificatess.get(depth1).getId());
				putQueryParameter("Certificates." + (depth1 + 1) + ".Domain" , certificatess.get(depth1).getDomain());
			}
		}	
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	public static class Certificates {

		private String id;

		private String domain;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}
	}

	@Override
	public Class<AssociateAdditionalCertificatesWithListenerResponse> getResponseClass() {
		return AssociateAdditionalCertificatesWithListenerResponse.class;
	}

}
