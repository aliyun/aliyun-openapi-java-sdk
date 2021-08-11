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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DissociateAdditionalCertificatesFromListenerRequest extends RpcAcsRequest<DissociateAdditionalCertificatesFromListenerResponse> {
	   

	private String clientToken;

	private String listenerId;

	private Boolean dryRun;

	private List<Certificates> certificates;
	public DissociateAdditionalCertificatesFromListenerRequest() {
		super("Alb", "2020-06-16", "DissociateAdditionalCertificatesFromListener", "alb");
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

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<Certificates> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificates> certificates) {
		this.certificates = certificates;	
		if (certificates != null) {
			for (int depth1 = 0; depth1 < certificates.size(); depth1++) {
				if (certificates.get(depth1) != null) {
					
						putQueryParameter("Certificates." + (depth1 + 1) + ".CertificateId" , certificates.get(depth1).getCertificateId());
				}
			}
		}	
	}

	public static class Certificates {

		private String certificateId;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}
	}

	@Override
	public Class<DissociateAdditionalCertificatesFromListenerResponse> getResponseClass() {
		return DissociateAdditionalCertificatesFromListenerResponse.class;
	}

}
