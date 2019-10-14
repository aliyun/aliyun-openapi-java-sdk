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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendUnicastCommandRequest extends RpcAcsRequest<SendUnicastCommandResponse> {
	   

	private String devEui;

	private Integer maxRetries;

	private Boolean cleanUp;

	private Integer fPort;

	private Boolean confirmed;

	private String content;
	public SendUnicastCommandRequest() {
		super("LinkWAN", "2019-03-01", "SendUnicastCommand", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putQueryParameter("DevEui", devEui);
		}
	}

	public Integer getMaxRetries() {
		return this.maxRetries;
	}

	public void setMaxRetries(Integer maxRetries) {
		this.maxRetries = maxRetries;
		if(maxRetries != null){
			putQueryParameter("MaxRetries", maxRetries.toString());
		}
	}

	public Boolean getCleanUp() {
		return this.cleanUp;
	}

	public void setCleanUp(Boolean cleanUp) {
		this.cleanUp = cleanUp;
		if(cleanUp != null){
			putQueryParameter("CleanUp", cleanUp.toString());
		}
	}

	public Integer getFPort() {
		return this.fPort;
	}

	public void setFPort(Integer fPort) {
		this.fPort = fPort;
		if(fPort != null){
			putQueryParameter("FPort", fPort.toString());
		}
	}

	public Boolean getConfirmed() {
		return this.confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
		if(confirmed != null){
			putQueryParameter("Confirmed", confirmed.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	@Override
	public Class<SendUnicastCommandResponse> getResponseClass() {
		return SendUnicastCommandResponse.class;
	}

}
