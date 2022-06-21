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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateHttpsPropRequest extends RpcAcsRequest<UpdateHttpsPropResponse> {
	   

	private String certId;

	private String site;

	private String serverUid;

	private String domain;

	private Boolean httpsOn;
	public UpdateHttpsPropRequest() {
		super("SWAS", "2017-08-10", "UpdateHttpsProp", "SWAS");
		setMethod(MethodType.POST);
	}

	public String getCertId() {
		return this.certId;
	}

	public void setCertId(String certId) {
		this.certId = certId;
		if(certId != null){
			putQueryParameter("CertId", certId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	public String getServerUid() {
		return this.serverUid;
	}

	public void setServerUid(String serverUid) {
		this.serverUid = serverUid;
		if(serverUid != null){
			putQueryParameter("ServerUid", serverUid);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public Boolean getHttpsOn() {
		return this.httpsOn;
	}

	public void setHttpsOn(Boolean httpsOn) {
		this.httpsOn = httpsOn;
		if(httpsOn != null){
			putQueryParameter("HttpsOn", httpsOn.toString());
		}
	}

	@Override
	public Class<UpdateHttpsPropResponse> getResponseClass() {
		return UpdateHttpsPropResponse.class;
	}

}
