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

package com.aliyuncs.sasti.model.v20200512;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainReportRequest extends RpcAcsRequest<DescribeDomainReportResponse> {
	   

	private String field;

	private String domain;

	private String serviceLang;
	public DescribeDomainReportRequest() {
		super("Sasti", "2020-05-12", "DescribeDomainReport");
		setMethod(MethodType.POST);
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
		if(field != null){
			putQueryParameter("Field", field);
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

	public String getServiceLang() {
		return this.serviceLang;
	}

	public void setServiceLang(String serviceLang) {
		this.serviceLang = serviceLang;
		if(serviceLang != null){
			putQueryParameter("ServiceLang", serviceLang);
		}
	}

	@Override
	public Class<DescribeDomainReportResponse> getResponseClass() {
		return DescribeDomainReportResponse.class;
	}

}
