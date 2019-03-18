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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertificateDetailRequest extends RpcAcsRequest<DescribeCertificateDetailResponse> {
	
	public DescribeCertificateDetailRequest() {
		super("cas", "2018-08-13", "DescribeCertificateDetail", "cas_esign_fdd");
	}

	private String sourceIp;

	private Long certificateId;

	private String lang;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
		if(certificateId != null){
			putQueryParameter("CertificateId", certificateId.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<DescribeCertificateDetailResponse> getResponseClass() {
		return DescribeCertificateDetailResponse.class;
	}

}
