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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLiveStreamTranscodeRequest extends RpcAcsRequest<AddLiveStreamTranscodeResponse> {
	   

	private String template;

	private String lazy;

	private String app;

	private String encryptParameters;

	private Long ownerId;

	private String domain;
	public AddLiveStreamTranscodeRequest() {
		super("live", "2016-11-01", "AddLiveStreamTranscode", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
		if(template != null){
			putQueryParameter("Template", template);
		}
	}

	public String getLazy() {
		return this.lazy;
	}

	public void setLazy(String lazy) {
		this.lazy = lazy;
		if(lazy != null){
			putQueryParameter("Lazy", lazy);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getEncryptParameters() {
		return this.encryptParameters;
	}

	public void setEncryptParameters(String encryptParameters) {
		this.encryptParameters = encryptParameters;
		if(encryptParameters != null){
			putQueryParameter("EncryptParameters", encryptParameters);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	@Override
	public Class<AddLiveStreamTranscodeResponse> getResponseClass() {
		return AddLiveStreamTranscodeResponse.class;
	}

}
