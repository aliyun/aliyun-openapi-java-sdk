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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ApplyFirewallTemplateRequest extends RpcAcsRequest<ApplyFirewallTemplateResponse> {
	   

	private String firewallTemplateId;

	private String clientToken;

	private List<String> instanceIdss;
	public ApplyFirewallTemplateRequest() {
		super("SWAS-OPEN", "2020-06-01", "ApplyFirewallTemplate", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getFirewallTemplateId() {
		return this.firewallTemplateId;
	}

	public void setFirewallTemplateId(String firewallTemplateId) {
		this.firewallTemplateId = firewallTemplateId;
		if(firewallTemplateId != null){
			putQueryParameter("FirewallTemplateId", firewallTemplateId);
		}
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

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ApplyFirewallTemplateResponse> getResponseClass() {
		return ApplyFirewallTemplateResponse.class;
	}

}
