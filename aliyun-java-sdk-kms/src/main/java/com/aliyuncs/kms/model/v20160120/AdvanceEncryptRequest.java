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

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AdvanceEncryptRequest extends RpcAcsRequest<AdvanceEncryptResponse> {
	   

	private String paddingMode;

	private String aad;

	private String keyId;

	private String plaintext;

	private String iv;

	private String algorithm;
	public AdvanceEncryptRequest() {
		super("Kms", "2016-01-20", "AdvanceEncrypt", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPaddingMode() {
		return this.paddingMode;
	}

	public void setPaddingMode(String paddingMode) {
		this.paddingMode = paddingMode;
		if(paddingMode != null){
			putQueryParameter("PaddingMode", paddingMode);
		}
	}

	public String getAad() {
		return this.aad;
	}

	public void setAad(String aad) {
		this.aad = aad;
		if(aad != null){
			putQueryParameter("Aad", aad);
		}
	}

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
		if(keyId != null){
			putQueryParameter("KeyId", keyId);
		}
	}

	public String getPlaintext() {
		return this.plaintext;
	}

	public void setPlaintext(String plaintext) {
		this.plaintext = plaintext;
		if(plaintext != null){
			putQueryParameter("Plaintext", plaintext);
		}
	}

	public String getIv() {
		return this.iv;
	}

	public void setIv(String iv) {
		this.iv = iv;
		if(iv != null){
			putQueryParameter("Iv", iv);
		}
	}

	public String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
		if(algorithm != null){
			putQueryParameter("Algorithm", algorithm);
		}
	}

	@Override
	public Class<AdvanceEncryptResponse> getResponseClass() {
		return AdvanceEncryptResponse.class;
	}

}
