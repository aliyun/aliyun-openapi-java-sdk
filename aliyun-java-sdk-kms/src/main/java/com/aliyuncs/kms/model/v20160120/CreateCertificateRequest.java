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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCertificateRequest extends RpcAcsRequest<CreateCertificateResponse> {
	   

	private Boolean exportablePrivateKey;

	private String subject;

	private List<Object> subjectAlternativeNames;

	private String keySpec;
	public CreateCertificateRequest() {
		super("Kms", "2016-01-20", "CreateCertificate", "kms");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getExportablePrivateKey() {
		return this.exportablePrivateKey;
	}

	public void setExportablePrivateKey(Boolean exportablePrivateKey) {
		this.exportablePrivateKey = exportablePrivateKey;
		if(exportablePrivateKey != null){
			putQueryParameter("ExportablePrivateKey", exportablePrivateKey.toString());
		}
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		if(subject != null){
			putQueryParameter("Subject", subject);
		}
	}

	public List<Object> getSubjectAlternativeNames() {
		return this.subjectAlternativeNames;
	}

	public void setSubjectAlternativeNames(List<Object> subjectAlternativeNames) {
		this.subjectAlternativeNames = subjectAlternativeNames;
		if(subjectAlternativeNames != null){
			putQueryParameter("SubjectAlternativeNames", new Gson().toJson(subjectAlternativeNames));
		}
	}

	public String getKeySpec() {
		return this.keySpec;
	}

	public void setKeySpec(String keySpec) {
		this.keySpec = keySpec;
		if(keySpec != null){
			putQueryParameter("KeySpec", keySpec);
		}
	}

	@Override
	public Class<CreateCertificateResponse> getResponseClass() {
		return CreateCertificateResponse.class;
	}

}
