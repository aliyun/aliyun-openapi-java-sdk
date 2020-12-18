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
public class ImportCertificateRequest extends RpcAcsRequest<ImportCertificateResponse> {
	   

	private String pKCS12Blob;

	private String passphrase;
	public ImportCertificateRequest() {
		super("Kms", "2016-01-20", "ImportCertificate", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPKCS12Blob() {
		return this.pKCS12Blob;
	}

	public void setPKCS12Blob(String pKCS12Blob) {
		this.pKCS12Blob = pKCS12Blob;
		if(pKCS12Blob != null){
			putQueryParameter("PKCS12Blob", pKCS12Blob);
		}
	}

	public String getPassphrase() {
		return this.passphrase;
	}

	public void setPassphrase(String passphrase) {
		this.passphrase = passphrase;
		if(passphrase != null){
			putQueryParameter("Passphrase", passphrase);
		}
	}

	@Override
	public Class<ImportCertificateResponse> getResponseClass() {
		return ImportCertificateResponse.class;
	}

}
