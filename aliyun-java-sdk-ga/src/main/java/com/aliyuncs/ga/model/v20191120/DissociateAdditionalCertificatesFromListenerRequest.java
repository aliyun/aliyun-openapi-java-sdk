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
public class DissociateAdditionalCertificatesFromListenerRequest extends RpcAcsRequest<DissociateAdditionalCertificatesFromListenerResponse> {
	   

	private String clientToken;

	private List<String> domainss;

	private String listenerId;

	private String acceleratorId;
	public DissociateAdditionalCertificatesFromListenerRequest() {
		super("Ga", "2019-11-20", "DissociateAdditionalCertificatesFromListener", "gaplus");
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

	public List<String> getDomainss() {
		return this.domainss;
	}

	public void setDomainss(List<String> domainss) {
		this.domainss = domainss;	
		if (domainss != null) {
			for (int i = 0; i < domainss.size(); i++) {
				putQueryParameter("Domains." + (i + 1) , domainss.get(i));
			}
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

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	@Override
	public Class<DissociateAdditionalCertificatesFromListenerResponse> getResponseClass() {
		return DissociateAdditionalCertificatesFromListenerResponse.class;
	}

}
