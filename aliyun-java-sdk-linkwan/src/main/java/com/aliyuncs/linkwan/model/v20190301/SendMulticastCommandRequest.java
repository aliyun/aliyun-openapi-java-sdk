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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendMulticastCommandRequest extends RpcAcsRequest<SendMulticastCommandResponse> {
	   

	private String mcAddress;

	private Integer fPort;

	private String content;

	private Integer maxRetries;

	private Boolean cleanUp;
	public SendMulticastCommandRequest() {
		super("LinkWAN", "2019-03-01", "SendMulticastCommand", "linkwan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMcAddress() {
		return this.mcAddress;
	}

	public void setMcAddress(String mcAddress) {
		this.mcAddress = mcAddress;
		if(mcAddress != null){
			putQueryParameter("McAddress", mcAddress);
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
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

	@Override
	public Class<SendMulticastCommandResponse> getResponseClass() {
		return SendMulticastCommandResponse.class;
	}

}
