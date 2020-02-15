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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ApplyAntChainCertificateRequest extends RpcAcsRequest<ApplyAntChainCertificateResponse> {
	   

	private String uploadReq;

	private String antChainId;
	public ApplyAntChainCertificateRequest() {
		super("Baas", "2018-12-21", "ApplyAntChainCertificate", "baas");
		setMethod(MethodType.PUT);
	}

	public String getUploadReq() {
		return this.uploadReq;
	}

	public void setUploadReq(String uploadReq) {
		this.uploadReq = uploadReq;
		if(uploadReq != null){
			putBodyParameter("UploadReq", uploadReq);
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	@Override
	public Class<ApplyAntChainCertificateResponse> getResponseClass() {
		return ApplyAntChainCertificateResponse.class;
	}

}
