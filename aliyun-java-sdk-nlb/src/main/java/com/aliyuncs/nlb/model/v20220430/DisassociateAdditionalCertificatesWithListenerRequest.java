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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DisassociateAdditionalCertificatesWithListenerRequest extends RpcAcsRequest<DisassociateAdditionalCertificatesWithListenerResponse> {
	   

	private String clientToken;

	private String listenerId;

	private Boolean dryRun;

	private List<String> additionalCertificateIdss;
	public DisassociateAdditionalCertificatesWithListenerRequest() {
		super("Nlb", "2022-04-30", "DisassociateAdditionalCertificatesWithListener", "nlb");
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
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putBodyParameter("ListenerId", listenerId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public List<String> getAdditionalCertificateIdss() {
		return this.additionalCertificateIdss;
	}

	public void setAdditionalCertificateIdss(List<String> additionalCertificateIdss) {
		this.additionalCertificateIdss = additionalCertificateIdss;	
		if (additionalCertificateIdss != null) {
			for (int i = 0; i < additionalCertificateIdss.size(); i++) {
				putBodyParameter("AdditionalCertificateIds." + (i + 1) , additionalCertificateIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DisassociateAdditionalCertificatesWithListenerResponse> getResponseClass() {
		return DisassociateAdditionalCertificatesWithListenerResponse.class;
	}

}
