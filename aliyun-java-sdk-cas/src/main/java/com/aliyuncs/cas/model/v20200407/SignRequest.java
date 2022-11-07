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

package com.aliyuncs.cas.model.v20200407;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SignRequest extends RpcAcsRequest<SignResponse> {
	   

	private String messageType;

	private String signingAlgorithm;

	private String message;

	private String certIdentifier;
	public SignRequest() {
		super("cas", "2020-04-07", "Sign");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
		if(messageType != null){
			putQueryParameter("MessageType", messageType);
		}
	}

	public String getSigningAlgorithm() {
		return this.signingAlgorithm;
	}

	public void setSigningAlgorithm(String signingAlgorithm) {
		this.signingAlgorithm = signingAlgorithm;
		if(signingAlgorithm != null){
			putQueryParameter("SigningAlgorithm", signingAlgorithm);
		}
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
		if(message != null){
			putQueryParameter("Message", message);
		}
	}

	public String getCertIdentifier() {
		return this.certIdentifier;
	}

	public void setCertIdentifier(String certIdentifier) {
		this.certIdentifier = certIdentifier;
		if(certIdentifier != null){
			putQueryParameter("CertIdentifier", certIdentifier);
		}
	}

	@Override
	public Class<SignResponse> getResponseClass() {
		return SignResponse.class;
	}

}
