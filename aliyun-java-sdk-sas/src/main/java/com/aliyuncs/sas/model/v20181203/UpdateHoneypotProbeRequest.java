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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHoneypotProbeRequest extends RpcAcsRequest<UpdateHoneypotProbeResponse> {
	   

	private Boolean ping;

	private String probeId;

	private List<String> serviceIpLists;

	private String lang;

	private Boolean arp;

	private String displayName;
	public UpdateHoneypotProbeRequest() {
		super("Sas", "2018-12-03", "UpdateHoneypotProbe");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getPing() {
		return this.ping;
	}

	public void setPing(Boolean ping) {
		this.ping = ping;
		if(ping != null){
			putQueryParameter("Ping", ping.toString());
		}
	}

	public String getProbeId() {
		return this.probeId;
	}

	public void setProbeId(String probeId) {
		this.probeId = probeId;
		if(probeId != null){
			putQueryParameter("ProbeId", probeId);
		}
	}

	public List<String> getServiceIpLists() {
		return this.serviceIpLists;
	}

	public void setServiceIpLists(List<String> serviceIpLists) {
		this.serviceIpLists = serviceIpLists;	
		if (serviceIpLists != null) {
			for (int i = 0; i < serviceIpLists.size(); i++) {
				putQueryParameter("ServiceIpList." + (i + 1) , serviceIpLists.get(i));
			}
		}	
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Boolean getArp() {
		return this.arp;
	}

	public void setArp(Boolean arp) {
		this.arp = arp;
		if(arp != null){
			putQueryParameter("Arp", arp.toString());
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	@Override
	public Class<UpdateHoneypotProbeResponse> getResponseClass() {
		return UpdateHoneypotProbeResponse.class;
	}

}
