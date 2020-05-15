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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySlbAPRequest extends RpcAcsRequest<ModifySlbAPResponse> {
	   

	private String sslCertId;

	private Integer establishedTimeout;

	private Integer realServerPort;

	private Integer stickySession;

	private Integer cookieTimeout;

	private String name;

	private Long slbAPId;
	public ModifySlbAPRequest() {
		super("retailcloud", "2018-03-13", "ModifySlbAP", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSslCertId() {
		return this.sslCertId;
	}

	public void setSslCertId(String sslCertId) {
		this.sslCertId = sslCertId;
		if(sslCertId != null){
			putQueryParameter("SslCertId", sslCertId);
		}
	}

	public Integer getEstablishedTimeout() {
		return this.establishedTimeout;
	}

	public void setEstablishedTimeout(Integer establishedTimeout) {
		this.establishedTimeout = establishedTimeout;
		if(establishedTimeout != null){
			putQueryParameter("EstablishedTimeout", establishedTimeout.toString());
		}
	}

	public Integer getRealServerPort() {
		return this.realServerPort;
	}

	public void setRealServerPort(Integer realServerPort) {
		this.realServerPort = realServerPort;
		if(realServerPort != null){
			putQueryParameter("RealServerPort", realServerPort.toString());
		}
	}

	public Integer getStickySession() {
		return this.stickySession;
	}

	public void setStickySession(Integer stickySession) {
		this.stickySession = stickySession;
		if(stickySession != null){
			putQueryParameter("StickySession", stickySession.toString());
		}
	}

	public Integer getCookieTimeout() {
		return this.cookieTimeout;
	}

	public void setCookieTimeout(Integer cookieTimeout) {
		this.cookieTimeout = cookieTimeout;
		if(cookieTimeout != null){
			putQueryParameter("CookieTimeout", cookieTimeout.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getSlbAPId() {
		return this.slbAPId;
	}

	public void setSlbAPId(Long slbAPId) {
		this.slbAPId = slbAPId;
		if(slbAPId != null){
			putQueryParameter("SlbAPId", slbAPId.toString());
		}
	}

	@Override
	public Class<ModifySlbAPResponse> getResponseClass() {
		return ModifySlbAPResponse.class;
	}

}
